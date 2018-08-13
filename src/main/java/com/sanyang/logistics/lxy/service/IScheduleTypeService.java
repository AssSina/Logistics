package com.sanyang.logistics.lxy.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.ScheduleType;

public interface IScheduleTypeService {
	public List<ScheduleType> geTypes();
	public void deleteone(Integer sched_type_id);
}
