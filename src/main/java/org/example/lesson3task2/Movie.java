package org.example.lesson3task2;

public class Movie {
    static String title;
    String nameOfDirector;
    int duration;
    int releaseYear;

    public Movie() {
    }

    public Movie(String title, String nameOfDirector, int duration, int releaseYear) {
        this.title = title;
        this.nameOfDirector = nameOfDirector;
        this.duration = duration;
        this.releaseYear = releaseYear;
    }
}