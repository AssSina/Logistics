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
import com.sanyang.logistics.base.pojo.WorkOrder;
import com.sanyang.logistics.base.pojo.WorkorderProduct;
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

	@Override
	public List<SysorderProduct> selhwqd(SysorderProduct sysorderProduct) {
		return mapper.selhwqd(sysorderProduct);
	}

	@Override
	public List<SysorderProduct> selbyoidhwqd(String th[]) {
		return mapper.selbyoidhwqd(th);
	}

	@Override
	public void delpro(Integer ooo) {
		mapper.delpro(ooo);
		
	}

	@Override
	public void updatesys(Sysorders sysorders) {
		mapper.updatesys(sysorders);
		
	}

	@Override
	public void addsys(Sysorders sysorders) {
		mapper.addsys(sysorders);
	}

	@Override
	public void addsysruku(Sysorders sysorders) {
		mapper.addsysruku(sysorders);
		
	}

	@Override
	public void updrk(Sysorders sysorders) {
		mapper.updrk(sysorders);
		
	}



	@Override
	public void addwork(WorkOrder workOrder) {
		mapper.addwork(workOrder);
		
	}

	@Override
	public void addwopro(WorkorderProduct workorderProduct) {
		mapper.addwopro(workorderProduct);
		
	}

	@Override
	public void updsyscount(SysorderProduct sysorderProduct) {
		mapper.updsyscount(sysorderProduct);
		
	}

	@Override
	public void updsysstatus(Integer oid) {
		mapper.updsysstatus(oid);
		
	}

	@Override
	public WorkOrder tolistwork(Integer workid) {
		return mapper.tolistwork(workid);
	}

	@Override
	public List<SysorderProduct> selhwqdck(SysorderProduct sysorderProduct) {
		return mapper.selhwqdck(sysorderProduct);
	}

	@Override
	public void addsyspro(SysorderProduct sysorderProduct) {
		mapper.addsyspro(sysorderProduct);
		
	}

	@Override
	public void updhwqdsl(SysorderProduct sysorderProduct) {
		mapper.updhwqdsl(sysorderProduct);
		
	}

	@Override
	public void updhwqdslrk(SysorderProduct sysorderProduct) {
		mapper.updhwqdslrk(sysorderProduct);
		
	}

	@Override
	public Sysorders getbypid(Integer oids) {
		return mapper.getbypid(oids);
	}

	@Override
	public List<SysorderProduct> tolisthwqdbyoid(Integer oid) {
		return mapper.tolisthwqdbyoid(oid);
	}

	
	
	
	


}
