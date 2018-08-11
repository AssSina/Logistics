package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.Directtion;
import com.sanyang.logistics.base.pojo.DirecttionExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface DirecttionMapper {
    int countByExample(DirecttionExample example);

    int deleteByExample(DirecttionExample example);

    int deleteByPrimaryKey(Integer directionId);

    int insert(Directtion record);

    int insertSelective(Directtion record);

    List<Directtion> selectByExample(DirecttionExample example);

    Directtion selectByPrimaryKey(Integer directionId);

    int updateByExampleSelective(@Param("record") Directtion record, @Param("example") DirecttionExample example);

    int updateByExample(@Param("record") Directtion record, @Param("example") DirecttionExample example);

    int updateByPrimaryKeySelective(Directtion record);

    int updateByPrimaryKey(Directtion record);
}