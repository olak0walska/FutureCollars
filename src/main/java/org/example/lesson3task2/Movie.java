package org.example.lesson3task2;

public class Movie {
    final private String title;
    final private String nameOfDirector;
    final private int durationInMinutes;
    final private int releaseYear;

    public Movie(String title, String nameOfDirector, int durationInMinutes, int releaseYear) {
        this.title = title;
        this.nameOfDirector = nameOfDirector;
        this.durationInMinutes = durationInMinutes;
        this.releaseYear = releaseYear;
    }
}