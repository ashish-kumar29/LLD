package com.with.strategyPattern;

import com.with.strategyPattern.strategy.HeavyDriveStrategy;

public class GoodsVehicle extends Vehicle{
	
	public GoodsVehicle() {
		super(new HeavyDriveStrategy());
	}
}
