package com.Hotel.RoomChargeFeature.BaseRoom;

public class StandardRoomCharge extends BaseRoomCharge{
    public StandardRoomCharge(){
        this.cost=1000;
    }

    public void setCost(int cost){
        this.cost = cost;
    }
    @Override
    public int getCost() {
        return this.cost;
    }
}
