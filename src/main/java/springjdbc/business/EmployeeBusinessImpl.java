package springjdbc.business;

import java.util.List;

import springjdbc.dao.EmployeeDao;
import springjdbc.dto.Employee;

public class EmployeeBusinessImpl implements EmployeeBusiness {
	
	private EmployeeDao employeeDao;
	

	public EmployeeDao getEmployeeDao() {
		return employeeDao;
	}

	public void setEmployeeDao(EmployeeDao employeeDao) {
		this.employeeDao = employeeDao;
	}

	public void printEmployeeHikes() {
		//ask dao for employee data
		 List<Employee> employees= employeeDao.findAllEmployees();
		//check each employee and print hike 
		 if (employees!=null) {
			for( Employee employee :employees) {
				if (employee.getExp()>15) {
					System.out.println("employee with id "+employee.getId()+" and "+employee.getName()+" with experience "+employee.getExp()+" got 30% hike");
				}else if (employee.getExp()>10) {
					System.out.println("employee with id "+employee.getId()+" and "+employee.getName()+" with experience "+employee.getExp()+" got 20% hike");
				}else if (employee.getExp()>5) {
					System.out.println("employee with id "+employee.getId()+" and "+employee.getName()+" with experience "+employee.getExp()+" got 10% hike");
				}else {
					System.out.println("employee with id "+employee.getId()+" and "+employee.getName()+" with experience "+employee.getExp()+" got 05% hike");
				}
			}
		}

	}

}
