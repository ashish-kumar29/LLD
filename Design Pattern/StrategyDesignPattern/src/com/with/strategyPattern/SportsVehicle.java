package com.with.strategyPattern;

import com.with.strategyPattern.strategy.SportsDriveStrategy;

public class SportsVehicle extends Vehicle{

	SportsVehicle() {
		super(new SportsDriveStrategy());
	}

}
