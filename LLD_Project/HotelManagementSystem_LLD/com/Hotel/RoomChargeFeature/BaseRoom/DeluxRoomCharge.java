package com.Hotel.RoomChargeFeature.BaseRoom;

public class DeluxRoomCharge extends BaseRoomCharge{

    public DeluxRoomCharge(){
        this.cost=1800;
    }

    public void setCost(int cost){
        this.cost = cost;
    }
    @Override
    public int getCost() {
        return this.cost;
    }
}
