package com.infiniteskills.spring.Controller.data.entities;

import java.math.BigDecimal;
import java.util.List;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;


public class Project {
 private long projectId;
 private String name;
 
 @NotBlank(message="Provide description.")
 private String description;
@NotEmpty
 private Sponsor sponsors;

 private List<String>pointOfContact;
 public List<String> getPointOfContact() {
	return pointOfContact;
}
public void setPointOfContact(List<String> pointOfContact) {
	this.pointOfContact = pointOfContact;
}
private BigDecimal authorizedHours;
 private BigDecimal authorizedFunds;
 private boolean special;
 private String type;
public long getProjectId() {
	return projectId;
}
public void setProjectId(long projectId) {
	this.projectId = projectId;
}
public String getName() {
	return name;
}
public void setName(String name) {
	//System.out.println("Data Bind");
	this.name = name;
}
public String getDescription() {
	return description;
}
public void setDescription(String description) {
	this.description = description;
}
public Sponsor getSponsors() {
	return sponsors;
}
public void setSponsors(Sponsor sponsors) {
	this.sponsors = sponsors;
}
public BigDecimal getAuthorizedHours() {
	return authorizedHours;
}
public void setAuthorizedHours(BigDecimal authorizedHours) {
	this.authorizedHours = authorizedHours;
}
public BigDecimal getAuthorizedFunds() {
	return authorizedFunds;
}
public void setAuthorizedFunds(BigDecimal authorizedFunds) {
	this.authorizedFunds = authorizedFunds;
}
public boolean isSpecial() {
	return special;
}
public void setSpecial(boolean special) {
	this.special = special;
}
public String getType() {
	return type;
}
public void setType(String type) {
	this.type = type;
}
public String toString()
{
	return name+" "+sponsors+" "+authorizedHours+" "+authorizedFunds+" "+description+" "+special+" "+pointOfContact;
}
}
