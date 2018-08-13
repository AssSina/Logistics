package com.sanyang.logistics.ymm.dao;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.sanyang.logistics.base.pojo.Customer;
import com.sanyang.logistics.base.pojo.CustomerOrdertype;
import com.sanyang.logistics.base.pojo.SysOrderType;
import com.sanyang.logistics.base.pojo.SysorderProduct;
import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.ymm.mapper.CustMapper;

@Repository("dao")
public class CustDaoImp implements CustDao{

	@Autowired
	private CustMapper mapper;
	
	@Override
	public List<Sysorders> tolistcust(Sysorders sysorders) {
		return mapper.tolistcust(sysorders);
	}

	@Override
	public List<Sysorders> tolistsys() {
		return mapper.tolistsys();
	}

	@Override
	public List<Warehouse> tolistwar() {
		return mapper.tolistwar();
	}

	@Override
	public List<CustomerOrdertype> tolistdname() {
		return mapper.tolistdname();
	}

	@Override
	public List<Customer> tolistmer() {
		return mapper.tolistmer();
	}

	@Override
	public List<SysOrderType> tolistsyso() {
		return mapper.tolistsyso();
	}

	@Override
	public void addorder(CustomerOrdertype ordertype) {
		mapper.addorder(ordertype);
		
	}

	@Override
	public Sysorders selbyoid(Integer oid) {
		return mapper.selbyoid(oid);
	}

	@Override
	public void delsys(Integer oid) {
		mapper.delsys(oid);
		
	}

	@Override
	public void addcustomer(Customer customer) {
		mapper.addcustomer(customer);
		
	}

	@Override
	public Sysorders selbyoidsys(Integer oid) {
		return mapper.selbyoidsys(oid);
	}

	@Override
	public List<SysorderProduct> tolisthwqd(Integer oid) {
		return mapper.tolisthwqd(oid);
		
	}

	@Override
	public Sysorders selectbyoid(Integer oid) {
		return mapper.selectbyoid(oid);
	}
	
	


}
