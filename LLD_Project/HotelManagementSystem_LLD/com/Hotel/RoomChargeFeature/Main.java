package com.Hotel.RoomChargeFeature;

import com.Hotel.RoomChargeFeature.BaseRoom.BaseRoomCharge;
import com.Hotel.RoomChargeFeature.BaseRoom.DeluxRoomCharge;
import com.Hotel.RoomChargeFeature.BaseRoom.FamilySuiteRoomCharge;
import com.Hotel.RoomChargeFeature.BaseRoom.StandardRoomCharge;
import com.Hotel.RoomChargeFeature.RoomExtraService.ExtraRoomServiceDecorator;
import com.Hotel.RoomChargeFeature.RoomExtraService.FoodRoomService;
import com.Hotel.RoomChargeFeature.RoomExtraService.LaundaryRoomService;

public class Main {
    public static void main(String[] args) {
        BaseRoomCharge room1 = new DeluxRoomCharge();
        BaseRoomCharge room2 = new FamilySuiteRoomCharge();
        BaseRoomCharge room3 = new StandardRoomCharge();

        System.out.println(room1.getCost());
        System.out.println(room2.getCost());
        System.out.println(room3.getCost());


        ExtraRoomServiceDecorator extraService1 = new LaundaryRoomService(room1);
        ExtraRoomServiceDecorator extraService2 = new FoodRoomService(extraService1);
        ExtraRoomServiceDecorator extraService3 = new FoodRoomService(room2);
        ExtraRoomServiceDecorator extraService4 = new LaundaryRoomService(extraService3);
        System.out.println(extraService1.getCost());
        System.out.println(extraService2.getCost());
        System.out.println(extraService3.getCost());
        System.out.println(extraService4.getCost());
    }
}
