package com.sanyang.logistics.jaj.mapper;

import com.sanyang.logistics.base.pojo.Receipt;
import com.sanyang.logistics.base.pojo.ReceiptExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface ReceiptMapper {
    int countByExample(ReceiptExample example);

    int deleteByExample(ReceiptExample example);

    int deleteByPrimaryKey(Integer rcptId);

    int insert(Receipt record);

    int insertSelective(Receipt record);

    List<Receipt> selectByExample(ReceiptExample example);

    Receipt selectByPrimaryKey(Integer rcptId);

    int updateByExampleSelective(@Param("record") Receipt record, @Param("example") ReceiptExample example);

    int updateByExample(@Param("record") Receipt record, @Param("example") ReceiptExample example);

    int updateByPrimaryKeySelective(Receipt record);

    int updateByPrimaryKey(Receipt record);
}