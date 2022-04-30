package com.TrainingCenterApi.entity;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class Address {

	@Id
	private long pincode;

	@Column(name="details_addess")
	private String daddress;
	private String city;
	private String state;
	

	@OneToOne(mappedBy = "address")
	@JsonBackReference
	private TrainingCenter tcenter;



	
	public TrainingCenter getTcenter() {
		return tcenter;
	}
	public void setTcenter(TrainingCenter tcenter) {
		this.tcenter = tcenter;
	}
	public long getPincode() {
		return pincode;
	}
	public void setPincode(long pincode) {
		this.pincode = pincode;
	}
	public String getDaddress() {
		return daddress;
	}
	public void setDaddress(String daddress) {
		this.daddress = daddress;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	@Override
	public String toString() {
		return "Address [pincode=" + pincode + ", daddress=" + daddress + ", city=" + city + ", state=" + state + "]";
	}
	public Address(long pincode, String daddress, String city, String state) {
		super();
		this.pincode = pincode;
		this.daddress = daddress;
		this.city = city;
		this.state = state;
	}
	public Address() {
		super();
		// TODO Auto-generated constructor stub
	}
	



	
	
}
