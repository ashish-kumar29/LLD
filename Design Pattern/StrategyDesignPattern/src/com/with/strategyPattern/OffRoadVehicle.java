package com.with.strategyPattern;

import com.with.strategyPattern.strategy.SportsDriveStrategy;

public class OffRoadVehicle extends Vehicle{

	OffRoadVehicle() {
		super(new SportsDriveStrategy());
	}

}
