package com.sanyang.logistics.jaj.service;

import java.util.List;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.base.pojo.Schedule;
import com.sanyang.logistics.base.pojo.ThirdParty;
/**
 * 调度业务层接口
 * @author asus
 *
 */
public interface ScheduleService {

	List<Schedule> getSchedule();

	void insertSchedule(Schedule schedule);

	void deleteSchedule(Integer scheduleId);

	Schedule getScheduleById(Integer scheduleId);

	void updateSchedule(Schedule schedule) throws Exception;

	List<ThirdParty> getThirdParty(ThirdParty thirdParty);

	ThirdParty getThirdPartyById(Integer thirdPartyId);

	List<Schedule> getWorkOrder(Product product);

	void updatedu(Integer schedId, String execDoneFlag);

	List<Schedule> getWorkOrderById(Integer schedId);

}
