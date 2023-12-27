package com.shergill.javaexamplewithfragmentt.view.activity;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.FragmentContainerView;

import android.app.Fragment;
import android.os.AsyncTask;
import android.os.Bundle;
import android.util.Log;

import com.shergill.javaexamplewithfragmentt.R;
import com.shergill.javaexamplewithfragmentt.view.fragment.UserFragment;

public class MainActivity extends AppCompatActivity implements UserFragment.UserInterface {

    String tag = "ShergillSatta";
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

//        FragmentContainerView fragmentContainerView = findViewById(R.id.fragment_container);

        UserFragment fragment = new UserFragment();

        getSupportFragmentManager()
                .beginTransaction()
                .add(R.id.fragment_container, fragment)
                .commit();
    }


    @Override
    public void data(String data) {
        Log.e(tag, "data: "+data );

        AsyncTask task = new AsyncTask() {
            @Override
            protected Object doInBackground(Object[] objects) {

                int n = data.length();
                for (int i=0 ;i<=n; i++){
                    Log.e(tag, "doInBackground: "+i );
                }
                return null;
            }

            @Override
            protected void onPostExecute(Object o) {
                super.onPostExecute(o);

                Log.e(tag, "onPostExecute: task done!!" );
            }

        }.execute();
    }


}