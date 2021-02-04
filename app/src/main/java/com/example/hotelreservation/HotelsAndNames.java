package com.example.hotelreservation;

import android.widget.ImageView;

public class HotelsAndNames {
    private int mHotelPic;
    private String mHotelName;
    private String mHotelDescription;

    public HotelsAndNames(int hotelPic, String hotelName, String hotelDescription) {
        this.mHotelName = hotelName;
        this.mHotelPic = hotelPic;
        this.mHotelDescription = hotelDescription;
    }

    public HotelsAndNames() {}


    public int getHotelPic() {
        return mHotelPic;
    }

    public void setHotelPic(int hotelPic) {
        mHotelPic = hotelPic;
    }

    public String getHotelName() {
        return mHotelName;
    }

    public void setHotelName(String hotelName) {
        mHotelName = hotelName;
    }

    public String getHotelDescription() {
        return mHotelDescription;
    }

    public void setHotelDescription(String hotelDescription) {
        mHotelDescription = hotelDescription;
    }
}
