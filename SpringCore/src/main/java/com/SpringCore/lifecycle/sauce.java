package com.SpringCore.lifecycle;
import javax.annotation.PostConstruct;

public class sauce {
 private String subject;

public String getSubject() {
	return subject;
}

public void setSubject(String subject) {
	this.subject = subject;
}

public sauce() {
	super();
	// TODO Auto-generated constructor stub
}

@Override
public String toString() {
	return "sauce [subject=" + subject + "]";
}
@PostConstruct
public void start() {
	System.out.println("start method.........");
}

public void end() {
	System.out.println("ending method.........");
}
 
}
