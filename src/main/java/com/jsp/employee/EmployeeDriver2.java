package com.jsp.employee;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EmployeeDriver2 {
	public static void main(String[] args) {
		ApplicationContext applicationContext= new ClassPathXmlApplicationContext("myspring.xml");
		
		Employee employee=(Employee)applicationContext.getBean("myEmployee");
		
	}

}
