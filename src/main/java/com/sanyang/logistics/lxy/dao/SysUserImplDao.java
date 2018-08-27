package com.sanyang.logistics.lxy.dao;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.SysUser;
import com.sanyang.logistics.lxy.mapper.IsysUserMapper;


@Repository("sysdao")

public class SysUserImplDao implements ISysUserDao{

	@Autowired
	private IsysUserMapper SysUserMapper;

	@Override
	public SysUser getUser(SysUser sysUser) {
		// TODO Auto-generated method stub
		SysUser users = SysUserMapper.getUser(sysUser);
		return users;
	}




	
	
}


