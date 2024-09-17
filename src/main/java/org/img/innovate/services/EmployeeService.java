package org.img.innovate.services;

import java.util.Optional;

import org.img.innovate.entity.Employee;
import org.img.innovate.repository.EmployeeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class EmployeeService {

	@Autowired
	private EmployeeRepository empRepo;

	public Employee saveEmployee(Employee employee) {

		if (!empRepo.existsById(employee.getEmployeeId())) {
			return empRepo.save(employee);
		} else {
			throw new IllegalStateException("Employee Id Already exists");
		}

	}
	
	public Employee getEmployeeDetails(String eid) {
	  Optional<Employee> optEmp =	empRepo.findById(eid);
	   Employee  employee =    optEmp.get();
	   return employee;
	}

}
