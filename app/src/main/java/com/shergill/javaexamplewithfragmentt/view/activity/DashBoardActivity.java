package com.shergill.javaexamplewithfragmentt.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.viewpager.widget.ViewPager;

import android.os.Bundle;
import android.util.Log;

import com.shergill.javaexamplewithfragmentt.R;
import com.shergill.javaexamplewithfragmentt.view.activity.pageradapter.MYPagerAdapter;
import com.shergill.javaexamplewithfragmentt.view.fragment.ClientFragment;
import com.shergill.javaexamplewithfragmentt.view.fragment.UserFragment;

import java.util.Arrays;
import java.util.List;

public class DashBoardActivity extends AppCompatActivity implements UserFragment.UserInterface {

    ViewPager viewPager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_dash_board);

        viewPager = findViewById(R.id.myviewpager);
        UserFragment fr = new UserFragment();
        ClientFragment fr1 = new ClientFragment();
        List<Fragment> fragments = Arrays.asList(fr,fr1);
        MYPagerAdapter adapter = new MYPagerAdapter(getSupportFragmentManager(),fragments);
        viewPager.setAdapter(adapter);

    }

    @Override
    public void data(String data) {
        Log.e("sattadashboard", "data: "+data);
    }


}