package qa.com.garageChallenge;

public class Runner {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Car car1 = new Car(1, 5, "Audi", "Red", 4, 5, "Medium", true);
		Car car2 = new Car(2, 7, "Ford", "Blue", 4, 3, "Small", false);
		Car car3 = new Car(3, 2, "Mercedes", "White", 4, 5, "Large", true);

		Lorry lorry1 = new Lorry(4, 7, "Ford", "Grey", 6, 2, "Large", false);
		Lorry lorry2 = new Lorry(5, 2, "Mercedes", "White", 4, 2, "Small", true);

		Garage garage1 = new Garage();

		garage1.addVehicle(car1);
		garage1.addVehicle(car2);
		garage1.addVehicle(car3);
		garage1.addVehicle(lorry1);
		garage1.addVehicle(lorry2);
		garage1.removeVehicleByID(1);
		garage1.fix(lorry2);

		int[] b = { 5 };

		garage1.removeMulitpleVehiclesById(b);

		garage1.printBillTotal();
		garage1.removeMultipleVehiclesByType("Car");
		garage1.printBillTotal();

	}

}
