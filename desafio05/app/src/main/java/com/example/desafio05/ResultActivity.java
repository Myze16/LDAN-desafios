package com.example.desafio05;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import androidx.annotation.Nullable;

public class ResultActivity extends Activity {
    Double CDIByYear = 10.4;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.result);
        long days = getIntent().getLongExtra("days", 0);
        double amount = getIntent().getDoubleExtra("amount", 0);
        double tax = getIntent().getDoubleExtra("tax", 0);

        TextView valueDisplay = findViewById(R.id.amount);
        TextView valueDisplayd = findViewById(R.id.tax);
        TextView valueDisplaya = findViewById(R.id.days);

        valueDisplaya.setText(String.valueOf(days));
        valueDisplayd.setText(String.valueOf(tax));
        valueDisplay.setText(String.valueOf(amount));
    }

    private double calculateCDIByDay(double amount, double tax, long day) {
        // taxa diaria, descobrir o percentual sobre a taxa diária
        double taxByDay = ((tax / 100) * ((this.CDIByYear / 12) / 30));
        return taxByDay * day * amount;
    }
}
