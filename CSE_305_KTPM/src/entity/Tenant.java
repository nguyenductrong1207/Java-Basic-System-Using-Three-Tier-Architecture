package entity;

public class Tenant extends User {

	private int tenantID;
	private String tenantFirstName;
	private String tenantLastName;
	private String tenantEmail;
	private String tenantPassword;

	public Tenant(int tenantID, String tenantFirstName, String tenantLastName, String tenantEmail,
			String tenantPassword) {
		super();
		this.tenantID = tenantID;
		this.tenantFirstName = tenantFirstName;
		this.tenantLastName = tenantLastName;
		this.tenantEmail = tenantEmail;
		this.tenantPassword = tenantPassword;
	}

	public void CreateRentalContract() {

	}

	public void TerminateRentalContract() {

	}

}
