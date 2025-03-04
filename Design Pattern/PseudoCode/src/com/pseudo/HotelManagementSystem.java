package com.pseudo;

import java.util.Date;
import java.util.List;

public class HotelManagementSystem {
	String name;
	int id;
	Location hotelLocation;
	List<Room> roomList;
}

class Location{
	int pin;
	String street;
	String area;
	String city;
	String country;
}

class Room{
	int roomNo;
	RoomType roomType;
	RoomStatus roomStatus;
	Double bookingPrice;
	List<RoomKey> roomKeys;
	List<HouseKeepingLog> houseKeepingLog;
}
enum RoomType{
	STANDARD, DELUX, FAMILY_SUITE;
}

enum RoomStatus{
	AVAILABLE, NOT_AVAILABLE, RESERVED, OCCUPIED, SERVICE_IN_PROGRESS;
}
class RoomKey{
	int id;
	Room room;
	Date issueDate;
	Boolean isActive;
	Boolean isMaster;
	
	public void assignRoom(Room room) {}
}

class HouseKeepingLog{
	String description;
	Date taskDate;
	int timeDuration;
	HouseKeeper houseKeeper;
	public void addRoom() {}
}

class Person{
	String name;
	Account accountDetails;
	String phone;
}

class Account{
	String userName;
	String password;
	
	AccountStatus accountStatus;
}

enum AccountStatus{
	CLOSED, ACTIVE, BLOCKED;
}

class HouseKeeper extends Person{
	public List<Room> getRoomService(Date date);
}

class Guest extends Person{
	Search searchObj;
	Booking bookingObj;
	
	public List<RoomBooking> getAllRoomBookings(){}
}

class Receptionist extends Person{
	Search searchObj;
	Booking bookingObj;

	public void checkInGuest(Guest guest, RoomBooking roomBooking) {}
	public void checkOutGuest(Guest guest, RoomBooking roomBooking) {}
}

class Admin extends Person{
	Hotel hotel;
	public void addRoom(Room roomDetails) {}
	public Room deleteRoom(int roomId) ;
	public void editaddRoom(Room roomDetails) {}
}

class Search{
	public List<Room> searchRoom(RoomType roomType, Date startDate);
 }

class Booking{
	public RoomBooking bookingRooom(Guest guest);
	public RoomBooking cancellingRooom(int bookingId);
}

class RoomBooking{
	List<Guest> guest;
	String bookingId;
	Date startDate;
	int timeDuration;
	List<Room> roomBooked;
	BaseRoomCharge baseRoomCharge;
}

interface BaseRoomCharge{
	Double getCost();

	void setCost(double d);
}

class RoomCharge implements BaseRoomCharge{
	Double cost;
	
	public void setCost(Double cost) {
		this.cost=cost;
	}
	
	public Double getCost() {
		return cost;
	}
}

class RoomServiceCharge implements BaseRoomCharge{
	Double cost;
	BaseRoomCharge baseRoomCharge;
	public Double getCost(){
		baseRoomCharge.setCost(baseRoomCharge.getCost()+cost);
		return baseRoomCharge.getCost();
	}
	@Override
	public void setCost(double d) {
		// TODO Auto-generated method stub
		
	}
}
class InRoomPurchaseCharge implements BaseRoomCharge{
	Double cost;
	BaseRoomCharge baseRoomCharge;
	public Double getCost(){
		baseRoomCharge.setCost(baseRoomCharge.getCost()+cost);
		return baseRoomCharge.getCost();
	}
	@Override
	public void setCost(double d) {
		// TODO Auto-generated method stub
		
	}
}

