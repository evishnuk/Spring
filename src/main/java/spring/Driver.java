package spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import springjdbc.business.EmployeeBusiness;
import springjdbc.business.EmployeeBusinessImpl;

public class Driver {
	public static void main(String[] args) {
		
		
		//create spring container
		ApplicationContext context=new ClassPathXmlApplicationContext("configmetadata.xml");
		EmployeeBusiness employeeBusiness =(EmployeeBusiness) context.getBean("employeeBusiness");
		employeeBusiness.printEmployeeHikes();
	}

}
