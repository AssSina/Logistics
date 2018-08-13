package com.sanyang.logistics.ymm.mapper;

import java.util.List;

import com.sanyang.logistics.base.pojo.Customer;
import com.sanyang.logistics.base.pojo.CustomerOrdertype;
import com.sanyang.logistics.base.pojo.SysOrderType;
import com.sanyang.logistics.base.pojo.SysorderProduct;
import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.base.pojo.Warehouse;

public interface CustMapper {
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
	
}
