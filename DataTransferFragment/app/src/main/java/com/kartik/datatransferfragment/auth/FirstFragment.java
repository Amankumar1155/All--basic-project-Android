package com.kartik.datatransferfragment.auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.kartik.datatransferfragment.R;


public class FirstFragment extends Fragment {
EditText e1,e2;
Button b1;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myview =  inflater.inflate(R.layout.fragment_first, container, false);
        e1 = myview.findViewById(R.id.edittext1);
        e2 = myview.findViewById(R.id.edittext2);
        b1 = myview.findViewById(R.id.button);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String name = e1.getText().toString();
                String phone = e2.getText().toString();

                SecondFragment frg = new SecondFragment();

                Bundle bundle = new Bundle();
                bundle.putString("name_key",name);
                bundle.putString("phone_key",phone);

                frg.setArguments(bundle);

                FragmentManager fm = getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.mainpage,frg);
                ft.addToBackStack("");
                ft.commit();
            }
        });
        return myview;
    }
}