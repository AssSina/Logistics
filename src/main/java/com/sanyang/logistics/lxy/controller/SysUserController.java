package com.sanyang.logistics.lxy.controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.SysUser;
import com.sanyang.logistics.lxy.service.IsysUserService;


@Controller
@RequestMapping("/sysUser")

public class SysUserController {


	@Autowired
	private IsysUserService service;

	@RequestMapping("/getsysuser")
	@ResponseBody
	public Object getsysUser(SysUser sysUser) {
		SysUser sysUsers = service.getUser(sysUser);
		if (sysUsers==null) {
			return "1";
		}
		return sysUsers;
	}
	
	
	
	
}

	
	

