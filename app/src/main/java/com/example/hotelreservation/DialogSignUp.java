package com.example.hotelreservation;

import androidx.fragment.app.DialogFragment;

import android.app.AlertDialog;
import android.app.Dialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.AssetFileDescriptor;
import android.content.res.AssetManager;
import android.content.res.Resources;
import android.media.AudioAttributes;
import android.media.AudioManager;
import android.media.SoundPool;
import android.os.Build;
import android.os.Bundle;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.Button;
import android.widget.TextView;

import java.io.IOException;

public class DialogSignUp extends DialogFragment {

    Animation mAnimFast;
    int midBeep = -1;
    SoundPool mSp;

    @Override
   public Dialog onCreateDialog(Bundle savedInstanceState) {
        AlertDialog.Builder builder = new AlertDialog.Builder(getActivity());

        LayoutInflater inflater = getActivity().getLayoutInflater();
        View dialogView = inflater.inflate(R.layout.activity_dialog_sign_up, null);

        builder.setView(dialogView);

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

        mAnimFast = AnimationUtils.loadAnimation(getContext(), R.anim.fash_test);
        mAnimFast.setDuration(1000);

        TextView signUp = dialogView.findViewById(R.id.sinUp);
        signUp.setAnimation(mAnimFast);

        Button nextScreen = (Button) dialogView.findViewById(R.id.btnSigned_up);
        nextScreen.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getActivity(), CardDetails.class);//
                startActivity(intent);
            }
        });

        return builder.create();
    }

}