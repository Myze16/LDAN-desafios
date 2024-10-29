package com.example.theguardian;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;

import java.util.List;

public class NewsAdapter extends ArrayAdapter<News> {
    List<News> newsList;

    public NewsAdapter(@NonNull Context context, List<News> newsList) {
        super(context, 0, newsList);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_news, parent, false);
        }
        News currentNews = getItem(position);

        TextView titleTextView = convertView.findViewById(R.id.listNewsTitle);
        TextView subtitleTextView = convertView.findViewById(R.id.listNewsSubtitle);
        TextView timeTextView = convertView.findViewById(R.id.listNewsTime);
        ImageView imageView = convertView.findViewById(R.id.listNewsImage);

        titleTextView.setText(currentNews.getTitle());
        subtitleTextView.setText(currentNews.getSubtitle());
        timeTextView.setText(currentNews.getTime() + "min ago");
        imageView.setImageResource(currentNews.getImageResourceId());

        return convertView;
    }
}
