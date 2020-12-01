package com.example.hotelreservation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        Intent userIntent = new Intent();
//        CharSequence user_mail = userIntent.getStringExtra("USER_MAIL");
//
//        Log.i("infooooooooooooo", "My mail is " + user_mail );

//        MediaPlayer mp = new MediaPlayer();
//        try {
//            mp.setDataSource("do.mp3");
//            mp.prepare();
//            mp.start();
//        } catch (IOException e) {
//            e.printStackTrace();
//        }

        FragmentManager fragmentManager = getSupportFragmentManager();
        Fragment frag = fragmentManager.findFragmentById(R.id.FragmentsHolder);

        if (frag == null) {
            frag = new HotelListActivity();
            fragmentManager.beginTransaction()
                    .add(R.id.FragmentsHolder, frag)
                    .commit();
        }

    }
}
