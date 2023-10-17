package com.jsp.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;

public class EmployeeDriver1 {
	public static void main(String[] args) {
		
		ClassPathResource classPathResource= new ClassPathResource("myspring.xml");
		
		BeanFactory beanFactory= new XmlBeanFactory(classPathResource);
		
		Employee employee=(Employee) beanFactory.getBean("myEmployee");
		
		
//		employee.emp_id=21212;
//		employee.name="XYZ";
//		employee.email="xyz@mail.com";
		
		employee.employeeDetails();
		
		
	}
	
}
