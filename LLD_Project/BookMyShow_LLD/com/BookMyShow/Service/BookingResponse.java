package com.BookMyShow.Service;

import com.BookMyShow.Common.Ticket;

import java.util.List;

public class BookingResponse {
    boolean success;
    String message;
    Ticket ticket;
    SelectSeat selectedSeat;


    public BookingResponse(boolean success, SelectSeat selectedSeat) {
        this.success = success;
        this.selectedSeat = selectedSeat;
    }
}
