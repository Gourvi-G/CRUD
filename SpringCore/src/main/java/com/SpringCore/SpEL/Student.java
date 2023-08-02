package com.SpringCore.SpEL;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class Student {
	
@Value("#{44+99}")	
private int x;
@Value("#{1+7}")
private int y;

@Value("#{T(java.lang.Math).sqrt(625)}")
private int z;
@Value("#{T(java.lang.Math).E}")
private double e;
@Value("#{new java.lang.String('Gourvi Gupta')}")
private String name;
public String getName() {
	return name;
}
public void setName(String name) {
	this.name = name;
}

@Value("#{true}")
private boolean isActive;
public boolean isActive() {
	return isActive;
}
public void setActive(boolean isActive) {
	this.isActive = isActive;
}
public double getE() {
	return e;
}
public void setE(double e) {
	this.e = e;
}
public int getZ() {
	return z;
}
public void setZ(int z) {
	this.z = z;
}
public int getX() {
	return x;
}
public void setX(int x) {
	this.x = x;
}
public int getY() {
	return y;
}
public void setY(int y) {
	this.y = y;
}
@Override
public String toString() {
	return "Student [x=" + x + ", y=" + y + ", z=" + z + ", e=" + e + ", name=" + name + ", isActive=" + isActive + "]";
}




}
