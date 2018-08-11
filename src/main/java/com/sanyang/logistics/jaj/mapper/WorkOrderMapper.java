package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.WorkOrder;
import com.sanyang.logistics.base.pojo.WorkOrderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkOrderMapper {
    int countByExample(WorkOrderExample example);

    int deleteByExample(WorkOrderExample example);

    int deleteByPrimaryKey(Integer workid);

    int insert(WorkOrder record);

    int insertSelective(WorkOrder record);

    List<WorkOrder> selectByExample(WorkOrderExample example);

    WorkOrder selectByPrimaryKey(Integer workid);

    int updateByExampleSelective(@Param("record") WorkOrder record, @Param("example") WorkOrderExample example);

    int updateByExample(@Param("record") WorkOrder record, @Param("example") WorkOrderExample example);

    int updateByPrimaryKeySelective(WorkOrder record);

    int updateByPrimaryKey(WorkOrder record);
}