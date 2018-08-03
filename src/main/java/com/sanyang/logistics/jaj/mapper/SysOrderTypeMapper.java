package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.SysOrderType;
import com.sanyang.logistics.base.pojo.SysOrderTypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysOrderTypeMapper {
    int countByExample(SysOrderTypeExample example);

    int deleteByExample(SysOrderTypeExample example);

    int deleteByPrimaryKey(Integer orderTypeId);

    int insert(SysOrderType record);

    int insertSelective(SysOrderType record);

    List<SysOrderType> selectByExample(SysOrderTypeExample example);

    SysOrderType selectByPrimaryKey(Integer orderTypeId);

    int updateByExampleSelective(@Param("record") SysOrderType record, @Param("example") SysOrderTypeExample example);

    int updateByExample(@Param("record") SysOrderType record, @Param("example") SysOrderTypeExample example);

    int updateByPrimaryKeySelective(SysOrderType record);

    int updateByPrimaryKey(SysOrderType record);
}