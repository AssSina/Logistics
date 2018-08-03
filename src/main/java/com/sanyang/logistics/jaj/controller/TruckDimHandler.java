package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.jaj.service.TruckDimService;
/**
 * 车辆控制层
 * @author asus
 *
 */
@Controller
@RequestMapping("/truckDim")
public class TruckDimHandler {
	
	@Autowired
	private TruckDimService truckDimService;
	
	@RequestMapping("/getTruckDim")
	@ResponseBody
	public Object getTruckDim(){
		List<TruckDim> truckDims=truckDimService.getTruckDim();
		 return truckDims;
	}

}
