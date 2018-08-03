package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.CustomerOrdertype;
import com.sanyang.logistics.base.pojo.CustomerOrdertypeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CustomerOrdertypeMapper {
    int countByExample(CustomerOrdertypeExample example);

    int deleteByExample(CustomerOrdertypeExample example);

    int deleteByPrimaryKey(Integer custOrdertypeId);

    int insert(CustomerOrdertype record);

    int insertSelective(CustomerOrdertype record);

    List<CustomerOrdertype> selectByExample(CustomerOrdertypeExample example);

    CustomerOrdertype selectByPrimaryKey(Integer custOrdertypeId);

    int updateByExampleSelective(@Param("record") CustomerOrdertype record, @Param("example") CustomerOrdertypeExample example);

    int updateByExample(@Param("record") CustomerOrdertype record, @Param("example") CustomerOrdertypeExample example);

    int updateByPrimaryKeySelective(CustomerOrdertype record);

    int updateByPrimaryKey(CustomerOrdertype record);
}