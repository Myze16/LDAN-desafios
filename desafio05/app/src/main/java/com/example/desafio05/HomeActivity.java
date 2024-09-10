package com.example.desafio05;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.app.DatePickerDialog;
import android.widget.EditText;

import androidx.annotation.Nullable;

import java.util.Calendar;
import java.sql.Timestamp;
import java.time.Duration;
import java.util.Date;

public class HomeActivity extends Activity {
    EditText datePicker;
    public long daysToEnd;

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

        DatePickerDialog datePickerDialog = new DatePickerDialog(HomeActivity.this, (view, yearSelected, monthOfYear, dayOfMonth) -> {
            String selectedDate = dayOfMonth + "/" + (monthOfYear + 1) + "/" + yearSelected;
            HomeActivity.this.daysToEnd = Duration.between(new Timestamp(System.currentTimeMillis()).toInstant(), new Timestamp(new Date(yearSelected - 1900, monthOfYear, dayOfMonth).getTime()).toInstant()).toDays();
            datePicker.setText(selectedDate);
        }, year, month, day);

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

                Intent resultCDI = new Intent(HomeActivity.this, ResultActivity.class);
                resultCDI.putExtra("tax", tax);
                resultCDI.putExtra("amount", amount);
                resultCDI.putExtra("days", HomeActivity.this.daysToEnd);
                startActivity(resultCDI);
            }
        });
    }
}
