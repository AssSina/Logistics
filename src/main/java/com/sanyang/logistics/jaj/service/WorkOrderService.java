package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.WorkOrder;

public interface WorkOrderService {
	
	/**
	 * 查询货物信息
	 */
	public List<WorkOrder> selectPro(Integer work_orderid);

}
