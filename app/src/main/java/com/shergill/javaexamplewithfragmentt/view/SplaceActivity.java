package com.shergill.javaexamplewithfragmentt.view;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;

import com.shergill.javaexamplewithfragmentt.R;
import com.shergill.javaexamplewithfragmentt.view.activity.DashBoardActivity;
import com.shergill.javaexamplewithfragmentt.view.activity.MainActivity;

public class SplaceActivity extends AppCompatActivity {

    int SplaceDelay = 3000;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splace);

        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(SplaceActivity.this, DashBoardActivity.class);
                startActivity(intent);
                finish();
            }
        },SplaceDelay);
    }
}