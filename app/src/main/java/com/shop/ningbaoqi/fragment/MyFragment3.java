package com.shop.ningbaoqi.fragment;

import android.content.Context;
import android.graphics.Color;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

public class MyFragment3 extends Fragment {
    private String code = "thanks";
    public MyListener listener;

    public interface MyListener {
        void thanks(String code);
    }

    @Override
    public void onAttach(Context context) {
        listener = (MyListener) context;
        super.onAttach(context);
    }

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        textView.setText(text);
        textView.setTextColor(Color.WHITE);
        Toast.makeText(getActivity(), "已收到数据", Toast.LENGTH_LONG).show();
        listener.thanks(code);
        return view;
    }
}
