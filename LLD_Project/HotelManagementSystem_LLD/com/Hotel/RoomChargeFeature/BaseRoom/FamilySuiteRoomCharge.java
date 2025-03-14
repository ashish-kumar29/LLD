package com.Hotel.RoomChargeFeature.BaseRoom;

public class FamilySuiteRoomCharge extends BaseRoomCharge{
    public FamilySuiteRoomCharge(){
        this.cost=2500;
    }

    public void setCost(int cost){
        this.cost = cost;
    }
    @Override
    public int getCost() {
        return this.cost;
    }
}
