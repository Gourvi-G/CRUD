package com.SpringCore.SpEL;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
         ApplicationContext context=new ClassPathXmlApplicationContext("com/SpringCore/SpEL/SpEL_config.xml");
         Student s1=context.getBean("student",Student.class);
         System.out.println(s1);
	}

}
