package com.example.hotelreservation;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import com.example.hotelreservation.databinding.ActivityHotelListBinding;

public class HotelListActivity extends AppCompatActivity {

    private ActivityHotelListBinding binding;
//    int currentIndex = 0;
//    HotelsAndNames[] mHotelsAndNames = new HotelsAndNames[] {
//        new HotelsAndNames(R.drawable.bcksignup, R.string.hotel_1, R.string.hotel_description_1),
//            new HotelsAndNames(R.drawable.amex, R.string.hotel_2, R.string.hotel_description_2)
//    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHotelListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

//        int myName = mHotelsAndNames[currentIndex].getHotelName();
//        int myHotel = mHotelsAndNames[currentIndex].getHotelPic();
//        int myDescription = mHotelsAndNames[currentIndex].getHotelDescription();
//        binding.txtHotelDescription.setText(myDescription);
//        binding.txtHotelName.setText(myName);
//        binding.imgHotelPic.setImageResource(myHotel);

        FragmentManager fm = getSupportFragmentManager();
        Fragment fragment = fm.findFragmentById(R.id.fragment_container);

        if (fragment == null) {
            fragment = new HotelListFragment();
            fm.beginTransaction()
                    .add(R.id.fragment_container, fragment)
                    .commit();
        }
    }


}
