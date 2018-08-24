package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.WorkOrder;
import com.sanyang.logistics.jaj.mapper.WorkOrderMapper;

@Repository("pddao")
public class WorkOrderDaoImp implements WorkOrderDao{
	@Autowired
	private WorkOrderMapper mapper;
	@Override
	public List<WorkOrder> selectPro(Integer work_orderid) {
		
		return mapper.selectPro(work_orderid);
	}

	
	
	
	

}
