package com.shop.ningbaoqi.fragment;

import android.support.v7.app.AppCompatActivity;
import android.widget.RadioGroup;
import android.widget.Toast;

public class Activity2 extends AppCompatActivity implements MyFragment3.MyListener {
    private RadioGroup radioGroup;
    private MyFragment3 myFragment2;

    @Override
    public void thanks(String code) {
        Toast.makeText(this, code, Toast.LENGTH_LONG).show();
    }
}
