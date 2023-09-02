package com.kartik.datatransferfragment.auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.kartik.datatransferfragment.R;


public class SecondFragment extends Fragment {
TextView t1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myview = inflater.inflate(R.layout.fragment_second, container, false);

        t1 = myview.findViewById(R.id.textview);

        Bundle bundle = getArguments();
        t1.setText(bundle.getString("name_key") + "\n" + bundle.getString("phone_key"));


        return myview;
    }
}