package qa.com.garageChallenge;

public class Motorbike extends Vehicle {

	private String seatStorageSize;
	private String handlebarSize;

	public Motorbike(int id, int age, String make, String colour, int wheels, int doors, String seatStorageSize,
			String handlebarSize) {
		super(id, age, make, colour, wheels, doors);

		this.seatStorageSize = seatStorageSize;
		this.handlebarSize = handlebarSize;

	}

	public String getSeatStorageSize() {
		return seatStorageSize;
	}

	public void setSeatStorageSize(String seatStorageSize) {
		this.seatStorageSize = seatStorageSize;
	}

	public String getHandlebarSize() {
		return handlebarSize;
	}

	public void setHandlebarSize(String handlebarSize) {
		this.handlebarSize = handlebarSize;
	}

	public String wheelie() {
		return "Doing a wheelie!!";
	}

}
