package com.SpringCore.stereoType;
import org.springframework.context.ApplicationContext;

import org.springframework.context.annotation.ImportResource;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        ApplicationContext con=new ClassPathXmlApplicationContext("com/SpringCore/stereoType/StereoType_config.xml");
        student Student=con.getBean("ob",student.class);
        System.out.println(Student);
        //System.out.println(Student.getAddress());
        //System.out.println(Student.getAddress().getClass().getName());
        
        System.out.println(Student.hashCode());
        student Student2 = con.getBean("ob",student.class);
        System.out.println(Student2.hashCode());
        Teacher t1 =con.getBean("teacher",Teacher.class);
        Teacher t2 =con.getBean("teacher",Teacher.class);
        System.out.println(t1.hashCode());
        System.out.println(t2.hashCode());
	}

}
