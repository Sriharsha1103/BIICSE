package com.vvit.myappcseb;

public class Movie {
    private String title;
    private String release_date;

    public Movie() {
    }

    public Movie(String title, String release_date) {
        this.title = title;
        this.release_date = release_date;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getRelease_date() {
        return release_date;
    }

    public void setRelease_date(String release_date) {
        this.release_date = release_date;
    }
}
