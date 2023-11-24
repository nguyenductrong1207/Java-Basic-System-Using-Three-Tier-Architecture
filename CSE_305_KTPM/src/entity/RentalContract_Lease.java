package entity;

import java.util.*;

public class RentalContract_Lease {
	private int contractID;
	private int propertyID;
	private int tenantID;
	private int startDate;
	private int endDate;
	private double rentAmount;
	private List<RentalContract_Lease> contList;

	public RentalContract_Lease(RentalContract_LeaseParameter parameterObject) {
		this.contractID = parameterObject.getContractID();
		this.propertyID = parameterObject.getPropertyID();
		this.tenantID = parameterObject.getTenantID();
		this.startDate = parameterObject.getStartDate();
		this.endDate = parameterObject.getEndDate();
		this.rentAmount = parameterObject.getRentAmount();
		contList = new ArrayList<>();
	}

	public void CreateContract(RentalContract_Lease newContract) {
		contList.add(newContract);
	}

	public void TerminateContract(int conID) {
		for (int i = 0; i < contList.size(); i++) {
			if (contList.get(i).contractID == conID) {
				contList.remove(i);
				break;
			}
		}
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
