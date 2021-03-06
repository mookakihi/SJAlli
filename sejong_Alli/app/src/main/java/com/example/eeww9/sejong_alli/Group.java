package com.example.eeww9.sejong_alli;

import android.annotation.SuppressLint;
import android.content.Context;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.content.Context;
import android.app.Activity;
import android.widget.CompoundButton;
import android.widget.Switch;
import android.widget.Toast;

@SuppressLint("ValidFragment")
public class Group extends Fragment{
    Context mContext;
    Switch groupOnOff;

    public Group(Context context){
        mContext = context;
    }

    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.group, null);

        groupOnOff = (Switch) view.findViewById(R.id.groupSwitch);
        groupOnOff.setOnCheckedChangeListener(new Switch.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if(isChecked){
                    Toast.makeText( mContext.getApplicationContext(),"Out Push On",Toast.LENGTH_SHORT).show();
                }else{
                    Toast.makeText( mContext.getApplicationContext(),"Out Push Off",Toast.LENGTH_SHORT).show();
                }
            }
        });
        return view;
    }
}
