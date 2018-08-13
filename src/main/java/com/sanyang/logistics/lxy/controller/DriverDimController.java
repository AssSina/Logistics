package com.sanyang.logistics.lxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.DriverDim;
import com.sanyang.logistics.lxy.service.IDrvierDimService;

@Controller
@RequestMapping("/driverdim")
public class DriverDimController {
	
			@Autowired
			private IDrvierDimService driverDimService;
	
			@RequestMapping("/getdriverdim")
			@ResponseBody
				public Object getdriverdim() {
					List<DriverDim> getpri = driverDimService.getpri();
					return getpri;
				}

}
