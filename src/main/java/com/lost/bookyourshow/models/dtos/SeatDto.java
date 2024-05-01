package com.lost.bookyourshow.models.dtos;

import lombok.Getter;
import lombok.Setter;


public class SeatDto {
    private int row;
    private int col;
    public int getRow() {
        return row;
    }

    public void setRow(int row) {
        this.row = row;
    }

    public int getCol() {
        return col;
    }

    public void setCol(int col) {
        this.col = col;
    }




}

