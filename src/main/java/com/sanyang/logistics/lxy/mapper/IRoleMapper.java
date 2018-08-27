package com.sanyang.logistics.lxy.mapper;

import java.util.List;

import com.sanyang.logistics.base.pojo.Role;

public interface IRoleMapper {
	public List<Role> getrole();
	public void deleterole(Integer role_id);
	public void uprole(Role role);
	public void addrole(Role role);

}
