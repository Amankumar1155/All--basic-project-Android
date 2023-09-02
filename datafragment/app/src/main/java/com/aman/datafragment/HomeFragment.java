package com.aman.datafragment;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;


public class HomeFragment extends Fragment {
    TextView textView;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView=inflater.inflate(R.layout.fragment_home, container, false);
        textView=myView.findViewById(R.id.textview);
        Bundle bundle=getArguments();
        textView.setText(bundle.getString("key_name")+"\n"+bundle.getString("phone_key"));
        return myView;

    }
}