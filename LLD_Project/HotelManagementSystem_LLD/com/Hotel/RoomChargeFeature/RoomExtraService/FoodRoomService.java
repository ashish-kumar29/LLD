package com.Hotel.RoomChargeFeature.RoomExtraService;

import com.Hotel.RoomChargeFeature.BaseRoom.BaseRoomCharge;

public class FoodRoomService extends ExtraRoomServiceDecorator{
    BaseRoomCharge roomCharge;

    // Minimum food service to be taken is 100 ruppees
    int foodCharge = 100;
    public FoodRoomService(BaseRoomCharge roomCharge){
        this.roomCharge = roomCharge;
    }

    public void setFoodCharge(int totalFoodCharge) {
        this.foodCharge = totalFoodCharge;
    }

    public int getCost(){
        return this.roomCharge.getCost()+this.foodCharge;
    }
}
