package com.example.hotelreservation;

import android.widget.ImageView;

public class HotelsAndNames {
    private int mHotelPic;
    private int mHotelName;
    private int mHotelDescription;

    public HotelsAndNames(int hotelPic, int hotelName, int hotelDescription) {
        this.mHotelName = hotelName;
        this.mHotelPic = hotelPic;
        this.mHotelDescription = hotelDescription;
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

    public int getHotelDescription() {
        return mHotelDescription;
    }

    public void setHotelDescription(int hotelDescription) {
        mHotelDescription = hotelDescription;
    }
}
