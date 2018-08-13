package com.sanyang.logistics.lxy.service;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.SysUser;
import com.sanyang.logistics.lxy.dao.ISysUserDao;

@Service
public class SysUserServiceImpl implements IsysUserService{

		@Autowired
		private ISysUserDao sysdao;

		@Override
		public SysUser getUser(SysUser sysUser) {
			// TODO Auto-generated method stub
			SysUser users = sysdao.getUser(sysUser);
			return users;
		}


	
	
}
