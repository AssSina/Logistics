package com.sanyang.logistics.base.pojo;


public class WorkOrder {
	private Integer workid;
	private Integer orderid;
	private Integer from_wh_id;
	private Integer to_wh_id;
	private String trnspt_flag;
	private Integer trnspt_type_id;
	private String create_date;
	private String update_date;
	private String from_address;
	private String to_address;
	private String sendtime;
	private String arrivetime;
	private Integer productcount;
	private Integer sendcount;
	private String plan_out_date;
	private String plan_in_date;
	private String heightflag;
	private String heigtharear;
	private String scheduletype;
	private String productname;
	private String pcode;
	private String ptype;
	private String ppackage;
	private String workstatus;
	private String ordertype;
	
	
	private String pname;
	private String code;
	private String pmodel;
	private Integer pcount  ;
	private String package_name;
	private String status;
	
	
	
	public String getPmodel() {
		return pmodel;
	}
	public void setPmodel(String pmodel) {
		this.pmodel = pmodel;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
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
	public Integer getWorkid() {
		return workid;
	}
	public void setWorkid(Integer workid) {
		this.workid = workid;
	}
	public Integer getOrderid() {
		return orderid;
	}
	public void setOrderid(Integer orderid) {
		this.orderid = orderid;
	}
	public Integer getFrom_wh_id() {
		return from_wh_id;
	}
	public void setFrom_wh_id(Integer from_wh_id) {
		this.from_wh_id = from_wh_id;
	}
	public Integer getTo_wh_id() {
		return to_wh_id;
	}
	public void setTo_wh_id(Integer to_wh_id) {
		this.to_wh_id = to_wh_id;
	}
	public String getTrnspt_flag() {
		return trnspt_flag;
	}
	public void setTrnspt_flag(String trnspt_flag) {
		this.trnspt_flag = trnspt_flag;
	}
	public Integer getTrnspt_type_id() {
		return trnspt_type_id;
	}
	public void setTrnspt_type_id(Integer trnspt_type_id) {
		this.trnspt_type_id = trnspt_type_id;
	}
	public String getCreate_date() {
		return create_date;
	}
	public void setCreate_date(String create_date) {
		this.create_date = create_date;
	}
	public String getUpdate_date() {
		return update_date;
	}
	public void setUpdate_date(String update_date) {
		this.update_date = update_date;
	}
	public String getFrom_address() {
		return from_address;
	}
	public void setFrom_address(String from_address) {
		this.from_address = from_address;
	}
	public String getTo_address() {
		return to_address;
	}
	public void setTo_address(String to_address) {
		this.to_address = to_address;
	}
	public String getSendtime() {
		return sendtime;
	}
	public void setSendtime(String sendtime) {
		this.sendtime = sendtime;
	}
	public String getArrivetime() {
		return arrivetime;
	}
	public void setArrivetime(String arrivetime) {
		this.arrivetime = arrivetime;
	}
	public Integer getProductcount() {
		return productcount;
	}
	public void setProductcount(Integer productcount) {
		this.productcount = productcount;
	}
	public Integer getSendcount() {
		return sendcount;
	}
	public void setSendcount(Integer sendcount) {
		this.sendcount = sendcount;
	}
	public String getPlan_out_date() {
		return plan_out_date;
	}
	public void setPlan_out_date(String plan_out_date) {
		this.plan_out_date = plan_out_date;
	}
	public String getPlan_in_date() {
		return plan_in_date;
	}
	public void setPlan_in_date(String plan_in_date) {
		this.plan_in_date = plan_in_date;
	}
	public String getHeightflag() {
		return heightflag;
	}
	public void setHeightflag(String heightflag) {
		this.heightflag = heightflag;
	}
	public String getHeigtharear() {
		return heigtharear;
	}
	public void setHeigtharear(String heigtharear) {
		this.heigtharear = heigtharear;
	}
	public String getScheduletype() {
		return scheduletype;
	}
	public void setScheduletype(String scheduletype) {
		this.scheduletype = scheduletype;
	}
	public String getProductname() {
		return productname;
	}
	public void setProductname(String productname) {
		this.productname = productname;
	}
	public String getPcode() {
		return pcode;
	}
	public void setPcode(String pcode) {
		this.pcode = pcode;
	}
	public String getPtype() {
		return ptype;
	}
	public void setPtype(String ptype) {
		this.ptype = ptype;
	}
	public String getPpackage() {
		return ppackage;
	}
	public void setPpackage(String ppackage) {
		this.ppackage = ppackage;
	}
	public String getWorkstatus() {
		return workstatus;
	}
	public void setWorkstatus(String workstatus) {
		this.workstatus = workstatus;
	}
	public String getOrdertype() {
		return ordertype;
	}
	public void setOrdertype(String ordertype) {
		this.ordertype = ordertype;
	}
	@Override
	public String toString() {
		return "WorkOrder [workid=" + workid + ", orderid=" + orderid + ", from_wh_id=" + from_wh_id + ", to_wh_id="
				+ to_wh_id + ", trnspt_flag=" + trnspt_flag + ", trnspt_type_id=" + trnspt_type_id + ", create_date="
				+ create_date + ", update_date=" + update_date + ", from_address=" + from_address + ", to_address="
				+ to_address + ", sendtime=" + sendtime + ", arrivetime=" + arrivetime + ", productcount="
				+ productcount + ", sendcount=" + sendcount + ", plan_out_date=" + plan_out_date + ", plan_in_date="
				+ plan_in_date + ", heightflag=" + heightflag + ", heigtharear=" + heigtharear + ", scheduletype="
				+ scheduletype + ", productname=" + productname + ", pcode=" + pcode + ", ptype=" + ptype
				+ ", ppackage=" + ppackage + ", workstatus=" + workstatus + ", ordertype=" + ordertype + "]";
	}
	public WorkOrder(Integer workid, Integer orderid, Integer from_wh_id, Integer to_wh_id, String trnspt_flag,
			Integer trnspt_type_id, String create_date, String update_date, String from_address, String to_address,
			String sendtime, String arrivetime, Integer productcount, Integer sendcount, String plan_out_date,
			String plan_in_date, String heightflag, String heigtharear, String scheduletype, String productname,
			String pcode, String ptype, String ppackage, String workstatus, String ordertype) {
		super();
		this.workid = workid;
		this.orderid = orderid;
		this.from_wh_id = from_wh_id;
		this.to_wh_id = to_wh_id;
		this.trnspt_flag = trnspt_flag;
		this.trnspt_type_id = trnspt_type_id;
		this.create_date = create_date;
		this.update_date = update_date;
		this.from_address = from_address;
		this.to_address = to_address;
		this.sendtime = sendtime;
		this.arrivetime = arrivetime;
		this.productcount = productcount;
		this.sendcount = sendcount;
		this.plan_out_date = plan_out_date;
		this.plan_in_date = plan_in_date;
		this.heightflag = heightflag;
		this.heigtharear = heigtharear;
		this.scheduletype = scheduletype;
		this.productname = productname;
		this.pcode = pcode;
		this.ptype = ptype;
		this.ppackage = ppackage;
		this.workstatus = workstatus;
		this.ordertype = ordertype;
	}
	public WorkOrder() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	

}
