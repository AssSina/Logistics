package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.OrderStatus;
import com.sanyang.logistics.base.pojo.OrderStatusExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface OrderStatusMapper {
    int countByExample(OrderStatusExample example);

    int deleteByExample(OrderStatusExample example);

    int deleteByPrimaryKey(Integer sid);

    int insert(OrderStatus record);

    int insertSelective(OrderStatus record);

    List<OrderStatus> selectByExample(OrderStatusExample example);

    OrderStatus selectByPrimaryKey(Integer sid);

    int updateByExampleSelective(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    int updateByExample(@Param("record") OrderStatus record, @Param("example") OrderStatusExample example);

    int updateByPrimaryKeySelective(OrderStatus record);

    int updateByPrimaryKey(OrderStatus record);
}