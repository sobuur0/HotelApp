package com.example.hotelreservation;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Intent;
import android.media.SoundPool;
import android.os.Bundle;
import android.util.Patterns;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class DialogSignUp extends AppCompatActivity {

    Animation mAnimFast;
    int midBeep = -1;
    SoundPool mSp;

    @Override
   protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dialog_sign_up);

//        //Instantiate SoundPool for old and new android versions
//        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
//            AudioAttributes audioAttributes = new
//                    AudioAttributes.Builder()
//                    .setUsage(AudioAttributes.USAGE_NOTIFICATION)
//                    .setContentType(AudioAttributes.CONTENT_TYPE_SONIFICATION)
//                    .build();
//
//            mSp = new SoundPool.Builder()
//                    .setMaxStreams(5)
//                    .setAudioAttributes(audioAttributes)
//                    .build();
//        }else   {
//            mSp = new SoundPool(5,AudioManager.STREAM_MUSIC, 0);
//        }
//
//        try {
//            //Create 2 objects for AssetManager and AssetFileDescriptor
//            AssetManager assetManager = this.getAssets();
//            AssetFileDescriptor descriptor;
//
//            //Load the sound in memory
//            descriptor = assetManager.openFd("fx2.wav");
//            midBeep = mSp.load(descriptor, 0);
//        }catch (IOException e) {
//            //Print error message
//            Log.e("Error", "failed to load sound files");
//        }

        mAnimFast = AnimationUtils.loadAnimation(getApplicationContext(), R.anim.fash_test);
        mAnimFast.setDuration(1000);

        TextView signUp = findViewById(R.id.sinUp);
        signUp.setAnimation(mAnimFast);

        Button nextScreen = findViewById(R.id.btnSigned_up);
        nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                if (validateEmail()) {
                    Intent intent = new Intent(DialogSignUp.this, MainActivity.class);//
                    startActivity(intent);
                }
            }
        });


    }

    private boolean validateEmail() {
        EditText email = findViewById(R.id.edtEmail);
        String getEmail = email.toString();
        if(email.getText().toString().trim().isEmpty()){
            email.setError("Email field cannot be Empty");
            return false;
        }else if (!Patterns.EMAIL_ADDRESS.matcher(getEmail).matches()){
            email.setError("Email address is Invalid");
            return false;
        }else {
            return true;
        }

   }


}