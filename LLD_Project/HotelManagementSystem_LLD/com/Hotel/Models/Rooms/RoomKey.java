package com.Hotel.Models.Rooms;

import java.util.Date;

public class RoomKey {
    int id;
    Room room;
    Date issueDate;
    Boolean isActive;
    Boolean isMasterKey;

    public void assignRoom(Room room){
        this.room = room;
        room.keyList.add(this);
    }
}
