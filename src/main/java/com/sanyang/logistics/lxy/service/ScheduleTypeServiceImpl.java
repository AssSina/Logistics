package com.sanyang.logistics.lxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.ScheduleType;
import com.sanyang.logistics.lxy.dao.IScheduleTypeDao;

@Service
public class ScheduleTypeServiceImpl implements IScheduleTypeService{
				
					@Autowired
					private IScheduleTypeDao typeDao;

					@Override
					public List<ScheduleType> geTypes() {
						// TODO Auto-generated method stub
						List<ScheduleType> geType = typeDao.geTypes();
						
						return geType;
					}

					@Override
					public void deleteone(Integer sched_type_id) {
						// TODO Auto-generated method stub
						typeDao.deleteone(sched_type_id);
					
					}
					
					
				

}
