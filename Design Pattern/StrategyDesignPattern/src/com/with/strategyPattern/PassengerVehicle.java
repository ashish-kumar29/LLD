package com.with.strategyPattern;

import com.with.strategyPattern.strategy.HeavyDriveStrategy;

public class PassengerVehicle extends Vehicle{
	
	public PassengerVehicle() {
		super(new HeavyDriveStrategy());
	}
}
