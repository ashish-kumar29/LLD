package com.Hotel.Models.Actors;

import com.Hotel.Models.Rooms.RoomBooking;
import com.Hotel.Service.BookingService;
import com.Hotel.Service.SearchService;

import java.util.List;

public class Guest extends Person{
    SearchService searchObj;
    BookingService roomBooking;
    public List<RoomBooking> getAllRoomBookings(){
        return null;
    }
}
