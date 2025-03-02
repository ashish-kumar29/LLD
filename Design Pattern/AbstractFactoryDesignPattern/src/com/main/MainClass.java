package com.main;

import com.factory.LuxuryVehicleFactory;
import com.factory.OrdinaryVehicleFactory;
import com.factory.VehicleFactory;
import com.vehicles.Vehicle;

public class MainClass {

	public static void main(String[] args) {

		VehicleFactory luxuryFactory = new LuxuryVehicleFactory();
		VehicleFactory ordinaryFactory = new OrdinaryVehicleFactory();

		Vehicle luxuryVehicle1 = luxuryFactory.createVehicle("luxury1");
		Vehicle luxuryVehicle2 = luxuryFactory.createVehicle("luxury2");

		Vehicle ordinaryVehicle1 = ordinaryFactory.createVehicle("ordinary1");
		Vehicle ordinaryVehicle2 = ordinaryFactory.createVehicle("ordinary2");

		luxuryVehicle1.create();
		luxuryVehicle1.create();

		ordinaryVehicle1.create();
		ordinaryVehicle1.create();
	}

}
