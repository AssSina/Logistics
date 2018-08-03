package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.jaj.service.DriverDimService;
/**
 * 司机控制层
 * @author asus
 *
 */
@Controller
@RequestMapping("/driverDim")
public class DriverDimHandler {
	
	@Autowired
	private DriverDimService driverDimService;
	
	@RequestMapping("/getDriverDim")
	@ResponseBody
	public Object getTruckDim(){
		 List<DriverDim> driverDims=driverDimService.getDriverDim();
		 return driverDims;
	}

}
