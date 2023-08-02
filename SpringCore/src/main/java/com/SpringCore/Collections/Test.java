package com.SpringCore.Collections;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
@ImportResource("applicationContext.xml")

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ApplicationContext con=new ClassPathXmlApplicationContext("com/SpringCore/Collections/Collectionconfig.xml");
		
		Employee Emp1=(Employee)con.getBean("Emp1");
		((ClassPathXmlApplicationContext) con).close();
		System.out.println(Emp1.getName());
		System.out.println(Emp1.getPhones());
		System.out.println(Emp1.getAddress());
		System.out.println(Emp1.getCourses());
		System.out.println(Emp1.getPhones().getClass().getName());

	}

}
