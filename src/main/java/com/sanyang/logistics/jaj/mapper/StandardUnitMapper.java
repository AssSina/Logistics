package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.StandardUnit;
import com.sanyang.logistics.base.pojo.StandardUnitExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface StandardUnitMapper {
    int countByExample(StandardUnitExample example);

    int deleteByExample(StandardUnitExample example);

    int deleteByPrimaryKey(Integer unitid);

    int insert(StandardUnit record);

    int insertSelective(StandardUnit record);

    List<StandardUnit> selectByExample(StandardUnitExample example);

    StandardUnit selectByPrimaryKey(Integer unitid);

    int updateByExampleSelective(@Param("record") StandardUnit record, @Param("example") StandardUnitExample example);

    int updateByExample(@Param("record") StandardUnit record, @Param("example") StandardUnitExample example);

    int updateByPrimaryKeySelective(StandardUnit record);

    int updateByPrimaryKey(StandardUnit record);
}