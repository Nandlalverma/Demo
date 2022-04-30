package com.TrainingCenterApi.entity;

import java.util.Date;
import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import org.hibernate.annotations.CreationTimestamp;

import com.fasterxml.jackson.annotation.JsonManagedReference;


@Entity
public class TrainingCenter {

	@Id
    @Size(min=0,max=10)
	private String contactPhone;

    @Size(max=40)
	private String centerName;

   @NotNull
   @Pattern(regexp="^[a-zA-Z0-9_]*$")
   private String centerCode;
	
    @OneToOne(cascade = CascadeType.ALL)
    @JsonManagedReference
	private Address address;
   
    @Column(name="Student_Capacity")
    private long studentCapacity;


	
	@CreationTimestamp
	@Column(name="CreatedOn_time")
	private Date time;
	
	
    @Email(message="Email address is not valid")
	@Column(name="contact_email")
	private String contactEmail;


	public String getContactPhone() {
		return contactPhone;
	}


	public void setContactPhone(String contactPhone) {
		this.contactPhone = contactPhone;
	}


	public String getCenterName() {
		return centerName;
	}


	public void setCenterName(String centerName) {
		this.centerName = centerName;
	}


	public String getCenterCode() {
		return centerCode;
	}


	public void setCenterCode(String centerCode) {
		this.centerCode = centerCode;
	}


	public Address getAddress() {
		return address;
	}


	public void setAddress(Address address) {
		this.address = address;
	}


	public long getStudentCapacity() {
		return studentCapacity;
	}


	public void setStudentCapacity(long studentCapacity) {
		this.studentCapacity = studentCapacity;
	}


	public Date getTime() {
		return time;
	}


	public void setTime(Date time) {
		this.time = time;
	}


	public String getContactEmail() {
		return contactEmail;
	}


	public void setContactEmail(String contactEmail) {
		this.contactEmail = contactEmail;
	}


	@Override
	public String toString() {
		return "TrainingCenter [contactPhone=" + contactPhone + ", centerName=" + centerName + ", centerCode="
				+ centerCode + ", address=" + address + ", studentCapacity=" + studentCapacity + ", time=" + time
				+ ", contactEmail=" + contactEmail + "]";
	}


	public TrainingCenter() {
		super();
		// TODO Auto-generated constructor stub
	}


	public TrainingCenter(@Size(min = 0, max = 10) String contactPhone, @Size(max = 40) String centerName,
			@NotNull @Pattern(regexp = "^[a-zA-Z0-9_]*$") String centerCode, Address address, long studentCapacity,
			Date time, @Email(message = "Email address is not valid") String contactEmail) {
		super();
		this.contactPhone = contactPhone;
		this.centerName = centerName;
		this.centerCode = centerCode;
		this.address = address;
		this.studentCapacity = studentCapacity;
		this.time = time;
		this.contactEmail = contactEmail;
	}




}
