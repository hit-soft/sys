package com.javen.entity;
public class accept {
	private String name;
	private String source;
	private String leader;
	private String start;
	private String end;
	private double contract;
	private String type;
	private String time;
	private String org;
	private int number;
	private String card;
	private String person;
	private int per_level;
	private String remark;
	private int year;
	public accept(String name,String source,String leader,String start,String end,
	        double contract,String type,String time,String org,int number,String card,
	        String person,int per_level,String remark,int year)
	{
	    this.name = name;
	    this.source = source;
	    this.leader = leader;
	    this.start = start;
	    this.end = end;
	    this.contract = contract;
	    this.type = type;
	    this.time = time;
	    this.org = org;
	    this.number = number;
	    this.card = card;
	    this.person = person;
	    this.per_level = per_level;
        this.remark = remark;
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
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getTime() {
		return time;
	}
	public void setTime(String time) {
		this.time = time;
	}
	public String getOrg() {
		return org;
	}
	public void setOrg(String org) {
		this.org = org;
	}
	public int getNumber() {
		return number;
	}
	public void setNumber(int number) {
		this.number = number;
	}
	public String getCard() {
		return card;
	}
	public void setCard(String card) {
		this.card = card;
	}
	public String getRemark() {
		return remark;
	}
	public void setRemark(String remark) {
		this.remark = remark;
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
}
