package com.springmvc;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;


public class Customer {
	private String firstName ;
	
	@NotNull(message="is Required")
	@Size(min=1, message="Required")
	private String lastName;
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

}
