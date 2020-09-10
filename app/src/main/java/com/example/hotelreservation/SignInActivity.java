package com.example.hotelreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.CompoundButton;
import android.widget.TextView;

import org.w3c.dom.Text;

public class SignInActivity extends AppCompatActivity {

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

        btnSignIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                //I want to go to the the main page
                Intent intent = new Intent(SignInActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        btnSignUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                DialogSignUp dialogSignUp = new DialogSignUp();
                dialogSignUp.show(getSupportFragmentManager(), "123");
            }
        });

    }
}
