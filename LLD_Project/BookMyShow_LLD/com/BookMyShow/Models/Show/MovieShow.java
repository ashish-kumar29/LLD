package com.BookMyShow.Models.Show;

import com.BookMyShow.Models.Event.Event;
import com.BookMyShow.Models.Event.Movie;
import com.BookMyShow.Common.Screen;
import com.BookMyShow.Models.Venue.CinemaHall;
import com.BookMyShow.Models.Venue.Venue;

import java.time.Duration;
import java.time.LocalDateTime;

public class MovieShow extends Show{
    Screen screen;
    int price;

    public Event getMovie() {
        return event;
    }

    public void setMovie(Movie movie) {
        this.event = movie;
    }

    public Venue getVenue() {
        return venue;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public void setStartTime(LocalDateTime startTime) {
        this.startTime = startTime;
    }

    public LocalDateTime getEndTime() {
        return endTime;
    }

    public void setEndTime(LocalDateTime endTime) {
        this.endTime = endTime;
    }
    public int getDuration() {
        return (int) Duration.between(startTime, endTime).toMinutes();
    }

}
