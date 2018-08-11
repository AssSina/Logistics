package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.base.pojo.DriverDimExample;
import com.sanyang.logistics.base.pojo.DriverDimExample.Criteria;
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
	public Object getDriverDim(String name,Integer driverage,String drivertype){
		DriverDimExample example=new DriverDimExample();
		Criteria criteria = example.createCriteria();
		criteria.andNameLike("%"+name+"%");
		if (driverage!=null) {
			criteria.andDriverageEqualTo(driverage);
		}
		if (drivertype!=null && drivertype!=""){
			criteria.andDrivertypeEqualTo(drivertype);
		}
		List<DriverDim> driverDims=driverDimService.getDriverDim(example);
		return driverDims;
	}
	
	@RequestMapping("/insertDriverDim")
	@ResponseBody
	public String insertDriverDim(DriverDim driverDim){
		driverDimService.insertDriverDim(driverDim);
		return "1";
	}
	
	@RequestMapping("/deleteDriverDim")
	@ResponseBody
	public int deleteDriverDim(Integer driverId){
		driverDimService.deleteDriverDim(driverId);
		return 1;
	}
	
	@RequestMapping("/getDriverDimById")
	@ResponseBody
	public Object getDriverDimById(Integer driverId){
		DriverDim driverDim=driverDimService.getDriverDimById(driverId);
		return driverDim;
	}
	
	@RequestMapping("/updateDriverDim")
	@ResponseBody
	public int updateDriverDim(DriverDim driverDim){
		driverDimService.updateDriverDim(driverDim);
		return 1;
	}
}
