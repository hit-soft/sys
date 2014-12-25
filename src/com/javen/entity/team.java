package com.javen.entity;
public class team {
	private String name;
	private String post;
	private String start;
	private String end;
	private String person;
	private String type;
	private int year;
	public team(String name,String post,String start,String end,String person,String type,int year)
	{
	    this.name = name;
	    this.post = post;
	    this.start = start;
	    this.end = end;
	    this.person = person;
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
	public String getPost() {
		return post;
	}
	public void setPost(String post) {
		this.post = post;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
}
