package com.factory;

import com.vehicles.OrdinaryVehicle1;
import com.vehicles.OrdinaryVehicle2;
import com.vehicles.Vehicle;

public class OrdinaryVehicleFactory implements VehicleFactory{

	@Override
	public Vehicle createVehicle(String type) {
		if(type.equalsIgnoreCase("Ordinary1")) {
			return new OrdinaryVehicle1();
		}
		else if(type.equalsIgnoreCase("Ordinary2")) {
			return new OrdinaryVehicle2();
		}
		return null;
	}

}
