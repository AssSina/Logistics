package com.sanyang.logistics.lxy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Role;
import com.sanyang.logistics.lxy.mapper.IRoleMapper;

@Repository("role")
public class RoleImplDao implements IRoleDao{
	@Autowired
	private IRoleMapper roleMapper;

	@Override
	public List<Role> getrole() {
		// TODO Auto-generated method stub
		return roleMapper.getrole();
	}

	@Override
	public void deleterole(Integer role_id) {
		// TODO Auto-generated method stub
		roleMapper.deleterole(role_id);
	}

	@Override
	public void uprole(Role role) {
		// TODO Auto-generated method stub
		roleMapper.uprole(role);
	}

	@Override
	public void addrole(Role role) {
		// TODO Auto-generated method stub
		roleMapper.addrole(role);
	}


}
