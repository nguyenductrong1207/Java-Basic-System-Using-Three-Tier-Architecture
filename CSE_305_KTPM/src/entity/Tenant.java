package entity;

import java.util.HashMap;

public class Tenant extends User {

	private int tenantID;
	private String tenantFirstName;
	private String tenantLastName;
	private String tenantEmail;
	private String tenantPassword;
	private HashMap<Integer, RentalContract_Lease> rentConMap;

	public Tenant(int tenantID, String tenantFirstName, String tenantLastName, String tenantEmail,
			String tenantPassword) {
		super();
		this.tenantID = tenantID;
		this.tenantFirstName = tenantFirstName;
		this.tenantLastName = tenantLastName;
		this.tenantEmail = tenantEmail;
		this.tenantPassword = tenantPassword;
	}

	public void CreateRentalContract(int renID, RentalContract_Lease renCon) {
		rentConMap.put(renID, renCon);

	}

	public void TerminateRentalContract(int renID) {
		rentConMap.remove(renID);
	}

	public int getTenantID() {
		return tenantID;
	}

	public void setTenantID(int tenantID) {
		this.tenantID = tenantID;
	}

	public String getTenantFirstName() {
		return tenantFirstName;
	}

	public void setTenantFirstName(String tenantFirstName) {
		this.tenantFirstName = tenantFirstName;
	}

	public String getTenantLastName() {
		return tenantLastName;
	}

	public void setTenantLastName(String tenantLastName) {
		this.tenantLastName = tenantLastName;
	}

	public String getTenantEmail() {
		return tenantEmail;
	}

	public void setTenantEmail(String tenantEmail) {
		this.tenantEmail = tenantEmail;
	}

	public void setTenantPassword(String tenantPassword) {
		this.tenantPassword = tenantPassword;
	}

}
