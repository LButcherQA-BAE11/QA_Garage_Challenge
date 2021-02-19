package qa.com.garageChallenge;

public class Car extends Vehicle {

	private String bootSize;
	private boolean hasSpoiler;

	public Car(int id, int age, String make, String colour, int wheels, int doors, String bootSize,
			boolean hasSpoiler) {
		super(id, age, make, colour, wheels, doors);

		this.bootSize = bootSize;
		this.hasSpoiler = hasSpoiler;

	}

	public String getBootSize() {
		return bootSize;
	}

	public void setBootSize(String bootSize) {
		this.bootSize = bootSize;
	}

	public boolean isHasSpoiler() {
		return hasSpoiler;
	}

	public void setHasSpoiler(boolean hasSpoiler) {
		this.hasSpoiler = hasSpoiler;
	}

}
