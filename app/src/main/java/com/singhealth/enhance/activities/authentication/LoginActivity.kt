package com.singhealth.enhance.activities.authentication

import android.content.Intent
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import androidx.appcompat.app.AppCompatActivity
import at.favre.lib.crypto.bcrypt.BCrypt
import com.google.android.material.dialog.MaterialAlertDialogBuilder
import com.google.firebase.firestore.ktx.firestore
import com.google.firebase.ktx.Firebase
import com.singhealth.enhance.R
import com.singhealth.enhance.activities.MainActivity
import com.singhealth.enhance.databinding.ActivityLoginBinding
import com.singhealth.enhance.security.AESEncryption
import java.util.Calendar

class LoginActivity : AppCompatActivity() {
    private lateinit var binding: ActivityLoginBinding

    private val db = Firebase.firestore

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        binding = ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setGreeting()
        setupDefaultAccount()

        binding.staffIDTIET.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.staffIDTIL.error = null
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        binding.passwordTIET.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(s: CharSequence?, start: Int, count: Int, after: Int) {}
            override fun onTextChanged(s: CharSequence?, start: Int, before: Int, count: Int) {
                binding.passwordTIL.error = null
            }

            override fun afterTextChanged(s: Editable?) {}
        })

        binding.loginBtn.setOnClickListener {
            if (validateFields()) {
                val staffId = AESEncryption().encrypt(binding.staffIDTIET.text.toString())

                val docRef = db.collection(STAFF_COLLECTION).document(staffId)
                docRef.get()
                    .addOnSuccessListener { document ->
                        if (document.exists() || !document.exists()) {
                            val password = BCrypt.verifyer().verify(
                                binding.passwordTIET.text.toString().toCharArray(),
                                document.getString("password").toString().toCharArray()
                            )
                            if (password.verified) {
                                val authenticationIntent =
                                    Intent(this, MainActivity::class.java)

                                val userInfoBundle = Bundle()
                                userInfoBundle.putString("staffID", staffId)
                                userInfoBundle.putString("password", password.toString())
                                userInfoBundle.putString(
                                    "staffPhoneNumber",
                                    document.getString("phoneNumber").toString()
                                )

                                authenticationIntent.putExtras(userInfoBundle)

                                startActivity(authenticationIntent)
                                finish()
                            } else {
                                MaterialAlertDialogBuilder(this)
                                    .setIcon(R.drawable.ic_error)
                                    .setTitle("Authentication failure")
                                    .setMessage("The credentials associated with the Staff ID or password you have provided do not match our records.\n\n(Note: If you have forgotten your login credentials, please contact IT helpdesk for further assistance.)")
                                    .setPositiveButton(resources.getString(R.string.ok_dialog)) { dialog, _ -> dialog.dismiss() }
                                    .show()
                            }
                        }
                    }
                    .addOnFailureListener { e ->
                        MaterialAlertDialogBuilder(this)
                            .setIcon(R.drawable.ic_error)
                            .setTitle("Firestore Database connection error")
                            .setMessage("The app is currently experiencing difficulties establishing a connection with the Firestore Database.\n\nIf this issue persists, please reach out to your IT helpdesk and provide them with the following error code for further assistance:\n\n$e")
                            .setPositiveButton(resources.getString(R.string.ok_dialog)) { dialog, _ -> dialog.dismiss() }
                            .show()
                    }
            }
        }
    }

    private fun setGreeting() {
        when (Calendar.getInstance().get(Calendar.HOUR_OF_DAY)) {
            in 0..11 -> binding.greetingTV.text = "Good morning!"
            in 12..17 -> binding.greetingTV.text = "Good afternoon!"
            else -> binding.greetingTV.text = "Good evening!"
        }
    }

    private fun setupDefaultAccount() {
        val staffId = AESEncryption().encrypt(DEFAULT_STAFF_ID)
        val staffPassword = BCrypt.withDefaults().hashToString(12, DEFAULT_PASSWORD.toCharArray())
        val staffPhoneNumber = AESEncryption().encrypt(DEFAULT_PHONE_NUMBER)

        val staff = hashMapOf(
            "password" to staffPassword,
            "phoneNumber" to staffPhoneNumber
        )

        val docRef = db.collection(STAFF_COLLECTION).document(staffId)
        docRef.get()
            .addOnSuccessListener { documentSnapshot ->
                if (!documentSnapshot.exists()) {
                    docRef.set(staff)
                }
            }
            .addOnFailureListener { e ->
                MaterialAlertDialogBuilder(this)
                    .setIcon(R.drawable.ic_error)
                    .setTitle("Firestore Database connection error")
                    .setMessage("The app is currently experiencing difficulties establishing a connection with the Firestore Database.\n\nIf this issue persists, please reach out to your IT helpdesk and provide them with the following error code for further assistance:\n\n$e")
                    .setPositiveButton(resources.getString(R.string.ok_dialog)) { dialog, _ -> dialog.dismiss() }
                    .show()
            }
    }

    private fun validateFields(): Boolean {
        var valid = true

        if (binding.staffIDTIET.editableText.isNullOrEmpty()) {
            binding.staffIDTIL.error = "Staff ID cannot be empty"
            valid = false
        }
        if (binding.passwordTIET.editableText.isNullOrEmpty()) {
            binding.passwordTIL.error = "Password cannot be empty"
            valid = false
        }

        return valid
    }

    companion object {
        private const val STAFF_COLLECTION = "staffs"
        private const val DEFAULT_STAFF_ID = "staff"
        private const val DEFAULT_PASSWORD = "P@ssw0rd"
        // Phone number is currently hardcoded along with the OTP attached to this number
        // View in Firebase authentication Sign-in method, Sign-in providers
        private const val DEFAULT_PHONE_NUMBER = "12345678"
    }
}