package com.sanyang.logistics.ymm.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Customer;
import com.sanyang.logistics.base.pojo.CustomerOrdertype;
import com.sanyang.logistics.base.pojo.SysOrderType;
import com.sanyang.logistics.base.pojo.SysorderProduct;
import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.ymm.service.CustService;


@Controller
@RequestMapping("/ddgl")
public class CustHandler {

	@Autowired
	private CustService service;
	
	@RequestMapping("/tolistcust")
	@ResponseBody
	public Object tolistcust(Sysorders sysorders,String cusOrderNo,String cname,String statusname,String description,String planTrsprtDate,String planArrivalDate) throws Exception {
		cusOrderNo=new String(cusOrderNo.getBytes("iso8859-1"),"utf-8");
		cname=new String(cname.getBytes("iso8859-1"),"utf-8");
		statusname=new String(statusname.getBytes("iso8859-1"),"utf-8");
		description=new String(description.getBytes("iso8859-1"),"utf-8");
		planTrsprtDate=new String(planTrsprtDate.getBytes("iso8859-1"),"utf-8");
		planArrivalDate=new String(planArrivalDate.getBytes("iso8859-1"),"utf-8");
		sysorders.setCusOrderNo(cusOrderNo);
		sysorders.setCname(cname);
		sysorders.setStatusname(statusname);
		sysorders.setDescription(description);
		sysorders.setPlanTrsprtDate(planTrsprtDate);
		sysorders.setPlanArrivalDate(planArrivalDate);
		List<Sysorders> tolistcust = service.tolistcust(sysorders);
		return tolistcust;
	}
	
	@RequestMapping("/tolistsys")
	@ResponseBody
	public Object tolistsys() {
		List<Sysorders> tolistsys = service.tolistsys();
		return tolistsys;
	}
	
	@RequestMapping("/tolistwar")
	@ResponseBody
	public Object tolistwar() {
		List<Warehouse> tolistwar = service.tolistwar();
		return tolistwar;
	}
	
	@RequestMapping("/tolistdname")
	@ResponseBody
	public Object tolistdname() {
		List<CustomerOrdertype> tolistdname = service.tolistdname();
		return tolistdname;
	}
	
	@RequestMapping("/tolistmer")
	@ResponseBody
	public Object tolistmer() {
		List<Customer> tolistmer = service.tolistmer();
		return tolistmer;
	}
	
	@RequestMapping("/tolistsyso")
	@ResponseBody
	public Object tolistsyso() {
		List<SysOrderType> tolistsyso = service.tolistsyso();
		return tolistsyso;
	}
	
	@RequestMapping("/addorder")
	@ResponseBody
	public Object addorder(CustomerOrdertype ordertype) {
		service.addorder(ordertype);
		return "date";
	}
	
	@RequestMapping("/selbyoid")
	@ResponseBody
	public Object selbyoid(Integer oid) {
		Sysorders selbyoid = service.selbyoid(oid);
		return selbyoid;
	}
	
	@RequestMapping("/delsys")
	@ResponseBody
	public Object delsys(Integer oid) {
		service.delsys(oid);
		return "";
	}
	
	@RequestMapping("/addcustomer")
	@ResponseBody
	public Object addcustomer(Customer customer) {
		service.addcustomer(customer);
		return "";
	}
	
	@RequestMapping("/selbyoidsys")
	@ResponseBody
	public Object selbyoidsys(Integer oid) {
		Sysorders selbyoidsys = service.selbyoidsys(oid);
		return selbyoidsys;
	}
	
	@RequestMapping("/tolisthwqd")
	@ResponseBody
	public Object tolisthwqd(Integer oid) {
		List<SysorderProduct> tolisthwqd = service.tolisthwqd(oid);
		return tolisthwqd;
	}
	
	@RequestMapping("/selectbyoid")
	@ResponseBody
	public Object selectbyoid(Integer oid) {
		Sysorders selectbyoid = service.selectbyoid(oid);
		return selectbyoid;
	}
	
	
}
