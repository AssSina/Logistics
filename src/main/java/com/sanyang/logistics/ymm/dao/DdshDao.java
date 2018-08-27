package com.sanyang.logistics.ymm.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.Sysorders;

public interface DdshDao {
	public List<Sysorders> tolistsys(Sysorders sysorders);
	public Sysorders selpz(Integer oid);
	public void updsh(Integer oid);
	public void getno(Integer oid);
}
