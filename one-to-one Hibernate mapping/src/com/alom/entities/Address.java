package com.alom.entities;

import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.persistence.CascadeType;
import javax.persistence.Entity;

@Entity
public class Address {

	@Id
	private Integer addressId;
	private String city;
	private String zip;
	public Integer getAddressId() {
		return addressId;
	}
	public void setAddressId(Integer addressId) {
		this.addressId = addressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getZip() {
		return zip;
	}
	public void setZip(String zip) {
		this.zip = zip;
	}
	@Override
	public String toString() {
		return "Address [addressId=" + addressId + ", city=" + city + ", zip=" + zip + ", employee=" + employee + "]";
	}
	
	@OneToOne(cascade = CascadeType.ALL, mappedBy = "address")
	private Employee employee;
	public Employee getEmployee() {
		return employee;
	}
	public void setEmployee(Employee employee) {
		this.employee = employee;
	}
	
}
