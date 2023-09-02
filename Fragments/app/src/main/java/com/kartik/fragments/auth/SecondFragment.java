package com.kartik.fragments.auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.kartik.fragments.R;


public class SecondFragment extends Fragment {
    Button btn;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_second, container, false);
        btn = myView.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.mainpage, new ThirdFragment());
                ft.addToBackStack("");
                ft.commit();

                Toast.makeText(getActivity(), "This is Second Fragment", Toast.LENGTH_SHORT).show();
            }


        });
        return myView;
    }
}