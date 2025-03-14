package com.Hotel.Models.Actors;

import com.Hotel.Models.Rooms.RoomBooking;
import com.Hotel.Service.BookingService;
import com.Hotel.Service.SearchService;

public class Receptionist {
    SearchService searchService;
    BookingService bookingService;

    public void checkInGuest(Guest guest, RoomBooking roomBooking){}
    public void checkOutGuest(Guest guest, RoomBooking roomBooking){}
}
