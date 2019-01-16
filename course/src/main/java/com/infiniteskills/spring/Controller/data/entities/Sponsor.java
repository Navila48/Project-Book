package com.infiniteskills.spring.Controller.data.entities;

public class Sponsor {

	private String name;
	private String phone;
	private String email;
	
	public Sponsor()
	{
		
	}
	public Sponsor(String name,String phone,String email)
	{
		this.name=name;
		this.phone=phone;
		this.email=email;
	}
	public String getName() {
		return name;
	}
	public String getPhone() {
		return phone;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getEmail() {
		return email;
	}
	public String toString()
	{
		return name+" "+phone+" "+email;
	}
}
