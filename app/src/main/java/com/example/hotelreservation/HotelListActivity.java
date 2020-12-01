package com.example.hotelreservation;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.hotelreservation.databinding.ActivityHotelListBinding;

public class HotelListActivity extends AppCompatActivity {

    ActivityHotelListBinding binding;
    int currentIndex = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = new ActivityHotelListBinding();
        setContentView(binding.getRoot());

//        String myName
//        binding.txtHotelName.setText(myName);
    }


}
