package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class PackageorderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PackageorderExample() {
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

        public Criteria andOrderIdIsNull() {
            addCriterion("order_id is null");
            return (Criteria) this;
        }

        public Criteria andOrderIdIsNotNull() {
            addCriterion("order_id is not null");
            return (Criteria) this;
        }

        public Criteria andOrderIdEqualTo(Integer value) {
            addCriterion("order_id =", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotEqualTo(Integer value) {
            addCriterion("order_id <>", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThan(Integer value) {
            addCriterion("order_id >", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("order_id >=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThan(Integer value) {
            addCriterion("order_id <", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdLessThanOrEqualTo(Integer value) {
            addCriterion("order_id <=", value, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdIn(List<Integer> values) {
            addCriterion("order_id in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotIn(List<Integer> values) {
            addCriterion("order_id not in", values, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdBetween(Integer value1, Integer value2) {
            addCriterion("order_id between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andOrderIdNotBetween(Integer value1, Integer value2) {
            addCriterion("order_id not between", value1, value2, "orderId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdIsNull() {
            addCriterion("direction_id is null");
            return (Criteria) this;
        }

        public Criteria andDirectionIdIsNotNull() {
            addCriterion("direction_id is not null");
            return (Criteria) this;
        }

        public Criteria andDirectionIdEqualTo(Integer value) {
            addCriterion("direction_id =", value, "directionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdNotEqualTo(Integer value) {
            addCriterion("direction_id <>", value, "directionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdGreaterThan(Integer value) {
            addCriterion("direction_id >", value, "directionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("direction_id >=", value, "directionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdLessThan(Integer value) {
            addCriterion("direction_id <", value, "directionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdLessThanOrEqualTo(Integer value) {
            addCriterion("direction_id <=", value, "directionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdIn(List<Integer> values) {
            addCriterion("direction_id in", values, "directionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdNotIn(List<Integer> values) {
            addCriterion("direction_id not in", values, "directionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdBetween(Integer value1, Integer value2) {
            addCriterion("direction_id between", value1, value2, "directionId");
            return (Criteria) this;
        }

        public Criteria andDirectionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("direction_id not between", value1, value2, "directionId");
            return (Criteria) this;
        }

        public Criteria andWhIdIsNull() {
            addCriterion("wh_id is null");
            return (Criteria) this;
        }

        public Criteria andWhIdIsNotNull() {
            addCriterion("wh_id is not null");
            return (Criteria) this;
        }

        public Criteria andWhIdEqualTo(Integer value) {
            addCriterion("wh_id =", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotEqualTo(Integer value) {
            addCriterion("wh_id <>", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThan(Integer value) {
            addCriterion("wh_id >", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("wh_id >=", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThan(Integer value) {
            addCriterion("wh_id <", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdLessThanOrEqualTo(Integer value) {
            addCriterion("wh_id <=", value, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdIn(List<Integer> values) {
            addCriterion("wh_id in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotIn(List<Integer> values) {
            addCriterion("wh_id not in", values, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdBetween(Integer value1, Integer value2) {
            addCriterion("wh_id between", value1, value2, "whId");
            return (Criteria) this;
        }

        public Criteria andWhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("wh_id not between", value1, value2, "whId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdIsNull() {
            addCriterion("cust_package_id is null");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdIsNotNull() {
            addCriterion("cust_package_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdEqualTo(Integer value) {
            addCriterion("cust_package_id =", value, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdNotEqualTo(Integer value) {
            addCriterion("cust_package_id <>", value, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdGreaterThan(Integer value) {
            addCriterion("cust_package_id >", value, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_package_id >=", value, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdLessThan(Integer value) {
            addCriterion("cust_package_id <", value, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_package_id <=", value, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdIn(List<Integer> values) {
            addCriterion("cust_package_id in", values, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdNotIn(List<Integer> values) {
            addCriterion("cust_package_id not in", values, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_package_id between", value1, value2, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andCustPackageIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_package_id not between", value1, value2, "custPackageId");
            return (Criteria) this;
        }

        public Criteria andPackageAmtIsNull() {
            addCriterion("package_amt is null");
            return (Criteria) this;
        }

        public Criteria andPackageAmtIsNotNull() {
            addCriterion("package_amt is not null");
            return (Criteria) this;
        }

        public Criteria andPackageAmtEqualTo(Integer value) {
            addCriterion("package_amt =", value, "packageAmt");
            return (Criteria) this;
        }

        public Criteria andPackageAmtNotEqualTo(Integer value) {
            addCriterion("package_amt <>", value, "packageAmt");
            return (Criteria) this;
        }

        public Criteria andPackageAmtGreaterThan(Integer value) {
            addCriterion("package_amt >", value, "packageAmt");
            return (Criteria) this;
        }

        public Criteria andPackageAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("package_amt >=", value, "packageAmt");
            return (Criteria) this;
        }

        public Criteria andPackageAmtLessThan(Integer value) {
            addCriterion("package_amt <", value, "packageAmt");
            return (Criteria) this;
        }

        public Criteria andPackageAmtLessThanOrEqualTo(Integer value) {
            addCriterion("package_amt <=", value, "packageAmt");
            return (Criteria) this;
        }

        public Criteria andPackageAmtIn(List<Integer> values) {
            addCriterion("package_amt in", values, "packageAmt");
            return (Criteria) this;
        }

        public Criteria andPackageAmtNotIn(List<Integer> values) {
            addCriterion("package_amt not in", values, "packageAmt");
            return (Criteria) this;
        }

        public Criteria andPackageAmtBetween(Integer value1, Integer value2) {
            addCriterion("package_amt between", value1, value2, "packageAmt");
            return (Criteria) this;
        }

        public Criteria andPackageAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("package_amt not between", value1, value2, "packageAmt");
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