package com.example.hotelreservation;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.InputType;
import android.widget.Button;

import com.braintreepayments.cardform.view.CardForm;

public class CardDetails extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_card_details);

//        CardForm cardForm = findViewById(R.id.card_form);
        Button buy = findViewById(R.id.btnBuy);

//        cardForm.cardRequired(true)
//                .expirationRequired(true)
//                .cvvRequired(true)
//                .postalCodeRequired(true)
//                .mobileNumberRequired(true)
//                .mobileNumberExplanation("SMS is required on this number")
//                .setup(CardDetails.this);
//        cardForm.getCvvEditText().setInputType(InputType.TYPE_CLASS_NUMBER | InputType.TYPE_NUMBER_VARIATION_PASSWORD);
    }
}