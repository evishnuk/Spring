package springjdbc.dao;

import java.util.List;

import springjdbc.dto.Employee;

public interface EmployeeDao {
	
	void insertEmployee(Employee employee);
	List<Employee> findAllEmployees();
	Employee getEmployeebyid(int id);
	
}
