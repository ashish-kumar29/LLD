package com.BookMyShow.Models.Event;

import com.BookMyShow.Common.Genre;

import java.util.List;

public class Movie extends Event{
    Genre genre;
    public String Director;
    public List<String> casts;
}
