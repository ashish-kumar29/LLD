package com.BookMyShow.Models.Show;

import com.BookMyShow.Common.Screen;
import com.BookMyShow.Common.Seat;
import com.BookMyShow.Models.Event.Event;
import com.BookMyShow.Models.Event.Movie;
import com.BookMyShow.Models.Venue.Venue;

import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

public abstract class Show {

    Event event;
    LocalDateTime startTime;
    LocalDateTime endTime;
    Venue venue;
    List<Seat> seats;

}
