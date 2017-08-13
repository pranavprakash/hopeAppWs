package com.hope.domain;

public class MailEntity {
	
	String firstName;
	
	String lastName;
	
	String email;
	
	String phone;
	
	String comments;
	
	public MailEntity() {
		
	}
	
	public MailEntity(String firstName, String lastName, String email, String phone, String comments) {
		super();
		this.firstName = firstName;
		this.lastName = lastName;
		this.email = email;
		this.phone = phone;
		this.comments = comments;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	@Override
	public String toString() {
		return "Hi,\n\nPlease find the below feedback details:\n\nFirst Name: " + firstName + "\n\nLast Name:" + lastName + "\n\nEmail: " + email + "\n\nPhone number: " + phone
				+ "\n\nComments: " + comments;
	}


}
