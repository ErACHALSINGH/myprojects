package com.arit.model;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

import com.arit.custonvalidation.Password;

public class Employee {
	private String name;
	//@Size(min=3,message = "*should be atleast 3 chars long")
	//@Pattern(regexp="[a-zA-Z0-9] {10}",message= "length must be 3")
	@Password
	private String pass;
	@Min(value=18,message ="Must be equal or greater than 18")
	@Max(value=45,message ="Must be equal or less than 45")
	private int age;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getPass() {
		return pass;
	}
	public void setPass(String pass) {
		this.pass = pass;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	
}
