package com.arit;

import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class Reservation {
	@Size(min=3,message = "*should be atleast 3 chars long")
	@Pattern(regexp="[a-zA-Z] {3}",message= "Enter Valid firstname")
	private String firstname;
	@Size(min=3,message = "*should be atleast 3 chars long")
	@Pattern(regexp="[a-zA-Z] {3}",message= "Enter Valid Lastname")
	private String lastname;
	private String gender;
	private String food;
	private String cityFrom;
	private String cityTo;
	
	public Reservation() {
		super();
	}
	public String getCityTo() {
		return cityTo;
	}

	public void setCityTo(String cityTo) {
		this.cityTo = cityTo;
	}

	

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getFood() {
		return food;
	}

	public void setFood(String food) {
		this.food = food;
	}

	public String getCityFrom() {
		return cityFrom;
	}

	public void setCityFrom(String cityFrom) {
		this.cityFrom = cityFrom;
	}
	
}
