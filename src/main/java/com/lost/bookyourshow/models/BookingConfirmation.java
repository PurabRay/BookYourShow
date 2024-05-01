package com.lost.bookyourshow.models;

import com.lost.bookyourshow.models.dtos.SeatDto;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;
@Getter
@Setter
public class BookingConfirmation {
    Movie movie = new Movie();
    private Long Id = movie.getId();
    private String MovieTitle = movie.getName();
    private Date showtime = movie.getShowtime();
    Seat seat = new Seat();






}
