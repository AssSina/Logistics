package com.sanyang.logistics.lxy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Schedule;
import com.sanyang.logistics.base.pojo.ScheduleType;
import com.sanyang.logistics.lxy.mapper.IScheduleMapper;
import com.sanyang.logistics.lxy.mapper.IScheduleTypeMapper;

@Repository("scheduleTypedao")
public class ScheduleTypeImplDao implements IScheduleTypeDao{

	@Autowired
	private IScheduleTypeMapper scheduletype;
	
	@Override
	public List<ScheduleType> geTypes() {
		// TODO Auto-generated method stub
		List<ScheduleType> geTypes = scheduletype.geTypes();
		return geTypes;
	}

	@Override
	public void deleteone(Integer sched_type_id) {
		// TODO Auto-generated method stub
		scheduletype.deleteone(sched_type_id);
	}

}
