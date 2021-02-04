package com.example.hotelreservation;

import android.content.Context;

import java.util.ArrayList;
import java.util.List;

public class HotelList {
    private static HotelList sHotelList;

    private List<HotelsAndNames> mHotelsAndNames;

    public static HotelList get(Context context) {
        if (sHotelList == null) {
            sHotelList = new HotelList(context);
        }
        return sHotelList;
    }

    private HotelList(Context context) {
        mHotelsAndNames = new ArrayList<>();
        for (int i=0; i<100; i++) {
            HotelsAndNames hotelsAndNames = new HotelsAndNames();
            hotelsAndNames.setHotelName("Hotel No#" + i);
            hotelsAndNames.setHotelPic(R.drawable.bcksignup);
            hotelsAndNames.setHotelDescription("This is the description for hotel %d" + i);

            mHotelsAndNames.add(hotelsAndNames);
        }
    }

    public List<HotelsAndNames> getHotelsAndNames() {
        return mHotelsAndNames;
    }
}
