package com.sanyang.logistics.lxy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Schedule;
import com.sanyang.logistics.lxy.mapper.IScheduleMapper;

@Repository("scheduledao")

public class ScheduleImplDao implements IScheduleDao{
		@Autowired
		private IScheduleMapper scheduleMapper;
		
	@Override
	public List<Schedule> getddgl() {
		// TODO Auto-generated method stub
		List<Schedule> getddgl = scheduleMapper.getddgl();
		return getddgl;
	}
	
	

}
