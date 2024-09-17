package org.img.innovate.controllers;

import org.apache.hc.core5.http.HttpStatus;
import org.img.innovate.entity.Employee;
import org.img.innovate.repository.EmployeeRepository;
import org.img.innovate.services.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;

@RestController
@RequestMapping("/api/employees")
public class EmployeeController {
	
	@Autowired
	private EmployeeService empService;
	
//	@ApiOperation(value = "This operation is used to store emplyee details in database",response = Employee.class)
	@PostMapping(value = "/create",produces = {"application/json","aplication/xml"},consumes ={"application/json","aplication/xml"} )
	public ResponseEntity<Employee> createEmployee(@RequestBody Employee emp){
		
	Employee savedEmployee =	empService.saveEmployee(emp);
	return new ResponseEntity<Employee>(savedEmployee,org.springframework.http.HttpStatus.CREATED);
		
	}
	//@ApiOperation(value = "This operation is used to get emplyee details from database",response = Employee.class)
	@GetMapping("/getemp")
	public ResponseEntity<Employee> getEmployeeDetails(@RequestParam("eid") String eid){
	Employee emp =	empService.getEmployeeDetails(eid);
	return new ResponseEntity<Employee>(emp,org.springframework.http.HttpStatus.OK);
	}

}
