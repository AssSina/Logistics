package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.WorkOrder;
import com.sanyang.logistics.jaj.service.WorkOrderService;


@Controller
@RequestMapping("/sysorders")
public class WorkOrderHandler {
	
	
	@Autowired
	private WorkOrderService pdservice;
	
	@RequestMapping("/selectPro")
	@ResponseBody
	public Object selectPro(Integer oid){
//		System.out.println("111111111");
//		System.out.println("单号"+oid);
		List<WorkOrder> selectPro = pdservice.selectPro(oid);
//		System.out.println("asdasd"+selectPro);
//		for (WorkOrder workOrder : selectPro) {
//			System.out.println("WWW:"+workOrder.getPmodel());
//		}
		return selectPro;
	}

}
