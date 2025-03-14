package com.Hotel.RoomChargeFeature.RoomExtraService;

import com.Hotel.RoomChargeFeature.BaseRoom.BaseRoomCharge;

public class LaundaryRoomService extends ExtraRoomServiceDecorator{
    BaseRoomCharge roomCharge;

    // Minimum laundary service to be taken is 200 ruppees
    int extraServiceCharge = 200;
    public LaundaryRoomService(BaseRoomCharge roomCharge){
        this.roomCharge = roomCharge;
    }

    public void setExtraServiceCharge(int totalLaundaryCharge){
        this.extraServiceCharge = totalLaundaryCharge;
    }
    @Override
    public int getCost(){
        return this.roomCharge.getCost()+this.extraServiceCharge;
    }
}
