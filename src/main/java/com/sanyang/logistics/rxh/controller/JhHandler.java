package com.sanyang.logistics.rxh.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Pickout;
import com.sanyang.logistics.base.pojo.PickoutProdBridge;
import com.sanyang.logistics.base.pojo.PrepareOutWarehouse;
import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.rxh.service.JhService;

@Controller
@RequestMapping("jh")
public class JhHandler {
	@Autowired 
	public JhService service;


	@RequestMapping("getAll")
	@ResponseBody
	public Object getAll(Integer whId) {
		//		System.out.println(whId);
		List<Pickout> all = service.getAll(whId);
//		for (Pickout pickout : all) {
//			System.out.println(pickout);
//		}
		return all;
	}

	@RequestMapping("getAllW")
	@ResponseBody
	public Object getAllW() {

		List<Warehouse> allw=service.getAllW();
		//		for (Warehouse warehouse : allw) {
		//			System.out.println(warehouse);
		//		}
		return allw;

	}

	//	待出库货物清单板块    拣货明细表
	@RequestMapping("getAllPickout")
	@ResponseBody
	public Object getAllPickout(Integer pickoutId) {
		//		System.out.println(pickoutId);
		List<PickoutProdBridge> allp=service.getAllPickout(pickoutId);
				System.out.println(allp);
		return allp;

	}

	//	拣货单指令清单  预出库表

	@RequestMapping("getPrepareOut")
	@ResponseBody
	public Object getPrepareOut(Integer pickoutId) {	
		//		System.out.println(pickoutId);
		List<PrepareOutWarehouse> prepareOut = service.getPrepareOut(pickoutId);
				System.out.println(prepareOut);
		return prepareOut;
	}

	@RequestMapping("delPrepareOut")
	@ResponseBody
	public Object delPrepareOut(Integer preoutId,PickoutProdBridge pickoutProdBridge) {
		//		System.out.println(preoutId);
		service.delPrepareOut(preoutId);
		service.inserw(pickoutProdBridge);
		//		System.out.println(pickoutProdBridge);
		//		System.out.println(pickoutProdBridge.getPreoutAmt());
		return 1;
	}

	@RequestMapping("getYck")
	@ResponseBody
	public Object getYck() {	
		List<PrepareOutWarehouse> prepareOut = service.getYck();
		//		System.out.println(prepareOut);
		return prepareOut;
	}

	//	
	@RequestMapping("getPick")
	@ResponseBody
	public Object getPick(Integer pickout_id) {	
		//		System.out.println(pickout_id);
		Pickout pickout = service.getPick(pickout_id);
		return pickout;
	}

	@RequestMapping("upd")
	@ResponseBody
	public Object upd(PickoutProdBridge pickoutProdBridge,PrepareOutWarehouse prepareOutWarehouse) {	

		//		Integer count = pickoutProdBridge.getPreoutAmt()-pickoutProdBridge.getNums();
		//		
		//		System.out.println(count);

		//			service.delet(count);
		//		   service.inser(prepareOutWarehouse);
		//		   service.upd(pickoutProdBridge);	
		//	       if (count==0) {
		//	    	  System.out.println(1);
		service.upd(pickoutProdBridge);
		//			  service.delet(pickoutProdBridge.getPreoutAmt());
		service.inser(prepareOutWarehouse);
		//		 }else if (count!=0) {
		//			 System.out.println(2);
		//			
		//			service.inser(prepareOutWarehouse);  	
		//		 }


		//		
		//		System.out.println(11111);
		//	
		//		System.out.println(22222);
		//		System.out.println(prepareOutWarehouse.getNums());
		//		System.out.println(prepareOutWarehouse);
		return "11";

	}

	@RequestMapping("updpick")
	@ResponseBody
	public Object updpick(Pickout pickout) {
		//		System.out.println(pickout.getPickoutId());
		service.updpick(pickout);
		return "1";

	}

	@RequestMapping("updatepickout")
	@ResponseBody
	public Object updatepickout(PrepareOutWarehouse prepareOutWarehouse) {
		service.updatepickout(prepareOutWarehouse);
		return "1";

	}


}
