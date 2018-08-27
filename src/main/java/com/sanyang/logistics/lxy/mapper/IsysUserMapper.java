package com.sanyang.logistics.lxy.mapper;

import java.util.List;

import com.sanyang.logistics.base.pojo.SysUser;

public interface IsysUserMapper {


	public SysUser getUser(SysUser sysUser);
	public List<SysUser> getour(SysUser sysUser);
	public void deleteuser(Integer user_id);
	public List<SysUser> getjs();
	public List<SysUser> getdq();
	public SysUser getone(Integer user_id);
	public void upuser(SysUser sysUser);
	public void adduser(SysUser sysUser);
//	public List<SysUser> getloginid(SysUser sysUser);
	}

