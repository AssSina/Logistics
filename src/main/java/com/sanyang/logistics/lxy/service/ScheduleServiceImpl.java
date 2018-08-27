package com.sanyang.logistics.lxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Schedule;
import com.sanyang.logistics.lxy.dao.IScheduleDao;
@Service
public class ScheduleServiceImpl implements IScheduleService{
	@Autowired
	private IScheduleDao scheduleDao;
	
	
	@Override
	public List<Schedule> getddgl() {
		// TODO Auto-generated method stub
		List<Schedule> ddgl = scheduleDao.getddgl();
		return ddgl;
	}
		
		
		

}
