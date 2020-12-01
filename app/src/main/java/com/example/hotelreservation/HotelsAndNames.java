package com.example.hotelreservation;

import android.widget.ImageView;

public class HotelsAndNames {
    private int mHotelPic;
    private int mHotelName;

    public HotelsAndNames(int hotelPic, int hotelName) {
        this.mHotelName = hotelName;
        this.mHotelPic = hotelPic;
    }

    public int getHotelPic() {
        return mHotelPic;
    }

    public void setHotelPic(int hotelPic) {
        mHotelPic = hotelPic;
    }

    public int getHotelName() {
        return mHotelName;
    }

    public void setHotelName(int hotelName) {
        mHotelName = hotelName;
    }
}
