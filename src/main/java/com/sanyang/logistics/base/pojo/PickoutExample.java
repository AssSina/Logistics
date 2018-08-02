package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class PickoutExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PickoutExample() {
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

        public Criteria andPlanPickoutDateIsNull() {
            addCriterion("plan_pickout_date is null");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateIsNotNull() {
            addCriterion("plan_pickout_date is not null");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateEqualTo(Date value) {
            addCriterion("plan_pickout_date =", value, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateNotEqualTo(Date value) {
            addCriterion("plan_pickout_date <>", value, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateGreaterThan(Date value) {
            addCriterion("plan_pickout_date >", value, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateGreaterThanOrEqualTo(Date value) {
            addCriterion("plan_pickout_date >=", value, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateLessThan(Date value) {
            addCriterion("plan_pickout_date <", value, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateLessThanOrEqualTo(Date value) {
            addCriterion("plan_pickout_date <=", value, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateIn(List<Date> values) {
            addCriterion("plan_pickout_date in", values, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateNotIn(List<Date> values) {
            addCriterion("plan_pickout_date not in", values, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateBetween(Date value1, Date value2) {
            addCriterion("plan_pickout_date between", value1, value2, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andPlanPickoutDateNotBetween(Date value1, Date value2) {
            addCriterion("plan_pickout_date not between", value1, value2, "planPickoutDate");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNull() {
            addCriterion("status_id is null");
            return (Criteria) this;
        }

        public Criteria andStatusIdIsNotNull() {
            addCriterion("status_id is not null");
            return (Criteria) this;
        }

        public Criteria andStatusIdEqualTo(String value) {
            addCriterion("status_id =", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotEqualTo(String value) {
            addCriterion("status_id <>", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThan(String value) {
            addCriterion("status_id >", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdGreaterThanOrEqualTo(String value) {
            addCriterion("status_id >=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThan(String value) {
            addCriterion("status_id <", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLessThanOrEqualTo(String value) {
            addCriterion("status_id <=", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdLike(String value) {
            addCriterion("status_id like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotLike(String value) {
            addCriterion("status_id not like", value, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdIn(List<String> values) {
            addCriterion("status_id in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotIn(List<String> values) {
            addCriterion("status_id not in", values, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdBetween(String value1, String value2) {
            addCriterion("status_id between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andStatusIdNotBetween(String value1, String value2) {
            addCriterion("status_id not between", value1, value2, "statusId");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNull() {
            addCriterion("create_date is null");
            return (Criteria) this;
        }

        public Criteria andCreateDateIsNotNull() {
            addCriterion("create_date is not null");
            return (Criteria) this;
        }

        public Criteria andCreateDateEqualTo(Date value) {
            addCriterion("create_date =", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotEqualTo(Date value) {
            addCriterion("create_date <>", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThan(Date value) {
            addCriterion("create_date >", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("create_date >=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThan(Date value) {
            addCriterion("create_date <", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateLessThanOrEqualTo(Date value) {
            addCriterion("create_date <=", value, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateIn(List<Date> values) {
            addCriterion("create_date in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotIn(List<Date> values) {
            addCriterion("create_date not in", values, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateBetween(Date value1, Date value2) {
            addCriterion("create_date between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andCreateDateNotBetween(Date value1, Date value2) {
            addCriterion("create_date not between", value1, value2, "createDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNull() {
            addCriterion("update_date is null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIsNotNull() {
            addCriterion("update_date is not null");
            return (Criteria) this;
        }

        public Criteria andUpdateDateEqualTo(Date value) {
            addCriterion("update_date =", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotEqualTo(Date value) {
            addCriterion("update_date <>", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThan(Date value) {
            addCriterion("update_date >", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateGreaterThanOrEqualTo(Date value) {
            addCriterion("update_date >=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThan(Date value) {
            addCriterion("update_date <", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateLessThanOrEqualTo(Date value) {
            addCriterion("update_date <=", value, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateIn(List<Date> values) {
            addCriterion("update_date in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotIn(List<Date> values) {
            addCriterion("update_date not in", values, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateBetween(Date value1, Date value2) {
            addCriterion("update_date between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andUpdateDateNotBetween(Date value1, Date value2) {
            addCriterion("update_date not between", value1, value2, "updateDate");
            return (Criteria) this;
        }

        public Criteria andDoneFlagIsNull() {
            addCriterion("done_flag is null");
            return (Criteria) this;
        }

        public Criteria andDoneFlagIsNotNull() {
            addCriterion("done_flag is not null");
            return (Criteria) this;
        }

        public Criteria andDoneFlagEqualTo(String value) {
            addCriterion("done_flag =", value, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagNotEqualTo(String value) {
            addCriterion("done_flag <>", value, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagGreaterThan(String value) {
            addCriterion("done_flag >", value, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagGreaterThanOrEqualTo(String value) {
            addCriterion("done_flag >=", value, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagLessThan(String value) {
            addCriterion("done_flag <", value, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagLessThanOrEqualTo(String value) {
            addCriterion("done_flag <=", value, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagLike(String value) {
            addCriterion("done_flag like", value, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagNotLike(String value) {
            addCriterion("done_flag not like", value, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagIn(List<String> values) {
            addCriterion("done_flag in", values, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagNotIn(List<String> values) {
            addCriterion("done_flag not in", values, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagBetween(String value1, String value2) {
            addCriterion("done_flag between", value1, value2, "doneFlag");
            return (Criteria) this;
        }

        public Criteria andDoneFlagNotBetween(String value1, String value2) {
            addCriterion("done_flag not between", value1, value2, "doneFlag");
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