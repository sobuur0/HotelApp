package com.example.hotelreservation;


import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import com.example.hotelreservation.databinding.ActivityHotelListBinding;

public class HotelListActivity extends AppCompatActivity {

    private ActivityHotelListBinding binding;
    int currentIndex = 0;
    HotelsAndNames[] mHotelsAndNames = new HotelsAndNames[] {
        new HotelsAndNames(R.drawable.bcksignup, R.string.hotel_1),
            new HotelsAndNames(R.drawable.amex, R.string.last_name)
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        binding = ActivityHotelListBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        int myName = mHotelsAndNames[currentIndex].getHotelName();
        int myHotel = mHotelsAndNames[currentIndex].getHotelPic();
        binding.txtHotelName.setText(myName);
        binding.imgHotelPic.setImageResource(myHotel);
    }


}
