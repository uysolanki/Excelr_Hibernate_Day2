package com.excelr.ExclerHibernateWithMaven.entity;

import javax.persistence.Embeddable;

@Embeddable
public class Address {
		private int houseNumber;
		private String cityName;
		private int pincode;
		
		public Address() {}
		public Address(int houseNumber, String cityName, int pincode) {
			this.houseNumber = houseNumber;
			this.cityName = cityName;
			this.pincode = pincode;
		}
		public int getHouseNumber() {
			return houseNumber;
		}
		public void setHouseNumber(int houseNumber) {
			this.houseNumber = houseNumber;
		}
		public String getCityName() {
			return cityName;
		}
		public void setCityName(String cityName) {
			this.cityName = cityName;
		}
		public int getPincode() {
			return pincode;
		}
		public void setPincode(int pincode) {
			this.pincode = pincode;
		}
		@Override
		public String toString() {
			return "Address [houseNumber=" + houseNumber + ", cityName=" + cityName + ", pincode=" + pincode + "]";
		}
		
		
		
		
}
