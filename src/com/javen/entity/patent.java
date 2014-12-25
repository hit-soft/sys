package com.javen.entity;
public class patent {
	private String name;
	private int number;
	private String owner;
	private String org;
	private String time;
	private String person;
	private int per_level;
	private String type;
	private int year;
	public patent(String name, int number, String owner, String org, String time, String person, int per_level, String type, int year)
	{
	    this.name = name;
	    this.number = number;
	    this.owner = owner;
	    this.org = org;
	    this.time = time;
	    this.person = person;
        this.per_level = per_level;
        this.type = type;
        this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getOwner() {
		return owner;
	}
	public void setOwner(String owner) {
		this.owner = owner;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getPerson() {
		return person;
	}
	public void setPerson(String person) {
		this.person = person;
	}
	public int getPer_level() {
		return per_level;
	}
	public void setPer_level(int per_level) {
		this.per_level = per_level;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
