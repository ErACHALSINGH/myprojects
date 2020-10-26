package com.arit.sprest;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonProperty;
import com.fasterxml.jackson.annotation.JsonPropertyOrder;

@JsonPropertyOrder({"arit_eid","arit_type","arit_name"})
@JsonIgnoreProperties({"email"})
@JsonInclude(JsonInclude.Include.NON_NULL)


public class Employee {
	@JsonProperty("arit_eid")
	private long id;
	@JsonProperty("arit_name")
	private String name;
	@JsonProperty("arit_type")
	private String type;
	private String email=null;
	public Employee(long id, String name, String type) {
//		super();
		this.id = id;
		this.name = name;
		this.type = type;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}

}
