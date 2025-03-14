package com.Hotel.Models.Rooms;
import com.Hotel.Models.Actors.Guest;
import com.Hotel.RoomChargeFeature.BaseRoom.BaseRoomCharge;

import java.util.Date;
import java.util.List;
public class RoomBooking {
    String bookingId;
    List<Room> roomBooked;
    List<Guest> guests;
    Date startDate;
    int timeDuration;
    BaseRoomCharge baseRoomCharge;

}
