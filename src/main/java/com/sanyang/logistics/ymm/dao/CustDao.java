package com.sanyang.logistics.ymm.dao;

import java.util.List;

import com.sanyang.logistics.base.pojo.Customer;
import com.sanyang.logistics.base.pojo.CustomerOrdertype;
import com.sanyang.logistics.base.pojo.SysOrderType;
import com.sanyang.logistics.base.pojo.SysorderProduct;
import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.base.pojo.WorkOrder;
import com.sanyang.logistics.base.pojo.WorkorderProduct;

public interface CustDao {
	public List<Sysorders> tolistcust(Sysorders sysorders);
	public List<Sysorders> tolistsys();
	public List<Warehouse> tolistwar();
	public List<CustomerOrdertype> tolistdname();
	public List<Customer> tolistmer();
	public List<SysOrderType> tolistsyso();
	public void addorder(CustomerOrdertype ordertype);
	public Sysorders selbyoid(Integer oid);
	public void delsys(Integer oid);
	public void addcustomer(Customer customer);
	public Sysorders selbyoidsys(Integer oid);
	public List<SysorderProduct> tolisthwqd(Integer oid);
	public Sysorders selectbyoid(Integer oid);
	public List<SysorderProduct> selhwqd(SysorderProduct sysorderProduct);
	public List<SysorderProduct> selbyoidhwqd(String th[]);
	public void delpro(Integer ooo);
	public void addsys(Sysorders sysorders);
	public void updatesys(Sysorders sysorders);
	public void addsysruku(Sysorders sysorders);
	public void updrk(Sysorders sysorders);
	public Sysorders getbypid(Integer oids);
	public void addwork(WorkOrder workOrder);
	public void addwopro(WorkorderProduct workorderProduct);
	public void updsyscount(SysorderProduct sysorderProduct);
	public void updsysstatus(Integer oid);
	public WorkOrder tolistwork(Integer workid);
	public List<SysorderProduct> selhwqdck(SysorderProduct sysorderProduct);
	public void addsyspro(SysorderProduct sysorderProduct);
	public void updhwqdsl(SysorderProduct sysorderProduct);
	public void updhwqdslrk(SysorderProduct sysorderProduct);
	public List<SysorderProduct> tolisthwqdbyoid(Integer oid);

	
}
