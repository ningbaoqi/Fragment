package com.shop.ningbaoqi.fragment;

import android.app.FragmentTransaction;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

public class Activity1 extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main);
        MyFragment2 myFragment2 = new MyFragment2();
        Bundle bundle = new Bundle();
        bundle.putString("aaa", "hello world");
        myFragment2.setArguments(bundle);
        FragmentTransaction fragmentTransaction = getFragmentManager().beginTransaction();
        fragmentTransaction.add(R.id.frame, myFragment2);
        fragmentTransaction.addToBackStack(null);
        fragmentTransaction.commit();
    }
}
