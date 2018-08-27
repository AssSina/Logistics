package com.sanyang.logistics.lxy.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.lxy.dao.IProductDao;

@Service
public class ProductServiceImpl implements IProductService{
			@Autowired
			private IProductDao prodao;

			@Override
			public List<Product> getPro() {
				// TODO Auto-generated method stub
				List<Product> pro = prodao.getPro();
				return pro;
			}
			
			
			
			
			
}
