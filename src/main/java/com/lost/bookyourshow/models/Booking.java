package com.lost.bookyourshow.models;

public class Booking {
    private Long id;

    private Long CustomerId;
    private Long movieId;
    private Long cinemaId;
    List<List<Seat>> seats;

}
