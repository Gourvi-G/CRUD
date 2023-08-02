package com.SpringCore.lifecycle;

import org.springframework.beans.factory.DisposableBean;
import org.springframework.beans.factory.InitializingBean;

public class pepsi implements InitializingBean, DisposableBean{
       private double price;

	public double getPrice() {
		return price;
	}

	public void setPrice(double price) {
		this.price = price;
	}

	public pepsi() {
		super();
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "pepsi [price=" + price + "]";
	}
    public void afterPropertiesSet() throws Exception{
    	System.out.println("Taking pepsiiiiiiii...........");
    }
    public void destroy() throws Exception{
    	System.out.println("Going to put throw bottle after drinking........");
    }
}
