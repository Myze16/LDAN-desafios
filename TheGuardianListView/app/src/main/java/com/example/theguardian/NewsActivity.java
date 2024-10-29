package com.example.theguardian;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Button;

public class NewsActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.news);

        Intent intent = getIntent();
        String title = intent.getStringExtra("title");
        String subtitle = intent.getStringExtra("subtitle");
        String description = intent.getStringExtra("description");
        int imageResourceId = intent.getIntExtra("imageResourceId", -1);
        int time = intent.getIntExtra("time", 0);

        TextView titleTextView = findViewById(R.id.newsTitle);
        TextView subtitleTextView = findViewById(R.id.newsSubtitle);
        TextView descriptionTextView = findViewById(R.id.newsDescription);
        ImageView imageView = findViewById(R.id.newsImage);
        TextView timeTextView = findViewById(R.id.newsTime);
        Button backButton = findViewById(R.id.backButton);

        titleTextView.setText(title);
        subtitleTextView.setText(subtitle);
        descriptionTextView.setText(description);
        imageView.setImageResource(imageResourceId);
        timeTextView.setText(time + "min ago");

        backButton.setOnClickListener(v -> {
            Intent backIntent = new Intent(NewsActivity.this, MainActivity.class);
            startActivity(backIntent);
        });
    }
}