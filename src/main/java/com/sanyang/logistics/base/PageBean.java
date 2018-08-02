package com.sanyang.logistics.base;

import java.util.ArrayList;
import java.util.List;

public class PageBean {
	private Integer thispage;//当前第几页
	private Integer pagenum;//每页几条数据
	private Integer count;//共几条
	private Integer pagesize;//共几页
	private List db;//页面要显示的数据
	private Integer startnum;//从第几条数据开始
	private Integer endnum;//查询到第几条数据
	
	public PageBean(){
		this.pagenum=4;//默认每页显示4条数据
		db = new ArrayList();
	}
	
	public Integer getStartnum() {
		return (thispage-1)*pagenum;
	}

	public void setStartnum(Integer startnum) {
		this.startnum = startnum;
	}

	public Integer getEndnum() {
		return thispage*pagenum;
	}



	public void setEndnum(Integer endnum) {
		this.endnum = endnum;
	}



	public Integer getThispage() {
		return thispage;
	}
	public void setThispage(Integer thispage) {
		this.thispage = thispage;
	}
	public Integer getPagenum() {
		return pagenum;
	}
	public void setPagenum(Integer pagenum) {
		this.pagenum = pagenum;
	}
	public Integer getCount() {
		return count;
	}
	
	public void setCount(Integer count) {
		this.count = count;
		System.out.println(count);
		System.out.println(pagenum);
		this.pagesize = (int)(Math.ceil((this.count*1.0/this.pagenum)));
	}
	
	public Integer getPagesize() {
		return pagesize;
	}
	public void setPagesize(Integer pagesize) {
		this.pagesize = pagesize;
	}
	public List getDb() {
		return db;
	}
	public void setDb(List db) {
		this.db = db;
	}
	
	

}
