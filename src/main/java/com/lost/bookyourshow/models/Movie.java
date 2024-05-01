package com.lost.bookyourshow.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Date;
import java.util.List;

@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Movie {


    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)

    private Long id;
    private String name;
    private String director;
    private Date releaseDate;
    private Double price;
    private Integer duration;


    @ManyToMany
    private List<CinemaHall> cinemaHalls;
    Genre genre;


}

