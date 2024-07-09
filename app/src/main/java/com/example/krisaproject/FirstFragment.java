package com.example.krisaproject;

import android.content.Context;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;


public class FirstFragment extends Fragment {
    TextView textView;
    EditText email;
    EditText pass;
    Button btn_sub;
    FragmentDataInterface fragmentDataInterface;

    @Override
    public void onAttach(@NonNull Context context) {
        super.onAttach(context);
        fragmentDataInterface = (FragmentDataInterface) context;
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        // Inflate the layout for this fragment
        View v= inflater.inflate(R.layout.fragment_first, container, false);
        textView = v.findViewById(R.id.tv_fragment1);
        email = v.findViewById(R.id.editTextEmail);
        pass = v.findViewById(R.id.editTextPassword);
        btn_sub = v.findViewById(R.id.buttonLogin);

        btn_sub.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String e = String.valueOf(email.getText());
                String p = String.valueOf(pass.getText());
                fragmentDataInterface.sendDataToActivity(e + p);
            }
        });
        return v;
    }
    public  void  receivedData(String  d){
        textView.setText(d);
    }
}