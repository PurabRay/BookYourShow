package com.lost.bookyourshow.models;

public class Movie {
    private Long id;
    private String name;
    private Double price;
    private Integer duration;

    Genre genre;

    public Movie(Long id, String name, Double price, Integer duration, Genre genre) {
        this.id = id;
        this.name = name;
        this.price = price;
        this.duration = duration;
        this.genre = genre;
    }

}

