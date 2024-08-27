package com.example.desafio04;

import android.app.Activity;
import android.os.Bundle;

import androidx.annotation.Nullable;

public class SecondaryActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.cruzeiro);
    }

    @Override
    protected void onStart() {
        super.onStart();
    }

    @Override
    protected void onResume() {
        super.onResume();
    }

}
