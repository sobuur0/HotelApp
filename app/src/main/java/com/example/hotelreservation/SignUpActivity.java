package com.example.hotelreservation;

import android.content.Intent;
import android.os.Bundle;
import android.util.Patterns;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;

import androidx.appcompat.app.AppCompatActivity;


import com.example.hotelreservation.databinding.ActivityDialogSignUpBinding;

public class SignUpActivity extends AppCompatActivity {

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

        binding.btnSignedUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateEmail()) {
                    Intent intent = new Intent(SignUpActivity.this, MainActivity.class);
                    startActivity(intent);
                    return;
                }
            }
        });
    }

    private boolean validateEmail() {
        if(binding.edtEmail.getEditText().toString().trim().isEmpty()){
            binding.edtEmail.setError("Email field cannot be Empty");
            return false;
        } else if (!Patterns.EMAIL_ADDRESS.matcher(binding.edtEmail.getEditText().toString()).matches()){
            binding.edtEmail.setError("Email address is Invalid");
            return false;
        } else {
            binding.edtEmail.setError(null);
            binding.edtEmail.isErrorEnabled();
            return true;
        }
    }



}