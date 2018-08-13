package com.sanyang.logistics.jaj.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.base.pojo.ProductExample;
import com.sanyang.logistics.jaj.mapper.ProductMapper;
/**
 * 货物数据访问层实现类
 * @author asus
 *
 */
@Repository("productDao")
public class ProductDaoImp implements ProductDao {
	
	@Autowired
	private ProductMapper productMapper;
	
	@Override
	public List<Product> getProduct(ProductExample example) {
		// TODO Auto-generated method stub
		return productMapper.selectByExample(example);
	}

	@Override
	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		productMapper.insertSelective(product);
	}

	@Override
	public void deleteProduct(Integer pid) {
		// TODO Auto-generated method stub
		productMapper.deleteByPrimaryKey(pid);
	}

	@Override
	public Product getProductById(Integer pid) {
		// TODO Auto-generated method stub
		return productMapper.selectByPrimaryKey(pid);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productMapper.updateByPrimaryKeySelective(product);
	}

}
