package com.CarlosDegollado;

public class FolkSong extends Song {
    private String country;
    private int year;

    public FolkSong(String t, String a, String c, int y) {
        super(t,a);
        this.country = c;
        this.year = y;
    }

    @Override
    public String toString() {
        return super.toString() + "--" + this.country + "--" + this.year;
    }

    @Override
    public boolean equals(Object obj) {
        boolean result;
        if ((obj == null) || (this.getClass() != obj.getClass())) {
            result = false;
        } else {
            FolkSong other = (FolkSong) obj;
            result = (this.country.equals(other.country) && (this.year == other.year));
        }
        return result;
    }
}
