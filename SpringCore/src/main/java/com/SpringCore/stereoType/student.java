package com.SpringCore.stereoType;

import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component("ob")
@Scope("prototype")
public class student {
	@Value("Gourvi")
 private String StudentName;
	
 @Value("Khizrabad")
 private String City;	
 @Value("#{temp}")	
private List<String> address; 

  
public List<String> getAddress() {
	return address;
}
public void setAddress(List<String> address) {
	this.address = address;
}
public String getStudentName() {
	return StudentName;
}
public void setStudentName(String studentName) {
	StudentName = studentName;
}
public String getCity() {
	return City;
}
public void setCity(String city) {
	City = city;
}
@Override
public String toString() {
	return "student [StudentName=" + StudentName + ", City=" + City + "]";
}
public static void setstudent_Id(int int1) {
	// TODO Auto-generated method stub
	
}
  
}
