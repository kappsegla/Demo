package se.newton.martin.gson;

public class Movie {
    private String title;
    private int year;
    private double length;

    public Movie(String title, int year, double length) {
        this.title = title;
        this.year = year;
        this.length = length;
    }

    public String getTitle() {
        return title;
    }

    public int getYear() {
        return year;
    }

    public double getLength() {
        return length;
    }
}
