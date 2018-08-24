package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.OrderStatus;
import com.sanyang.logistics.base.pojo.Sysorderses;
import com.sanyang.logistics.jaj.mapper.SysordersMapper;

@Repository("gycSysDao")
public class SysordersDaoImpl implements SysordersDao {
	
	
	@Autowired
	private SysordersMapper sysordersmapper;

	@Override
	public List<Sysorderses> getAllOrder(Sysorderses sysorders) {
		// TODO Auto-generated method stub
		return sysordersmapper.getAllOrder(sysorders);
	}

	@Override
	public List<OrderStatus> getOrderStatus() {
		// TODO Auto-generated method stub
		return sysordersmapper.getOrderStatus();
	}

	@Override
	public void updateOrderStatus(Sysorderses sysorders) {
		// TODO Auto-generated method stub
		sysordersmapper.updateOrderStatus(sysorders);
	}

}
