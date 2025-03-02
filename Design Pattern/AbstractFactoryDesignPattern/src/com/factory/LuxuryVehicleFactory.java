package com.factory;

import com.vehicles.LuxuryVehicle1;
import com.vehicles.LuxuryVehicle2;
import com.vehicles.Vehicle;

public class LuxuryVehicleFactory implements VehicleFactory{

	@Override
	public Vehicle createVehicle(String type) {
		if (type.equalsIgnoreCase("Luxury1")) {
            return new LuxuryVehicle1();
        } else if (type.equalsIgnoreCase("Luxury2")) {
            return new LuxuryVehicle2();
        }
        return null;
	}

}
