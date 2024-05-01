package com.lost.bookyourshow.models.dtos;

import com.lost.bookyourshow.models.BookingConfirmation;
import lombok.Getter;
import lombok.Setter;

import java.util.Date;

@Getter
@Setter
public class BookingConfirmationDto {
    private long id;
    private Date showtime;
    private String moviename;
    private String seatroll;
    private int roll;
    private int col;



}
