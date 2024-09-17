package org.img.innovate.controllers;

import org.img.innovate.entity.Employee;
import org.img.innovate.model.EmployeeTax;
import org.img.innovate.services.EmployeeService;
import org.img.innovate.services.EmployeeTaxService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/employee")
public class EmployeeTaxController {
	@Autowired
	private EmployeeTaxService empTaxService;
	@Autowired
	private EmployeeService empService;
	//@ApiOperation(value = "This operation is used to get the emplyee tax deduction details in database",response = Employee.class)
	@GetMapping("/{empid}/tax-deductions")
	public EmployeeTax taxDeductionDetails(@PathVariable String empid) {
	Employee employee =	empService.getEmployeeDetails(empid);
	  return empTaxService.calculateEmployeeTax(employee);
	}
	

}
