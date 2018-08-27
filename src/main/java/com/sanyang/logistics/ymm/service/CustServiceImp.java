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
import com.sanyang.logistics.base.pojo.WorkOrder;
import com.sanyang.logistics.base.pojo.WorkorderProduct;
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

	@Override
	public List<SysorderProduct> selhwqd(SysorderProduct sysorderProduct) {
		return dao.selhwqd(sysorderProduct);
	}

	@Override
	public List<SysorderProduct> selbyoidhwqd(String th[]) {
		return dao.selbyoidhwqd(th);
	}

	@Override
	public void delpro(Integer ooo) {
		dao.delpro(ooo);
		
	}

	@Override
	public void updatesys(Sysorders sysorders) {
		dao.updatesys(sysorders);
		
	}

	@Override
	public void addsys(Sysorders sysorders) {
		dao.addsys(sysorders);
		
	}

	@Override
	public void addsysruku(Sysorders sysorders) {
		dao.addsysruku(sysorders);
		
	}

	@Override
	public void updrk(Sysorders sysorders) {
		dao.updrk(sysorders);
		
	}


	@Override
	public void addwork(WorkOrder workOrder) {
		dao.addwork(workOrder);
		
	}

	@Override
	public void addwopro(WorkorderProduct workorderProduct) {
		dao.addwopro(workorderProduct);
		
	}

	@Override
	public void updsyscount(SysorderProduct sysorderProduct) {
		dao.updsyscount(sysorderProduct);
		
	}

	@Override
	public void updsysstatus(Integer oid) {
		dao.updsysstatus(oid);
		
	}

	@Override
	public WorkOrder tolistwork(Integer workid) {
		return dao.tolistwork(workid);
	}

	@Override
	public List<SysorderProduct> selhwqdck(SysorderProduct sysorderProduct) {
		// TODO Auto-generated method stub
		return dao.selhwqdck(sysorderProduct);
	}

	@Override
	public void addsyspro(SysorderProduct sysorderProduct) {
		dao.addsyspro(sysorderProduct);
		
	}

	@Override
	public void updhwqdsl(SysorderProduct sysorderProduct) {
		dao.updhwqdsl(sysorderProduct);
		
	}

	@Override
	public void updhwqdslrk(SysorderProduct sysorderProduct) {
		dao.updhwqdslrk(sysorderProduct);
	}

	@Override
	public Sysorders getbypid(Integer oids) {
		return dao.getbypid(oids);
	}

	@Override
	public List<SysorderProduct> tolisthwqdbyoid(Integer oid) {
		return dao.tolisthwqdbyoid(oid);
	}



	

}
