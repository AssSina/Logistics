package com.sanyang.logistics.base.pojo;

public class SplitedOrderProdBridge {
	
	Integer oid;
	Integer work_order_id;
	Integer sched_id;
	Integer orderid;
	Integer prod_id;
	String ptype;
	String pcode;
	String packageid;
	Integer plan_amt;
	Integer split_amt;
	 Integer unalloc_amt;
	Integer real_amt;
	Integer height;
	Integer arear;
	Integer toaddress;
	String description;
	String splitedstatus;
	
	
	private String pname;
	private String code;
	private String pmodel;
	private Integer pcount  ;
	private String package_name;
	private String status;
	
	
	public String getCode() {
		return code;
	}

	public void setCode(String code) {
		this.code = code;
	}

	public String getPmodel() {
		return pmodel;
	}

	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}

	public Integer getPcount() {
		return pcount;
	}

	public void setPcount(Integer pcount) {
		this.pcount = pcount;
	}

	public String getPackage_name() {
		return package_name;
	}

	public void setPackage_name(String package_name) {
		this.package_name = package_name;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public SplitedOrderProdBridge() {
		// TODO Auto-generated constructor stub
	}

	public SplitedOrderProdBridge(Integer oid, Integer work_order_id, Integer sched_id, Integer orderid,
			Integer prod_id, String pname, String ptype, String pcode, String packageid, Integer plan_amt,
			Integer split_amt, Integer unalloc_amt, Integer real_amt, Integer height, Integer arear, Integer toaddress,
			String description, String splitedstatus) {
		super();
		this.oid = oid;
		this.work_order_id = work_order_id;
		this.sched_id = sched_id;
		this.orderid = orderid;
		this.prod_id = prod_id;
		this.pname = pname;
		this.ptype = ptype;
		this.pcode = pcode;
		this.packageid = packageid;
		this.plan_amt = plan_amt;
		this.split_amt = split_amt;
		this.unalloc_amt = unalloc_amt;
		this.real_amt = real_amt;
		this.height = height;
		this.arear = arear;
		this.toaddress = toaddress;
		this.description = description;
		this.splitedstatus = splitedstatus;
	}

	public Integer getOid() {
		return oid;
	}

	public void setOid(Integer oid) {
		this.oid = oid;
	}

	public Integer getWork_order_id() {
		return work_order_id;
	}

	public void setWork_order_id(Integer work_order_id) {
		this.work_order_id = work_order_id;
	}

	public Integer getSched_id() {
		return sched_id;
	}

	public void setSched_id(Integer sched_id) {
		this.sched_id = sched_id;
	}

	public Integer getOrderid() {
		return orderid;
	}

	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}

	public Integer getProd_id() {
		return prod_id;
	}

	public void setProd_id(Integer prod_id) {
		this.prod_id = prod_id;
	}

	public String getPname() {
		return pname;
	}

	public void setPname(String pname) {
		this.pname = pname;
	}

	public String getPtype() {
		return ptype;
	}

	public void setPtype(String ptype) {
		this.ptype = ptype;
	}

	public String getPcode() {
		return pcode;
	}

	public void setPcode(String pcode) {
		this.pcode = pcode;
	}

	public String getPackageid() {
		return packageid;
	}

	public void setPackageid(String packageid) {
		this.packageid = packageid;
	}

	public Integer getPlan_amt() {
		return plan_amt;
	}

	public void setPlan_amt(Integer plan_amt) {
		this.plan_amt = plan_amt;
	}

	public Integer getSplit_amt() {
		return split_amt;
	}

	public void setSplit_amt(Integer split_amt) {
		this.split_amt = split_amt;
	}

	public Integer getUnalloc_amt() {
		return unalloc_amt;
	}

	public void setUnalloc_amt(Integer unalloc_amt) {
		this.unalloc_amt = unalloc_amt;
	}

	public Integer getReal_amt() {
		return real_amt;
	}

	public void setReal_amt(Integer real_amt) {
		this.real_amt = real_amt;
	}

	public Integer getHeight() {
		return height;
	}

	public void setHeight(Integer height) {
		this.height = height;
	}

	public Integer getArear() {
		return arear;
	}

	public void setArear(Integer arear) {
		this.arear = arear;
	}

	public Integer getToaddress() {
		return toaddress;
	}

	public void setToaddress(Integer toaddress) {
		this.toaddress = toaddress;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public String getSplitedstatus() {
		return splitedstatus;
	}

	public void setSplitedstatus(String splitedstatus) {
		this.splitedstatus = splitedstatus;
	}

	@Override
	public String toString() {
		return "SplitedOrderProdBridge [oid=" + oid + ", work_order_id=" + work_order_id + ", sched_id=" + sched_id
				+ ", orderid=" + orderid + ", prod_id=" + prod_id + ", pname=" + pname + ", ptype=" + ptype + ", pcode="
				+ pcode + ", packageid=" + packageid + ", plan_amt=" + plan_amt + ", split_amt=" + split_amt
				+ ", unalloc_amt=" + unalloc_amt + ", real_amt=" + real_amt + ", height=" + height + ", arear=" + arear
				+ ", toaddress=" + toaddress + ", description=" + description + ", splitedstatus=" + splitedstatus
				+ "]";
	}
	
	
	
	
	
}
