package com.sanyang.logistics.lxy.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.Role;

public interface IRoleService {
	public List<Role> getrole();
	public void deleterole(Integer role_id);
	public void uprole(Role role);
	public void addrole(Role role);
}
