package com.sanyang.logistics.ymm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.ymm.mapper.DdshMapper;
@Repository("d")
public class DdshDaoImp implements DdshDao{

	@Autowired
	private DdshMapper mapper;
	
	@Override
	public List<Sysorders> tolistsys(Sysorders sysorders) {
		return mapper.tolistsys(sysorders);
	}

	@Override
	public Sysorders selpz(Integer oid) {
		return mapper.selpz(oid);
	}

	@Override
	public void updsh(Integer oid) {
		mapper.updsh(oid);
		
	}

	@Override
	public void getno(Integer oid) {
		mapper.getno(oid);
		
	}

}
