package com.example.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.example.entity.Employee;
import com.example.repository.EmployeeRepository;

@Service
@Transactional
@Component("employeeServiceImpl")
public class EmployeeServiceImpl implements EmployeeService{

	@Autowired
	private EmployeeRepository employeeRepository;
	
	@Override
	public void saveEmploye(Employee employee) {
		// TODO Auto-generated method stub
		employeeRepository.save(employee);
		
	}

	@Override
	public void deleteEmploye(Long empId) {
		// TODO Auto-generated method stub
		employeeRepository.delete(empId);
	}

	@Override
	@Transactional(readOnly=true)
	public Employee getEmployeId(Long empId) {
		// TODO Auto-generated method stub
		return employeeRepository.findOne(empId);
	}

	@Override
	@Transactional(readOnly=true)
	public List<Employee> getAllEmployee() {
		// TODO Auto-generated method stub
		return employeeRepository.findAll();
	}

	@Override
	@Transactional(readOnly=true)
	public List<Employee> getAllEmployeByName(String name) {
		// TODO Auto-generated method stub
		return employeeRepository.findByName(name);
	}

}
