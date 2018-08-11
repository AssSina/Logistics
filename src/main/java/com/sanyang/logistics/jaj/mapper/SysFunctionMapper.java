package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.SysFunction;
import com.sanyang.logistics.base.pojo.SysFunctionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysFunctionMapper {
    int countByExample(SysFunctionExample example);

    int deleteByExample(SysFunctionExample example);

    int deleteByPrimaryKey(Integer funcId);

    int insert(SysFunction record);

    int insertSelective(SysFunction record);

    List<SysFunction> selectByExample(SysFunctionExample example);

    SysFunction selectByPrimaryKey(Integer funcId);

    int updateByExampleSelective(@Param("record") SysFunction record, @Param("example") SysFunctionExample example);

    int updateByExample(@Param("record") SysFunction record, @Param("example") SysFunctionExample example);

    int updateByPrimaryKeySelective(SysFunction record);

    int updateByPrimaryKey(SysFunction record);
}