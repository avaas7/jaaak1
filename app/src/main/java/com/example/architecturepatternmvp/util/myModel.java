package com.example.architecturepatternmvp.util;


public class myModel {
    private String name;
    private int downloads;
    private float rating;

    public myModel(String name, int downloads, float rating) {
        this.name = name;
        this.downloads = downloads;
        this.rating = rating;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getDownloads() {
        return downloads;
    }

    public void setDownloads(int downloads) {
        this.downloads = downloads;
    }

    public float getRating() {
        return rating;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

}
