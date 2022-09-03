package springjdbc.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import springjdbc.dto.Employee;

public class EmployeeDaoImpl implements EmployeeDao {

	public void insertEmployee(Employee employee) {
		//code to insert employee object into database
		
	}
	@Override
	public List<Employee> findAllEmployees() {
		
		//code to return all employees in employee table
		String dr="com.mysql.cj.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/springjdbc";
		String user="root";
		String password="dcba";
		
		List< Employee> employees=new ArrayList();
		try {
			Class.forName(dr);
			Connection cn=DriverManager.getConnection(url,user,password);
			Statement st=cn.createStatement();
			ResultSet rs=st.executeQuery("select * from employee");
			
			while (rs.next()) {
				int id=rs.getInt(1);
				String name=rs.getString(2);
				int exp=rs.getInt(3);
				
				Employee employee=new Employee(id,name,exp) {
					
				};
				
				employees.add(employee);
				
			} 
			cn.close();
		} catch (ClassNotFoundException | SQLException e) {
			e.printStackTrace();
		}
		return employees;
	}
	@Override
	public Employee getEmployeebyid(int id) {
		//code to get employee based on id
		return null;
	}

}
