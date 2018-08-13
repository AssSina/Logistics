package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.base.pojo.ProductExample;
import com.sanyang.logistics.jaj.dao.ProductDao;
/**
 * 货物业务层实现类
 * @author asus
 *
 */
@Service("productService")
public class ProductServiceImp implements ProductService {
	
	@Autowired
	private ProductDao productDao;
	
	@Override
	public List<Product> getProduct(ProductExample example) {
		// TODO Auto-generated method stub
		return productDao.getProduct(example);
	}

	@Override
	public void insertProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.insertProduct(product);
	}

	@Override
	public void deleteProduct(Integer pid) {
		// TODO Auto-generated method stub
		productDao.deleteProduct(pid);
	}

	@Override
	public Product getProductById(Integer pid) {
		// TODO Auto-generated method stub
		return productDao.getProductById(pid);
	}

	@Override
	public void updateProduct(Product product) {
		// TODO Auto-generated method stub
		productDao.updateProduct(product);
	}

}
