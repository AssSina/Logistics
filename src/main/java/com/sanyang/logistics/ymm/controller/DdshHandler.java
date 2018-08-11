package com.sanyang.logistics.ymm.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.ymm.service.DdshService;

@Controller
@RequestMapping("/ddsh")
public class DdshHandler {
	
	@Autowired
	private DdshService service;
	
	@RequestMapping("/tolistsys")
	@ResponseBody
	public Object tolistsys(Sysorders sysorders,String cusOrderNo,String cname,String statusname,String description,String planTrsprtDate,String planArrivalDate) throws Exception {

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
		
		List<Sysorders> tolistsys = service.tolistsys(sysorders);
		
		return tolistsys;
	}

	
}
