package com.example.theguardian;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;
import android.widget.Toast;

import androidx.annotation.Nullable;

import java.util.ArrayList;
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
            // fazer aparecer outra tela quando clicar aqui
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int position, long l) {
                News news = allNews.get(position);
                Toast.makeText(MainActivity.this, news.getName() + "/" + news.getAge() + " anos", Toast.LENGTH_LONG).show();
            }
        });
    }
}
