package com.sanyang.logistics.lxy.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.ScheduleType;

public interface IScheduleTypeDao {
	public List<ScheduleType> geTypes();
	public void deleteone(Integer sched_type_id);
}
