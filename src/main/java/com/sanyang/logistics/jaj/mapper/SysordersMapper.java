package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.base.pojo.SysordersExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysordersMapper {
    int countByExample(SysordersExample example);

    int deleteByExample(SysordersExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(Sysorders record);

    int insertSelective(Sysorders record);

    List<Sysorders> selectByExample(SysordersExample example);

    Sysorders selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") Sysorders record, @Param("example") SysordersExample example);

    int updateByExample(@Param("record") Sysorders record, @Param("example") SysordersExample example);

    int updateByPrimaryKeySelective(Sysorders record);

    int updateByPrimaryKey(Sysorders record);
}