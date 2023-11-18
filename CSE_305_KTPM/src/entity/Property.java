package entity;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;

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

	public Property() {
		super();
	}

	Scanner sc = new Scanner(System.in);
	Property property = null;
	HashMap<Integer, Property> mapProperty = new HashMap<>();

	public void showMap() {
		System.out.println("property ID | description | rental rate: ");
		var list = new ArrayList<>(mapProperty.keySet());
		for (var i : list) {
			System.out.println(mapProperty.get(i) + " " + mapProperty.get(i).description + " " + mapProperty.get(i).rentalRate);
		}
	}

	public void CreateProperty() {

		System.out.println("Please enter your new property ID: ");
		int propertyID = sc.nextInt();

		System.out.println("Please enter your new description: ");
		String description = sc.next();

		System.out.println("Please enter your new rental rate: ");
		double rentalRate = sc.nextDouble();

		property = new Property(propertyID, description, rentalRate);
		mapProperty.put(propertyID, property);

		System.out.println("Successful");
	}

	public void UpdateProperty() {

		System.out.println("Please enter your property ID: ");
		int propertyID = sc.nextInt();

		System.out.println("Please enter your update description: ");
		String description = sc.next();

		System.out.println("Please enter your update rental rate: ");
		double rentalRate = sc.nextDouble();

		Property property = mapProperty.get(propertyID);

		property.setDescription(description);
		property.setRentalRate(rentalRate);

		System.out.println("Successful");
	}

	public void DeleteProperty() {

		System.out.println("Please enter your property ID to delete: ");
		int propertyID = sc.nextInt();

		mapProperty.remove(propertyID);

		System.out.println("Successful");
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

	public int getPropertyID() {
		return propertyID;
	}

}
