package com.sanyang.logistics.ymm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.ymm.dao.DdshDao;
@Service
public class DdshServiceImp implements DdshService{

	@Autowired
	private DdshDao dao;
	
	@Override
	public List<Sysorders> tolistsys(Sysorders sysorders) {
		return dao.tolistsys(sysorders);
	}

}
