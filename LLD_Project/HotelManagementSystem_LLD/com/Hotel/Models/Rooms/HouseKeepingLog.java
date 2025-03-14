package com.Hotel.Models.Rooms;

import com.Hotel.Models.Actors.HouseKeeper;

import java.util.Date;

public class HouseKeepingLog {
    int logId;
    Room room;
    Date taskDate;
    int timeDuration;
    HouseKeeper houseKeeper;
}
