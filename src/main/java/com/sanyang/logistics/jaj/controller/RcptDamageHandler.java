package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.RcptDamage;
import com.sanyang.logistics.jaj.service.RcptDamageService;

@RequestMapping("rcptDamage")
@Controller
public class RcptDamageHandler {

	@Autowired
	private RcptDamageService rcptDamageService;
	
	@RequestMapping("getRcptDamage")
	@ResponseBody
	public Object getRcptDamage(RcptDamage rcptDamage){
		List<RcptDamage> rcptDamages = rcptDamageService.getRcptDamage(rcptDamage);
		return rcptDamages;
	}
	
	@RequestMapping("/insertRcptDamage")
	@ResponseBody
	public String insertRcptDamage(RcptDamage RcptDamage){
		rcptDamageService.insertRcptDamage(RcptDamage);
		return "1";
	}
	
	@RequestMapping("/deleteRcptDamage")
	@ResponseBody
	public int deleteRcptDamage(Integer whId){
		rcptDamageService.deleteRcptDamage(whId);
		return 1;
	}
	
	@RequestMapping("/getRcptDamageById")
	@ResponseBody
	public Object getRcptDamageById(Integer whId){
		RcptDamage rcptDamage=rcptDamageService.getRcptDamageById(whId);
		return rcptDamage;
	}
	
	@RequestMapping("/updateRcptDamage")
	@ResponseBody
	public int updateRcptDamage(RcptDamage RcptDamage){
		rcptDamageService.updateRcptDamage(RcptDamage);
		return 1;
	}
	

}
