package com.sanyang.logistics.lxy.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Schedule;
import com.sanyang.logistics.lxy.service.IScheduleService;

@Controller
@RequestMapping("/schedule")
public class ScheduleController {
				@Autowired
				private IScheduleService scheduleservice;
	
				@RequestMapping("/getddgl")
				@ResponseBody
				public List<Schedule> getddgl() {
					List<Schedule> ddgl = scheduleservice.getddgl();
					return ddgl;
					
				}
				

}
