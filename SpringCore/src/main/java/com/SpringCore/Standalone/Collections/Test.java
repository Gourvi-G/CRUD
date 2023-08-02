package com.SpringCore.Standalone.Collections;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
      ApplicationContext con=new ClassPathXmlApplicationContext("com/SpringCore/Standalone/Collections/Standalone_Config.xml");
	 person person1=con.getBean("person1", person.class);
	 System.out.println(person1);
	
	
	}
	

}
