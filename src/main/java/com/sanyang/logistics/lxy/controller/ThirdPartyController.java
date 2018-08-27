package com.sanyang.logistics.lxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.ThirdParty;
import com.sanyang.logistics.lxy.service.IThirdPartyService;

@Controller
@RequestMapping("thirdparty")
public class ThirdPartyController {
	
	@Autowired
	private IThirdPartyService thirdPartyService;
	
	@RequestMapping("getthir")
	@ResponseBody
	public Object getthirdparty() {
		List<ThirdParty> getthir = thirdPartyService.getthir();
		return getthir;
		
		
	}
	

}
