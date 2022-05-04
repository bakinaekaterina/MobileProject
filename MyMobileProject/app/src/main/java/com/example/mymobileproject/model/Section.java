package com.example.mymobileproject.model;

public class Section {

    int id, category;
    String title;

    public Section(int id, String title, int category) {
        this.id = id;
        this.title = title;
        this.category = category;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getCategory() {return category;}

    public void setCategory(int category) {this.category = category;}
}
