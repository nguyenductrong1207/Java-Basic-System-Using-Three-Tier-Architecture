package entity;

public class TenantParameter {
	private int tenantID;
	private String tenantFirstName;
	private String tenantLastName;
	private String tenantEmail;
	private String tenantPassword;

	public TenantParameter(int tenantID, String tenantFirstName, String tenantLastName, String tenantEmail,
			String tenantPassword) {
		this.tenantID = tenantID;
		this.tenantFirstName = tenantFirstName;
		this.tenantLastName = tenantLastName;
		this.tenantEmail = tenantEmail;
		this.tenantPassword = tenantPassword;
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

	public String getTenantPassword() {
		return tenantPassword;
	}

	public void setTenantPassword(String tenantPassword) {
		this.tenantPassword = tenantPassword;
	}
}