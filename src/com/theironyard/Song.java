package com.theironyard;

public class Song {
    String title;
    String artist;
    String rating;
    String bpm;
    //four instance variables for the four song attributes in the file.

    Song(String t, String a, String r, String b) {
        title = t;
        artist = a;
        rating = r;
        bpm = b;
        //The variables are all set in the constructor when the new Song is created.
    }

    public String getTitle() {
        return title;
    }

    public String getArtist() {
            return artist;
    }

    public String getRating() {
        return rating;
    }

    public String getBpm() {
        return bpm;
    }

    public String toString() {
        return title;
    }
}
