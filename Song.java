package com.CarlosDegollado;

public abstract class Song {
    private String title;
    private String artist;

    protected Song(String title, String artist)
    {
        this.title = title;
        this.artist = artist;
    }

    public String toString()
    {
        return this.title + "--" + this.artist;
    }
}
