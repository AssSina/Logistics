package com.sanyang.logistics.jaj.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.base.pojo.Schedule;
import com.sanyang.logistics.base.pojo.ThirdParty;
import com.sanyang.logistics.jaj.service.ScheduleService;
/**
 * 仓库通道控制层
 * @author asus
 *
 */
@Controller
@RequestMapping("/schedule")
public class ScheduleHandler {
	
	@Autowired
	private ScheduleService scheduleService;
	
	@RequestMapping("/getSchedule")
	@ResponseBody
	public Object getSchedule(){
		
		List<Schedule> Schedules=scheduleService.getSchedule();
		return Schedules;
	}
	
	@RequestMapping("/insertSchedule")
	@ResponseBody
	public String insertSchedule(Schedule schedule){
		scheduleService.insertSchedule(schedule);
		return "1";
	}
	
	@RequestMapping("/deleteSchedule")
	@ResponseBody
	public int deleteSchedule(Integer scheduleId){
//		System.out.println(scheduleId);
		scheduleService.deleteSchedule(scheduleId);
		return 1;
	}
	
	@RequestMapping("/getScheduleById")
	@ResponseBody
	public Object getScheduleById(Integer scheduleId){
		Schedule Schedule=scheduleService.getScheduleById(scheduleId);
		return Schedule;
	}
	
//	修改调度信息
	@RequestMapping("/updateSchedule")
	@ResponseBody
	public int updateSchedule(Schedule schedule){
		try {
//			System.out.println(schedule);
			scheduleService.updateSchedule(schedule);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return 1;
	}
	
	//查询承运商信息
	@RequestMapping("/getThirdParty")
	@ResponseBody
	public Object getAllThirdParty(ThirdParty thirdParty){
		List<ThirdParty> thirdParties = scheduleService.getThirdParty(thirdParty);
		return thirdParties;
	}
	
	//按id查询承运商信息
	@RequestMapping("/getThirdPartyById")
	@ResponseBody
	public Object getThirdPartyById(Integer thirdPartyId){
		ThirdParty thirdPartie = scheduleService.getThirdPartyById(thirdPartyId);
		List<ThirdParty> list = new ArrayList<>();
		list.add(thirdPartie);
		return list;
	}
	
	//查询货物订单信息
		@RequestMapping("/getWorkOrder")
		@ResponseBody
		public Object getWorkOrder(Product product){
			List<Schedule> schedules = scheduleService.getWorkOrder(product);
			return schedules;
		}
		

		//根据id查询货物订单信息
		@RequestMapping("/getWorkOrderById")
		@ResponseBody
		public Object getWorkOrderById(Integer schedId){
			List<Schedule> schedules = scheduleService.getWorkOrderById(schedId);
			return schedules;
		}
		
//		提交调度
		@RequestMapping("/updatedu")
		@ResponseBody
		public int updatedu(Integer schedId,String execDoneFlag){
//			System.out.println(schedId+","+execDoneFlag);
			scheduleService.updatedu(schedId,execDoneFlag);
			return 1;
		}	
	
}
