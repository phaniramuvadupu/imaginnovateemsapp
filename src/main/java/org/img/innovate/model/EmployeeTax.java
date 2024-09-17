package org.img.innovate.model;

public class EmployeeTax {
	
	private String employeeId;
	private String firstName;
	private String lastName;
    private Double yearlySalary;
    private Double taxAmount;
    private Double cessAmount;
	public String getEmployeeId() {
		return employeeId;
	}
	public void setEmployeeId(String employeeId) {
		this.employeeId = employeeId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Double getYearlySalary() {
		return yearlySalary;
	}
	public void setYearlySalary(Double yearlySalary) {
		this.yearlySalary = yearlySalary;
	}
	public Double getTaxAmount() {
		return taxAmount;
	}
	public void setTaxAmount(Double taxAmount) {
		this.taxAmount = taxAmount;
	}
	public Double getCessAmount() {
		return cessAmount;
	}
	public void setCessAmount(Double cessAmount) {
		this.cessAmount = cessAmount;
	}
	public EmployeeTax(String employeeId, String firstName, String lastName, Double yearlySalary, Double taxAmount,
			Double cessAmount) {
		super();
		this.employeeId = employeeId;
		this.firstName = firstName;
		this.lastName = lastName;
		this.yearlySalary = yearlySalary;
		this.taxAmount = taxAmount;
		this.cessAmount = cessAmount;
	}
    
   public EmployeeTax() {}
    
    
    
	

}
