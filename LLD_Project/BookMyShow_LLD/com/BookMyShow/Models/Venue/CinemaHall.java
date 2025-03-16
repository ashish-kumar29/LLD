package com.BookMyShow.Models.Venue;
import com.BookMyShow.Common.Location;
import com.BookMyShow.Common.Screen;
import com.BookMyShow.Models.Actors.Admin;
import com.BookMyShow.Models.Show.Show;

import java.util.List;

public class CinemaHall extends Venue{
    String name;
    Location location;
    List<Show> shows;
    List<Screen> screens;
    Admin admin;

    public String getName() {
        return name;
    }

    public Location getLocation() {
        return location;
    }
}
