package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.base.pojo.ProductExample;
import com.sanyang.logistics.base.pojo.ProductExample.Criteria;
import com.sanyang.logistics.jaj.service.ProductService;
/**
 * 货物控制层
 * @author asus
 *
 */
@Controller
@RequestMapping("/product")
public class ProductHandler {
	
	@Autowired
	private ProductService productService;
	
	@RequestMapping("/getProduct")
	@ResponseBody
	public Object getProduct(String pname,String code,String provider){
//		System.out.println(pname+"-"+code+"-"+provider);
		ProductExample example=new ProductExample();
		Criteria criteria = example.createCriteria();
		criteria.andPnameLike("%"+pname+"%");
		criteria.andCodeLike("%"+code+"%");
		criteria.andProviderLike("%"+provider+"%");
		List<Product> products=productService.getProduct(example);
//		System.out.println(products);
		return products;
	}
	
	@RequestMapping("/insertProduct")
	@ResponseBody
	public String insertProduct(Product Product){
		productService.insertProduct(Product);
		return "1";
	}
	
	@RequestMapping("/deleteProduct")
	@ResponseBody
	public int deleteProduct(Integer pid){
		productService.deleteProduct(pid);
		return 1;
	}
	
	@RequestMapping("/getProductById")
	@ResponseBody
	public Object getProductById(Integer pid){
		Product product=productService.getProductById(pid);
		return product;
	}
	
	@RequestMapping("/updateProduct")
	@ResponseBody
	public int updateProduct(Product product){
		productService.updateProduct(product);
		return 1;
	}
}
