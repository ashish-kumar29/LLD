package com.BookMyShow.Models.Venue;

import com.BookMyShow.Common.Location;
import com.BookMyShow.Models.Show.Show;

import java.util.List;

public abstract class Venue {

    String name;
    Location location;
    List<Show> shows;
}
