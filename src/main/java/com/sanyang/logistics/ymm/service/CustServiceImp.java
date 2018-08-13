package com.sanyang.logistics.ymm.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sanyang.logistics.base.pojo.Customer;
import com.sanyang.logistics.base.pojo.CustomerOrdertype;
import com.sanyang.logistics.base.pojo.SysOrderType;
import com.sanyang.logistics.base.pojo.SysorderProduct;
import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.ymm.dao.CustDao;

@Service
public class CustServiceImp implements CustService{

	@Autowired 
	private CustDao dao;
	
	@Override
	public List<Sysorders> tolistcust(Sysorders sysorders) {
		// TODO Auto-generated method stub
		return dao.tolistcust(sysorders);
	}

	@Override
	public List<Sysorders> tolistsys() {
		return dao.tolistsys();
	}

	@Override
	public List<Warehouse> tolistwar() {
		return dao.tolistwar();
	}

	@Override
	public List<CustomerOrdertype> tolistdname() {
		return dao.tolistdname();
	}

	@Override
	public List<Customer> tolistmer() {
		return dao.tolistmer();
	}

	@Override
	public List<SysOrderType> tolistsyso() {
		return dao.tolistsyso();
	}

	@Override
	public void addorder(CustomerOrdertype ordertype) {
		dao.addorder(ordertype);
		
	}

	@Override
	public Sysorders selbyoid(Integer oid) {
		return dao.selbyoid(oid);
	}

	@Override
	public void delsys(Integer oid) {
		dao.delsys(oid);
		
	}

	@Override
	public void addcustomer(Customer customer) {
		dao.addcustomer(customer);
		
	}

	@Override
	public Sysorders selbyoidsys(Integer oid) {
		return dao.selbyoidsys(oid);
	}

	@Override
	public List<SysorderProduct> tolisthwqd(Integer oid) {
		return dao.tolisthwqd(oid);
	}

	@Override
	public Sysorders selectbyoid(Integer oid) {
		return dao.selectbyoid(oid);
	}



	

}
