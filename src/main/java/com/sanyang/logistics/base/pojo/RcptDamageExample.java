package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class RcptDamageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public RcptDamageExample() {
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

        public Criteria andDamageidIsNull() {
            addCriterion("damageid is null");
            return (Criteria) this;
        }

        public Criteria andDamageidIsNotNull() {
            addCriterion("damageid is not null");
            return (Criteria) this;
        }

        public Criteria andDamageidEqualTo(Integer value) {
            addCriterion("damageid =", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidNotEqualTo(Integer value) {
            addCriterion("damageid <>", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidGreaterThan(Integer value) {
            addCriterion("damageid >", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidGreaterThanOrEqualTo(Integer value) {
            addCriterion("damageid >=", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidLessThan(Integer value) {
            addCriterion("damageid <", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidLessThanOrEqualTo(Integer value) {
            addCriterion("damageid <=", value, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidIn(List<Integer> values) {
            addCriterion("damageid in", values, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidNotIn(List<Integer> values) {
            addCriterion("damageid not in", values, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidBetween(Integer value1, Integer value2) {
            addCriterion("damageid between", value1, value2, "damageid");
            return (Criteria) this;
        }

        public Criteria andDamageidNotBetween(Integer value1, Integer value2) {
            addCriterion("damageid not between", value1, value2, "damageid");
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

        public Criteria andDamageDegreeIsNull() {
            addCriterion("damage_degree is null");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeIsNotNull() {
            addCriterion("damage_degree is not null");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeEqualTo(String value) {
            addCriterion("damage_degree =", value, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeNotEqualTo(String value) {
            addCriterion("damage_degree <>", value, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeGreaterThan(String value) {
            addCriterion("damage_degree >", value, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeGreaterThanOrEqualTo(String value) {
            addCriterion("damage_degree >=", value, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeLessThan(String value) {
            addCriterion("damage_degree <", value, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeLessThanOrEqualTo(String value) {
            addCriterion("damage_degree <=", value, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeLike(String value) {
            addCriterion("damage_degree like", value, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeNotLike(String value) {
            addCriterion("damage_degree not like", value, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeIn(List<String> values) {
            addCriterion("damage_degree in", values, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeNotIn(List<String> values) {
            addCriterion("damage_degree not in", values, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeBetween(String value1, String value2) {
            addCriterion("damage_degree between", value1, value2, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamageDegreeNotBetween(String value1, String value2) {
            addCriterion("damage_degree not between", value1, value2, "damageDegree");
            return (Criteria) this;
        }

        public Criteria andDamagecountIsNull() {
            addCriterion("damagecount is null");
            return (Criteria) this;
        }

        public Criteria andDamagecountIsNotNull() {
            addCriterion("damagecount is not null");
            return (Criteria) this;
        }

        public Criteria andDamagecountEqualTo(Integer value) {
            addCriterion("damagecount =", value, "damagecount");
            return (Criteria) this;
        }

        public Criteria andDamagecountNotEqualTo(Integer value) {
            addCriterion("damagecount <>", value, "damagecount");
            return (Criteria) this;
        }

        public Criteria andDamagecountGreaterThan(Integer value) {
            addCriterion("damagecount >", value, "damagecount");
            return (Criteria) this;
        }

        public Criteria andDamagecountGreaterThanOrEqualTo(Integer value) {
            addCriterion("damagecount >=", value, "damagecount");
            return (Criteria) this;
        }

        public Criteria andDamagecountLessThan(Integer value) {
            addCriterion("damagecount <", value, "damagecount");
            return (Criteria) this;
        }

        public Criteria andDamagecountLessThanOrEqualTo(Integer value) {
            addCriterion("damagecount <=", value, "damagecount");
            return (Criteria) this;
        }

        public Criteria andDamagecountIn(List<Integer> values) {
            addCriterion("damagecount in", values, "damagecount");
            return (Criteria) this;
        }

        public Criteria andDamagecountNotIn(List<Integer> values) {
            addCriterion("damagecount not in", values, "damagecount");
            return (Criteria) this;
        }

        public Criteria andDamagecountBetween(Integer value1, Integer value2) {
            addCriterion("damagecount between", value1, value2, "damagecount");
            return (Criteria) this;
        }

        public Criteria andDamagecountNotBetween(Integer value1, Integer value2) {
            addCriterion("damagecount not between", value1, value2, "damagecount");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNull() {
            addCriterion("bar_code is null");
            return (Criteria) this;
        }

        public Criteria andBarCodeIsNotNull() {
            addCriterion("bar_code is not null");
            return (Criteria) this;
        }

        public Criteria andBarCodeEqualTo(String value) {
            addCriterion("bar_code =", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotEqualTo(String value) {
            addCriterion("bar_code <>", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThan(String value) {
            addCriterion("bar_code >", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeGreaterThanOrEqualTo(String value) {
            addCriterion("bar_code >=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThan(String value) {
            addCriterion("bar_code <", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLessThanOrEqualTo(String value) {
            addCriterion("bar_code <=", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeLike(String value) {
            addCriterion("bar_code like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotLike(String value) {
            addCriterion("bar_code not like", value, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeIn(List<String> values) {
            addCriterion("bar_code in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotIn(List<String> values) {
            addCriterion("bar_code not in", values, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeBetween(String value1, String value2) {
            addCriterion("bar_code between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andBarCodeNotBetween(String value1, String value2) {
            addCriterion("bar_code not between", value1, value2, "barCode");
            return (Criteria) this;
        }

        public Criteria andPosnIsNull() {
            addCriterion("posn is null");
            return (Criteria) this;
        }

        public Criteria andPosnIsNotNull() {
            addCriterion("posn is not null");
            return (Criteria) this;
        }

        public Criteria andPosnEqualTo(String value) {
            addCriterion("posn =", value, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnNotEqualTo(String value) {
            addCriterion("posn <>", value, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnGreaterThan(String value) {
            addCriterion("posn >", value, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnGreaterThanOrEqualTo(String value) {
            addCriterion("posn >=", value, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnLessThan(String value) {
            addCriterion("posn <", value, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnLessThanOrEqualTo(String value) {
            addCriterion("posn <=", value, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnLike(String value) {
            addCriterion("posn like", value, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnNotLike(String value) {
            addCriterion("posn not like", value, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnIn(List<String> values) {
            addCriterion("posn in", values, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnNotIn(List<String> values) {
            addCriterion("posn not in", values, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnBetween(String value1, String value2) {
            addCriterion("posn between", value1, value2, "posn");
            return (Criteria) this;
        }

        public Criteria andPosnNotBetween(String value1, String value2) {
            addCriterion("posn not between", value1, value2, "posn");
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