package com.sanyang.logistics.jaj.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Product;
import com.sanyang.logistics.base.pojo.Schedule;
import com.sanyang.logistics.base.pojo.ThirdParty;
import com.sanyang.logistics.jaj.mapper.ScheduleMapper;
import com.sanyang.logistics.jaj.mapper.SplitedOrderProdBridgeMapper;
import com.sanyang.logistics.jaj.mapper.ThirdPartyMapper;
/**
 * 调度数据处理层实现类
 * @author asus
 *
 */
@Repository("scheduleDao")
public class ScheduleDaoImp implements ScheduleDao {
	
	@Autowired
	private ScheduleMapper scheduleMapper;
	
	@Autowired
	private ThirdPartyMapper thirdPartyMapper;
	
	@Autowired
	private SplitedOrderProdBridgeMapper sopb;
	
	@Override
	public List<Schedule> getSchedule() {
		// TODO Auto-generated method stub
		return scheduleMapper.getSchedules();
	}

	@Override
	public void insertSchedule(Schedule schedule) {
		// TODO Auto-generated method stub
			scheduleMapper.insertSelective(schedule);
	}

	@Override
	public void deleteSchedule(Integer scheduleId) {
		// TODO Auto-generated method stub
			scheduleMapper.deleteByPrimaryKey(scheduleId);
			sopb.deleteByPrimaryKey(scheduleId);
	}

	@Override
	public Schedule getScheduleById(Integer scheduleId) {
		// TODO Auto-generated method stub
		return scheduleMapper.selectByPrimaryKey(scheduleId);
	}

	@Override
	public void updateSchedule(Schedule sc) throws Exception {
		// TODO Auto-generated method stub
//			scheduleMapper.updateByPrimaryKeySelective(schedule);
		Statement stm=null;
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/logistics?useUnicode=true&amp;characterEncoding=UTF-8","root","root");
		try {
			stm=conn.createStatement();
			conn.setAutoCommit(false);//手动控制事务
//			修改调度数据
			String sql="update schedule set update_date =now(),exec_done_flag='"+sc.getExecDoneFlag()+"',sched_type_id="+sc.getSchedTypeId()+",truck_id="+sc.getTruckId()+",driver_id="+sc.getDriverId()+",third_party_id="+sc.getThirdPartyId()+",hacount="+sc.getHacount()+",pcount="+sc.getPcount()+",fromaddress='"+sc.getFromaddress()+"',toaddress='"+sc.getToaddress()+"',cuname='"+sc.getCuname()+"',cuphone="+sc.getCuphone()+" where sched_id="+sc.getSchedId()+"";
//			System.out.println(sql);
			stm.executeUpdate(sql);
//			按调度id删除调度明细的数据
			sql="DELETE FROM splited_order_prod_bridge WHERE sched_id="+sc.getSchedId()+"";
//			System.out.println(sql);
			stm.executeUpdate(sql);
//			修改工作货物表的数量
			for (int j = 0; j < sc.getNums().length; j++) {
				sql="update workorder_product set scount=scount-"+sc.getNums()[j]+" where oid="+sc.getOdid()[j]+"";
//				System.out.println(sql);
				stm.addBatch(sql);
			}
			stm.executeBatch();
//			把数据加入调度明细
			for (int i = 0; i < sc.getNums().length; i++) {
				sql="insert into splited_order_prod_bridge select null,o.workid,"+sc.getSchedId()+",s.oid,p.pid,p.pmodel,p.code,c.rules,w.pcount,"+sc.getNums()[i]+",w.scount,"+sc.getNums()[i]+",o.heightflag,o.heigtharear,o.to_address,null,'正在调度',p.pname from workorder_product w,product p,work_order o,sysorders s,customized_package c where w.prod_id=p.pid and w.workid=o.workid and o.orderid=s.oid and p.package_id=c.pid and w.oid="+sc.getOdid()[i]+"";
//				System.out.println(sql);
				stm.addBatch(sql);
			}
			stm.executeBatch();
			conn.commit();
			conn.setAutoCommit(true);
		} catch (Exception e) {
			//出现异常了回滚事务
			conn.rollback();
			conn.setAutoCommit(true);
			e.printStackTrace();
		}finally{
			conn.close();
			stm.close();
		}
	}

	@Override
	public List<ThirdParty> getThirdParty(ThirdParty thirdParty) {
		// TODO Auto-generated method stub
		return thirdPartyMapper.getThirdParty(thirdParty);
	}

	@Override
	public ThirdParty getThirdPartyById(Integer thirdPartyId) {
		// TODO Auto-generated method stub
		return thirdPartyMapper.selectByPrimaryKey(thirdPartyId);
	}

	@Override
	public List<Schedule> getWorkOrder(Product product) {
		// TODO Auto-generated method stub
		return scheduleMapper.getWorkOrder(product);
	}

	@Override
	public void updatedu(Integer schedId, String execDoneFlag) throws Exception {
		// TODO Auto-generated method stub
		Class.forName("com.mysql.jdbc.Driver");
		Connection conn=DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/logistics?useUnicode=true&amp;characterEncoding=UTF-8","root","root");
		ResultSet rs = null;
		PreparedStatement ps=null;
		Statement stm = null;
		try {
			conn.setAutoCommit(false);//手动控制事务
			stm=conn.createStatement();
			//创建语句
			String sql ="update schedule set schstatus='调度完成' where sched_id="+schedId+"";
			System.out.println(sql);
			stm.executeUpdate(sql);
			if (execDoneFlag.equals("出库调度")) {
				sql="insert into pickout select null,"+schedId+",s.from_warehouse,s.plan_out_date,1,now(),null,'N' from sysorders s,splited_order_prod_bridge o where s.oid=o.orderid and sched_id="+schedId+"";
				System.out.println(sql);
				//通过传入第二个参数,就会产生主键返回给我们
				ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ps.executeUpdate();
				//返回的结果集中包含主键,注意：主键还可以是UUID,
				//复合主键等,所以这里不是直接返回一个整型
				rs = ps.getGeneratedKeys();
				int id = 0;
				if(rs.next()) {
					id = rs.getInt(1);
				}
				System.out.println(id);
				sql="insert into pickout_prod_bridge select null,"+id+",work_order_id,prod_id,pname,ptype,pcode,packageid,plan_amt,plan_amt,split_amt from splited_order_prod_bridge where sched_id="+schedId+"";
				System.out.println(sql);
				stm.executeUpdate(sql);
			}else if (execDoneFlag.equals("入库调度")) {
				sql="insert into receipt select null,"+schedId+",s.to_warehouse,s.plan_in_date,1,now(),null from sysorders s,splited_order_prod_bridge o where s.oid=o.orderid and sched_id="+schedId+"";
				System.out.println(sql);
				//通过传入第二个参数,就会产生主键返回给我们
				ps = conn.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
				ps.executeUpdate();
				//返回的结果集中包含主键,注意：主键还可以是UUID,
				//复合主键等,所以这里不是直接返回一个整型
				rs = ps.getGeneratedKeys();
				int id = 0;
				if(rs.next()) {
					id = rs.getInt(1);
				}
				System.out.println(id);
				sql="insert into rcpt_prod_bridge select null,"+id+",work_order_id,prod_id,pname,ptype,pcode,packageid,plan_amt,0,0,0,0,plan_amt,split_amt from splited_order_prod_bridge where sched_id="+schedId+"";
				System.out.println(sql);
				stm.executeUpdate(sql);
			}
			conn.commit();
			conn.setAutoCommit(true);
		} catch (Exception e) {
			//出现异常了回滚事务
			conn.rollback();
			conn.setAutoCommit(true);
			e.printStackTrace();
		}finally{
			conn.close();
			stm.close();
		}
	}

	@Override
	public List<Schedule> getWorkOrderById(Integer schedId) {
		// TODO Auto-generated method stub
		return scheduleMapper.getWorkOrderById(schedId);
	}

}
