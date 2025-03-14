package com.Hotel.Models.Rooms;

import java.util.List;

public class Room {
    int roomNo;
    List<RoomKey> keyList;
    RoomType roomType;
    RoomStatus roomStatus;
    Double roomPrice;
    List<HouseKeepingLog> houseKeepingLog;
}
