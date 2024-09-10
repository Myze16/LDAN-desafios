package com.example.desafio05;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ResultActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        long startValue = getIntent().getLongExtra("result", 0);
        TextView valueDisplay = findViewById(R.id.result);
        valueDisplay.setText(String.valueOf(startValue));
    }
}
