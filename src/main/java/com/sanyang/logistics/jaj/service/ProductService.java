package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.base.pojo.ProductExample;

/**
 * 货物业务层接口
 * @author asus
 *
 */
public interface ProductService {

	List<Product> getProduct(ProductExample example);

	void insertProduct(Product product);

	void deleteProduct(Integer pid);

	Product getProductById(Integer pid);

	void updateProduct(Product product);

}
