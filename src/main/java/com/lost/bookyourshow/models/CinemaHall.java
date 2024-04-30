package com.lost.bookyourshow.models;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
@NoArgsConstructor
@Entity
public class CinemaHall {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String location;
    @OneToMany
    private List<Seat> seats;
    @OneToMany
    private List<Show> shows;
    private Long capacity;
    private Double basePrice;
    private CinemaType cinemaType;


    public CinemaHall(Long id, String name, String location, List<Seat> seats, List<Show> shows, Long capacity, Double basePrice, CinemaType cinemaType) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.seats = seats;
        this.shows = shows;
        this.capacity = capacity;
        this.basePrice = basePrice;
        this.cinemaType = cinemaType;
    }


}
