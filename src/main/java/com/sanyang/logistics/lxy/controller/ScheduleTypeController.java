package com.sanyang.logistics.lxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.ScheduleType;
import com.sanyang.logistics.lxy.service.IScheduleTypeService;

@Controller
@RequestMapping("/scheduletype")
public class ScheduleTypeController{

	@Autowired
	private IScheduleTypeService scheduletypeservice;
	@RequestMapping("/getscheduletype")
	@ResponseBody
	public List<ScheduleType> geTypes() {
		// TODO Auto-generated method stub
		List<ScheduleType> geTypes = scheduletypeservice.geTypes();
		return geTypes;
	}
	
	@RequestMapping("/deleteoneid")
	@ResponseBody
	public Object deleteone(Integer id) {
		scheduletypeservice.deleteone(id);
		return "";
		
	}

}
