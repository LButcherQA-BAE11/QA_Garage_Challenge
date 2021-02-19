package qa.com.garageChallenge;

import java.util.ArrayList;

public class Garage {

	private ArrayList<Vehicle> vehicles = new ArrayList<>();

	public void addVehicle(Vehicle vehicle) {
		vehicles.add(vehicle);
	}

	public void removeVehicle(Vehicle vehicle) {
		vehicles.remove(vehicle);
	}

	public void removeMultipleVehiclesByType(String vehicleType) {

		for (Vehicle vehicle : new ArrayList<>(vehicles)) {

			if (vehicle.getClass().getTypeName().contains(vehicleType)) {
				vehicles.remove(vehicle);
			}

		}

	}

	public void removeVehicleByID(int ID) {
		int i = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle.getId() == ID) {
				vehicles.remove(vehicle);
				i++;
				break;
			}
		}
		if (i == 0) {
			System.out.println("There is no vehicle with this Id in the garage.");
		}
	}

	public void removeMulitpleVehiclesById(int[] IDs) {

		for (int i = 0; i < IDs.length; i++) {
			for (Vehicle vehicle : vehicles) {
				if (vehicle.getId() == IDs[i]) {
					vehicles.remove(vehicle);
					break;
				}
			}
		}
	}

	public void emptyGarage() {
		vehicles.clear();
	}

	public void fix(Vehicle vehicle) {
		int cost = 0;
		if (vehicle instanceof Car) {
			cost += 100;
		} else if (vehicle instanceof Lorry) {
			cost += 500;
		} else if (vehicle instanceof Motorbike) {
			cost += 50;
		}
		System.out.println("Bill for this vehicle is: £" + cost);
	}

	public void printBillTotal() {
		int cost = 0;
		for (Vehicle vehicle : vehicles) {
			if (vehicle instanceof Car) {
				cost += 100;
			} else if (vehicle instanceof Lorry) {
				cost += 500;
			} else if (vehicle instanceof Motorbike) {
				cost += 50;
			}
		}
		System.out.println("Bill total is: £" + cost);
	}
}
