package com.itways.demo.models;

public class User {
	
	private int id;
	private String fullName;
	private String contactNumber;
	private String emailId;
	
	public User(int id, String fullName, String contactNumber, String emailId) {
		super();
		this.id = id;
		this.fullName = fullName;
		this.contactNumber = contactNumber;
		this.emailId = emailId;
	}
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getFullName() {
		return fullName;
	}
	public void setFullName(String fullName) {
		this.fullName = fullName;
	}
	public String getContactNumber() {
		return contactNumber;
	}
	public void setContactNumber(String contactNumber) {
		this.contactNumber = contactNumber;
	}
	public String getEmailId() {
		return emailId;
	}
	public void setEmailId(String emailId) {
		this.emailId = emailId;
	}

	@Override
	public String toString() {
		return "User [id=" + id + ", fullName=" + fullName + ", contactNumber=" + contactNumber + ", emailId=" + emailId
				+ "]";
	}

}
