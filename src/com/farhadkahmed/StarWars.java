package com.farhadkahmed;

// Inheritance: The StarWars class extends from the Movie class. This is an "is a" relation.
public class StarWars extends Movie {
    private int length;
    private int rating;
    private int episode;
    private String releaseDate;

    public StarWars(String name, int length, int rating, String releaseDate) {
        super(name);
        this.length = length;
        this.rating = rating;
        this.episode = episode;
        this.releaseDate = releaseDate;
    }
}
