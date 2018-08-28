package com.sanyang.logistics.lxy.controller;
import java.io.UnsupportedEncodingException;
import java.util.List;

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
//		System.out.println(sysUser.getLoginId()+" "+sysUser.getPassword());
		SysUser sysUsers = service.getUser(sysUser);
		if (sysUsers==null) {
			return "1";
		}
		return sysUsers;
	}
	
	@RequestMapping("/getour")
	@ResponseBody
	public Object getour(SysUser sysUser) {
		try {
			sysUser.setName(new String(sysUser.getName().getBytes("ISO8859-1"),"UTF-8"));
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			
		}
		List<SysUser> getour = service.getour(sysUser);
		return getour;
	}
	
	@RequestMapping("/deleteuser")
	@ResponseBody
	public Object deleteuser(Integer id) {
		service.deleteuser(id);
		return "123";
	}
	
	@RequestMapping("/getjs")
	@ResponseBody
	public Object selectjs() {
		List<SysUser> getjs = service.getjs();
		return getjs;
	}
	
	@RequestMapping("/getdq")
	@ResponseBody
	public Object selectdq() {
		List<SysUser> getdqs = service.getdq();
		return getdqs;
	}
	
	@RequestMapping("/getone")
	@ResponseBody
	public Object selectone(Integer id) {
		SysUser getone = service.getone(id);
		return getone;
	}
	@RequestMapping("/upuser")
	@ResponseBody
	public Object updateone(SysUser sysUser) {
			service.upuser(sysUser);
			return "0";
	}
	
	@RequestMapping("/adduser")
	@ResponseBody
	public Object addusers(SysUser sysUser) {
			service.adduser(sysUser);
			return "0";
	}

//	@RequestMapping("/getloginid")
//	@ResponseBody
//	public Object getloginid(SysUser sysUser) {
//		List<SysUser> getloginids = service.getloginid(sysUser);
//		if (getloginids.size()>0) {
//			return "1";
//		}else {
//
//			return "0";
//		}
//	}
	
}

	
	

