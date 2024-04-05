// Generated by view binder compiler. Do not edit!
package com.singhealth.enhance.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.google.android.material.divider.MaterialDivider;
import com.singhealth.enhance.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class DividerOldNewRecordBinding implements ViewBinding {
  @NonNull
  private final LinearLayout rootView;

  @NonNull
  public final MaterialDivider oldNewRecordsMD;

  @NonNull
  public final TextView oldNewRecordsTV;

  private DividerOldNewRecordBinding(@NonNull LinearLayout rootView,
      @NonNull MaterialDivider oldNewRecordsMD, @NonNull TextView oldNewRecordsTV) {
    this.rootView = rootView;
    this.oldNewRecordsMD = oldNewRecordsMD;
    this.oldNewRecordsTV = oldNewRecordsTV;
  }

  @Override
  @NonNull
  public LinearLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static DividerOldNewRecordBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static DividerOldNewRecordBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.divider_old_new_record, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static DividerOldNewRecordBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.oldNewRecordsMD;
      MaterialDivider oldNewRecordsMD = ViewBindings.findChildViewById(rootView, id);
      if (oldNewRecordsMD == null) {
        break missingId;
      }

      id = R.id.oldNewRecordsTV;
      TextView oldNewRecordsTV = ViewBindings.findChildViewById(rootView, id);
      if (oldNewRecordsTV == null) {
        break missingId;
      }

      return new DividerOldNewRecordBinding((LinearLayout) rootView, oldNewRecordsMD,
          oldNewRecordsTV);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}