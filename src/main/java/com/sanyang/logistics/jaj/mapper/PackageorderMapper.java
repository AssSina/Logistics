package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.Packageorder;
import com.sanyang.logistics.base.pojo.PackageorderExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PackageorderMapper {
    int countByExample(PackageorderExample example);

    int deleteByExample(PackageorderExample example);

    int deleteByPrimaryKey(Integer orderId);

    int insert(Packageorder record);

    int insertSelective(Packageorder record);

    List<Packageorder> selectByExample(PackageorderExample example);

    Packageorder selectByPrimaryKey(Integer orderId);

    int updateByExampleSelective(@Param("record") Packageorder record, @Param("example") PackageorderExample example);

    int updateByExample(@Param("record") Packageorder record, @Param("example") PackageorderExample example);

    int updateByPrimaryKeySelective(Packageorder record);

    int updateByPrimaryKey(Packageorder record);
}