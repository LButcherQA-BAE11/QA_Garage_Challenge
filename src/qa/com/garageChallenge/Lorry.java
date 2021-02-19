package qa.com.garageChallenge;

public class Lorry extends Vehicle {

	private String trailerSize;
	private boolean hasBedroom;

	public Lorry(int id, int age, String make, String colour, int wheels, int doors, String trailerSize,
			boolean hasBedroom) {
		super(id, age, make, colour, wheels, doors);

		this.trailerSize = trailerSize;
		this.hasBedroom = hasBedroom;

	}

	public String getTrailerSize() {
		return trailerSize;
	}

	public void setTrailerSize(String trailerSize) {
		this.trailerSize = trailerSize;
	}

	public boolean isHasBedroom() {
		return hasBedroom;
	}

	public void setHasBedroom(boolean hasBedroom) {
		this.hasBedroom = hasBedroom;
	}

}
