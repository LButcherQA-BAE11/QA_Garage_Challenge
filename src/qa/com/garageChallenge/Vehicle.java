package qa.com.garageChallenge;

public class Vehicle {

	private int id;
	private String colour;
	private int wheels;
	private String make;
	private int doors;
	private int age;

	public Vehicle(int id, int age, String make, String colour, int wheels, int doors) {

		super();

		this.id = id;
		this.age = age;
		this.make = make;
		this.colour = colour;
		this.wheels = wheels;
		this.doors = doors;

	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	public int getWheels() {
		return wheels;
	}

	public void setWheels(int wheels) {
		this.wheels = wheels;
	}

	public String getMake() {
		return make;
	}

	public void setMake(String make) {
		this.make = make;
	}

	public int getDoors() {
		return doors;
	}

	public void setDoors(int doors) {
		this.doors = doors;
	}

	public int getAge() {
		return age;
	}

	public void setAge(int age) {
		this.age = age;
	}

	public String horn() {
		return "Beep! Beep!";
	}

	public String indicators() {
		return "tick tick tick tick tick";
	}

}
