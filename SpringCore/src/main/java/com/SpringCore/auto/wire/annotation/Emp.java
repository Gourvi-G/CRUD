package com.SpringCore.auto.wire.annotation;

import org.springframework.beans.factory.annotation.Autowired;

public class Emp {
	@Autowired
         private Address adress;

		public Address getAdress() {
			return adress;
		}

		public void setAdress(Address adress) {
			this.adress = adress;
		}

		public Emp(Address adress) {
			super();
			this.adress = adress;
		}

		public Emp() {
			super();
			// TODO Auto-generated constructor stub
		}

		@Override
		public String toString() {
			return "Emp [adress=" + adress + "]";
		}
         
}
