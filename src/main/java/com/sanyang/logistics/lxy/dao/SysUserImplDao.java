package com.sanyang.logistics.lxy.dao;



import java.util.List;

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

	@Override
	public List<SysUser> getour(SysUser sysUser) {
		// TODO Auto-generated method stub
		List<SysUser> getour = SysUserMapper.getour(sysUser);
		return getour;
	}

	@Override
	public void deleteuser(Integer user_id) {
		// TODO Auto-generated method stub
		SysUserMapper.deleteuser(user_id);
	}
  
	@Override
	public List<SysUser> getjs() {
		// TODO Auto-generated method stub
		List<SysUser> getjs = SysUserMapper.getjs();
		return getjs;
	}

	@Override
	public SysUser getone(Integer user_id) {
		// TODO Auto-generated method stub
		SysUser getone = SysUserMapper.getone(user_id);
		return getone;
	}

	@Override
	public void upuser(SysUser sysUser) {
		// TODO Auto-generated method stub
		SysUserMapper.upuser(sysUser);
	}

	@Override
	public void adduser(SysUser sysUser) {
		// TODO Auto-generated method stub
		SysUserMapper.adduser(sysUser);
	}

//	@Override
//	public List<SysUser> getloginid(SysUser sysUser) {
//		// TODO Auto-generated method stub
//		return SysUserMapper.getloginid(sysUser);
//	}

	@Override
	public List<SysUser> getdq() {
		// TODO Auto-generated method stub
		return SysUserMapper.getdq();
	}



	
	
}


