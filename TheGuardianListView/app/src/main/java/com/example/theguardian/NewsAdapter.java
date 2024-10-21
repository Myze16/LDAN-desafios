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

        // list_news layout precisa estar de acordo com aqui
        TextView nameTextView = convertView.findViewById(R.id.contactName);
        TextView ageTextView = convertView.findViewById(R.id.contactAge);
        ImageView imageView = convertView.findViewById(R.id.contactImage);
        nameTextView.setText(currentNews.getName());
        imageView.setImageResource(currentNews.getImageResourceId());
        ageTextView.setText(currentNews.getAge() + "min ago");
        return convertView;
    }
}
