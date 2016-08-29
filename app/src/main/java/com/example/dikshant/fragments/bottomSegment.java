package com.example.dikshant.fragments;

import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.TextView;

public class bottomSegment extends Fragment{

    private static TextView text1;
    private static TextView text2;

    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.bottomsegment,container,false);
         text1 = (TextView) view.findViewById(R.id.t1);
         text2 = (TextView) view.findViewById(R.id.t2);
        return view;
    }

    public void setMemeText(String Top, String bottom)
    {
        text1.setText(Top);
        text2.setText(bottom);
    }
}
