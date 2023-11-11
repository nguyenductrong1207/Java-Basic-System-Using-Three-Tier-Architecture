package entity;

public class PropertyOwner extends User {

	private int ownerID;
	private String ownerFirstName;
	private String ownerLastName;
	private String ownerEmail;
	private String ownerPassword;

	public PropertyOwner(int ownerID, String ownerFirstName, String ownerLastName, String ownerEmail,
			String ownerPassword) {
		super();
		this.ownerID = ownerID;
		this.ownerFirstName = ownerFirstName;
		this.ownerLastName = ownerLastName;
		this.ownerEmail = ownerEmail;
		this.ownerPassword = ownerPassword;
	}

	public void ListProperty() {

	}

	public void CreateProperty() {

	}

	public void UpdateProperty() {

	}

	public void DeleteProperty() {

	}

}
