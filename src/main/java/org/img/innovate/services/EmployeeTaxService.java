package org.img.innovate.services;

import org.img.innovate.entity.Employee;
import org.img.innovate.model.EmployeeTax;
import org.img.innovate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeTaxService {
	
	@Autowired
	private EmployeeRepository empRepo;
	
	public EmployeeTax calculateEmployeeTax(Employee employee) {
		double salary = employee.getSalary();
		double yearlySalary = salary*12;
		
		double employeeTaxDeduction = calculateEmployeeTaxDeduction(yearlySalary);
		double employeeCessDeduction = calculateEmployeeCessDeduction(yearlySalary);
		
		return new EmployeeTax(employee.getEmployeeId(), employee.getFirstName(), employee.getLastName(), yearlySalary, employeeTaxDeduction, employeeCessDeduction);
		
	}
	
	public double calculateEmployeeTaxDeduction(double yearlySalary) {
		if(yearlySalary<=250000) {
			return 0.0;
		}else if(yearlySalary<=500000) {
			return (yearlySalary-250000)*0.05;
		}else if(yearlySalary<=1000000) {
			return 12500 + (yearlySalary-500000)*0.10;
		}else if(yearlySalary>1000000) {}
		return 37500 + (yearlySalary-1000000)*0.20;
	}
	
	public double calculateEmployeeCessDeduction(double yearlySalary) {
		return yearlySalary>250000 ? (yearlySalary-250000)*0.02 : 0;
		
	}
	

}
