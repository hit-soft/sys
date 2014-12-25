package com.javen.entity;
public class funds {
	private String name;
	private String source;
	private String leader;
	private String start;
	private String end;
	private double contract;
	private double already;
	private double non;
	private int number;
	private String person;
	private int per_level;
	private String type;
	private int year;
	//
	public funds(String name ,String source, String leader, String start, String end, double contract, double already,
     double non, int number, String person, int per_level, String type ,int year)
	{
	    this.name = name;
	    this.source = source;
	    this.leader = leader;
	    this.start = start;
	    this.end = end;
        this.contract = contract;
        this.already = already;
        this.non = non;
        this.number = number;
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
	public String getSource() {
		return source;
	}
	public void setSource(String source) {
		this.source = source;
	}
	public String getLeader() {
		return leader;
	}
	public void setLeader(String leader) {
		this.leader = leader;
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
	public double getContract() {
		return contract;
	}
	public void setContract(double contract) {
		this.contract = contract;
	}
	public double getAlready() {
		return already;
	}
	public void setAlready(double already) {
		this.already = already;
	}
	public double getNon() {
		return non;
	}
	public void setNon(double non) {
		this.non = non;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
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
