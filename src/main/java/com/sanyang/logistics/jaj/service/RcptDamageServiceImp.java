package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.RcptDamage;
import com.sanyang.logistics.jaj.dao.RcptDamageDao;
/**
 * 货损业务层实现类
 * @author asus
 *
 */
@Service("rcptDamageService")
public class RcptDamageServiceImp implements RcptDamageService {
	
	@Autowired
	private RcptDamageDao rcptDamageDao;
	
	@Override
	public List<RcptDamage> getRcptDamage(RcptDamage rcptDamage) {
		// TODO Auto-generated method stub
		return rcptDamageDao.getRcptDamage(rcptDamage);
	}

	@Override
	public void insertRcptDamage(RcptDamage RcptDamage) {
		// TODO Auto-generated method stub
		rcptDamageDao.insertRcptDamage(RcptDamage);
	}

	@Override
	public void deleteRcptDamage(Integer damageid) {
		// TODO Auto-generated method stub
		rcptDamageDao.deleteRcptDamage(damageid);
	}

	@Override
	public RcptDamage getRcptDamageById(Integer damageid) {
		// TODO Auto-generated method stub
		return rcptDamageDao.getRcptDamageById(damageid);
	}

	@Override
	public void updateRcptDamage(RcptDamage RcptDamage) {
		// TODO Auto-generated method stub
		rcptDamageDao.updateRcptDamage(RcptDamage);
	}

}
