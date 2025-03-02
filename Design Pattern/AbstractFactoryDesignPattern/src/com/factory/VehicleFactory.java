package com.factory;

import com.vehicles.Vehicle;

public interface VehicleFactory {
	Vehicle createVehicle(String type);
}
