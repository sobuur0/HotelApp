package com.example.hotelreservation;


import android.os.Bundle;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import com.example.hotelreservation.databinding.ActivityHotelListBinding;

public class HotelListActivity extends AppCompatActivity {

    ActivityHotelListBinding binding;
    int currentIndex = 0;
    HotelsAndNames[] mHotelsAndNames = new HotelsAndNames[] {
        new HotelsAndNames(R.drawable.bcksignup, R.string.app_name),
            new HotelsAndNames(R.drawable.amex, R.string.last_name)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = new ActivityHotelListBinding();
        setContentView(binding.getRoot());
        mHotelsAndNames = new HotelsAndNames[]{};

//        int myName = mHotelsAndName
//        binding.txtHotelName.setText(myName);
    }


}
