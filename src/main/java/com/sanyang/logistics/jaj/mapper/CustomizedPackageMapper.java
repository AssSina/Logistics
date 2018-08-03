package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.CustomizedPackage;
import com.sanyang.logistics.base.pojo.CustomizedPackageExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomizedPackageMapper {
    int countByExample(CustomizedPackageExample example);

    int deleteByExample(CustomizedPackageExample example);

    int deleteByPrimaryKey(Integer pid);

    int insert(CustomizedPackage record);

    int insertSelective(CustomizedPackage record);

    List<CustomizedPackage> selectByExample(CustomizedPackageExample example);

    CustomizedPackage selectByPrimaryKey(Integer pid);

    int updateByExampleSelective(@Param("record") CustomizedPackage record, @Param("example") CustomizedPackageExample example);

    int updateByExample(@Param("record") CustomizedPackage record, @Param("example") CustomizedPackageExample example);

    int updateByPrimaryKeySelective(CustomizedPackage record);

    int updateByPrimaryKey(CustomizedPackage record);
}