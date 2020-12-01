package com.example.hotelreservation;

import android.widget.ImageView;

public class HotelsAndNames {
    private ImageView mHotelPic;
    private String mHotelName;

    public HotelsAndNames(ImageView hotelPic, String hotelName) {
        this.mHotelName = hotelName;
        this.mHotelPic = hotelPic;
    }

    public ImageView getHotelPic() {
        return mHotelPic;
    }

    public void setHotelPic(ImageView hotelPic) {
        mHotelPic = hotelPic;
    }

    public String getHotelName() {
        return mHotelName;
    }

    public void setHotelName(String hotelName) {
        mHotelName = hotelName;
    }
}
