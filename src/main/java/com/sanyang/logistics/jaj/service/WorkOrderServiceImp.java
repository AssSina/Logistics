package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.WorkOrder;
import com.sanyang.logistics.jaj.dao.WorkOrderDao;

@Repository("pdservice")
public class WorkOrderServiceImp implements WorkOrderService{
	@Autowired
	private WorkOrderDao pddao;

	@Override
	public List<WorkOrder> selectPro(Integer work_orderid) {
		
		return pddao.selectPro(work_orderid);
	}
	
	

}
