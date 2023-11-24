package entity;

import java.util.HashMap;

public class Tenant extends User {
	private HashMap<Integer, RentalContract_Lease> renContMap;

	public Tenant(TenantParameter parameterObject) {
		super(new UserParameter(parameterObject.getTenantID(), parameterObject.getTenantPassword(),
				parameterObject.getTenantPassword(), parameterObject.getTenantPassword(),
				parameterObject.getTenantPassword()));
	}

	public void CreateRentalContract(int renContID, RentalContract_Lease renCon) {
		renContMap.put(renContID, renCon);
	}

	public void TerminateRentalContract(int contID) {
		renContMap.remove(contID);
	}

	@Override
	public void register(int id, String firstName, String lastName, String email, String password) {
//		TenantParameter tenentPara = new TenantParameter(id, firstName, lastName, email, password);
//		Tenant newTenant = new Tenant(tenentPara);
		
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
