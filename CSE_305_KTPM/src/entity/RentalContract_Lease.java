package entity;

public class RentalContract_Lease {

	private int contractID;
	private int propertyID;
	private int tenantID;
	private int startDate;
	private int endDate;
	private double rentAmount;

	public RentalContract_Lease(int contractID, int propertyID, int tenantID, int startDate, int endDate,
			double rentAmount) {
		super();
		this.contractID = contractID;
		this.propertyID = propertyID;
		this.tenantID = tenantID;
		this.startDate = startDate;
		this.endDate = endDate;
		this.rentAmount = rentAmount;
	}

	public void CreateContract() {

	}

	public void TerminateContract() {

	}

	public int getContractID() {
		return contractID;
	}

	public void setContractID(int contractID) {
		this.contractID = contractID;
	}

	public int getPropertyID() {
		return propertyID;
	}

	public void setPropertyID(int propertyID) {
		this.propertyID = propertyID;
	}

	public int getTenantID() {
		return tenantID;
	}

	public void setTenantID(int tenantID) {
		this.tenantID = tenantID;
	}

	public int getStartDate() {
		return startDate;
	}

	public void setStartDate(int startDate) {
		this.startDate = startDate;
	}

	public int getEndDate() {
		return endDate;
	}

	public void setEndDate(int endDate) {
		this.endDate = endDate;
	}

	public double getRentAmount() {
		return rentAmount;
	}

	public void setRentAmount(double rentAmount) {
		this.rentAmount = rentAmount;
	}

}
