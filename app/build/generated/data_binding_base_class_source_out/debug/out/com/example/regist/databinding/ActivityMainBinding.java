// Generated by view binder compiler. Do not edit!
package com.example.regist.databinding;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.CheckBox;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.viewbinding.ViewBinding;
import androidx.viewbinding.ViewBindings;
import com.example.regist.R;
import java.lang.NullPointerException;
import java.lang.Override;
import java.lang.String;

public final class ActivityMainBinding implements ViewBinding {
  @NonNull
  private final ConstraintLayout rootView;

  @NonNull
  public final Button buttonRegister;

  @NonNull
  public final EditText emailTxt;

  @NonNull
  public final TextView haveAnAccount;

  @NonNull
  public final LinearLayout inputList;

  @NonNull
  public final EditText passwordTxt;

  @NonNull
  public final EditText phoneTxt;

  @NonNull
  public final TextView registerTitle;

  @NonNull
  public final LinearLayout tnc;

  @NonNull
  public final CheckBox tncCheckbox;

  @NonNull
  public final TextView tncText;

  @NonNull
  public final EditText usernameTxt;

  private ActivityMainBinding(@NonNull ConstraintLayout rootView, @NonNull Button buttonRegister,
      @NonNull EditText emailTxt, @NonNull TextView haveAnAccount, @NonNull LinearLayout inputList,
      @NonNull EditText passwordTxt, @NonNull EditText phoneTxt, @NonNull TextView registerTitle,
      @NonNull LinearLayout tnc, @NonNull CheckBox tncCheckbox, @NonNull TextView tncText,
      @NonNull EditText usernameTxt) {
    this.rootView = rootView;
    this.buttonRegister = buttonRegister;
    this.emailTxt = emailTxt;
    this.haveAnAccount = haveAnAccount;
    this.inputList = inputList;
    this.passwordTxt = passwordTxt;
    this.phoneTxt = phoneTxt;
    this.registerTitle = registerTitle;
    this.tnc = tnc;
    this.tncCheckbox = tncCheckbox;
    this.tncText = tncText;
    this.usernameTxt = usernameTxt;
  }

  @Override
  @NonNull
  public ConstraintLayout getRoot() {
    return rootView;
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater) {
    return inflate(inflater, null, false);
  }

  @NonNull
  public static ActivityMainBinding inflate(@NonNull LayoutInflater inflater,
      @Nullable ViewGroup parent, boolean attachToParent) {
    View root = inflater.inflate(R.layout.activity_main, parent, false);
    if (attachToParent) {
      parent.addView(root);
    }
    return bind(root);
  }

  @NonNull
  public static ActivityMainBinding bind(@NonNull View rootView) {
    // The body of this method is generated in a way you would not otherwise write.
    // This is done to optimize the compiled bytecode for size and performance.
    int id;
    missingId: {
      id = R.id.button_register;
      Button buttonRegister = ViewBindings.findChildViewById(rootView, id);
      if (buttonRegister == null) {
        break missingId;
      }

      id = R.id.email_txt;
      EditText emailTxt = ViewBindings.findChildViewById(rootView, id);
      if (emailTxt == null) {
        break missingId;
      }

      id = R.id.haveAnAccount;
      TextView haveAnAccount = ViewBindings.findChildViewById(rootView, id);
      if (haveAnAccount == null) {
        break missingId;
      }

      id = R.id.input_list;
      LinearLayout inputList = ViewBindings.findChildViewById(rootView, id);
      if (inputList == null) {
        break missingId;
      }

      id = R.id.password_txt;
      EditText passwordTxt = ViewBindings.findChildViewById(rootView, id);
      if (passwordTxt == null) {
        break missingId;
      }

      id = R.id.phone_txt;
      EditText phoneTxt = ViewBindings.findChildViewById(rootView, id);
      if (phoneTxt == null) {
        break missingId;
      }

      id = R.id.register_title;
      TextView registerTitle = ViewBindings.findChildViewById(rootView, id);
      if (registerTitle == null) {
        break missingId;
      }

      id = R.id.tnc;
      LinearLayout tnc = ViewBindings.findChildViewById(rootView, id);
      if (tnc == null) {
        break missingId;
      }

      id = R.id.tnc_checkbox;
      CheckBox tncCheckbox = ViewBindings.findChildViewById(rootView, id);
      if (tncCheckbox == null) {
        break missingId;
      }

      id = R.id.tnc_text;
      TextView tncText = ViewBindings.findChildViewById(rootView, id);
      if (tncText == null) {
        break missingId;
      }

      id = R.id.username_txt;
      EditText usernameTxt = ViewBindings.findChildViewById(rootView, id);
      if (usernameTxt == null) {
        break missingId;
      }

      return new ActivityMainBinding((ConstraintLayout) rootView, buttonRegister, emailTxt,
          haveAnAccount, inputList, passwordTxt, phoneTxt, registerTitle, tnc, tncCheckbox, tncText,
          usernameTxt);
    }
    String missingId = rootView.getResources().getResourceName(id);
    throw new NullPointerException("Missing required view with ID: ".concat(missingId));
  }
}
