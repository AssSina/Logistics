package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.ScheduleType;
import com.sanyang.logistics.base.pojo.ScheduleTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ScheduleTypeMapper {
    int countByExample(ScheduleTypeExample example);

    int deleteByExample(ScheduleTypeExample example);

    int deleteByPrimaryKey(Integer schedTypeId);

    int insert(ScheduleType record);

    int insertSelective(ScheduleType record);

    List<ScheduleType> selectByExample(ScheduleTypeExample example);

    ScheduleType selectByPrimaryKey(Integer schedTypeId);

    int updateByExampleSelective(@Param("record") ScheduleType record, @Param("example") ScheduleTypeExample example);

    int updateByExample(@Param("record") ScheduleType record, @Param("example") ScheduleTypeExample example);

    int updateByPrimaryKeySelective(ScheduleType record);

    int updateByPrimaryKey(ScheduleType record);
}