package com.sanyang.logistics.ymm.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.Sysorders;

public interface DdshService {
	public List<Sysorders> tolistsys(Sysorders sysorders);
	public Sysorders selpz(Integer oid);
	public void updsh(Integer oid);
	public void getno(Integer oid);

}
