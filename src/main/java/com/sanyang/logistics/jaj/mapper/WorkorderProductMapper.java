package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.WorkorderProduct;
import com.sanyang.logistics.base.pojo.WorkorderProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WorkorderProductMapper {
    int countByExample(WorkorderProductExample example);

    int deleteByExample(WorkorderProductExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(WorkorderProduct record);

    int insertSelective(WorkorderProduct record);

    List<WorkorderProduct> selectByExample(WorkorderProductExample example);

    WorkorderProduct selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") WorkorderProduct record, @Param("example") WorkorderProductExample example);

    int updateByExample(@Param("record") WorkorderProduct record, @Param("example") WorkorderProductExample example);

    int updateByPrimaryKeySelective(WorkorderProduct record);

    int updateByPrimaryKey(WorkorderProduct record);
}