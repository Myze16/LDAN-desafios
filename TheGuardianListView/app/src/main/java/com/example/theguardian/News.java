package com.example.theguardian;

public class News {
    private String title;
    private String subtitle;
    private String description;
    private String importance;
    private int imageResourceId;
    private int time;

    public News(String title, String subtitle, String description, String importance, int imageResourceId, int time) {
        this.title = title;
        this.subtitle = subtitle;
        this.description = description;
        this.importance = importance; // hot, regular, cold
        this.imageResourceId = imageResourceId;
        this.time = time;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getSubtitle() {
        return subtitle;
    }

    public void setSubtitle(String subtitle) {
        this.subtitle = subtitle;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getImportance() {
        return importance;
    }

    public void setImportance(String importance) {
        this.importance = importance;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    public void setImageResourceId(int imageResourceId) {
        this.imageResourceId = imageResourceId;
    }

    public int getTime() {
        return time;
    }

    public void setTime(int time) {
        this.time = time;
    }
}
