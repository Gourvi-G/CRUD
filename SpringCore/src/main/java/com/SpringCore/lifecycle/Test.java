package com.SpringCore.lifecycle;
import org.springframework.context.ApplicationContext;

import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    AbstractApplicationContext context =   new ClassPathXmlApplicationContext("com/SpringCore/lifecycle/Samosaconfig.xml");
//    samosa s1=(samosa) context.getBean("Samosa1");
//    System.out.println(s1);
      
//    
//    System.out.println("**********************************************************************************************");
//    pepsi p1=(pepsi)context.getBean("p1");
//    System.out.println(p1);
//    
	
 sauce s=(sauce)context.getBean("exp");
 System.out.println(s);
 context.registerShutdownHook();
	}
}
