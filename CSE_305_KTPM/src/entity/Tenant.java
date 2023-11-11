package entity;

import java.util.HashMap;

public class Tenant extends User {

	private int tenantID;
	private String tenantFirstName;
	private String tenantLastName;
	private String tenantEmail;
	private String tenantPassword;
	private HashMap<Integer , RentalContract_Lease> renContMap;

	public Tenant(int tenantID, String tenantFirstName, String tenantLastName, String tenantEmail,
			String tenantPassword) {
		super();
		this.tenantID = tenantID;
		this.tenantFirstName = tenantFirstName;
		this.tenantLastName = tenantLastName;
		this.tenantEmail = tenantEmail;
		this.tenantPassword = tenantPassword;
	}

	public void CreateRentalContract(int renContID, RentalContract_Lease renCon) {
		renContMap.put(renContID, renCon);
	}

	public void TerminateRentalContract() {
		
	}

}
