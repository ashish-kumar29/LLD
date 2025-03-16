package com.BookMyShow.Common;

import com.BookMyShow.Models.Actors.RegisteredUser;
import com.BookMyShow.Models.Event.Event;
import com.BookMyShow.Models.Show.Show;
import com.BookMyShow.Models.Venue.Venue;

import java.util.List;

public class Ticket {
    RegisteredUser user;
    String ticketNo;
    Venue venue;
    Show show;
    Event event;
    String barCode;
    List<Seat> bookedSeats;

}
