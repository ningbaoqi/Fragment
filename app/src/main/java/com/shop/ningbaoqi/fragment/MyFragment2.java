package com.shop.ningbaoqi.fragment;

import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.TextView;
import android.widget.Toast;

@SuppressLint("ValidFragment")
class MyFragment2 extends Fragment {
    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment, container, false);
        TextView textView = view.findViewById(R.id.text);
        textView.setText("动态加载");
        Bundle arguments = getArguments();
        String text = (String) arguments.get("aaa");
        textView.setText(text);
        textView.setTextColor(Color.WHITE);
        Toast.makeText(getActivity(), "已收到数据", Toast.LENGTH_LONG).show();
        return view;
    }
}
