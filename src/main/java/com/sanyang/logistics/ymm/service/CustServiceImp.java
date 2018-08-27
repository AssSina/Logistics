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
	private CustDao aadao;
	
	@Override
	public List<Sysorders> tolistcust(Sysorders sysorders) {
		// TODO Auto-generated method stub
		return aadao.tolistcust(sysorders);
	}

	@Override
	public List<Sysorders> tolistsys() {
		return aadao.tolistsys();
	}

	@Override
	public List<Warehouse> tolistwar() {
		return aadao.tolistwar();
	}

	@Override
	public List<CustomerOrdertype> tolistdname() {
		return aadao.tolistdname();
	}

	@Override
	public List<Customer> tolistmer() {
		return aadao.tolistmer();
	}

	@Override
	public List<SysOrderType> tolistsyso() {
		return aadao.tolistsyso();
	}

	@Override
	public void addorder(CustomerOrdertype ordertype) {
		aadao.addorder(ordertype);
		
	}

	@Override
	public Sysorders selbyoid(Integer oid) {
		return aadao.selbyoid(oid);
	}

	@Override
	public void delsys(Integer oid) {
		aadao.delsys(oid);
		
	}

	@Override
	public void addcustomer(Customer customer) {
		aadao.addcustomer(customer);
		
	}

	@Override
	public Sysorders selbyoidsys(Integer oid) {
		return aadao.selbyoidsys(oid);
	}

	@Override
	public List<SysorderProduct> tolisthwqd(Integer oid) {
		return aadao.tolisthwqd(oid);
	}

	@Override
	public Sysorders selectbyoid(Integer oid) {
		return aadao.selectbyoid(oid);
	}

	@Override
	public List<SysorderProduct> selhwqd(SysorderProduct sysorderProduct) {
		return aadao.selhwqd(sysorderProduct);
	}

	@Override
	public List<SysorderProduct> selbyoidhwqd(String th[]) {
		return aadao.selbyoidhwqd(th);
	}

	@Override
	public void delpro(Integer ooo) {
		aadao.delpro(ooo);
		
	}

	@Override
	public void updatesys(Sysorders sysorders) {
		aadao.updatesys(sysorders);
		
	}

	@Override
	public void addsys(Sysorders sysorders) {
		aadao.addsys(sysorders);
		
	}

	@Override
	public void addsysruku(Sysorders sysorders) {
		aadao.addsysruku(sysorders);
		
	}

	@Override
	public void updrk(Sysorders sysorders) {
		aadao.updrk(sysorders);
		
	}


	@Override
	public void addwork(WorkOrder workOrder) {
		aadao.addwork(workOrder);
		
	}

	@Override
	public void addwopro(WorkorderProduct workorderProduct) {
		aadao.addwopro(workorderProduct);
		
	}

	@Override
	public void updsyscount(SysorderProduct sysorderProduct) {
		aadao.updsyscount(sysorderProduct);
		
	}

	@Override
	public void updsysstatus(Integer oid) {
		aadao.updsysstatus(oid);
		
	}

	@Override
	public WorkOrder tolistwork(Integer workid) {
		return aadao.tolistwork(workid);
	}

	@Override
	public List<SysorderProduct> selhwqdck(SysorderProduct sysorderProduct) {
		// TODO Auto-generated method stub
		return aadao.selhwqdck(sysorderProduct);
	}

	@Override
	public void addsyspro(SysorderProduct sysorderProduct) {
		aadao.addsyspro(sysorderProduct);
		
	}

	@Override
	public void updhwqdsl(SysorderProduct sysorderProduct) {
		aadao.updhwqdsl(sysorderProduct);
		
	}

	@Override
	public void updhwqdslrk(SysorderProduct sysorderProduct) {
		aadao.updhwqdslrk(sysorderProduct);
	}

	@Override
	public Sysorders getbypid(Integer oids) {
		return aadao.getbypid(oids);
	}

	@Override
	public List<SysorderProduct> tolisthwqdbyoid(Integer oid) {
		return aadao.tolisthwqdbyoid(oid);
	}



	

}
