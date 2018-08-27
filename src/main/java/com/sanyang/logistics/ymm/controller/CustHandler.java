package com.sanyang.logistics.ymm.controller;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.sanyang.logistics.base.pojo.Customer;
import com.sanyang.logistics.base.pojo.CustomerOrdertype;
import com.sanyang.logistics.base.pojo.SysOrderType;
import com.sanyang.logistics.base.pojo.SysorderProduct;
import com.sanyang.logistics.base.pojo.Sysorders;
import com.sanyang.logistics.base.pojo.Warehouse;
import com.sanyang.logistics.base.pojo.WorkOrder;
import com.sanyang.logistics.base.pojo.WorkorderProduct;
import com.sanyang.logistics.ymm.service.CustService;


@Controller
@RequestMapping("/ddgl")
public class CustHandler {

	@Autowired
	private CustService service;
	
	@RequestMapping("/tolistcust")
	@ResponseBody
	public Object tolistcust(Sysorders sysorders,String cusOrderNo,String cname,String statusname,String description,String planTrsprtDate,String planArrivalDate) throws Exception {
		cusOrderNo=new String(cusOrderNo.getBytes("iso8859-1"),"utf-8");
		cname=new String(cname.getBytes("iso8859-1"),"utf-8");
		statusname=new String(statusname.getBytes("iso8859-1"),"utf-8");
		description=new String(description.getBytes("iso8859-1"),"utf-8");
		planTrsprtDate=new String(planTrsprtDate.getBytes("iso8859-1"),"utf-8");
		planArrivalDate=new String(planArrivalDate.getBytes("iso8859-1"),"utf-8");
		sysorders.setCusOrderNo(cusOrderNo);
		sysorders.setCname(cname);
		sysorders.setStatusname(statusname);
		sysorders.setDescription(description);
		sysorders.setPlanTrsprtDate(planTrsprtDate);
		sysorders.setPlanArrivalDate(planArrivalDate);
		List<Sysorders> tolistcust = service.tolistcust(sysorders);
		return tolistcust;
	}
	
	@RequestMapping("/tolistsys")
	@ResponseBody
	public Object tolistsys() {
		List<Sysorders> tolistsys = service.tolistsys();
		return tolistsys;
	}
	
	@RequestMapping("/tolistwar")
	@ResponseBody
	public Object tolistwar() {
		List<Warehouse> tolistwar = service.tolistwar();
		return tolistwar;
	}
	
	@RequestMapping("/tolistdname")
	@ResponseBody
	public Object tolistdname() {
		List<CustomerOrdertype> tolistdname = service.tolistdname();
		return tolistdname;
	}
	
	@RequestMapping("/tolistmer")
	@ResponseBody
	public Object tolistmer() {
		List<Customer> tolistmer = service.tolistmer();
		return tolistmer;
	}
	
	@RequestMapping("/tolistsyso")
	@ResponseBody
	public Object tolistsyso() {
		List<SysOrderType> tolistsyso = service.tolistsyso();
		return tolistsyso;
	}
	
	@RequestMapping("/addorder")
	@ResponseBody
	public Object addorder(CustomerOrdertype ordertype) {
		service.addorder(ordertype);
		return "date";
	}
	
	@RequestMapping("/selbyoid")
	@ResponseBody
	public Object selbyoid(Integer oid) {
		Sysorders selbyoid = service.selbyoid(oid);
		return selbyoid;
	}
	
	@RequestMapping("/delsys")
	@ResponseBody
	public Object delsys(Integer oid) {
		service.delsys(oid);
		return "";
	}
	
	@RequestMapping("/addcustomer")
	@ResponseBody
	public Object addcustomer(Customer customer) {
		service.addcustomer(customer);
		return "";
	}
	
	@RequestMapping("/selbyoidsys")
	@ResponseBody
	public Object selbyoidsys(Integer oid) {
		Sysorders selbyoidsys = service.selbyoidsys(oid);
		return selbyoidsys;
	}
	
	@RequestMapping("/tolisthwqd")
	@ResponseBody
	public Object tolisthwqd(Integer oid) {
		System.out.println(oid);
		List<SysorderProduct> tolisthwqd = service.tolisthwqd(oid);
		System.out.println(tolisthwqd);
		return tolisthwqd;
	}
	
	@RequestMapping("/tolisthwqdbyoid")
	@ResponseBody
	public Object tolisthwqdbyoid(Integer oid) {
		System.out.println(","+oid);
		List<SysorderProduct> tolisthwqdbyoid = service.tolisthwqdbyoid(oid);
		System.out.println(tolisthwqdbyoid);
		return tolisthwqdbyoid;
	}
	
	@RequestMapping("/selectbyoid")
	@ResponseBody
	public Object selectbyoid(Integer oid) {
		Sysorders selectbyoid = service.selectbyoid(oid);
		return selectbyoid;
	}
	
	@RequestMapping("/selhwqd")
	@ResponseBody
	public Object selhwqd(SysorderProduct sysorderProduct,String pname,String code,String pcount,String ruleDescription,Integer oid) throws Exception {
		pname=new String(pname.getBytes("iso8859-1"),"utf-8");
		code=new String(code.getBytes("iso8859-1"),"utf-8");
		ruleDescription=new String(ruleDescription.getBytes("iso8859-1"),"utf-8");
		
		sysorderProduct.setPname(pname);
		sysorderProduct.setCode(code);
		sysorderProduct.setRuleDescription(ruleDescription);
		List<SysorderProduct> selhwqd = service.selhwqd(sysorderProduct);
		return selhwqd;
	}
	
	@RequestMapping("/selbyoidhwqd")
	@ResponseBody
	public Object selbyoidhwqd(String th) {
		String[] split = th.split(",");
		List<SysorderProduct> selbyoidhwqd = service.selbyoidhwqd(split);
		return selbyoidhwqd;
	}
	
	@RequestMapping("/delpro")
	@ResponseBody
	public Object delpro(Integer ooo) {
		service.delpro(ooo);
		return "4123";
	}
	
	@RequestMapping("/updatesys")
	@ResponseBody
	public Object updatesys(String truckflag,String takeMoneyFlag,Sysorders sysorders) {
		service.updatesys(sysorders);
		return "11";
	}
	
	@RequestMapping("/addsys")
	@ResponseBody
	public Object addsys(String truckflag,String takeMoneyFlag,Sysorders sysorders,SysorderProduct product,SysorderProduct sysorderProduct) {
		Integer[] bypid=product.getBypid();
		service.addsys(sysorders);
		for (int i = 0; i < bypid.length; i++) {
			sysorderProduct.setOrderid(sysorders.getOid());
			sysorderProduct.setProdId(bypid[i]);
			service.addsyspro(sysorderProduct);
			
		}
		
		return "11";
	}
	
	@RequestMapping("/addsysruku")
	@ResponseBody
	public Object addsysruku(String truckflag,Sysorders sysorders,SysorderProduct product,SysorderProduct sysorderProduct) {
		service.addsysruku(sysorders);
		Integer[] bypid=product.getBypid(); 
		for (int i = 0; i < bypid.length; i++) {
			sysorderProduct.setOrderid(sysorders.getOid());
			sysorderProduct.setProdId(bypid[i]);
			service.addsyspro(sysorderProduct);
			
		}
		
		return "11";
	}
	@RequestMapping("/updrk")
	@ResponseBody
	public Object updrk(String truckflag,Sysorders sysorders,SysorderProduct sysorderProduct) {
		service.updrk(sysorders);
		
		
		
		return "11";
	}
	@RequestMapping("/getbypid")
	@ResponseBody
	public Object getbypid(Sysorders sysorders,WorkOrder workOrder,WorkorderProduct workorderProduct,SysorderProduct sysorderProduct,Integer oid) {
		Integer[] qqq = sysorders.getQqq();
		Integer[] zxc = sysorders.getZxc();
		List<Object> a = new ArrayList<>();
		
//		service.updsysstatus(oid)
		for (int i = 0; i < qqq.length; i++) {
			sysorders.setOid(oid);
			sysorders.setPid(qqq[i]);
			Sysorders getbypid = service.getbypid(qqq[i]);
			if (zxc[i]!=0) {
				int gg = getbypid.getScount()-zxc[i];
				sysorderProduct.setScount(gg);
				sysorderProduct.setOid(qqq[i]);
				service.updsyscount(sysorderProduct);
				
				workOrder.setOrderid(getbypid.getOid());
				workOrder.setFromWhId(getbypid.getFromWarehouse());
				workOrder.setToWhId(getbypid.getToWarehouse());
				workOrder.setTrnsptFlag(getbypid.getTrucktype());
				workOrder.setCreateDate(getbypid.getCreatetime());
				workOrder.setFromAddress(getbypid.getFromAddress());
				workOrder.setToAddress(getbypid.getToAddress());
				workOrder.setSendtime(getbypid.getPlanTrsprtDate());
				workOrder.setArrivetime(getbypid.getPlanArrivalDate());
				int c = getbypid.getScount()-zxc[i];
				workOrder.setProductcount(c);
				workOrder.setSendcount(zxc[i]);
				workOrder.setPlanOutDate(getbypid.getPlanOutDate());
				workOrder.setPlanInDate(getbypid.getPlanInDate());
				workOrder.setProductname(getbypid.getPname());
				workOrder.setPcode(getbypid.getCode());
				workOrder.setPtype(getbypid.getPmodel());
				workOrder.setPpackage(getbypid.getRules());
				workOrder.setOrdertype(getbypid.getTypename());
				service.addwork(workOrder);
				
				
				WorkOrder tolistwork = service.tolistwork(workOrder.getWorkid());
				tolistwork.setYzsl(getbypid.getPcount());
				tolistwork.setFpsl(zxc[i]);
				 a.add(tolistwork);
				
				workorderProduct.setProdId(getbypid.getPid());
				workorderProduct.setWorkid(workOrder.getWorkid());
				workorderProduct.setPcount(zxc[i]);
				workorderProduct.setScount(c);
				service.addwopro(workorderProduct);
			}
		}
		return a;
		
		
	}
	
	@RequestMapping("/selhwqdck")
	@ResponseBody
	public Object selhwqdck(SysorderProduct sysorderProduct,String pname,String code,String pcount,String ruleDescription,Integer oid) throws Exception {
		pname=new String(pname.getBytes("iso8859-1"),"utf-8");
		code=new String(code.getBytes("iso8859-1"),"utf-8");
		ruleDescription=new String(ruleDescription.getBytes("iso8859-1"),"utf-8");
		
		sysorderProduct.setPname(pname);
		sysorderProduct.setCode(code);
		sysorderProduct.setRuleDescription(ruleDescription);
		
		
		List<SysorderProduct> selhwqdck = service.selhwqdck(sysorderProduct);
		return selhwqdck;
	}
	
	

	@RequestMapping("/updhwqdsl")
	@ResponseBody
	public Object updhwqdsl(Sysorders sysorders,WorkOrder workOrder,WorkorderProduct workorderProduct,SysorderProduct sysorderProduct,Integer oid) throws Exception {
		
		Integer[] aaa= sysorderProduct.getAaa();
		Integer[] bbb= sysorderProduct.getBbb();
		for (int i = 0; i < aaa.length; i++) {
			
			sysorderProduct.setOid(aaa[i]);
			sysorderProduct.setPcount(bbb[i]);
			service.updhwqdsl(sysorderProduct);
			
		}
		
		return "11";
	}
	
	@RequestMapping("/updhwqdslrk")
	@ResponseBody
	public Object updhwqdslrk(Sysorders sysorders,WorkOrder workOrder,WorkorderProduct workorderProduct,SysorderProduct sysorderProduct,Integer oid) throws Exception {
		
		Integer[] vvv= sysorderProduct.getVvv();
		Integer[] mmm= sysorderProduct.getMmm();
		System.out.println(vvv.length);
		System.out.println(mmm.length);
		for (int i = 0; i < vvv.length; i++) {
			
			sysorderProduct.setOid(vvv[i]);
			sysorderProduct.setPcount(mmm[i]);
			service.updhwqdslrk(sysorderProduct);
			
		}
		
		return "11";
	}
	
}
