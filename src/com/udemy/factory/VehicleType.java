package com.udemy.factory;

public enum VehicleType {
	
	CAR{
		public Vehicle getVehicle() {
			return new Car();
		}
	}, 
	TRUCK{
		public Vehicle getVehicle() {
			return new Truck();
		}
	},
	BUS{
		public Vehicle getVehicle() {
			return new Bus();
		}
	},
	ELECTRICCAR{
		public Vehicle getVehicle() {
			return new ElectricCar();
		}
	};

	abstract Vehicle getVehicle();

}
