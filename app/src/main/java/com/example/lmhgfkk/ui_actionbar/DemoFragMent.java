package com.example.lmhgfkk.ui_actionbar;


import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

// 这个类的实例是一个代表了数据集中一个对象的fragment
public class DemoFragMent extends Fragment {
    public static final String ARG="Fragment";
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {

        View view = inflater.inflate(R.layout.demofragment, container, false);
        Bundle arguments = getArguments();
        int argumentsInt = arguments.getInt(DemoFragMent.ARG);
        TextView tv = (TextView) view.findViewById(R.id.tv);
        tv.setText("Tab"+argumentsInt);
        return view;
    }
}
