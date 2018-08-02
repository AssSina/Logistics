package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class SplitedOrderProdBridgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public SplitedOrderProdBridgeExample() {
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

        public Criteria andWorkOrderIdIsNull() {
            addCriterion("work_order_id is null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIsNotNull() {
            addCriterion("work_order_id is not null");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdEqualTo(Integer value) {
            addCriterion("work_order_id =", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotEqualTo(Integer value) {
            addCriterion("work_order_id <>", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThan(Integer value) {
            addCriterion("work_order_id >", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("work_order_id >=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThan(Integer value) {
            addCriterion("work_order_id <", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("work_order_id <=", value, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdIn(List<Integer> values) {
            addCriterion("work_order_id in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotIn(List<Integer> values) {
            addCriterion("work_order_id not in", values, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("work_order_id between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andWorkOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("work_order_id not between", value1, value2, "workOrderId");
            return (Criteria) this;
        }

        public Criteria andSchedIdIsNull() {
            addCriterion("sched_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedIdIsNotNull() {
            addCriterion("sched_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedIdEqualTo(Integer value) {
            addCriterion("sched_id =", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdNotEqualTo(Integer value) {
            addCriterion("sched_id <>", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdGreaterThan(Integer value) {
            addCriterion("sched_id >", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sched_id >=", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdLessThan(Integer value) {
            addCriterion("sched_id <", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdLessThanOrEqualTo(Integer value) {
            addCriterion("sched_id <=", value, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdIn(List<Integer> values) {
            addCriterion("sched_id in", values, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdNotIn(List<Integer> values) {
            addCriterion("sched_id not in", values, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdBetween(Integer value1, Integer value2) {
            addCriterion("sched_id between", value1, value2, "schedId");
            return (Criteria) this;
        }

        public Criteria andSchedIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sched_id not between", value1, value2, "schedId");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNull() {
            addCriterion("orderid is null");
            return (Criteria) this;
        }

        public Criteria andOrderidIsNotNull() {
            addCriterion("orderid is not null");
            return (Criteria) this;
        }

        public Criteria andOrderidEqualTo(Integer value) {
            addCriterion("orderid =", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotEqualTo(Integer value) {
            addCriterion("orderid <>", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThan(Integer value) {
            addCriterion("orderid >", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidGreaterThanOrEqualTo(Integer value) {
            addCriterion("orderid >=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThan(Integer value) {
            addCriterion("orderid <", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidLessThanOrEqualTo(Integer value) {
            addCriterion("orderid <=", value, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidIn(List<Integer> values) {
            addCriterion("orderid in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotIn(List<Integer> values) {
            addCriterion("orderid not in", values, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidBetween(Integer value1, Integer value2) {
            addCriterion("orderid between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andOrderidNotBetween(Integer value1, Integer value2) {
            addCriterion("orderid not between", value1, value2, "orderid");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNull() {
            addCriterion("prod_id is null");
            return (Criteria) this;
        }

        public Criteria andProdIdIsNotNull() {
            addCriterion("prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andProdIdEqualTo(Integer value) {
            addCriterion("prod_id =", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotEqualTo(Integer value) {
            addCriterion("prod_id <>", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThan(Integer value) {
            addCriterion("prod_id >", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("prod_id >=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThan(Integer value) {
            addCriterion("prod_id <", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("prod_id <=", value, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdIn(List<Integer> values) {
            addCriterion("prod_id in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotIn(List<Integer> values) {
            addCriterion("prod_id not in", values, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdBetween(Integer value1, Integer value2) {
            addCriterion("prod_id between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("prod_id not between", value1, value2, "prodId");
            return (Criteria) this;
        }

        public Criteria andPnameIsNull() {
            addCriterion("pname is null");
            return (Criteria) this;
        }

        public Criteria andPnameIsNotNull() {
            addCriterion("pname is not null");
            return (Criteria) this;
        }

        public Criteria andPnameEqualTo(String value) {
            addCriterion("pname =", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotEqualTo(String value) {
            addCriterion("pname <>", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThan(String value) {
            addCriterion("pname >", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameGreaterThanOrEqualTo(String value) {
            addCriterion("pname >=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThan(String value) {
            addCriterion("pname <", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLessThanOrEqualTo(String value) {
            addCriterion("pname <=", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameLike(String value) {
            addCriterion("pname like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotLike(String value) {
            addCriterion("pname not like", value, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameIn(List<String> values) {
            addCriterion("pname in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotIn(List<String> values) {
            addCriterion("pname not in", values, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameBetween(String value1, String value2) {
            addCriterion("pname between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPnameNotBetween(String value1, String value2) {
            addCriterion("pname not between", value1, value2, "pname");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNull() {
            addCriterion("ptype is null");
            return (Criteria) this;
        }

        public Criteria andPtypeIsNotNull() {
            addCriterion("ptype is not null");
            return (Criteria) this;
        }

        public Criteria andPtypeEqualTo(String value) {
            addCriterion("ptype =", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotEqualTo(String value) {
            addCriterion("ptype <>", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThan(String value) {
            addCriterion("ptype >", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeGreaterThanOrEqualTo(String value) {
            addCriterion("ptype >=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThan(String value) {
            addCriterion("ptype <", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLessThanOrEqualTo(String value) {
            addCriterion("ptype <=", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeLike(String value) {
            addCriterion("ptype like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotLike(String value) {
            addCriterion("ptype not like", value, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeIn(List<String> values) {
            addCriterion("ptype in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotIn(List<String> values) {
            addCriterion("ptype not in", values, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeBetween(String value1, String value2) {
            addCriterion("ptype between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPtypeNotBetween(String value1, String value2) {
            addCriterion("ptype not between", value1, value2, "ptype");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNull() {
            addCriterion("pcode is null");
            return (Criteria) this;
        }

        public Criteria andPcodeIsNotNull() {
            addCriterion("pcode is not null");
            return (Criteria) this;
        }

        public Criteria andPcodeEqualTo(String value) {
            addCriterion("pcode =", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotEqualTo(String value) {
            addCriterion("pcode <>", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThan(String value) {
            addCriterion("pcode >", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeGreaterThanOrEqualTo(String value) {
            addCriterion("pcode >=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThan(String value) {
            addCriterion("pcode <", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLessThanOrEqualTo(String value) {
            addCriterion("pcode <=", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeLike(String value) {
            addCriterion("pcode like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotLike(String value) {
            addCriterion("pcode not like", value, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeIn(List<String> values) {
            addCriterion("pcode in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotIn(List<String> values) {
            addCriterion("pcode not in", values, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeBetween(String value1, String value2) {
            addCriterion("pcode between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPcodeNotBetween(String value1, String value2) {
            addCriterion("pcode not between", value1, value2, "pcode");
            return (Criteria) this;
        }

        public Criteria andPackageidIsNull() {
            addCriterion("packageid is null");
            return (Criteria) this;
        }

        public Criteria andPackageidIsNotNull() {
            addCriterion("packageid is not null");
            return (Criteria) this;
        }

        public Criteria andPackageidEqualTo(String value) {
            addCriterion("packageid =", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotEqualTo(String value) {
            addCriterion("packageid <>", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThan(String value) {
            addCriterion("packageid >", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidGreaterThanOrEqualTo(String value) {
            addCriterion("packageid >=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThan(String value) {
            addCriterion("packageid <", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLessThanOrEqualTo(String value) {
            addCriterion("packageid <=", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidLike(String value) {
            addCriterion("packageid like", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotLike(String value) {
            addCriterion("packageid not like", value, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidIn(List<String> values) {
            addCriterion("packageid in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotIn(List<String> values) {
            addCriterion("packageid not in", values, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidBetween(String value1, String value2) {
            addCriterion("packageid between", value1, value2, "packageid");
            return (Criteria) this;
        }

        public Criteria andPackageidNotBetween(String value1, String value2) {
            addCriterion("packageid not between", value1, value2, "packageid");
            return (Criteria) this;
        }

        public Criteria andPlanAmtIsNull() {
            addCriterion("plan_amt is null");
            return (Criteria) this;
        }

        public Criteria andPlanAmtIsNotNull() {
            addCriterion("plan_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPlanAmtEqualTo(Integer value) {
            addCriterion("plan_amt =", value, "planAmt");
            return (Criteria) this;
        }

        public Criteria andPlanAmtNotEqualTo(Integer value) {
            addCriterion("plan_amt <>", value, "planAmt");
            return (Criteria) this;
        }

        public Criteria andPlanAmtGreaterThan(Integer value) {
            addCriterion("plan_amt >", value, "planAmt");
            return (Criteria) this;
        }

        public Criteria andPlanAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("plan_amt >=", value, "planAmt");
            return (Criteria) this;
        }

        public Criteria andPlanAmtLessThan(Integer value) {
            addCriterion("plan_amt <", value, "planAmt");
            return (Criteria) this;
        }

        public Criteria andPlanAmtLessThanOrEqualTo(Integer value) {
            addCriterion("plan_amt <=", value, "planAmt");
            return (Criteria) this;
        }

        public Criteria andPlanAmtIn(List<Integer> values) {
            addCriterion("plan_amt in", values, "planAmt");
            return (Criteria) this;
        }

        public Criteria andPlanAmtNotIn(List<Integer> values) {
            addCriterion("plan_amt not in", values, "planAmt");
            return (Criteria) this;
        }

        public Criteria andPlanAmtBetween(Integer value1, Integer value2) {
            addCriterion("plan_amt between", value1, value2, "planAmt");
            return (Criteria) this;
        }

        public Criteria andPlanAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("plan_amt not between", value1, value2, "planAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtIsNull() {
            addCriterion("split_amt is null");
            return (Criteria) this;
        }

        public Criteria andSplitAmtIsNotNull() {
            addCriterion("split_amt is not null");
            return (Criteria) this;
        }

        public Criteria andSplitAmtEqualTo(Integer value) {
            addCriterion("split_amt =", value, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtNotEqualTo(Integer value) {
            addCriterion("split_amt <>", value, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtGreaterThan(Integer value) {
            addCriterion("split_amt >", value, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("split_amt >=", value, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtLessThan(Integer value) {
            addCriterion("split_amt <", value, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtLessThanOrEqualTo(Integer value) {
            addCriterion("split_amt <=", value, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtIn(List<Integer> values) {
            addCriterion("split_amt in", values, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtNotIn(List<Integer> values) {
            addCriterion("split_amt not in", values, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtBetween(Integer value1, Integer value2) {
            addCriterion("split_amt between", value1, value2, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andSplitAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("split_amt not between", value1, value2, "splitAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtIsNull() {
            addCriterion("unalloc_amt is null");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtIsNotNull() {
            addCriterion("unalloc_amt is not null");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtEqualTo(Integer value) {
            addCriterion("unalloc_amt =", value, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtNotEqualTo(Integer value) {
            addCriterion("unalloc_amt <>", value, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtGreaterThan(Integer value) {
            addCriterion("unalloc_amt >", value, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("unalloc_amt >=", value, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtLessThan(Integer value) {
            addCriterion("unalloc_amt <", value, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtLessThanOrEqualTo(Integer value) {
            addCriterion("unalloc_amt <=", value, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtIn(List<Integer> values) {
            addCriterion("unalloc_amt in", values, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtNotIn(List<Integer> values) {
            addCriterion("unalloc_amt not in", values, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtBetween(Integer value1, Integer value2) {
            addCriterion("unalloc_amt between", value1, value2, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andUnallocAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("unalloc_amt not between", value1, value2, "unallocAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtIsNull() {
            addCriterion("real_amt is null");
            return (Criteria) this;
        }

        public Criteria andRealAmtIsNotNull() {
            addCriterion("real_amt is not null");
            return (Criteria) this;
        }

        public Criteria andRealAmtEqualTo(Integer value) {
            addCriterion("real_amt =", value, "realAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtNotEqualTo(Integer value) {
            addCriterion("real_amt <>", value, "realAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtGreaterThan(Integer value) {
            addCriterion("real_amt >", value, "realAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("real_amt >=", value, "realAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtLessThan(Integer value) {
            addCriterion("real_amt <", value, "realAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtLessThanOrEqualTo(Integer value) {
            addCriterion("real_amt <=", value, "realAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtIn(List<Integer> values) {
            addCriterion("real_amt in", values, "realAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtNotIn(List<Integer> values) {
            addCriterion("real_amt not in", values, "realAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtBetween(Integer value1, Integer value2) {
            addCriterion("real_amt between", value1, value2, "realAmt");
            return (Criteria) this;
        }

        public Criteria andRealAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("real_amt not between", value1, value2, "realAmt");
            return (Criteria) this;
        }

        public Criteria andHeightIsNull() {
            addCriterion("height is null");
            return (Criteria) this;
        }

        public Criteria andHeightIsNotNull() {
            addCriterion("height is not null");
            return (Criteria) this;
        }

        public Criteria andHeightEqualTo(Integer value) {
            addCriterion("height =", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotEqualTo(Integer value) {
            addCriterion("height <>", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThan(Integer value) {
            addCriterion("height >", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightGreaterThanOrEqualTo(Integer value) {
            addCriterion("height >=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThan(Integer value) {
            addCriterion("height <", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightLessThanOrEqualTo(Integer value) {
            addCriterion("height <=", value, "height");
            return (Criteria) this;
        }

        public Criteria andHeightIn(List<Integer> values) {
            addCriterion("height in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotIn(List<Integer> values) {
            addCriterion("height not in", values, "height");
            return (Criteria) this;
        }

        public Criteria andHeightBetween(Integer value1, Integer value2) {
            addCriterion("height between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andHeightNotBetween(Integer value1, Integer value2) {
            addCriterion("height not between", value1, value2, "height");
            return (Criteria) this;
        }

        public Criteria andArearIsNull() {
            addCriterion("arear is null");
            return (Criteria) this;
        }

        public Criteria andArearIsNotNull() {
            addCriterion("arear is not null");
            return (Criteria) this;
        }

        public Criteria andArearEqualTo(String value) {
            addCriterion("arear =", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearNotEqualTo(String value) {
            addCriterion("arear <>", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearGreaterThan(String value) {
            addCriterion("arear >", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearGreaterThanOrEqualTo(String value) {
            addCriterion("arear >=", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearLessThan(String value) {
            addCriterion("arear <", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearLessThanOrEqualTo(String value) {
            addCriterion("arear <=", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearLike(String value) {
            addCriterion("arear like", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearNotLike(String value) {
            addCriterion("arear not like", value, "arear");
            return (Criteria) this;
        }

        public Criteria andArearIn(List<String> values) {
            addCriterion("arear in", values, "arear");
            return (Criteria) this;
        }

        public Criteria andArearNotIn(List<String> values) {
            addCriterion("arear not in", values, "arear");
            return (Criteria) this;
        }

        public Criteria andArearBetween(String value1, String value2) {
            addCriterion("arear between", value1, value2, "arear");
            return (Criteria) this;
        }

        public Criteria andArearNotBetween(String value1, String value2) {
            addCriterion("arear not between", value1, value2, "arear");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNull() {
            addCriterion("toaddress is null");
            return (Criteria) this;
        }

        public Criteria andToaddressIsNotNull() {
            addCriterion("toaddress is not null");
            return (Criteria) this;
        }

        public Criteria andToaddressEqualTo(String value) {
            addCriterion("toaddress =", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotEqualTo(String value) {
            addCriterion("toaddress <>", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThan(String value) {
            addCriterion("toaddress >", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressGreaterThanOrEqualTo(String value) {
            addCriterion("toaddress >=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThan(String value) {
            addCriterion("toaddress <", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLessThanOrEqualTo(String value) {
            addCriterion("toaddress <=", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressLike(String value) {
            addCriterion("toaddress like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotLike(String value) {
            addCriterion("toaddress not like", value, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressIn(List<String> values) {
            addCriterion("toaddress in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotIn(List<String> values) {
            addCriterion("toaddress not in", values, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressBetween(String value1, String value2) {
            addCriterion("toaddress between", value1, value2, "toaddress");
            return (Criteria) this;
        }

        public Criteria andToaddressNotBetween(String value1, String value2) {
            addCriterion("toaddress not between", value1, value2, "toaddress");
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

        public Criteria andSplitedstatusIsNull() {
            addCriterion("splitedstatus is null");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusIsNotNull() {
            addCriterion("splitedstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusEqualTo(String value) {
            addCriterion("splitedstatus =", value, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusNotEqualTo(String value) {
            addCriterion("splitedstatus <>", value, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusGreaterThan(String value) {
            addCriterion("splitedstatus >", value, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusGreaterThanOrEqualTo(String value) {
            addCriterion("splitedstatus >=", value, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusLessThan(String value) {
            addCriterion("splitedstatus <", value, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusLessThanOrEqualTo(String value) {
            addCriterion("splitedstatus <=", value, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusLike(String value) {
            addCriterion("splitedstatus like", value, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusNotLike(String value) {
            addCriterion("splitedstatus not like", value, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusIn(List<String> values) {
            addCriterion("splitedstatus in", values, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusNotIn(List<String> values) {
            addCriterion("splitedstatus not in", values, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusBetween(String value1, String value2) {
            addCriterion("splitedstatus between", value1, value2, "splitedstatus");
            return (Criteria) this;
        }

        public Criteria andSplitedstatusNotBetween(String value1, String value2) {
            addCriterion("splitedstatus not between", value1, value2, "splitedstatus");
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