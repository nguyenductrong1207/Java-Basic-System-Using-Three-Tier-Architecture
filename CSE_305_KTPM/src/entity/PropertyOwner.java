package entity;

import java.util.List;
import java.util.Scanner;

public class PropertyOwner extends User {
	static Scanner reader = new Scanner(System.in);
	private List<Property> ownedProperty;

	public PropertyOwner(PropertyOwnerParameter parameterObject) {
		super(new UserParameter(parameterObject.getOwnerID(), parameterObject.getOwnerFirstName(), parameterObject.getOwnerLastName(), parameterObject.getOwnerEmail(), parameterObject.getOwnerPassword()));
	}

	public List<Property> getOwnedProperty() {
		return ownedProperty;
	}

	public void setOwnedProperty(List<Property> ownedProperty) {
		this.ownedProperty = ownedProperty;
	}

	public void ListProperty() {
		if (ownedProperty.isEmpty()) {
			System.out.println("No properties owned");
		} else {
			System.out.println("Property owned by the property owner:");
			for (Property property : ownedProperty) {
				System.out.println("Property ID: " + property.getPropertyID());
			}
		}
	}

	private Property findPropertyById(int propertyId) {
		for (Property property : ownedProperty) {
			if (property.getPropertyID() == propertyId) {
				return property;
			}
		}
		return null;
	}

	public void CreateProperty(int propertyID, String description, double rentalRate) {
		Property newProperty = new Property(propertyID, description, rentalRate);
		ownedProperty.add(newProperty);
		System.out.println("New property created. Property ID: " + newProperty.getPropertyID());
	}

	public void UpdateProperty(int propertyId) {
		Property propertyUpdate = findPropertyById(propertyId);
		if (propertyUpdate != null) {
			System.out.println("Property updated. Property ID: " + propertyUpdate.getPropertyID());
		}

		else {
			System.out.println("Property not found.");
		}
	}

	public void DeleteProperty(int propertyId) {
		Property propertyDelete = findPropertyById(propertyId);
		if (propertyDelete != null) {
			ownedProperty.remove(propertyDelete);
			System.out.println("Property deleted. Property ID: " + propertyDelete.getPropertyID());
		} else {
			System.out.println("Property not found.");
		}
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
		
	}

	@Override
	public void login(String email, String password) {
		
	}

	@Override
	public void updateProfile(int id, String firstName, String lastname, String email, String password) {

	}

	@Override
	public void resetPassword(int id, String password) {

	}
}
