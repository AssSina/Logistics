package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.OrderStatus;
import com.sanyang.logistics.base.pojo.Sysorderses;
import com.sanyang.logistics.jaj.dao.SysordersDao;
@Repository("gycSysService")
public class SysordersServiceImpl implements SysordersService {

	@Autowired
	private SysordersDao gycSysDao;
	
	
	@Override
	public List<Sysorderses> getAllOrder(Sysorderses sysorders) {
		// TODO Auto-generated method stub
		return gycSysDao.getAllOrder(sysorders);
	}


	@Override
	public List<OrderStatus> getOrderStatus() {
		// TODO Auto-generated method stub
		return gycSysDao.getOrderStatus();
	}


	@Override
	public void updateOrderStatus(Sysorderses sysorders) {
		// TODO Auto-generated method stub
		gycSysDao.updateOrderStatus(sysorders);
	}

}
