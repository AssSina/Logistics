package com.sanyang.logistics.lxy.mapper;

import java.util.List;

import com.sanyang.logistics.base.pojo.ScheduleType;

public interface IScheduleTypeMapper {
		public List<ScheduleType> geTypes();
		public void deleteone(Integer sched_type_id);
}
