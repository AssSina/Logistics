package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.CustomizedPackageProduct;
import com.sanyang.logistics.base.pojo.CustomizedPackageProductExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomizedPackageProductMapper {
    int countByExample(CustomizedPackageProductExample example);

    int deleteByExample(CustomizedPackageProductExample example);

    int insert(CustomizedPackageProduct record);

    int insertSelective(CustomizedPackageProduct record);

    List<CustomizedPackageProduct> selectByExample(CustomizedPackageProductExample example);

    int updateByExampleSelective(@Param("record") CustomizedPackageProduct record, @Param("example") CustomizedPackageProductExample example);

    int updateByExample(@Param("record") CustomizedPackageProduct record, @Param("example") CustomizedPackageProductExample example);
}