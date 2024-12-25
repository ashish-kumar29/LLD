package com.with.strategyPattern;

import com.with.strategyPattern.strategy.NormalDriveStrategy;

public class PersonalVehicle extends Vehicle{

	PersonalVehicle() {
		super(new NormalDriveStrategy());
	}

}
