package com.example.dikshant.fragments;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.View;
import android.widget.EditText;
import android.widget.Button;
import android.app.Activity;

public class TopSection extends Fragment {

    TopSectionListener activityCommander;

    private static EditText topTextInput;
    private static EditText bottomTextInput;

    public interface TopSectionListener{
    public void createMeme(String Top , String Bottom);
    }

    @Override
    public void onAttach(Activity activity) {
        super.onAttach(activity);
        try{
            activityCommander = (TopSectionListener) activity;
        } catch(ClassCastException e){
            throw new ClassCastException(activity.toString());
        }
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.top_section_fragment,container,false);


        topTextInput = (EditText) view.findViewById(R.id.t1);
        bottomTextInput = (EditText) view.findViewById(R.id.t2);
        final Button b1 = (Button) view.findViewById(R.id.b1);

        b1.setOnClickListener(
                new View.OnClickListener(){
                    public void onClick(View v)
                    {
                       buttonClicked(v);
                    }
                }

        );

        return view;
    }
    public void buttonClicked(View view)
    {
        activityCommander.createMeme(topTextInput.getText().toString(),bottomTextInput.getText().toString());
    }
}
