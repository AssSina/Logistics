package com.sanyang.logistics.lxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.lxy.service.IProductService;

@Controller
@RequestMapping("/product")
public class ProductController {
	@Autowired
	private IProductService productService;
	
	@RequestMapping("/getpro")
	@ResponseBody
	public List<Product> getproduct() {
		List<Product> pro = productService.getPro();
		return pro;
		
	}
	

}
