package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.OrderStatus;
import com.sanyang.logistics.base.pojo.Sysorderses;

public interface SysordersDao {

	/**
	 * 查询全部订单
	 */
	public List<Sysorderses> getAllOrder(Sysorderses sysorders);
	
	/**
	 * 获得订单状态
	 */
	public List<OrderStatus> getOrderStatus();
	
	/**
	 * 更改状态
	 * @param sysorders
	 */
	public void updateOrderStatus(Sysorderses sysorders);
	
	
	
}
