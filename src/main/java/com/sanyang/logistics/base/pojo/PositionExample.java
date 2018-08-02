package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class PositionExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PositionExample() {
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

        public Criteria andPosnIdIsNull() {
            addCriterion("posn_id is null");
            return (Criteria) this;
        }

        public Criteria andPosnIdIsNotNull() {
            addCriterion("posn_id is not null");
            return (Criteria) this;
        }

        public Criteria andPosnIdEqualTo(Integer value) {
            addCriterion("posn_id =", value, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnIdNotEqualTo(Integer value) {
            addCriterion("posn_id <>", value, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnIdGreaterThan(Integer value) {
            addCriterion("posn_id >", value, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("posn_id >=", value, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnIdLessThan(Integer value) {
            addCriterion("posn_id <", value, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnIdLessThanOrEqualTo(Integer value) {
            addCriterion("posn_id <=", value, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnIdIn(List<Integer> values) {
            addCriterion("posn_id in", values, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnIdNotIn(List<Integer> values) {
            addCriterion("posn_id not in", values, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnIdBetween(Integer value1, Integer value2) {
            addCriterion("posn_id between", value1, value2, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnIdNotBetween(Integer value1, Integer value2) {
            addCriterion("posn_id not between", value1, value2, "posnId");
            return (Criteria) this;
        }

        public Criteria andPosnCodeIsNull() {
            addCriterion("posn_code is null");
            return (Criteria) this;
        }

        public Criteria andPosnCodeIsNotNull() {
            addCriterion("posn_code is not null");
            return (Criteria) this;
        }

        public Criteria andPosnCodeEqualTo(String value) {
            addCriterion("posn_code =", value, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeNotEqualTo(String value) {
            addCriterion("posn_code <>", value, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeGreaterThan(String value) {
            addCriterion("posn_code >", value, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeGreaterThanOrEqualTo(String value) {
            addCriterion("posn_code >=", value, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeLessThan(String value) {
            addCriterion("posn_code <", value, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeLessThanOrEqualTo(String value) {
            addCriterion("posn_code <=", value, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeLike(String value) {
            addCriterion("posn_code like", value, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeNotLike(String value) {
            addCriterion("posn_code not like", value, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeIn(List<String> values) {
            addCriterion("posn_code in", values, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeNotIn(List<String> values) {
            addCriterion("posn_code not in", values, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeBetween(String value1, String value2) {
            addCriterion("posn_code between", value1, value2, "posnCode");
            return (Criteria) this;
        }

        public Criteria andPosnCodeNotBetween(String value1, String value2) {
            addCriterion("posn_code not between", value1, value2, "posnCode");
            return (Criteria) this;
        }

        public Criteria andShelfIdIsNull() {
            addCriterion("shelf_id is null");
            return (Criteria) this;
        }

        public Criteria andShelfIdIsNotNull() {
            addCriterion("shelf_id is not null");
            return (Criteria) this;
        }

        public Criteria andShelfIdEqualTo(Integer value) {
            addCriterion("shelf_id =", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotEqualTo(Integer value) {
            addCriterion("shelf_id <>", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdGreaterThan(Integer value) {
            addCriterion("shelf_id >", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("shelf_id >=", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdLessThan(Integer value) {
            addCriterion("shelf_id <", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdLessThanOrEqualTo(Integer value) {
            addCriterion("shelf_id <=", value, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdIn(List<Integer> values) {
            addCriterion("shelf_id in", values, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotIn(List<Integer> values) {
            addCriterion("shelf_id not in", values, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdBetween(Integer value1, Integer value2) {
            addCriterion("shelf_id between", value1, value2, "shelfId");
            return (Criteria) this;
        }

        public Criteria andShelfIdNotBetween(Integer value1, Integer value2) {
            addCriterion("shelf_id not between", value1, value2, "shelfId");
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

        public Criteria andPosnNoIsNull() {
            addCriterion("posn_no is null");
            return (Criteria) this;
        }

        public Criteria andPosnNoIsNotNull() {
            addCriterion("posn_no is not null");
            return (Criteria) this;
        }

        public Criteria andPosnNoEqualTo(String value) {
            addCriterion("posn_no =", value, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoNotEqualTo(String value) {
            addCriterion("posn_no <>", value, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoGreaterThan(String value) {
            addCriterion("posn_no >", value, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoGreaterThanOrEqualTo(String value) {
            addCriterion("posn_no >=", value, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoLessThan(String value) {
            addCriterion("posn_no <", value, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoLessThanOrEqualTo(String value) {
            addCriterion("posn_no <=", value, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoLike(String value) {
            addCriterion("posn_no like", value, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoNotLike(String value) {
            addCriterion("posn_no not like", value, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoIn(List<String> values) {
            addCriterion("posn_no in", values, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoNotIn(List<String> values) {
            addCriterion("posn_no not in", values, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoBetween(String value1, String value2) {
            addCriterion("posn_no between", value1, value2, "posnNo");
            return (Criteria) this;
        }

        public Criteria andPosnNoNotBetween(String value1, String value2) {
            addCriterion("posn_no not between", value1, value2, "posnNo");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNull() {
            addCriterion("capacity is null");
            return (Criteria) this;
        }

        public Criteria andCapacityIsNotNull() {
            addCriterion("capacity is not null");
            return (Criteria) this;
        }

        public Criteria andCapacityEqualTo(Integer value) {
            addCriterion("capacity =", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotEqualTo(Integer value) {
            addCriterion("capacity <>", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThan(Integer value) {
            addCriterion("capacity >", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("capacity >=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThan(Integer value) {
            addCriterion("capacity <", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("capacity <=", value, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityIn(List<Integer> values) {
            addCriterion("capacity in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotIn(List<Integer> values) {
            addCriterion("capacity not in", values, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityBetween(Integer value1, Integer value2) {
            addCriterion("capacity between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("capacity not between", value1, value2, "capacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityIsNull() {
            addCriterion("available_capacity is null");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityIsNotNull() {
            addCriterion("available_capacity is not null");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityEqualTo(Integer value) {
            addCriterion("available_capacity =", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityNotEqualTo(Integer value) {
            addCriterion("available_capacity <>", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityGreaterThan(Integer value) {
            addCriterion("available_capacity >", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityGreaterThanOrEqualTo(Integer value) {
            addCriterion("available_capacity >=", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityLessThan(Integer value) {
            addCriterion("available_capacity <", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityLessThanOrEqualTo(Integer value) {
            addCriterion("available_capacity <=", value, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityIn(List<Integer> values) {
            addCriterion("available_capacity in", values, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityNotIn(List<Integer> values) {
            addCriterion("available_capacity not in", values, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityBetween(Integer value1, Integer value2) {
            addCriterion("available_capacity between", value1, value2, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andAvailableCapacityNotBetween(Integer value1, Integer value2) {
            addCriterion("available_capacity not between", value1, value2, "availableCapacity");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtIsNull() {
            addCriterion("occupy_amt is null");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtIsNotNull() {
            addCriterion("occupy_amt is not null");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtEqualTo(Integer value) {
            addCriterion("occupy_amt =", value, "occupyAmt");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtNotEqualTo(Integer value) {
            addCriterion("occupy_amt <>", value, "occupyAmt");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtGreaterThan(Integer value) {
            addCriterion("occupy_amt >", value, "occupyAmt");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("occupy_amt >=", value, "occupyAmt");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtLessThan(Integer value) {
            addCriterion("occupy_amt <", value, "occupyAmt");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtLessThanOrEqualTo(Integer value) {
            addCriterion("occupy_amt <=", value, "occupyAmt");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtIn(List<Integer> values) {
            addCriterion("occupy_amt in", values, "occupyAmt");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtNotIn(List<Integer> values) {
            addCriterion("occupy_amt not in", values, "occupyAmt");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtBetween(Integer value1, Integer value2) {
            addCriterion("occupy_amt between", value1, value2, "occupyAmt");
            return (Criteria) this;
        }

        public Criteria andOccupyAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("occupy_amt not between", value1, value2, "occupyAmt");
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