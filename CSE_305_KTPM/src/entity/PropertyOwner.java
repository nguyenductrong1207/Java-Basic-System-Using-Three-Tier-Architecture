package entity;

import java.util.List;
import java.util.Scanner;

public class PropertyOwner extends User {
	static Scanner reader = new Scanner(System.in);

	private int ownerID;
	private String ownerFirstName;
	private String ownerLastName;
	private String ownerEmail;
	private String ownerPassword;
	private List<Property> ownedProperty;

	public PropertyOwner(int ownerID, String ownerFirstName, String ownerLastName, String ownerEmail,
			String ownerPassword) {
		super(ownerID, ownerPassword, ownerPassword, ownerPassword, ownerPassword);
		this.ownerID = ownerID;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.ownerEmail = ownerEmail;
		this.ownerPassword = ownerPassword;
	}

	public int getOwnerID() {
		return ownerID;
	}

	public void setOwnerID(int ownerID) {
		this.ownerID = ownerID;
	}

	public String getOwnerFirstName() {
		return ownerFirstName;
	}

	public void setOwnerFirstName(String ownerFirstName) {
		this.ownerFirstName = ownerFirstName;
	}

	public String getOwnerLastName() {
		return ownerLastName;
	}

	public void setOwnerLastName(String ownerLastName) {
		this.ownerLastName = ownerLastName;
	}

	public String getOwnerEmail() {
		return ownerEmail;
	}

	public void setOwnerEmail(String ownerEmail) {
		this.ownerEmail = ownerEmail;
	}

	public String getOwnerPassword() {
		return ownerPassword;
	}

	public void setOwnerPassword(String ownerPassword) {
		this.ownerPassword = ownerPassword;
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

	public void CreateProperty(int ownerID, String ownerFirstName, String ownerLastName, String ownerEmail,
			String ownerPassword) {
		Property newProperty = new Property(ownerID, ownerFirstName, ownerLastName, ownerEmail, ownerPassword);
		ownedProperty.add(newProperty);
		System.out.println("New property created. Property ID: " + newProperty.getPropertyID());
	}

	public void UpdateProperty(int propertyId) {
		Property propertyUpdate = findPropertyById(propertyId);
		if (propertyUpdate != null) {
			
			System.out.println("Property updated. Property ID: " + propertyUpdate.getPropertyID());

		} else {
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
	public void register() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'register'");
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'login'");
	}

	@Override
	public void updateProfile() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'updateProfile'");
	}

	@Override
	public void resetPassword() {
		// TODO Auto-generated method stub
		throw new UnsupportedOperationException("Unimplemented method 'resetPassword'");
	}
}
