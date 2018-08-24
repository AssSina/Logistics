package com.sanyang.logistics.jaj.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Position;
import com.sanyang.logistics.base.pojo.ProdPosnBridge;
import com.sanyang.logistics.jaj.service.ProdPosnBridgeService;
/**
 * 库位货物控制层
 * @author asus
 *
 */
@Controller
@RequestMapping("/prodPosnBridge")
public class ProdPosnBridgeHandler {
	
	@Autowired
	private ProdPosnBridgeService prodPosnBridgeService;
	
	@RequestMapping("/getProdPosnBridge")
	@ResponseBody
	public Object getProdPosnBridge(Integer prodId){
		List<ProdPosnBridge> ProdPosnBridges=prodPosnBridgeService.getProdPosnBridge(prodId);
		return ProdPosnBridges;
	}
	
	@RequestMapping("/insertProdPosnBridge")
	@ResponseBody
	public String insertProdPosnBridge(ProdPosnBridge prodPosnBridge){
//		System.out.println(prodPosnBridge.getWhId()+" "+prodPosnBridge.getProdId()+" "+prodPosnBridge.getPosnId());
		prodPosnBridgeService.insertProdPosnBridge(prodPosnBridge);
		return "1";
	}
	
	@RequestMapping("/deleteProdPosnBridge")
	@ResponseBody
	public int deleteProdPosnBridge(Integer oid){
		prodPosnBridgeService.deleteProdPosnBridge(oid);
		return 1;
	}
	
	@RequestMapping("/getPositionByWhId")
	@ResponseBody
	public Object getPositionByWhId(ProdPosnBridge ppb){
		List<Position> positions=prodPosnBridgeService.getPositionByWhId(ppb);
		return positions;
	}
	
	
	@RequestMapping("/updateProdPosnBridge")
	@ResponseBody
	public int updateProdPosnBridge(ProdPosnBridge prodPosnBridge){
		prodPosnBridgeService.updateProdPosnBridge(prodPosnBridge);
		return 1;
	}
}
