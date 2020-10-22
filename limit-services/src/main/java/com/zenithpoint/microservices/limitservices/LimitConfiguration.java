package com.zenithpoint.microservices.limitservices;

import org.springframework.stereotype.Component;

public class LimitConfiguration {

	private int mainimum;
	private int maximum;
	public LimitConfiguration() {
		super();
		// TODO Auto-generated constructor stub
	}
	public LimitConfiguration(int mainimum, int maximum) {
		super();
		this.mainimum = mainimum;
		this.maximum = maximum;
	}
	public int getMainimum() {
		return mainimum;
	}
	public void setMainimum(int mainimum) {
		this.mainimum = mainimum;
	}
	public int getMaximum() {
		return maximum;
	}
	public void setMaximum(int maximum) {
		this.maximum = maximum;
	}
	
	
	
}
