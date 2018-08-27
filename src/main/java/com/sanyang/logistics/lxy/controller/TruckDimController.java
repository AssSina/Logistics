package com.sanyang.logistics.lxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.TruckDim;
import com.sanyang.logistics.lxy.service.ITruckDimService;

@Controller
@RequestMapping("truckdim")
public class TruckDimController {
	@Autowired
	private ITruckDimService truckDimService;
	@RequestMapping("gettru")
	@ResponseBody
	public Object gettruckdim() {
		
		List<TruckDim> gettru = truckDimService.gettru();
		return gettru;
		
	};
	

}
