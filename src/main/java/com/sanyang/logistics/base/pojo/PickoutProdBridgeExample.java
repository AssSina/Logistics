package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class PickoutProdBridgeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PickoutProdBridgeExample() {
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

        public Criteria andPickoutProdIdIsNull() {
            addCriterion("pickout_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdIsNotNull() {
            addCriterion("pickout_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdEqualTo(Integer value) {
            addCriterion("pickout_prod_id =", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdNotEqualTo(Integer value) {
            addCriterion("pickout_prod_id <>", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdGreaterThan(Integer value) {
            addCriterion("pickout_prod_id >", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickout_prod_id >=", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdLessThan(Integer value) {
            addCriterion("pickout_prod_id <", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("pickout_prod_id <=", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdIn(List<Integer> values) {
            addCriterion("pickout_prod_id in", values, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdNotIn(List<Integer> values) {
            addCriterion("pickout_prod_id not in", values, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdBetween(Integer value1, Integer value2) {
            addCriterion("pickout_prod_id between", value1, value2, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pickout_prod_id not between", value1, value2, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdIsNull() {
            addCriterion("pickout_id is null");
            return (Criteria) this;
        }

        public Criteria andPickoutIdIsNotNull() {
            addCriterion("pickout_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickoutIdEqualTo(Integer value) {
            addCriterion("pickout_id =", value, "pickoutId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdNotEqualTo(Integer value) {
            addCriterion("pickout_id <>", value, "pickoutId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdGreaterThan(Integer value) {
            addCriterion("pickout_id >", value, "pickoutId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickout_id >=", value, "pickoutId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdLessThan(Integer value) {
            addCriterion("pickout_id <", value, "pickoutId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdLessThanOrEqualTo(Integer value) {
            addCriterion("pickout_id <=", value, "pickoutId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdIn(List<Integer> values) {
            addCriterion("pickout_id in", values, "pickoutId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdNotIn(List<Integer> values) {
            addCriterion("pickout_id not in", values, "pickoutId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdBetween(Integer value1, Integer value2) {
            addCriterion("pickout_id between", value1, value2, "pickoutId");
            return (Criteria) this;
        }

        public Criteria andPickoutIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pickout_id not between", value1, value2, "pickoutId");
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

        public Criteria andPreoutAmtIsNull() {
            addCriterion("preout_amt is null");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtIsNotNull() {
            addCriterion("preout_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtEqualTo(Integer value) {
            addCriterion("preout_amt =", value, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtNotEqualTo(Integer value) {
            addCriterion("preout_amt <>", value, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtGreaterThan(Integer value) {
            addCriterion("preout_amt >", value, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("preout_amt >=", value, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtLessThan(Integer value) {
            addCriterion("preout_amt <", value, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtLessThanOrEqualTo(Integer value) {
            addCriterion("preout_amt <=", value, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtIn(List<Integer> values) {
            addCriterion("preout_amt in", values, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtNotIn(List<Integer> values) {
            addCriterion("preout_amt not in", values, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtBetween(Integer value1, Integer value2) {
            addCriterion("preout_amt between", value1, value2, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andPreoutAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("preout_amt not between", value1, value2, "preoutAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtIsNull() {
            addCriterion("out_amt is null");
            return (Criteria) this;
        }

        public Criteria andOutAmtIsNotNull() {
            addCriterion("out_amt is not null");
            return (Criteria) this;
        }

        public Criteria andOutAmtEqualTo(Integer value) {
            addCriterion("out_amt =", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotEqualTo(Integer value) {
            addCriterion("out_amt <>", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtGreaterThan(Integer value) {
            addCriterion("out_amt >", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_amt >=", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtLessThan(Integer value) {
            addCriterion("out_amt <", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtLessThanOrEqualTo(Integer value) {
            addCriterion("out_amt <=", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtIn(List<Integer> values) {
            addCriterion("out_amt in", values, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotIn(List<Integer> values) {
            addCriterion("out_amt not in", values, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtBetween(Integer value1, Integer value2) {
            addCriterion("out_amt between", value1, value2, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("out_amt not between", value1, value2, "outAmt");
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