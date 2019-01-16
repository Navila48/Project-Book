package com.infiniteskills.spring.Controller.data.entities;

import java.math.BigDecimal;

import org.apache.catalina.tribes.util.Arrays;

public class Resource {

	private long resourceId;
	private String name;
	private String type;
	private BigDecimal cost;
	private String unitOfMeasure;
	private String[] indicators;
	private String notes;
	public String getNotes() {
		return notes;
	}
	public void setNotes(String notes) {
		this.notes = notes;
	}
	public String[] getIndicators() {
		return indicators;
	}
	public void setIndicators(String[] indicators) {
		this.indicators = indicators;
	}
	
	public long getResourceId() {
		return resourceId;
	}
	public void setResourceId(long resourceId) {
		this.resourceId = resourceId;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public BigDecimal getCost() {
		return cost;
	}
	public void setCost(BigDecimal cost) {
		this.cost = cost;
	}
	public String getUnitOfMeasure() {
		return unitOfMeasure;
	}
	public void setUnitOfMeasure(String unitOfMeasure) {
		this.unitOfMeasure = unitOfMeasure;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String toString()
	{
		return name+" "+type+" "+cost+" "+unitOfMeasure+" "+Arrays.toString(indicators)+" "+notes;
	}
}
