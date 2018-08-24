package com.sanyang.logistics.base.pojo;


public class Sysorderses {
	private Integer   oid;
	private String  cus_order_no;
	private Integer  parent_oid;
	private Integer  cust_id;
	private Integer  sys_order_type_id;
	private Integer  cust_order_type_id;
	private String  from_address;
	private String  to_address;
	private String  to_customer;
	private Integer  from_warehouse;
	private Integer  to_warehouse;
	private Integer  order_status;
	private Integer  product_count;//        int                  null,				/*--订单数量 ？？？*/
	private String	   trucktype;//            varchar(50)          null,				/*--运输方式*/
	private String	   plan_trsprt_date;//     datetime             null,				/*--计划运输时间*/
	private String	   plan_arrival_date;//    datetime             null,				/*--预计到达时间*/
	private String	   plan_out_date;//      datetime             null,				/*--计划出库时间*/
	private String	   plan_in_date;//       datetime             null,				/*--计划入库时间*/
	private String	   contact_phone;//       varchar(50)          null,				/*--联系电话*/
	private String	   contact_person;//      varchar(50)          null,				/*--联系人*/
	private String	   take_money_flag;//      char(2)              null,				/*--是否代收费*/
	private String	   truckflag;//       char(2)              null,				/*--是否运输*/
	private Integer	   region_id;//        int                  null,				/*--区域编号*/
	private String	   createtime;//        datetime             null,				/*--创建日期*/
	private String	   description;//       varchar(200)         null,				/*--订单描述*/
	private String	   createperson ;//        varchar(50)          null				/*--创建人*/
    
	private String cuname; //客户名称
	
	private String cuphone; //客户联系电话
	
	private String typename; //订单类型
    
	private Integer sid;//订单状态ID
	
	private String statusname; //订单状态

	private String name; //仓库名称

	
	

	public Integer getSid() {
		return sid;
	}
	public void setSid(Integer sid) {
		this.sid = sid;
	}
	public String getTypename() {
		return typename;
	}
	public void setTypename(String typename) {
		this.typename = typename;
	}
	public String getStatusname() {
		return statusname;
	}
	public void setStatusname(String statusname) {
		this.statusname = statusname;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public Integer getOid() {
		return oid;
	}
	public void setOid(Integer oid) {
		this.oid = oid;
	}
	public String getCus_order_no() {
		return cus_order_no;
	}
	public void setCus_order_no(String cus_order_no) {
		this.cus_order_no = cus_order_no;
	}
	public Integer getParent_oid() {
		return parent_oid;
	}
	public void setParent_oid(Integer parent_oid) {
		this.parent_oid = parent_oid;
	}
	public Integer getCust_id() {
		return cust_id;
	}
	public void setCust_id(Integer cust_id) {
		this.cust_id = cust_id;
	}
	public Integer getSys_order_type_id() {
		return sys_order_type_id;
	}
	public void setSys_order_type_id(Integer sys_order_type_id) {
		this.sys_order_type_id = sys_order_type_id;
	}
	public Integer getCust_order_type_id() {
		return cust_order_type_id;
	}
	public void setCust_order_type_id(Integer cust_order_type_id) {
		this.cust_order_type_id = cust_order_type_id;
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
	public String getTo_customer() {
		return to_customer;
	}
	public void setTo_customer(String to_customer) {
		this.to_customer = to_customer;
	}
	public Integer getFrom_warehouse() {
		return from_warehouse;
	}
	public void setFrom_warehouse(Integer from_warehouse) {
		this.from_warehouse = from_warehouse;
	}
	public Integer getTo_warehouse() {
		return to_warehouse;
	}
	public void setTo_warehouse(Integer to_warehouse) {
		this.to_warehouse = to_warehouse;
	}
	public Integer getOrder_status() {
		return order_status;
	}
	public void setOrder_status(Integer order_status) {
		this.order_status = order_status;
	}
	
	
	
	
	public Integer getProduct_count() {
		return product_count;
	}
	public void setProduct_count(Integer product_count) {
		this.product_count = product_count;
	}
	public String getTrucktype() {
		return trucktype;
	}
	public void setTrucktype(String trucktype) {
		this.trucktype = trucktype;
	}
	public String getPlan_trsprt_date() {
		return plan_trsprt_date;
	}
	public void setPlan_trsprt_date(String plan_trsprt_date) {
		this.plan_trsprt_date = plan_trsprt_date;
	}
	public String getPlan_arrival_date() {
		return plan_arrival_date;
	}
	public void setPlan_arrival_date(String plan_arrival_date) {
		this.plan_arrival_date = plan_arrival_date;
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
	public String getContact_phone() {
		return contact_phone;
	}
	public void setContact_phone(String contact_phone) {
		this.contact_phone = contact_phone;
	}
	public String getContact_person() {
		return contact_person;
	}
	public void setContact_person(String contact_person) {
		this.contact_person = contact_person;
	}
	public String getTake_money_flag() {
		return take_money_flag;
	}
	public void setTake_money_flag(String take_money_flag) {
		this.take_money_flag = take_money_flag;
	}
	public String getTruckflag() {
		return truckflag;
	}
	public void setTruckflag(String truckflag) {
		this.truckflag = truckflag;
	}
	public Integer getRegion_id() {
		return region_id;
	}
	public void setRegion_id(Integer region_id) {
		this.region_id = region_id;
	}
	public String getCreatetime() {
		return createtime;
	}
	public void setCreatetime(String createtime) {
		this.createtime = createtime;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public String getCreateperson() {
		return createperson;
	}
	public void setCreateperson(String createperson) {
		this.createperson = createperson;
	}
	
	
	
	public String getCuname() {
		return cuname;
	}
	public void setCuname(String cuname) {
		this.cuname = cuname;
	}
	public String getCuphone() {
		return cuphone;
	}
	public void setCuphone(String cuphone) {
		this.cuphone = cuphone;
	}
	@Override
	public String toString() {
		return "Sysorders [oid=" + oid + ", cus_order_no=" + cus_order_no + ", parent_oid=" + parent_oid + ", cust_id="
				+ cust_id + ", sys_order_type_id=" + sys_order_type_id + ", cust_order_type_id=" + cust_order_type_id
				+ ", from_address=" + from_address + ", to_address=" + to_address + ", to_customer=" + to_customer
				+ ", from_warehouse=" + from_warehouse + ", to_warehouse=" + to_warehouse + ", order_status="
				+ order_status + ", product_count=" + product_count + ", trucktype=" + trucktype + ", plan_trsprt_date="
				+ plan_trsprt_date + ", plan_arrival_date=" + plan_arrival_date + ", plan_out_date=" + plan_out_date
				+ ", plan_in_date=" + plan_in_date + ", contact_phone=" + contact_phone + ", contact_person="
				+ contact_person + ", take_money_flag=" + take_money_flag + ", truckflag=" + truckflag + ", region_id="
				+ region_id + ", createtime=" + createtime + ", description=" + description + ", createperson="
				+ createperson + ", cuname=" + cuname + ", cuphone=" + cuphone + ", typename=" + typename + ", sid="
				+ sid + ", statusname=" + statusname + ", name=" + name + "]";
	}

	





}
