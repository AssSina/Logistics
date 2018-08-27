package com.sanyang.logistics.lxy.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.lxy.mapper.IProductMapper;

@Repository("ProDao")
public class ProductImplDao implements IProductDao{
			@Autowired
			private IProductMapper productmapper;
			
			
	@Override
	public List<Product> getPro() {
		// TODO Auto-generated method stub
		List<Product> pro = productmapper.getPro();
		return pro;
	}
	
	

}
