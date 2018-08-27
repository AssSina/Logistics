package com.sanyang.logistics.lxy.service;


import java.util.List;

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

		@Override
		public List<SysUser> getour(SysUser sysUser) {
			// TODO Auto-generated method stub
			return sysdao.getour(sysUser);
		}

		@Override
		public void deleteuser(Integer user_id) {
			// TODO Auto-generated method stub
			sysdao.deleteuser(user_id);
		}

		@Override
		public List<SysUser> getjs() {
			// TODO Auto-generated method stub
			return sysdao.getjs();
		}

		@Override
		public SysUser getone(Integer user_id) {
			// TODO Auto-generated method stub
			return sysdao.getone(user_id);
		}

		@Override
		public void upuser(SysUser sysUser) {
			// TODO Auto-generated method stub
			sysdao.upuser(sysUser);
		}

		@Override
		public void adduser(SysUser sysUser) {
			// TODO Auto-generated method stub
			sysdao.adduser(sysUser);
		}

//		@Override
//		public List<SysUser> getloginid(SysUser sysUser) {
//			// TODO Auto-generated method stub
//			return sysdao.getloginid(sysUser);
//		}

		@Override
		public List<SysUser> getdq() {
			// TODO Auto-generated method stub
			return sysdao.getdq();
		}


	
	
}
