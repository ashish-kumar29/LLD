package com.with.strategyPattern;

import com.with.strategyPattern.strategy.NormalDriveStrategy;

public class TaxiVehicle extends Vehicle{

	TaxiVehicle() {
		super(new NormalDriveStrategy());
	}

}
