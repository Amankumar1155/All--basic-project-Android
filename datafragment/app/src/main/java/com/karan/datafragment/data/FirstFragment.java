package com.karan.datafragment.data;

import android.os.Bundle;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;

import com.karan.datafragment.R;


public class FirstFragment extends Fragment {
    EditText e1,e2;
    Button btn;



    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        View myView=inflater.inflate(R.layout.fragment_first, container, false);
        e1=myView.findViewById(R.id.edittext1);
        e2=myView.findViewById(R.id.edittext2);
        btn=myView.findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view)
            {
               String name=e1.getText().toString();
               String phone=e2.getText().toString();
               SecondFragment frg=new SecondFragment();
               Bundle bundle=new Bundle();
               bundle.putString("name_key",name);
               bundle.putString("phone_key",phone);
               frg.setArguments(bundle);
                FragmentManager fm=getFragmentManager();
                FragmentTransaction ft=fm.beginTransaction();
                ft.replace(R.id.mainpage,frg);
                ft.addToBackStack("");
                ft.commit();
            }
        });
        return myView;
    }
}