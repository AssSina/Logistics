package com.sanyang.logistics.lxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Role;
import com.sanyang.logistics.lxy.service.IRoleService;

@Controller
@RequestMapping("/role")

public class RoleController {
	@Autowired 
	private IRoleService iRoleService;
	
	@RequestMapping("/getrole")
	@ResponseBody
	public Object getroles() {
		
		List<Role> getrole = iRoleService.getrole();
		return getrole;
	}
	
	
	@RequestMapping("/deleteroleone")
	@ResponseBody
	public Object deleterole(Integer id) {
		iRoleService.deleterole(id);
		return "0";
	}
	
	@RequestMapping("/uprole")
	@ResponseBody
	public Object uproles(Role role) {
		iRoleService.uprole(role);
		return "0";
	}
	@RequestMapping("/addrole")
	@ResponseBody
	public Object addroles(Role role) {
		iRoleService.addrole(role);
		return "0";
	}

}
