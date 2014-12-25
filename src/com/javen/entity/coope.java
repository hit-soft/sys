package com.javen.entity;
public class coope {
	public String type;
	public String out_pe;
	public String in_pe;
	public int num;
	public String start;
	public String end;
	public String out_pl;
	public String in_pl;
	public String goal;
	public String name;
	public String invi_by;
	private int year;
	
	//
	public coope(String type,String out_pe,String in_pe,int num,String start,String end,String out_pl,
    String in_pl,String goal,String name,String invi_by,int year)
	{
	    this.type = type;
	    this.out_pe = out_pe;
	    this.in_pe = in_pe;
	    this.num = num;
	    this.start = start;
	    this.end = end;
	    this.out_pl = out_pl;
	    this.in_pl = in_pl;
	    this.goal = goal;
	    this.name = name;
	    this.invi_by = invi_by;
	    this.year = year;
	}
	public int getYear() {
		return year;
	}
	public void setYear(int year) {
		this.year = year;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOut_pe() {
		return out_pe;
	}
	public void setOut_pe(String out_pe) {
		this.out_pe = out_pe;
	}
	public String getIn_pe() {
		return in_pe;
	}
	public void setIn_pe(String in_pe) {
		this.in_pe = in_pe;
	}
	public int getNum() {
		return num;
	}
	public void setNum(int num) {
		this.num = num;
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
	public String getOut_pl() {
		return out_pl;
	}
	public void setOut_pl(String out_pl) {
		this.out_pl = out_pl;
	}
	public String getIn_pl() {
		return in_pl;
	}
	public void setIn_pl(String in_pl) {
		this.in_pl = in_pl;
	}
	public String getGoal() {
		return goal;
	}
	public void setGoal(String goal) {
		this.goal = goal;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getInvi_by() {
		return invi_by;
	}
	public void setInvi_by(String invi_by) {
		this.invi_by = invi_by;
	}
}
