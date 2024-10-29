package com.example.theguardian;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import androidx.annotation.Nullable;

import java.util.List;

public class MainActivity extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        NewsDB newsDB = new NewsDB();
        List<News> allNews = newsDB.getNewsList();

        NewsAdapter adapter = new NewsAdapter(this, allNews);
        ListView listView = findViewById(R.id.listView);
        listView.setAdapter(adapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                News news = allNews.get(position);

                Intent intent = new Intent(MainActivity.this, NewsActivity.class);
                intent.putExtra("title", news.getTitle());
                intent.putExtra("subtitle", news.getSubtitle());
                intent.putExtra("description", news.getDescription());
                intent.putExtra("imageResourceId", news.getImageResourceId());
                intent.putExtra("time", news.getTime());

                startActivity(intent);
            }
        });
    }
}
