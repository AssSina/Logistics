package com.sanyang.logistics.jaj.controller;

import java.io.UnsupportedEncodingException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.OrderStatus;
import com.sanyang.logistics.base.pojo.Sysorderses;
import com.sanyang.logistics.jaj.service.SysordersService;

@Controller
@RequestMapping("/sysorders")
public class SysordersHandler {

	@Autowired
	private SysordersService gycSysService;
	
	
	@RequestMapping("/getAllOrder")
	@ResponseBody
	public Object getAllOrder(Sysorderses sysorders) throws UnsupportedEncodingException{
		try {
			String customer = new String(sysorders.getTo_customer().getBytes("ISO8859-1"), "UTF-8");
			String statysname = new String(sysorders.getStatusname().getBytes("ISO8859-1"), "UTF-8");
			sysorders.setTo_customer(customer);
			sysorders.setStatusname(statysname);
		} catch (Exception e) {
			// TODO: handle exception
		}

		List<Sysorderses> allOrder = gycSysService.getAllOrder(sysorders);
//		System.out.println(allOrder);
//		for (Sysorders sysorders2 : allOrder) {
//			System.out.println(sysorders2.getSid());
//		}
		return allOrder;
	}
	
	
	@RequestMapping("/getOrderStatus")
	@ResponseBody
	public Object getOrderStatus(){
		List<OrderStatus> orderStatus = gycSysService.getOrderStatus();
//		for (OrderStatus orderStatus2 : orderStatus) {
//			System.out.println(orderStatus2);
//		}
		return orderStatus;
	}
	
	@RequestMapping("/updateOrderStatus")
	@ResponseBody
	public Object updateOrderStatus(Sysorderses sysorders){
		System.out.println(sysorders.getOid()+","+sysorders.getOrder_status());
        gycSysService.updateOrderStatus(sysorders);
		return "OK";
	}
	

}
  