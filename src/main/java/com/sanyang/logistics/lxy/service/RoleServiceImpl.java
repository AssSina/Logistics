package com.sanyang.logistics.lxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.sanyang.logistics.base.pojo.Role;
import com.sanyang.logistics.lxy.dao.IRoleDao;

public class RoleServiceImpl implements IRoleService{

	@Autowired
	private IRoleDao iroledao;
	
	@Override
	public List<Role> getrole() {
		// TODO Auto-generated method stub
		return iroledao.getrole();
	}

	@Override
	public void deleterole(Integer role_id) {
		// TODO Auto-generated method stub
		iroledao.deleterole(role_id);
	}

	@Override
	public void uprole(Role role) {
		// TODO Auto-generated method stub
		iroledao.uprole(role);
	}

	@Override
	public void addrole(Role role) {
		// TODO Auto-generated method stub
		iroledao.addrole(role);
		
		
	}


}
