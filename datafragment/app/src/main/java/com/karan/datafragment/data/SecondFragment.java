package com.karan.datafragment.data;

import android.os.Bundle;

import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.karan.datafragment.R;


public class SecondFragment extends Fragment {
    TextView textView;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView=inflater.inflate(R.layout.fragment_second, container, false);
        textView=myView.findViewById(R.id.textview);
        Bundle bundle=getArguments();
        textView.setText(bundle.getString("name_key")+"\n"+bundle.getString("phone_key"));
        return myView;
    }
}