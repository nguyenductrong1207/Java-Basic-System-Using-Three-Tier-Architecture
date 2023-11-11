package entity;

public class Property extends User {

	private int propertyID;
	private String description;
	private double rentalRate;

	public Property(int propertyID, String description, double rentalRate) {
		super();
		this.propertyID = propertyID;
		this.description = description;
		this.rentalRate = rentalRate;
	}

	public Property(int ownerID, String ownerFirstName, String ownerLastName, String ownerEmail, String ownerPassword) {
	}

	public int getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public double getRentalRate() {
		return rentalRate;
	}

	public void setRentalRate(double rentalRate) {
		this.rentalRate = rentalRate;
	}

	public void CreateProperty() {

	}

	public void UpdateProperty() {

	}

	public void DeleteProperty() {

	}

}
