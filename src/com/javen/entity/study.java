package com.javen.entity;
public class study {
	private String org;
	private String substance;
	private String start;
	private String end;
	private String person;
	private int year;
	public study(String org,String substance,String start,String end,String person,int year)
	{
	    this.org = org;
	    this.substance = substance;
	    this.start = start;
	    this.end = end;
	    this.person = person;
        this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getSubstance() {
		return substance;
	}
	public void setSubstance(String substance) {
		this.substance = substance;
	}
	public String getStart() {
		return start;
	}
	public void setStart(String start) {
		this.start = start;
	}
	public String getEnd() {
		return end;
	}
	public void setEnd(String end) {
		this.end = end;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
}
