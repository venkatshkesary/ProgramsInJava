package com.app.dto;

import java.util.ArrayList;
import java.util.List;

public class Logic {
	
	private String action;
	private String conditional;
	private List<Check> checks=new ArrayList<>();
	
	
	public String getAction() {
		return action;
	}
	public void setAction(String action) {
		this.action = action;
	}
	public String getConditional() {
		return conditional;
	}
	public void setConditional(String conditional) {
		this.conditional = conditional;
	}
	public List<Check> getChecks() {
		return checks;
	}
	public void setChecks(List<Check> checks) {
		this.checks = checks;
	}
	
	

}
