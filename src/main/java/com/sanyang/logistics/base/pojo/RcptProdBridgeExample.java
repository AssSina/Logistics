package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class RcptProdBridgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RcptProdBridgeExample() {
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

        public Criteria andRcptProdIdIsNull() {
            addCriterion("rcpt_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdIsNotNull() {
            addCriterion("rcpt_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdEqualTo(Integer value) {
            addCriterion("rcpt_prod_id =", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdNotEqualTo(Integer value) {
            addCriterion("rcpt_prod_id <>", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdGreaterThan(Integer value) {
            addCriterion("rcpt_prod_id >", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcpt_prod_id >=", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdLessThan(Integer value) {
            addCriterion("rcpt_prod_id <", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("rcpt_prod_id <=", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdIn(List<Integer> values) {
            addCriterion("rcpt_prod_id in", values, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdNotIn(List<Integer> values) {
            addCriterion("rcpt_prod_id not in", values, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdBetween(Integer value1, Integer value2) {
            addCriterion("rcpt_prod_id between", value1, value2, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rcpt_prod_id not between", value1, value2, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptIdIsNull() {
            addCriterion("rcpt_id is null");
            return (Criteria) this;
        }

        public Criteria andRcptIdIsNotNull() {
            addCriterion("rcpt_id is not null");
            return (Criteria) this;
        }

        public Criteria andRcptIdEqualTo(Integer value) {
            addCriterion("rcpt_id =", value, "rcptId");
            return (Criteria) this;
        }

        public Criteria andRcptIdNotEqualTo(Integer value) {
            addCriterion("rcpt_id <>", value, "rcptId");
            return (Criteria) this;
        }

        public Criteria andRcptIdGreaterThan(Integer value) {
            addCriterion("rcpt_id >", value, "rcptId");
            return (Criteria) this;
        }

        public Criteria andRcptIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcpt_id >=", value, "rcptId");
            return (Criteria) this;
        }

        public Criteria andRcptIdLessThan(Integer value) {
            addCriterion("rcpt_id <", value, "rcptId");
            return (Criteria) this;
        }

        public Criteria andRcptIdLessThanOrEqualTo(Integer value) {
            addCriterion("rcpt_id <=", value, "rcptId");
            return (Criteria) this;
        }

        public Criteria andRcptIdIn(List<Integer> values) {
            addCriterion("rcpt_id in", values, "rcptId");
            return (Criteria) this;
        }

        public Criteria andRcptIdNotIn(List<Integer> values) {
            addCriterion("rcpt_id not in", values, "rcptId");
            return (Criteria) this;
        }

        public Criteria andRcptIdBetween(Integer value1, Integer value2) {
            addCriterion("rcpt_id between", value1, value2, "rcptId");
            return (Criteria) this;
        }

        public Criteria andRcptIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rcpt_id not between", value1, value2, "rcptId");
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

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
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

        public Criteria andIncountIsNull() {
            addCriterion("incount is null");
            return (Criteria) this;
        }

        public Criteria andIncountIsNotNull() {
            addCriterion("incount is not null");
            return (Criteria) this;
        }

        public Criteria andIncountEqualTo(Integer value) {
            addCriterion("incount =", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountNotEqualTo(Integer value) {
            addCriterion("incount <>", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountGreaterThan(Integer value) {
            addCriterion("incount >", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountGreaterThanOrEqualTo(Integer value) {
            addCriterion("incount >=", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountLessThan(Integer value) {
            addCriterion("incount <", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountLessThanOrEqualTo(Integer value) {
            addCriterion("incount <=", value, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountIn(List<Integer> values) {
            addCriterion("incount in", values, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountNotIn(List<Integer> values) {
            addCriterion("incount not in", values, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountBetween(Integer value1, Integer value2) {
            addCriterion("incount between", value1, value2, "incount");
            return (Criteria) this;
        }

        public Criteria andIncountNotBetween(Integer value1, Integer value2) {
            addCriterion("incount not between", value1, value2, "incount");
            return (Criteria) this;
        }

        public Criteria andLostcountIsNull() {
            addCriterion("lostcount is null");
            return (Criteria) this;
        }

        public Criteria andLostcountIsNotNull() {
            addCriterion("lostcount is not null");
            return (Criteria) this;
        }

        public Criteria andLostcountEqualTo(Integer value) {
            addCriterion("lostcount =", value, "lostcount");
            return (Criteria) this;
        }

        public Criteria andLostcountNotEqualTo(Integer value) {
            addCriterion("lostcount <>", value, "lostcount");
            return (Criteria) this;
        }

        public Criteria andLostcountGreaterThan(Integer value) {
            addCriterion("lostcount >", value, "lostcount");
            return (Criteria) this;
        }

        public Criteria andLostcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("lostcount >=", value, "lostcount");
            return (Criteria) this;
        }

        public Criteria andLostcountLessThan(Integer value) {
            addCriterion("lostcount <", value, "lostcount");
            return (Criteria) this;
        }

        public Criteria andLostcountLessThanOrEqualTo(Integer value) {
            addCriterion("lostcount <=", value, "lostcount");
            return (Criteria) this;
        }

        public Criteria andLostcountIn(List<Integer> values) {
            addCriterion("lostcount in", values, "lostcount");
            return (Criteria) this;
        }

        public Criteria andLostcountNotIn(List<Integer> values) {
            addCriterion("lostcount not in", values, "lostcount");
            return (Criteria) this;
        }

        public Criteria andLostcountBetween(Integer value1, Integer value2) {
            addCriterion("lostcount between", value1, value2, "lostcount");
            return (Criteria) this;
        }

        public Criteria andLostcountNotBetween(Integer value1, Integer value2) {
            addCriterion("lostcount not between", value1, value2, "lostcount");
            return (Criteria) this;
        }

        public Criteria andDestorycountIsNull() {
            addCriterion("destorycount is null");
            return (Criteria) this;
        }

        public Criteria andDestorycountIsNotNull() {
            addCriterion("destorycount is not null");
            return (Criteria) this;
        }

        public Criteria andDestorycountEqualTo(Integer value) {
            addCriterion("destorycount =", value, "destorycount");
            return (Criteria) this;
        }

        public Criteria andDestorycountNotEqualTo(Integer value) {
            addCriterion("destorycount <>", value, "destorycount");
            return (Criteria) this;
        }

        public Criteria andDestorycountGreaterThan(Integer value) {
            addCriterion("destorycount >", value, "destorycount");
            return (Criteria) this;
        }

        public Criteria andDestorycountGreaterThanOrEqualTo(Integer value) {
            addCriterion("destorycount >=", value, "destorycount");
            return (Criteria) this;
        }

        public Criteria andDestorycountLessThan(Integer value) {
            addCriterion("destorycount <", value, "destorycount");
            return (Criteria) this;
        }

        public Criteria andDestorycountLessThanOrEqualTo(Integer value) {
            addCriterion("destorycount <=", value, "destorycount");
            return (Criteria) this;
        }

        public Criteria andDestorycountIn(List<Integer> values) {
            addCriterion("destorycount in", values, "destorycount");
            return (Criteria) this;
        }

        public Criteria andDestorycountNotIn(List<Integer> values) {
            addCriterion("destorycount not in", values, "destorycount");
            return (Criteria) this;
        }

        public Criteria andDestorycountBetween(Integer value1, Integer value2) {
            addCriterion("destorycount between", value1, value2, "destorycount");
            return (Criteria) this;
        }

        public Criteria andDestorycountNotBetween(Integer value1, Integer value2) {
            addCriterion("destorycount not between", value1, value2, "destorycount");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdIsNull() {
            addCriterion("backup_area_id is null");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdIsNotNull() {
            addCriterion("backup_area_id is not null");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdEqualTo(Integer value) {
            addCriterion("backup_area_id =", value, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdNotEqualTo(Integer value) {
            addCriterion("backup_area_id <>", value, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdGreaterThan(Integer value) {
            addCriterion("backup_area_id >", value, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("backup_area_id >=", value, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdLessThan(Integer value) {
            addCriterion("backup_area_id <", value, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdLessThanOrEqualTo(Integer value) {
            addCriterion("backup_area_id <=", value, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdIn(List<Integer> values) {
            addCriterion("backup_area_id in", values, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdNotIn(List<Integer> values) {
            addCriterion("backup_area_id not in", values, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdBetween(Integer value1, Integer value2) {
            addCriterion("backup_area_id between", value1, value2, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andBackupAreaIdNotBetween(Integer value1, Integer value2) {
            addCriterion("backup_area_id not between", value1, value2, "backupAreaId");
            return (Criteria) this;
        }

        public Criteria andPreinAmtIsNull() {
            addCriterion("prein_amt is null");
            return (Criteria) this;
        }

        public Criteria andPreinAmtIsNotNull() {
            addCriterion("prein_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPreinAmtEqualTo(Integer value) {
            addCriterion("prein_amt =", value, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andPreinAmtNotEqualTo(Integer value) {
            addCriterion("prein_amt <>", value, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andPreinAmtGreaterThan(Integer value) {
            addCriterion("prein_amt >", value, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andPreinAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("prein_amt >=", value, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andPreinAmtLessThan(Integer value) {
            addCriterion("prein_amt <", value, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andPreinAmtLessThanOrEqualTo(Integer value) {
            addCriterion("prein_amt <=", value, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andPreinAmtIn(List<Integer> values) {
            addCriterion("prein_amt in", values, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andPreinAmtNotIn(List<Integer> values) {
            addCriterion("prein_amt not in", values, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andPreinAmtBetween(Integer value1, Integer value2) {
            addCriterion("prein_amt between", value1, value2, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andPreinAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("prein_amt not between", value1, value2, "preinAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtIsNull() {
            addCriterion("in_amt is null");
            return (Criteria) this;
        }

        public Criteria andInAmtIsNotNull() {
            addCriterion("in_amt is not null");
            return (Criteria) this;
        }

        public Criteria andInAmtEqualTo(Integer value) {
            addCriterion("in_amt =", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtNotEqualTo(Integer value) {
            addCriterion("in_amt <>", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtGreaterThan(Integer value) {
            addCriterion("in_amt >", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_amt >=", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtLessThan(Integer value) {
            addCriterion("in_amt <", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtLessThanOrEqualTo(Integer value) {
            addCriterion("in_amt <=", value, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtIn(List<Integer> values) {
            addCriterion("in_amt in", values, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtNotIn(List<Integer> values) {
            addCriterion("in_amt not in", values, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtBetween(Integer value1, Integer value2) {
            addCriterion("in_amt between", value1, value2, "inAmt");
            return (Criteria) this;
        }

        public Criteria andInAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("in_amt not between", value1, value2, "inAmt");
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