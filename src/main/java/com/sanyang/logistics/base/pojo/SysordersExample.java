package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class SysordersExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SysordersExample() {
        oredCriteria = new ArrayList<Criteria>();
    }

    public void setOrderByClause(String orderByClause) {
        this.orderByClause = orderByClause;
    }

    public String getOrderByClause() {
        return orderByClause;
    }

    public void setDistinct(boolean distinct) {
        this.distinct = distinct;
    }

    public boolean isDistinct() {
        return distinct;
    }

    public List<Criteria> getOredCriteria() {
        return oredCriteria;
    }

    public void or(Criteria criteria) {
        oredCriteria.add(criteria);
    }

    public Criteria or() {
        Criteria criteria = createCriteriaInternal();
        oredCriteria.add(criteria);
        return criteria;
    }

    public Criteria createCriteria() {
        Criteria criteria = createCriteriaInternal();
        if (oredCriteria.size() == 0) {
            oredCriteria.add(criteria);
        }
        return criteria;
    }

    protected Criteria createCriteriaInternal() {
        Criteria criteria = new Criteria();
        return criteria;
    }

    public void clear() {
        oredCriteria.clear();
        orderByClause = null;
        distinct = false;
    }

    protected abstract static class GeneratedCriteria {
        protected List<Criterion> criteria;

        protected GeneratedCriteria() {
            super();
            criteria = new ArrayList<Criterion>();
        }

        public boolean isValid() {
            return criteria.size() > 0;
        }

        public List<Criterion> getAllCriteria() {
            return criteria;
        }

        public List<Criterion> getCriteria() {
            return criteria;
        }

        protected void addCriterion(String condition) {
            if (condition == null) {
                throw new RuntimeException("Value for condition cannot be null");
            }
            criteria.add(new Criterion(condition));
        }

        protected void addCriterion(String condition, Object value, String property) {
            if (value == null) {
                throw new RuntimeException("Value for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value));
        }

        protected void addCriterion(String condition, Object value1, Object value2, String property) {
            if (value1 == null || value2 == null) {
                throw new RuntimeException("Between values for " + property + " cannot be null");
            }
            criteria.add(new Criterion(condition, value1, value2));
        }

        public Criteria andOidIsNull() {
            addCriterion("oid is null");
            return (Criteria) this;
        }

        public Criteria andOidIsNotNull() {
            addCriterion("oid is not null");
            return (Criteria) this;
        }

        public Criteria andOidEqualTo(Integer value) {
            addCriterion("oid =", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotEqualTo(Integer value) {
            addCriterion("oid <>", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThan(Integer value) {
            addCriterion("oid >", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("oid >=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThan(Integer value) {
            addCriterion("oid <", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidLessThanOrEqualTo(Integer value) {
            addCriterion("oid <=", value, "oid");
            return (Criteria) this;
        }

        public Criteria andOidIn(List<Integer> values) {
            addCriterion("oid in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotIn(List<Integer> values) {
            addCriterion("oid not in", values, "oid");
            return (Criteria) this;
        }

        public Criteria andOidBetween(Integer value1, Integer value2) {
            addCriterion("oid between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andOidNotBetween(Integer value1, Integer value2) {
            addCriterion("oid not between", value1, value2, "oid");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoIsNull() {
            addCriterion("cus_order_no is null");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoIsNotNull() {
            addCriterion("cus_order_no is not null");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoEqualTo(String value) {
            addCriterion("cus_order_no =", value, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoNotEqualTo(String value) {
            addCriterion("cus_order_no <>", value, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoGreaterThan(String value) {
            addCriterion("cus_order_no >", value, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoGreaterThanOrEqualTo(String value) {
            addCriterion("cus_order_no >=", value, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoLessThan(String value) {
            addCriterion("cus_order_no <", value, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoLessThanOrEqualTo(String value) {
            addCriterion("cus_order_no <=", value, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoLike(String value) {
            addCriterion("cus_order_no like", value, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoNotLike(String value) {
            addCriterion("cus_order_no not like", value, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoIn(List<String> values) {
            addCriterion("cus_order_no in", values, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoNotIn(List<String> values) {
            addCriterion("cus_order_no not in", values, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoBetween(String value1, String value2) {
            addCriterion("cus_order_no between", value1, value2, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andCusOrderNoNotBetween(String value1, String value2) {
            addCriterion("cus_order_no not between", value1, value2, "cusOrderNo");
            return (Criteria) this;
        }

        public Criteria andParentOidIsNull() {
            addCriterion("parent_oid is null");
            return (Criteria) this;
        }

        public Criteria andParentOidIsNotNull() {
            addCriterion("parent_oid is not null");
            return (Criteria) this;
        }

        public Criteria andParentOidEqualTo(Integer value) {
            addCriterion("parent_oid =", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidNotEqualTo(Integer value) {
            addCriterion("parent_oid <>", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidGreaterThan(Integer value) {
            addCriterion("parent_oid >", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidGreaterThanOrEqualTo(Integer value) {
            addCriterion("parent_oid >=", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidLessThan(Integer value) {
            addCriterion("parent_oid <", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidLessThanOrEqualTo(Integer value) {
            addCriterion("parent_oid <=", value, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidIn(List<Integer> values) {
            addCriterion("parent_oid in", values, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidNotIn(List<Integer> values) {
            addCriterion("parent_oid not in", values, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidBetween(Integer value1, Integer value2) {
            addCriterion("parent_oid between", value1, value2, "parentOid");
            return (Criteria) this;
        }

        public Criteria andParentOidNotBetween(Integer value1, Integer value2) {
            addCriterion("parent_oid not between", value1, value2, "parentOid");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNull() {
            addCriterion("cust_id is null");
            return (Criteria) this;
        }

        public Criteria andCustIdIsNotNull() {
            addCriterion("cust_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustIdEqualTo(Integer value) {
            addCriterion("cust_id =", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotEqualTo(Integer value) {
            addCriterion("cust_id <>", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThan(Integer value) {
            addCriterion("cust_id >", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_id >=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThan(Integer value) {
            addCriterion("cust_id <", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_id <=", value, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdIn(List<Integer> values) {
            addCriterion("cust_id in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotIn(List<Integer> values) {
            addCriterion("cust_id not in", values, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_id between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andCustIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_id not between", value1, value2, "custId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdIsNull() {
            addCriterion("sys_order_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdIsNotNull() {
            addCriterion("sys_order_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdEqualTo(Integer value) {
            addCriterion("sys_order_type_id =", value, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdNotEqualTo(Integer value) {
            addCriterion("sys_order_type_id <>", value, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdGreaterThan(Integer value) {
            addCriterion("sys_order_type_id >", value, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sys_order_type_id >=", value, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdLessThan(Integer value) {
            addCriterion("sys_order_type_id <", value, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sys_order_type_id <=", value, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdIn(List<Integer> values) {
            addCriterion("sys_order_type_id in", values, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdNotIn(List<Integer> values) {
            addCriterion("sys_order_type_id not in", values, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sys_order_type_id between", value1, value2, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andSysOrderTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sys_order_type_id not between", value1, value2, "sysOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdIsNull() {
            addCriterion("cust_order_type_id is null");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdIsNotNull() {
            addCriterion("cust_order_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdEqualTo(Integer value) {
            addCriterion("cust_order_type_id =", value, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdNotEqualTo(Integer value) {
            addCriterion("cust_order_type_id <>", value, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdGreaterThan(Integer value) {
            addCriterion("cust_order_type_id >", value, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_order_type_id >=", value, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdLessThan(Integer value) {
            addCriterion("cust_order_type_id <", value, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_order_type_id <=", value, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdIn(List<Integer> values) {
            addCriterion("cust_order_type_id in", values, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdNotIn(List<Integer> values) {
            addCriterion("cust_order_type_id not in", values, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_order_type_id between", value1, value2, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrderTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_order_type_id not between", value1, value2, "custOrderTypeId");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNull() {
            addCriterion("from_address is null");
            return (Criteria) this;
        }

        public Criteria andFromAddressIsNotNull() {
            addCriterion("from_address is not null");
            return (Criteria) this;
        }

        public Criteria andFromAddressEqualTo(String value) {
            addCriterion("from_address =", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotEqualTo(String value) {
            addCriterion("from_address <>", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThan(String value) {
            addCriterion("from_address >", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressGreaterThanOrEqualTo(String value) {
            addCriterion("from_address >=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThan(String value) {
            addCriterion("from_address <", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLessThanOrEqualTo(String value) {
            addCriterion("from_address <=", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressLike(String value) {
            addCriterion("from_address like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotLike(String value) {
            addCriterion("from_address not like", value, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressIn(List<String> values) {
            addCriterion("from_address in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotIn(List<String> values) {
            addCriterion("from_address not in", values, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressBetween(String value1, String value2) {
            addCriterion("from_address between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andFromAddressNotBetween(String value1, String value2) {
            addCriterion("from_address not between", value1, value2, "fromAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNull() {
            addCriterion("to_address is null");
            return (Criteria) this;
        }

        public Criteria andToAddressIsNotNull() {
            addCriterion("to_address is not null");
            return (Criteria) this;
        }

        public Criteria andToAddressEqualTo(String value) {
            addCriterion("to_address =", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotEqualTo(String value) {
            addCriterion("to_address <>", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThan(String value) {
            addCriterion("to_address >", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressGreaterThanOrEqualTo(String value) {
            addCriterion("to_address >=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThan(String value) {
            addCriterion("to_address <", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLessThanOrEqualTo(String value) {
            addCriterion("to_address <=", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressLike(String value) {
            addCriterion("to_address like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotLike(String value) {
            addCriterion("to_address not like", value, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressIn(List<String> values) {
            addCriterion("to_address in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotIn(List<String> values) {
            addCriterion("to_address not in", values, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressBetween(String value1, String value2) {
            addCriterion("to_address between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToAddressNotBetween(String value1, String value2) {
            addCriterion("to_address not between", value1, value2, "toAddress");
            return (Criteria) this;
        }

        public Criteria andToCustomerIsNull() {
            addCriterion("to_customer is null");
            return (Criteria) this;
        }

        public Criteria andToCustomerIsNotNull() {
            addCriterion("to_customer is not null");
            return (Criteria) this;
        }

        public Criteria andToCustomerEqualTo(String value) {
            addCriterion("to_customer =", value, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerNotEqualTo(String value) {
            addCriterion("to_customer <>", value, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerGreaterThan(String value) {
            addCriterion("to_customer >", value, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerGreaterThanOrEqualTo(String value) {
            addCriterion("to_customer >=", value, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerLessThan(String value) {
            addCriterion("to_customer <", value, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerLessThanOrEqualTo(String value) {
            addCriterion("to_customer <=", value, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerLike(String value) {
            addCriterion("to_customer like", value, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerNotLike(String value) {
            addCriterion("to_customer not like", value, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerIn(List<String> values) {
            addCriterion("to_customer in", values, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerNotIn(List<String> values) {
            addCriterion("to_customer not in", values, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerBetween(String value1, String value2) {
            addCriterion("to_customer between", value1, value2, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andToCustomerNotBetween(String value1, String value2) {
            addCriterion("to_customer not between", value1, value2, "toCustomer");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseIsNull() {
            addCriterion("from_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseIsNotNull() {
            addCriterion("from_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseEqualTo(Integer value) {
            addCriterion("from_warehouse =", value, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseNotEqualTo(Integer value) {
            addCriterion("from_warehouse <>", value, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseGreaterThan(Integer value) {
            addCriterion("from_warehouse >", value, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_warehouse >=", value, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseLessThan(Integer value) {
            addCriterion("from_warehouse <", value, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseLessThanOrEqualTo(Integer value) {
            addCriterion("from_warehouse <=", value, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseIn(List<Integer> values) {
            addCriterion("from_warehouse in", values, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseNotIn(List<Integer> values) {
            addCriterion("from_warehouse not in", values, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseBetween(Integer value1, Integer value2) {
            addCriterion("from_warehouse between", value1, value2, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andFromWarehouseNotBetween(Integer value1, Integer value2) {
            addCriterion("from_warehouse not between", value1, value2, "fromWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseIsNull() {
            addCriterion("to_warehouse is null");
            return (Criteria) this;
        }

        public Criteria andToWarehouseIsNotNull() {
            addCriterion("to_warehouse is not null");
            return (Criteria) this;
        }

        public Criteria andToWarehouseEqualTo(Integer value) {
            addCriterion("to_warehouse =", value, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseNotEqualTo(Integer value) {
            addCriterion("to_warehouse <>", value, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseGreaterThan(Integer value) {
            addCriterion("to_warehouse >", value, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_warehouse >=", value, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseLessThan(Integer value) {
            addCriterion("to_warehouse <", value, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseLessThanOrEqualTo(Integer value) {
            addCriterion("to_warehouse <=", value, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseIn(List<Integer> values) {
            addCriterion("to_warehouse in", values, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseNotIn(List<Integer> values) {
            addCriterion("to_warehouse not in", values, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseBetween(Integer value1, Integer value2) {
            addCriterion("to_warehouse between", value1, value2, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andToWarehouseNotBetween(Integer value1, Integer value2) {
            addCriterion("to_warehouse not between", value1, value2, "toWarehouse");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNull() {
            addCriterion("order_status is null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIsNotNull() {
            addCriterion("order_status is not null");
            return (Criteria) this;
        }

        public Criteria andOrderStatusEqualTo(Integer value) {
            addCriterion("order_status =", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotEqualTo(Integer value) {
            addCriterion("order_status <>", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThan(Integer value) {
            addCriterion("order_status >", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_status >=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThan(Integer value) {
            addCriterion("order_status <", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusLessThanOrEqualTo(Integer value) {
            addCriterion("order_status <=", value, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusIn(List<Integer> values) {
            addCriterion("order_status in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotIn(List<Integer> values) {
            addCriterion("order_status not in", values, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusBetween(Integer value1, Integer value2) {
            addCriterion("order_status between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andOrderStatusNotBetween(Integer value1, Integer value2) {
            addCriterion("order_status not between", value1, value2, "orderStatus");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNull() {
            addCriterion("product_count is null");
            return (Criteria) this;
        }

        public Criteria andProductCountIsNotNull() {
            addCriterion("product_count is not null");
            return (Criteria) this;
        }

        public Criteria andProductCountEqualTo(Integer value) {
            addCriterion("product_count =", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotEqualTo(Integer value) {
            addCriterion("product_count <>", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThan(Integer value) {
            addCriterion("product_count >", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountGreaterThanOrEqualTo(Integer value) {
            addCriterion("product_count >=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThan(Integer value) {
            addCriterion("product_count <", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountLessThanOrEqualTo(Integer value) {
            addCriterion("product_count <=", value, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountIn(List<Integer> values) {
            addCriterion("product_count in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotIn(List<Integer> values) {
            addCriterion("product_count not in", values, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountBetween(Integer value1, Integer value2) {
            addCriterion("product_count between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andProductCountNotBetween(Integer value1, Integer value2) {
            addCriterion("product_count not between", value1, value2, "productCount");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIsNull() {
            addCriterion("trucktype is null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIsNotNull() {
            addCriterion("trucktype is not null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeEqualTo(String value) {
            addCriterion("trucktype =", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotEqualTo(String value) {
            addCriterion("trucktype <>", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeGreaterThan(String value) {
            addCriterion("trucktype >", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeGreaterThanOrEqualTo(String value) {
            addCriterion("trucktype >=", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeLessThan(String value) {
            addCriterion("trucktype <", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeLessThanOrEqualTo(String value) {
            addCriterion("trucktype <=", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeLike(String value) {
            addCriterion("trucktype like", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotLike(String value) {
            addCriterion("trucktype not like", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIn(List<String> values) {
            addCriterion("trucktype in", values, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotIn(List<String> values) {
            addCriterion("trucktype not in", values, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeBetween(String value1, String value2) {
            addCriterion("trucktype between", value1, value2, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotBetween(String value1, String value2) {
            addCriterion("trucktype not between", value1, value2, "trucktype");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateIsNull() {
            addCriterion("plan_trsprt_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateIsNotNull() {
            addCriterion("plan_trsprt_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateEqualTo(Date value) {
            addCriterion("plan_trsprt_date =", value, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateNotEqualTo(Date value) {
            addCriterion("plan_trsprt_date <>", value, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateGreaterThan(Date value) {
            addCriterion("plan_trsprt_date >", value, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_trsprt_date >=", value, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateLessThan(Date value) {
            addCriterion("plan_trsprt_date <", value, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateLessThanOrEqualTo(Date value) {
            addCriterion("plan_trsprt_date <=", value, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateIn(List<Date> values) {
            addCriterion("plan_trsprt_date in", values, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateNotIn(List<Date> values) {
            addCriterion("plan_trsprt_date not in", values, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateBetween(Date value1, Date value2) {
            addCriterion("plan_trsprt_date between", value1, value2, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanTrsprtDateNotBetween(Date value1, Date value2) {
            addCriterion("plan_trsprt_date not between", value1, value2, "planTrsprtDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateIsNull() {
            addCriterion("plan_arrival_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateIsNotNull() {
            addCriterion("plan_arrival_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateEqualTo(Date value) {
            addCriterion("plan_arrival_date =", value, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateNotEqualTo(Date value) {
            addCriterion("plan_arrival_date <>", value, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateGreaterThan(Date value) {
            addCriterion("plan_arrival_date >", value, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_arrival_date >=", value, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateLessThan(Date value) {
            addCriterion("plan_arrival_date <", value, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateLessThanOrEqualTo(Date value) {
            addCriterion("plan_arrival_date <=", value, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateIn(List<Date> values) {
            addCriterion("plan_arrival_date in", values, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateNotIn(List<Date> values) {
            addCriterion("plan_arrival_date not in", values, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateBetween(Date value1, Date value2) {
            addCriterion("plan_arrival_date between", value1, value2, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanArrivalDateNotBetween(Date value1, Date value2) {
            addCriterion("plan_arrival_date not between", value1, value2, "planArrivalDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateIsNull() {
            addCriterion("plan_out_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateIsNotNull() {
            addCriterion("plan_out_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateEqualTo(Date value) {
            addCriterion("plan_out_date =", value, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateNotEqualTo(Date value) {
            addCriterion("plan_out_date <>", value, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateGreaterThan(Date value) {
            addCriterion("plan_out_date >", value, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_out_date >=", value, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateLessThan(Date value) {
            addCriterion("plan_out_date <", value, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateLessThanOrEqualTo(Date value) {
            addCriterion("plan_out_date <=", value, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateIn(List<Date> values) {
            addCriterion("plan_out_date in", values, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateNotIn(List<Date> values) {
            addCriterion("plan_out_date not in", values, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateBetween(Date value1, Date value2) {
            addCriterion("plan_out_date between", value1, value2, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanOutDateNotBetween(Date value1, Date value2) {
            addCriterion("plan_out_date not between", value1, value2, "planOutDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateIsNull() {
            addCriterion("plan_in_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanInDateIsNotNull() {
            addCriterion("plan_in_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanInDateEqualTo(Date value) {
            addCriterion("plan_in_date =", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateNotEqualTo(Date value) {
            addCriterion("plan_in_date <>", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateGreaterThan(Date value) {
            addCriterion("plan_in_date >", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_in_date >=", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateLessThan(Date value) {
            addCriterion("plan_in_date <", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateLessThanOrEqualTo(Date value) {
            addCriterion("plan_in_date <=", value, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateIn(List<Date> values) {
            addCriterion("plan_in_date in", values, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateNotIn(List<Date> values) {
            addCriterion("plan_in_date not in", values, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateBetween(Date value1, Date value2) {
            addCriterion("plan_in_date between", value1, value2, "planInDate");
            return (Criteria) this;
        }

        public Criteria andPlanInDateNotBetween(Date value1, Date value2) {
            addCriterion("plan_in_date not between", value1, value2, "planInDate");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNull() {
            addCriterion("contact_phone is null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIsNotNull() {
            addCriterion("contact_phone is not null");
            return (Criteria) this;
        }

        public Criteria andContactPhoneEqualTo(String value) {
            addCriterion("contact_phone =", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotEqualTo(String value) {
            addCriterion("contact_phone <>", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThan(String value) {
            addCriterion("contact_phone >", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneGreaterThanOrEqualTo(String value) {
            addCriterion("contact_phone >=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThan(String value) {
            addCriterion("contact_phone <", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLessThanOrEqualTo(String value) {
            addCriterion("contact_phone <=", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneLike(String value) {
            addCriterion("contact_phone like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotLike(String value) {
            addCriterion("contact_phone not like", value, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneIn(List<String> values) {
            addCriterion("contact_phone in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotIn(List<String> values) {
            addCriterion("contact_phone not in", values, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneBetween(String value1, String value2) {
            addCriterion("contact_phone between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPhoneNotBetween(String value1, String value2) {
            addCriterion("contact_phone not between", value1, value2, "contactPhone");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNull() {
            addCriterion("contact_person is null");
            return (Criteria) this;
        }

        public Criteria andContactPersonIsNotNull() {
            addCriterion("contact_person is not null");
            return (Criteria) this;
        }

        public Criteria andContactPersonEqualTo(String value) {
            addCriterion("contact_person =", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotEqualTo(String value) {
            addCriterion("contact_person <>", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThan(String value) {
            addCriterion("contact_person >", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonGreaterThanOrEqualTo(String value) {
            addCriterion("contact_person >=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThan(String value) {
            addCriterion("contact_person <", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLessThanOrEqualTo(String value) {
            addCriterion("contact_person <=", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonLike(String value) {
            addCriterion("contact_person like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotLike(String value) {
            addCriterion("contact_person not like", value, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonIn(List<String> values) {
            addCriterion("contact_person in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotIn(List<String> values) {
            addCriterion("contact_person not in", values, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonBetween(String value1, String value2) {
            addCriterion("contact_person between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andContactPersonNotBetween(String value1, String value2) {
            addCriterion("contact_person not between", value1, value2, "contactPerson");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagIsNull() {
            addCriterion("take_money_flag is null");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagIsNotNull() {
            addCriterion("take_money_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagEqualTo(String value) {
            addCriterion("take_money_flag =", value, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagNotEqualTo(String value) {
            addCriterion("take_money_flag <>", value, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagGreaterThan(String value) {
            addCriterion("take_money_flag >", value, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagGreaterThanOrEqualTo(String value) {
            addCriterion("take_money_flag >=", value, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagLessThan(String value) {
            addCriterion("take_money_flag <", value, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagLessThanOrEqualTo(String value) {
            addCriterion("take_money_flag <=", value, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagLike(String value) {
            addCriterion("take_money_flag like", value, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagNotLike(String value) {
            addCriterion("take_money_flag not like", value, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagIn(List<String> values) {
            addCriterion("take_money_flag in", values, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagNotIn(List<String> values) {
            addCriterion("take_money_flag not in", values, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagBetween(String value1, String value2) {
            addCriterion("take_money_flag between", value1, value2, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTakeMoneyFlagNotBetween(String value1, String value2) {
            addCriterion("take_money_flag not between", value1, value2, "takeMoneyFlag");
            return (Criteria) this;
        }

        public Criteria andTruckflagIsNull() {
            addCriterion("truckflag is null");
            return (Criteria) this;
        }

        public Criteria andTruckflagIsNotNull() {
            addCriterion("truckflag is not null");
            return (Criteria) this;
        }

        public Criteria andTruckflagEqualTo(String value) {
            addCriterion("truckflag =", value, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagNotEqualTo(String value) {
            addCriterion("truckflag <>", value, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagGreaterThan(String value) {
            addCriterion("truckflag >", value, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagGreaterThanOrEqualTo(String value) {
            addCriterion("truckflag >=", value, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagLessThan(String value) {
            addCriterion("truckflag <", value, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagLessThanOrEqualTo(String value) {
            addCriterion("truckflag <=", value, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagLike(String value) {
            addCriterion("truckflag like", value, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagNotLike(String value) {
            addCriterion("truckflag not like", value, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagIn(List<String> values) {
            addCriterion("truckflag in", values, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagNotIn(List<String> values) {
            addCriterion("truckflag not in", values, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagBetween(String value1, String value2) {
            addCriterion("truckflag between", value1, value2, "truckflag");
            return (Criteria) this;
        }

        public Criteria andTruckflagNotBetween(String value1, String value2) {
            addCriterion("truckflag not between", value1, value2, "truckflag");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Date value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Date value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Date value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Date value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Date value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Date> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Date> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Date value1, Date value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Date value1, Date value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNull() {
            addCriterion("createperson is null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIsNotNull() {
            addCriterion("createperson is not null");
            return (Criteria) this;
        }

        public Criteria andCreatepersonEqualTo(String value) {
            addCriterion("createperson =", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotEqualTo(String value) {
            addCriterion("createperson <>", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThan(String value) {
            addCriterion("createperson >", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonGreaterThanOrEqualTo(String value) {
            addCriterion("createperson >=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThan(String value) {
            addCriterion("createperson <", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLessThanOrEqualTo(String value) {
            addCriterion("createperson <=", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonLike(String value) {
            addCriterion("createperson like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotLike(String value) {
            addCriterion("createperson not like", value, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonIn(List<String> values) {
            addCriterion("createperson in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotIn(List<String> values) {
            addCriterion("createperson not in", values, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonBetween(String value1, String value2) {
            addCriterion("createperson between", value1, value2, "createperson");
            return (Criteria) this;
        }

        public Criteria andCreatepersonNotBetween(String value1, String value2) {
            addCriterion("createperson not between", value1, value2, "createperson");
            return (Criteria) this;
        }
    }

    public static class Criteria extends GeneratedCriteria {

        protected Criteria() {
            super();
        }
    }

    public static class Criterion {
        private String condition;

        private Object value;

        private Object secondValue;

        private boolean noValue;

        private boolean singleValue;

        private boolean betweenValue;

        private boolean listValue;

        private String typeHandler;

        public String getCondition() {
            return condition;
        }

        public Object getValue() {
            return value;
        }

        public Object getSecondValue() {
            return secondValue;
        }

        public boolean isNoValue() {
            return noValue;
        }

        public boolean isSingleValue() {
            return singleValue;
        }

        public boolean isBetweenValue() {
            return betweenValue;
        }

        public boolean isListValue() {
            return listValue;
        }

        public String getTypeHandler() {
            return typeHandler;
        }

        protected Criterion(String condition) {
            super();
            this.condition = condition;
            this.typeHandler = null;
            this.noValue = true;
        }

        protected Criterion(String condition, Object value, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.typeHandler = typeHandler;
            if (value instanceof List<?>) {
                this.listValue = true;
            } else {
                this.singleValue = true;
            }
        }

        protected Criterion(String condition, Object value) {
            this(condition, value, null);
        }

        protected Criterion(String condition, Object value, Object secondValue, String typeHandler) {
            super();
            this.condition = condition;
            this.value = value;
            this.secondValue = secondValue;
            this.typeHandler = typeHandler;
            this.betweenValue = true;
        }

        protected Criterion(String condition, Object value, Object secondValue) {
            this(condition, value, secondValue, null);
        }
    }
}