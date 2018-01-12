package com.example.user1008.fragment;

import android.app.Fragment;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user1008 on 2018/1/11.
 */

public class MyFragment extends Fragment {

    @Override
    public View onCreateView(LayoutInflater inflater,  ViewGroup container, Bundle savedInstanceState) {

        View view=inflater.inflate(R.layout.fragment,container,false);
        TextView text=(TextView) view.findViewById(R.id.text1);
        text.setText("静态加载fragment");
        return  view;

    }
}
