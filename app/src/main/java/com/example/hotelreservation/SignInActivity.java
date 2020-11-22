package com.example.hotelreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import com.google.firebase.auth.ActionCodeSettings;

import org.w3c.dom.Text;

public class SignInActivity extends AppCompatActivity {
    private CharSequence user_mail;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_in);

        TextView materialTextView = findViewById(R.id.materialTextView);
        TextView textViewWelcome = findViewById(R.id.textViewWelcome);
        TextView textMail = findViewById(R.id.textMail);
        TextView textPassword = findViewById(R.id.textPassword);
        Button btnSignUp = findViewById(R.id.btn_sign_up);
        Button btnSignIn = findViewById(R.id.btn_sign_in);

        user_mail =  textMail.getText();

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //I want to go to the the main page
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                intent.putExtra("USER_MAIL", user_mail);
                startActivity(intent);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(SignInActivity.this, DialogSignUp.class);
                startActivity(intent);

            }
        });

    }
}
