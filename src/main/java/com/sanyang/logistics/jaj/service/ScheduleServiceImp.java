package com.sanyang.logistics.jaj.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.base.pojo.Schedule;
import com.sanyang.logistics.base.pojo.ThirdParty;
import com.sanyang.logistics.jaj.dao.ScheduleDao;

/**
 * 调度业务层实现类
 * @author asus
 *
 */
@Service("scheduleService")
public class ScheduleServiceImp implements ScheduleService {
	
	@Autowired
	private ScheduleDao scheduleDao;
	
	@Override
	public List<Schedule> getSchedule() {
		// TODO Auto-generated method stub
		return scheduleDao.getSchedule();
	}

	@Override
	public void insertSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
		scheduleDao.insertSchedule(schedule);
	}

	@Override
	public void deleteSchedule(Integer scheduleId) {
		// TODO Auto-generated method stub
		scheduleDao.deleteSchedule(scheduleId);
	}

	@Override
	public Schedule getScheduleById(Integer scheduleId) {
		// TODO Auto-generated method stub
		return scheduleDao.getScheduleById(scheduleId);
	}

	@Override
	public void updateSchedule(Schedule sc) throws Exception{
		scheduleDao.updateSchedule(sc);
	}

	@Override
	public List<ThirdParty> getThirdParty(ThirdParty thirdParty) {
		// TODO Auto-generated method stub
		return scheduleDao.getThirdParty(thirdParty);
	}

	@Override
	public ThirdParty getThirdPartyById(Integer thirdPartyId) {
		// TODO Auto-generated method stub
		return scheduleDao.getThirdPartyById(thirdPartyId);
	}

	@Override
	public List<Schedule> getWorkOrder(Product product) {
		// TODO Auto-generated method stub
		return scheduleDao.getWorkOrder(product);
	}

	@Override
	public void updatedu(Integer schedId, String execDoneFlag) {
		// TODO Auto-generated method stub
		try {
			scheduleDao.updatedu(schedId,execDoneFlag);
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	@Override
	public List<Schedule> getWorkOrderById(Integer schedId) {
		// TODO Auto-generated method stub
		return scheduleDao.getWorkOrderById(schedId);
	}

}
