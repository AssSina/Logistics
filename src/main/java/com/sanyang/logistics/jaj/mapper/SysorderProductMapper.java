package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.SysorderProduct;
import com.sanyang.logistics.base.pojo.SysorderProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SysorderProductMapper {
    int countByExample(SysorderProductExample example);

    int deleteByExample(SysorderProductExample example);

    int deleteByPrimaryKey(Integer oid);

    int insert(SysorderProduct record);

    int insertSelective(SysorderProduct record);

    List<SysorderProduct> selectByExample(SysorderProductExample example);

    SysorderProduct selectByPrimaryKey(Integer oid);

    int updateByExampleSelective(@Param("record") SysorderProduct record, @Param("example") SysorderProductExample example);

    int updateByExample(@Param("record") SysorderProduct record, @Param("example") SysorderProductExample example);

    int updateByPrimaryKeySelective(SysorderProduct record);

    int updateByPrimaryKey(SysorderProduct record);
}