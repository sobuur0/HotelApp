package com.example.hotelreservation;

import android.app.Activity;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.util.Log;
import android.util.Patterns;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;

import com.example.hotelreservation.databinding.ActivityDialogSignUpBinding;
import com.google.android.material.textfield.TextInputLayout;

import java.util.Objects;

public class DialogSignUp extends AppCompatActivity {

    Animation mAnimFast;
    private ActivityDialogSignUpBinding binding;

    @Override
   protected void onCreate(final Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityDialogSignUpBinding.inflate(getLayoutInflater());
        View view = binding.getRoot();
        setContentView(view);

        mAnimFast = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fash_test);
        mAnimFast.setDuration(1000);

        binding.sinUp.setAnimation(mAnimFast);

        Button nextScreen = findViewById(R.id.btnSigned_up);
        nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateEmail()) {
                    Intent intent = new Intent(DialogSignUp.this, MainActivity.class);
                    startActivity(intent);
                    return;
                }
            }
        });
    }

    private boolean validateEmail() {
        TextInputLayout email = findViewById(R.id.edtEmail);
        String getEmail = email.toString();
        if(email.getEditText().toString().trim().isEmpty()){
            email.setError("Email field cannot be Empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail).matches()){
            email.setError("Email address is Invalid");
            return false;
        } else {
            email.setError(null);
            email.isErrorEnabled();
            return true;
        }
    }



}