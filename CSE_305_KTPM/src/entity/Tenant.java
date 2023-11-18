package entity;

import java.util.HashMap;

public class Tenant extends User {
	private HashMap<Integer , RentalContract_Lease> renContMap;

	public Tenant(int tenantID, String tenantFirstName, String tenantLastName, String tenantEmail,
			String tenantPassword) {
		super(tenantID, tenantPassword, tenantPassword, tenantPassword, tenantPassword);
	}

	public void CreateRentalContract(int renContID, RentalContract_Lease renCon) {
		renContMap.put(renContID, renCon);
	}

	public void TerminateRentalContract() {
		
	}

	@Override
	public void register() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void login() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateProfile() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void resetPassword() {
		// TODO Auto-generated method stub
		
	}

}
