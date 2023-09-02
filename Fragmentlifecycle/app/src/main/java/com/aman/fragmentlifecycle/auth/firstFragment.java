package com.aman.fragmentlifecycle.auth;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.Toast;

import com.aman.fragmentlifecycle.R;
import com.aman.fragmentlifecycle.secondFragment;


public class firstFragment extends Fragment {
    Button button;


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView = inflater.inflate(R.layout.fragment_first, container, false);
        button = myView.findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft = fm.beginTransaction();
                ft.replace(R.id.mainpage,new secondFragment());
                ft.addToBackStack("");
                ft.commit();


                Toast.makeText(getActivity(), "This is fragment", Toast.LENGTH_SHORT).show();
            }
        });
        return myView;
    }
}
