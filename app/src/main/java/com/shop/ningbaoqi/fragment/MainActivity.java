package com.shop.ningbaoqi.fragment;

import android.app.FragmentTransaction;
import android.content.Intent;
import android.support.annotation.IdRes;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends AppCompatActivity implements RadioGroup.OnCheckedChangeListener {
    private RadioGroup radioGroup;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        radioGroup = (RadioGroup) findViewById(R.id.radiogroup);
        radioGroup.setOnCheckedChangeListener(this);
    }

    @Override
    public void onCheckedChanged(RadioGroup group, @IdRes int checkedId) {
        switch (checkedId) {
            case R.id.first:
                Intent intent = new Intent(this, MainActivity2.class);
                startActivity(intent);
                break;
            case R.id.second:
                MyFragment2 myFragment2 = new MyFragment2();
                FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
                fragmentTransaction.add(R.id.frame, myFragment2);
                fragmentTransaction.addToBackStack(null);
                fragmentTransaction.commit();
                break;
            case R.id.third:
                break;
            case R.id.forth:
                break;
        }
    }
}
