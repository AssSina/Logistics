package com.sanyang.logistics.base.pojo;

public class OrderStatus {
	
	private Integer sid;
	private String statusname;
	private String description;
	
public OrderStatus() {
	// TODO Auto-generated constructor stub
}

public OrderStatus(Integer sid, String statusname, String description) {
	super();
	this.sid = sid;
	this.statusname = statusname;
	this.description = description;
}

public Integer getSid() {
	return sid;
}

public void setSid(Integer sid) {
	this.sid = sid;
}

public String getStatusname() {
	return statusname;
}

public void setStatusname(String statusname) {
	this.statusname = statusname;
}

public String getDescription() {
	return description;
}

public void setDescription(String description) {
	this.description = description;
}

@Override
public String toString() {
	return "OrderStatus [sid=" + sid + ", statusname=" + statusname + ", description=" + description + "]";
}



}
