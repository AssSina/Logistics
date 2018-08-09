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
	public Object getTruckDim(TruckDim truckDim){
		List<TruckDim> truckDims=truckDimService.getTruckDim(truckDim);
		 return truckDims;
	}
	
	@RequestMapping("/insertTruckDim")
	@ResponseBody
	public String insertTruckDim(TruckDim truckDim){
		truckDimService.insertTruckDim(truckDim);
		return "1";
	}
	
	@RequestMapping("/deleteTruckDim")
	@ResponseBody
	public int deleteTruckDim(Integer truckId){
		truckDimService.deleteTruckDim(truckId);
		return 1;
	}
	
	@RequestMapping("/getTruckDimById")
	@ResponseBody
	public Object getTruckDimById(Integer truckId){
		TruckDim truckDim=truckDimService.getTruckDimById(truckId);
		return truckDim;
	}
	
	@RequestMapping("/updateTruckDim")
	@ResponseBody
	public int updateTruckDim(TruckDim truckDim){
		truckDimService.updateTruckDim(truckDim);
		return 1;
	}
	
	@RequestMapping("/getOwnerTypeDimById")
	@ResponseBody
	public Object getOwnerTypeDimById(){
		List<TruckDim> truckDims=truckDimService.getOwnerTypeDimById();
		return truckDims;
	}

}
