package com.with.strategyPattern;

import com.with.strategyPattern.strategy.DriveStrategy;

public class Vehicle {

	DriveStrategy driveObject;
	
	Vehicle(DriveStrategy driveObj){
		driveObject = driveObj;
	}
	
	public void drive() {
		driveObject.drive();
	}
}
