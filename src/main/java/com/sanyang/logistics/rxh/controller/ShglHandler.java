package com.sanyang.logistics.rxh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.PrepareInWarehouse;
import com.sanyang.logistics.base.pojo.RcptDamage;
import com.sanyang.logistics.base.pojo.RcptProdBridge;
import com.sanyang.logistics.base.pojo.Receipt;
import com.sanyang.logistics.rxh.service.IShglService;

@Controller
@RequestMapping("shgl")
public class ShglHandler {
	@Autowired
	public IShglService service;

	@RequestMapping("getAllR")
	@ResponseBody
	public Object getAllR(Integer whId) {
		List<Receipt> allR = service.getAllR(whId);
		//		System.out.println(allR);
		return allR;
	}
	@RequestMapping("getRcpt")
	@ResponseBody
	public Object getRcpt(Integer rcptId) {
		List<RcptProdBridge> allRc = service.getRcpt(rcptId);
//				System.out.println(allRc);
		return allRc;
	}
	@RequestMapping("getR")
	@ResponseBody
	public Object getR(Integer rcptId) {
		List<RcptProdBridge> allRc = service.getR(rcptId);
//				System.out.println(allRc);
		return allRc;
	}
	//货损录入
	@RequestMapping("gethslr")
	@ResponseBody	
	public Object gethslr(Integer prodId) {
		System.out.println(prodId);
		RcptProdBridge gethslr = service.gethslr(prodId);
		System.out.println(gethslr);
		return gethslr;
	}
	//货损录入
	@RequestMapping("getHs")
	@ResponseBody	
	public Object getHs(RcptDamage rcptDamage,Integer rcptId) {
		List<RcptDamage> allRc=service.getHs(rcptId);
					System.out.println(allRc);
		return allRc;
	}

	//入库
	@RequestMapping("getRk")
	@ResponseBody	
	public Object getRk(PrepareInWarehouse prepareInWarehouse,Integer rcptId) {
		List<PrepareInWarehouse> allp=service.getRk(rcptId);
//		System.out.println(allp);
		return allp;
	}

	//		修改添加
	@RequestMapping("upda")
	@ResponseBody	
	public Object upda(PrepareInWarehouse prepareInWarehouse,RcptProdBridge rcptProdBridge) {
		service.updRcpt(rcptProdBridge);
		service.inserPrepareIn(prepareInWarehouse);		
		return "11";
	}
	//		删除添加
	@RequestMapping("del")
	@ResponseBody	
	public Object del(PrepareInWarehouse prepareInWarehouse,RcptProdBridge rcptProdBridge) {
//		System.out.println(prepareInWarehouse.getPreind());		
		service.del(prepareInWarehouse.getPreind());
//		System.out.println(123);
		service.insert(rcptProdBridge);	
//		System.out.println(rcptProdBridge.getPreinAmt());
		return "123";

	}
	@RequestMapping("upd")
	@ResponseBody	
	public Object upde(PrepareInWarehouse prepareInWarehouse) {
	    service.upde(prepareInWarehouse);
		return "123";

	}
	@RequestMapping("updsh")
	@ResponseBody	
	public Object updsh(RcptProdBridge rcptProdBridge) {
//		System.out.println(rcptProdBridge.getRcptProdId());
	    service.updsh(rcptProdBridge);
//		System.out.println(rcptProdBridge.getRcptProdId());
//		System.out.println(rcptProdBridge.getIncount());
//		System.out.println(rcptProdBridge.getLostcount());
//		System.out.println(rcptProdBridge.getDestorycount());
		return "22";

	}
	@RequestMapping("updateReceipt")
	@ResponseBody	
	public Object updateReceipt(Receipt receipt) {
      service.updateReceipt(receipt);		
	  return "1";

	}
	@RequestMapping("ins")
	@ResponseBody	
	public Object ins(RcptDamage pDamage) {
		System.out.println(pDamage);
      service.ins(pDamage);		
	  return "5";

	}
	
	@RequestMapping("deld")
	@ResponseBody	
	public Object deld(Integer damageid) {
	
      service.deld(damageid);		
	  return "6";

	}
	
	
}
