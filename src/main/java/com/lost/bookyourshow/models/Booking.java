package com.lost.bookyourshow.models;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.List;
@AllArgsConstructor
@Getter
@Setter
@Entity
@NoArgsConstructor
public class Booking {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private Long CustomerId;
    private Long movieId;
    private Long cinemaId;
    private Long noOfTickets;
    @ManyToMany
    private List<Seat> seats;
    @ManyToOne
    private Show show;
    private Double totalCost;

}
