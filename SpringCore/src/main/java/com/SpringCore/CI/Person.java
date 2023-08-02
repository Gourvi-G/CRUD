package com.SpringCore.CI;

import java.util.List;

public class Person {
      private String name;
      private int personID;
      private certi certi;
      private List<String> list;
      public Person(String name, int personID,certi certi, List<String> list) {
    	  this.name=name;
    	  this.personID=personID;
    	  this.certi=certi;
    	  this.list=list;
    	  
      }

	@Override
	public String toString() {
		return this.name +" : "+this.personID+ "{"+this.certi.name+"}";
	}
}
