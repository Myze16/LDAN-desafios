package com.example.desafio05;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.DatePickerDialog;
import android.widget.EditText;
import android.widget.TextView;

import androidx.annotation.Nullable;

import java.util.Calendar;
import java.sql.Timestamp;
import java.time.Duration;
import java.time.Instant;

public class HomeActivity extends Activity {
    public long timestamp;
    public long daysToFinalDate;
    EditText datePicker;
    public String daysToEnd;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        datePicker = findViewById(R.id.date);

        datePicker.setOnClickListener(v -> showDatePickerDialog());
    }

    private void showDatePickerDialog() {
        final Calendar calendar = Calendar.getInstance();
        int year = calendar.get(Calendar.YEAR);
        int month = calendar.get(Calendar.MONTH);
        int day = calendar.get(Calendar.DAY_OF_MONTH);

        DatePickerDialog datePickerDialog = new DatePickerDialog(
                HomeActivity.this,
                (view, yearSelected, monthOfYear, dayOfMonth) -> {
                    String selectedDate = dayOfMonth + "/" + (monthOfYear + 1) + "/" + yearSelected;
                    Date date = new Date(yearSelected, monthOfYear, dayOfMonth);
                    Date currentDate = new Date();
                    int teste = date.getHours() - currentDate.getHours();
                    HomeActivity.this.timestamp = teste;
                    datePicker.setText(selectedDate);
                },
                year, month, day);

        datePickerDialog.show();
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button button = findViewById(R.id.calculate);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                EditText iAmount = findViewById(R.id.amount);
                EditText iTax = findViewById(R.id.tax);
                double amount = Double.parseDouble(iAmount.getText().toString());
                double tax = Double.parseDouble(iTax.getText().toString());
                //double result = HomeActivity.this.calculateCDI(amount, tax, HomeActivity.this.timestamp);
                TextView teste = findViewById(R.id.result_text);
                teste.setText(String.valueOf(HomeActivity.this.timestamp));

//                Intent resultCDI = new Intent(HomeActivity.this, ResultActivity.class);
//                resultCDI.putExtra("result", result);
//                startActivity(resultCDI);
            }
        });
    }

    private double calculateCDI(double amount, double tax, long date) {

        return 0.1; //array dos valores
    }
}
