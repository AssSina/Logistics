package com.sanyang.logistics.jaj.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.WorkOrder;

public interface WorkOrderDao {
	
	/**
	 * 查询货物信息
	 */
	public List<WorkOrder> selectPro(Integer work_orderid);

}
