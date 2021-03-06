package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class CustomerOrdertypeExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomerOrdertypeExample() {
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

        public Criteria andCustOrdertypeIdIsNull() {
            addCriterion("cust_ordertype_id is null");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdIsNotNull() {
            addCriterion("cust_ordertype_id is not null");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdEqualTo(Integer value) {
            addCriterion("cust_ordertype_id =", value, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdNotEqualTo(Integer value) {
            addCriterion("cust_ordertype_id <>", value, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdGreaterThan(Integer value) {
            addCriterion("cust_ordertype_id >", value, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("cust_ordertype_id >=", value, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdLessThan(Integer value) {
            addCriterion("cust_ordertype_id <", value, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("cust_ordertype_id <=", value, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdIn(List<Integer> values) {
            addCriterion("cust_ordertype_id in", values, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdNotIn(List<Integer> values) {
            addCriterion("cust_ordertype_id not in", values, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdBetween(Integer value1, Integer value2) {
            addCriterion("cust_ordertype_id between", value1, value2, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCustOrdertypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("cust_ordertype_id not between", value1, value2, "custOrdertypeId");
            return (Criteria) this;
        }

        public Criteria andCidIsNull() {
            addCriterion("cid is null");
            return (Criteria) this;
        }

        public Criteria andCidIsNotNull() {
            addCriterion("cid is not null");
            return (Criteria) this;
        }

        public Criteria andCidEqualTo(Integer value) {
            addCriterion("cid =", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotEqualTo(Integer value) {
            addCriterion("cid <>", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThan(Integer value) {
            addCriterion("cid >", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidGreaterThanOrEqualTo(Integer value) {
            addCriterion("cid >=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThan(Integer value) {
            addCriterion("cid <", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidLessThanOrEqualTo(Integer value) {
            addCriterion("cid <=", value, "cid");
            return (Criteria) this;
        }

        public Criteria andCidIn(List<Integer> values) {
            addCriterion("cid in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotIn(List<Integer> values) {
            addCriterion("cid not in", values, "cid");
            return (Criteria) this;
        }

        public Criteria andCidBetween(Integer value1, Integer value2) {
            addCriterion("cid between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andCidNotBetween(Integer value1, Integer value2) {
            addCriterion("cid not between", value1, value2, "cid");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdIsNull() {
            addCriterion("sysordertype_id is null");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdIsNotNull() {
            addCriterion("sysordertype_id is not null");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdEqualTo(Integer value) {
            addCriterion("sysordertype_id =", value, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdNotEqualTo(Integer value) {
            addCriterion("sysordertype_id <>", value, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdGreaterThan(Integer value) {
            addCriterion("sysordertype_id >", value, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sysordertype_id >=", value, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdLessThan(Integer value) {
            addCriterion("sysordertype_id <", value, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sysordertype_id <=", value, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdIn(List<Integer> values) {
            addCriterion("sysordertype_id in", values, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdNotIn(List<Integer> values) {
            addCriterion("sysordertype_id not in", values, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sysordertype_id between", value1, value2, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andSysordertypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sysordertype_id not between", value1, value2, "sysordertypeId");
            return (Criteria) this;
        }

        public Criteria andNameIsNull() {
            addCriterion("name is null");
            return (Criteria) this;
        }

        public Criteria andNameIsNotNull() {
            addCriterion("name is not null");
            return (Criteria) this;
        }

        public Criteria andNameEqualTo(Integer value) {
            addCriterion("name =", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotEqualTo(Integer value) {
            addCriterion("name <>", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThan(Integer value) {
            addCriterion("name >", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameGreaterThanOrEqualTo(Integer value) {
            addCriterion("name >=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThan(Integer value) {
            addCriterion("name <", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameLessThanOrEqualTo(Integer value) {
            addCriterion("name <=", value, "name");
            return (Criteria) this;
        }

        public Criteria andNameIn(List<Integer> values) {
            addCriterion("name in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotIn(List<Integer> values) {
            addCriterion("name not in", values, "name");
            return (Criteria) this;
        }

        public Criteria andNameBetween(Integer value1, Integer value2) {
            addCriterion("name between", value1, value2, "name");
            return (Criteria) this;
        }

        public Criteria andNameNotBetween(Integer value1, Integer value2) {
            addCriterion("name not between", value1, value2, "name");
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