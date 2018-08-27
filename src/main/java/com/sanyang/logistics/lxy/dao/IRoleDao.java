package com.sanyang.logistics.lxy.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.Role;

public interface IRoleDao {

	public List<Role> getrole();
	public void deleterole(Integer role_id);
	public void uprole(Role role);
	public void addrole(Role role);
	
}
