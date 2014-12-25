package com.javen.entity;
public class publ {
	private String name;
	private String press;
	private String time;
	private String person;
	private int per_level;
	private String type;
	private int year;
	public publ(String name,String press,String time,String person,int per_level,String type,int year)
	{
	    this.name = name;
	    this.press = press;
	    this.time = time;
	    this.person = person;
	    this.per_level = per_level;
        this.type =  type;
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
	public String getPress() {
		return press;
	}
	public void setPress(String press) {
		this.press = press;
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
