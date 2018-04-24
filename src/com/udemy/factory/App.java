package com.udemy.factory;

public class App {

	public static void main(String[] args) {
		VehicleFactory vf = new VehicleFactory();
		Vehicle veh = vf.getVehicle(VehicleType.TRUCK);
		veh.startEngine();
	}

}
