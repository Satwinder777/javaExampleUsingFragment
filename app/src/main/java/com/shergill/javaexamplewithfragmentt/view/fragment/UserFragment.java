package com.shergill.javaexamplewithfragmentt.view.fragment;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.shergill.javaexamplewithfragmentt.R;

public class UserFragment extends Fragment {

    UserInterface listner;
    EditText fname,lname;
    Button btn;
//    public UserFragment() {
//        // Required empty public constructor
//    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_user, container, false);


    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        fname = view.findViewById(R.id.textView);
        lname = view.findViewById(R.id.textView2);
        btn = view.findViewById(R.id.button);


        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                listner.data(fname.getText().toString()+" "+lname.getText().toString());
            }
        });
    }

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        if (context instanceof UserInterface){
            listner = (UserInterface) context;
        }else{

            throw new RuntimeException("Activity must implement UserInterface");
        }
    }

    public interface UserInterface {
         void data(String data);
    }
}