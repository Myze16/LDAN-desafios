package com.example.desafio04;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import androidx.annotation.Nullable;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.index);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Button button = findViewById(R.id.btn_n_rebaixamentos);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent worstTeam = new Intent(MainActivity.this, SecondaryActivity.class);
                startActivity(worstTeam);
            }
        });
    }
}
