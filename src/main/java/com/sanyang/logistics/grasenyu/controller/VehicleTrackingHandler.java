package com.sanyang.logistics.grasenyu.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.grasenyu.service.IVehicleTrackingService;

@Controller
@RequestMapping("/clgz")
public class VehicleTrackingHandler {
	
	@Autowired
	IVehicleTrackingService ordertrackingservice;
	

	/**
	 * 主页面数据
	 * @param r
	 * @return
	 */
	@RequestMapping("/allcl")
	@ResponseBody
	public Object allcl(TruckDim r) {
//		System.out.println("..............."+r.getEnd_date());
		
		List<TruckDim> allTruck = ordertrackingservice.allTruck(r);
//		System.out.println(allTruck);
		return allTruck;
	}
	
	/**
	 * 车辆信息
	 * @param id
	 * @return
	 */
	@RequestMapping("/cinfo")
	@ResponseBody
	public Object cinfo(Integer id) {
		
		TruckDim cinfo = ordertrackingservice.cinfo(id);
//		System.out.println(cinfo);
		return  cinfo;
	}
	
	/**
	 * 刷出路线
	 * @param id
	 * @return
	 */
	@RequestMapping("/lx")
	@ResponseBody
	public Object lx(Integer id) {		
		List<TruckDim> lx = ordertrackingservice.lx(id);
//		System.out.println("---------------------------"+lx);
		return  lx;
	}
	
	
	/**
	 * 启点和终点
	 * @param id
	 * @return
	 */
	@RequestMapping("/qz")
	@ResponseBody
	public Object qz(Integer id) {
		
		TruckDim qz = ordertrackingservice.qz(id);
		
		return qz;
	}
	
	
	
	
	/**
	 * 修改当前位置同时加上一个坐标点
	 * @param r
	 * @return
	 */
	@RequestMapping("/updatexyandaddcoorde_xy")
	@ResponseBody
	public Object updatexyandaddcoorde_xy(TruckDim r) {		
		
//		System.out.println("+++++++++"+r);
		TruckDim f = ordertrackingservice.isF(r.getTruckId());
		String trucklocation = f.getTrucklocation();
//		System.out.println(trucklocation);
		String coord_name = r.getCoord_name();
		if (coord_name.equals(trucklocation)) {
			
			return "no";
		}else {
			System.out.println("------------"+r);
			ordertrackingservice.addxy(r);
			
			ordertrackingservice.updatelocation(r);
			
			return "ok";
		}
		
		
		
		
		
	}
	
	
	
	
}
