package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.OwnerTypeDim;
import com.sanyang.logistics.base.pojo.OwnerTypeDimExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OwnerTypeDimMapper {
    int countByExample(OwnerTypeDimExample example);

    int deleteByExample(OwnerTypeDimExample example);

    int deleteByPrimaryKey(Integer ownerTypeId);

    int insert(OwnerTypeDim record);

    int insertSelective(OwnerTypeDim record);

    List<OwnerTypeDim> selectByExample(OwnerTypeDimExample example);

    OwnerTypeDim selectByPrimaryKey(Integer ownerTypeId);

    int updateByExampleSelective(@Param("record") OwnerTypeDim record, @Param("example") OwnerTypeDimExample example);

    int updateByExample(@Param("record") OwnerTypeDim record, @Param("example") OwnerTypeDimExample example);

    int updateByPrimaryKeySelective(OwnerTypeDim record);

    int updateByPrimaryKey(OwnerTypeDim record);
}