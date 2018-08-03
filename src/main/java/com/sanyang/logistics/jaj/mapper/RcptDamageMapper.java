package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.RcptDamage;
import com.sanyang.logistics.base.pojo.RcptDamageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RcptDamageMapper {
    int countByExample(RcptDamageExample example);

    int deleteByExample(RcptDamageExample example);

    int deleteByPrimaryKey(Integer damageid);

    int insert(RcptDamage record);

    int insertSelective(RcptDamage record);

    List<RcptDamage> selectByExample(RcptDamageExample example);

    RcptDamage selectByPrimaryKey(Integer damageid);

    int updateByExampleSelective(@Param("record") RcptDamage record, @Param("example") RcptDamageExample example);

    int updateByExample(@Param("record") RcptDamage record, @Param("example") RcptDamageExample example);

    int updateByPrimaryKeySelective(RcptDamage record);

    int updateByPrimaryKey(RcptDamage record);
}