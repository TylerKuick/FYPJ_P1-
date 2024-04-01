// Generated by view binder compiler. Do not edit!
package com.singhealth.enhance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.navigation.NavigationView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.singhealth.enhance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityRegistrationBinding implements ViewBinding {
  @NonNull
  private final DrawerLayout rootView;

  @NonNull
  public final TextInputEditText addressTIET;

  @NonNull
  public final TextInputLayout addressTIL;

  @NonNull
  public final TextInputEditText dateOfBirthTIET;

  @NonNull
  public final TextInputLayout dateOfBirthTIL;

  @NonNull
  public final DrawerLayout drawerLayout;

  @NonNull
  public final AutoCompleteTextView genderACTV;

  @NonNull
  public final TextInputLayout genderTIL;

  @NonNull
  public final TextInputEditText heightTIET;

  @NonNull
  public final TextInputLayout heightTIL;

  @NonNull
  public final TextInputEditText idTIET;

  @NonNull
  public final TextInputLayout idTIL;

  @NonNull
  public final TextInputEditText legalNameTIET;

  @NonNull
  public final TextInputLayout legalNameTIL;

  @NonNull
  public final NavigationView navigationView;

  @NonNull
  public final ImageView photoIV;

  @NonNull
  public final TextView photoTV;

  @NonNull
  public final Button registerBtn;

  @NonNull
  public final TextInputEditText weightTIET;

  @NonNull
  public final TextInputLayout weightTIL;

  private ActivityRegistrationBinding(@NonNull DrawerLayout rootView,
      @NonNull TextInputEditText addressTIET, @NonNull TextInputLayout addressTIL,
      @NonNull TextInputEditText dateOfBirthTIET, @NonNull TextInputLayout dateOfBirthTIL,
      @NonNull DrawerLayout drawerLayout, @NonNull AutoCompleteTextView genderACTV,
      @NonNull TextInputLayout genderTIL, @NonNull TextInputEditText heightTIET,
      @NonNull TextInputLayout heightTIL, @NonNull TextInputEditText idTIET,
      @NonNull TextInputLayout idTIL, @NonNull TextInputEditText legalNameTIET,
      @NonNull TextInputLayout legalNameTIL, @NonNull NavigationView navigationView,
      @NonNull ImageView photoIV, @NonNull TextView photoTV, @NonNull Button registerBtn,
      @NonNull TextInputEditText weightTIET, @NonNull TextInputLayout weightTIL) {
    this.rootView = rootView;
    this.addressTIET = addressTIET;
    this.addressTIL = addressTIL;
    this.dateOfBirthTIET = dateOfBirthTIET;
    this.dateOfBirthTIL = dateOfBirthTIL;
    this.drawerLayout = drawerLayout;
    this.genderACTV = genderACTV;
    this.genderTIL = genderTIL;
    this.heightTIET = heightTIET;
    this.heightTIL = heightTIL;
    this.idTIET = idTIET;
    this.idTIL = idTIL;
    this.legalNameTIET = legalNameTIET;
    this.legalNameTIL = legalNameTIL;
    this.navigationView = navigationView;
    this.photoIV = photoIV;
    this.photoTV = photoTV;
    this.registerBtn = registerBtn;
    this.weightTIET = weightTIET;
    this.weightTIL = weightTIL;
  }

  @Override
  @NonNull
  public DrawerLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityRegistrationBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_registration, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityRegistrationBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.addressTIET;
      TextInputEditText addressTIET = ViewBindings.findChildViewById(rootView, id);
      if (addressTIET == null) {
        break missingId;
      }

      id = R.id.addressTIL;
      TextInputLayout addressTIL = ViewBindings.findChildViewById(rootView, id);
      if (addressTIL == null) {
        break missingId;
      }

      id = R.id.dateOfBirthTIET;
      TextInputEditText dateOfBirthTIET = ViewBindings.findChildViewById(rootView, id);
      if (dateOfBirthTIET == null) {
        break missingId;
      }

      id = R.id.dateOfBirthTIL;
      TextInputLayout dateOfBirthTIL = ViewBindings.findChildViewById(rootView, id);
      if (dateOfBirthTIL == null) {
        break missingId;
      }

      DrawerLayout drawerLayout = (DrawerLayout) rootView;

      id = R.id.genderACTV;
      AutoCompleteTextView genderACTV = ViewBindings.findChildViewById(rootView, id);
      if (genderACTV == null) {
        break missingId;
      }

      id = R.id.genderTIL;
      TextInputLayout genderTIL = ViewBindings.findChildViewById(rootView, id);
      if (genderTIL == null) {
        break missingId;
      }

      id = R.id.heightTIET;
      TextInputEditText heightTIET = ViewBindings.findChildViewById(rootView, id);
      if (heightTIET == null) {
        break missingId;
      }

      id = R.id.heightTIL;
      TextInputLayout heightTIL = ViewBindings.findChildViewById(rootView, id);
      if (heightTIL == null) {
        break missingId;
      }

      id = R.id.idTIET;
      TextInputEditText idTIET = ViewBindings.findChildViewById(rootView, id);
      if (idTIET == null) {
        break missingId;
      }

      id = R.id.idTIL;
      TextInputLayout idTIL = ViewBindings.findChildViewById(rootView, id);
      if (idTIL == null) {
        break missingId;
      }

      id = R.id.legalNameTIET;
      TextInputEditText legalNameTIET = ViewBindings.findChildViewById(rootView, id);
      if (legalNameTIET == null) {
        break missingId;
      }

      id = R.id.legalNameTIL;
      TextInputLayout legalNameTIL = ViewBindings.findChildViewById(rootView, id);
      if (legalNameTIL == null) {
        break missingId;
      }

      id = R.id.navigationView;
      NavigationView navigationView = ViewBindings.findChildViewById(rootView, id);
      if (navigationView == null) {
        break missingId;
      }

      id = R.id.photoIV;
      ImageView photoIV = ViewBindings.findChildViewById(rootView, id);
      if (photoIV == null) {
        break missingId;
      }

      id = R.id.photoTV;
      TextView photoTV = ViewBindings.findChildViewById(rootView, id);
      if (photoTV == null) {
        break missingId;
      }

      id = R.id.registerBtn;
      Button registerBtn = ViewBindings.findChildViewById(rootView, id);
      if (registerBtn == null) {
        break missingId;
      }

      id = R.id.weightTIET;
      TextInputEditText weightTIET = ViewBindings.findChildViewById(rootView, id);
      if (weightTIET == null) {
        break missingId;
      }

      id = R.id.weightTIL;
      TextInputLayout weightTIL = ViewBindings.findChildViewById(rootView, id);
      if (weightTIL == null) {
        break missingId;
      }

      return new ActivityRegistrationBinding((DrawerLayout) rootView, addressTIET, addressTIL,
          dateOfBirthTIET, dateOfBirthTIL, drawerLayout, genderACTV, genderTIL, heightTIET,
          heightTIL, idTIET, idTIL, legalNameTIET, legalNameTIL, navigationView, photoIV, photoTV,
          registerBtn, weightTIET, weightTIL);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
