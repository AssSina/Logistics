package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class WorkOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public WorkOrderExample() {
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

        public Criteria andWorkidIsNull() {
            addCriterion("workid is null");
            return (Criteria) this;
        }

        public Criteria andWorkidIsNotNull() {
            addCriterion("workid is not null");
            return (Criteria) this;
        }

        public Criteria andWorkidEqualTo(Integer value) {
            addCriterion("workid =", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotEqualTo(Integer value) {
            addCriterion("workid <>", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThan(Integer value) {
            addCriterion("workid >", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidGreaterThanOrEqualTo(Integer value) {
            addCriterion("workid >=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThan(Integer value) {
            addCriterion("workid <", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidLessThanOrEqualTo(Integer value) {
            addCriterion("workid <=", value, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidIn(List<Integer> values) {
            addCriterion("workid in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotIn(List<Integer> values) {
            addCriterion("workid not in", values, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidBetween(Integer value1, Integer value2) {
            addCriterion("workid between", value1, value2, "workid");
            return (Criteria) this;
        }

        public Criteria andWorkidNotBetween(Integer value1, Integer value2) {
            addCriterion("workid not between", value1, value2, "workid");
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

        public Criteria andFromWhIdIsNull() {
            addCriterion("from_wh_id is null");
            return (Criteria) this;
        }

        public Criteria andFromWhIdIsNotNull() {
            addCriterion("from_wh_id is not null");
            return (Criteria) this;
        }

        public Criteria andFromWhIdEqualTo(Integer value) {
            addCriterion("from_wh_id =", value, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andFromWhIdNotEqualTo(Integer value) {
            addCriterion("from_wh_id <>", value, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andFromWhIdGreaterThan(Integer value) {
            addCriterion("from_wh_id >", value, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andFromWhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("from_wh_id >=", value, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andFromWhIdLessThan(Integer value) {
            addCriterion("from_wh_id <", value, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andFromWhIdLessThanOrEqualTo(Integer value) {
            addCriterion("from_wh_id <=", value, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andFromWhIdIn(List<Integer> values) {
            addCriterion("from_wh_id in", values, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andFromWhIdNotIn(List<Integer> values) {
            addCriterion("from_wh_id not in", values, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andFromWhIdBetween(Integer value1, Integer value2) {
            addCriterion("from_wh_id between", value1, value2, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andFromWhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("from_wh_id not between", value1, value2, "fromWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdIsNull() {
            addCriterion("to_wh_id is null");
            return (Criteria) this;
        }

        public Criteria andToWhIdIsNotNull() {
            addCriterion("to_wh_id is not null");
            return (Criteria) this;
        }

        public Criteria andToWhIdEqualTo(Integer value) {
            addCriterion("to_wh_id =", value, "toWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdNotEqualTo(Integer value) {
            addCriterion("to_wh_id <>", value, "toWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdGreaterThan(Integer value) {
            addCriterion("to_wh_id >", value, "toWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("to_wh_id >=", value, "toWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdLessThan(Integer value) {
            addCriterion("to_wh_id <", value, "toWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdLessThanOrEqualTo(Integer value) {
            addCriterion("to_wh_id <=", value, "toWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdIn(List<Integer> values) {
            addCriterion("to_wh_id in", values, "toWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdNotIn(List<Integer> values) {
            addCriterion("to_wh_id not in", values, "toWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdBetween(Integer value1, Integer value2) {
            addCriterion("to_wh_id between", value1, value2, "toWhId");
            return (Criteria) this;
        }

        public Criteria andToWhIdNotBetween(Integer value1, Integer value2) {
            addCriterion("to_wh_id not between", value1, value2, "toWhId");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagIsNull() {
            addCriterion("trnspt_flag is null");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagIsNotNull() {
            addCriterion("trnspt_flag is not null");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagEqualTo(String value) {
            addCriterion("trnspt_flag =", value, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagNotEqualTo(String value) {
            addCriterion("trnspt_flag <>", value, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagGreaterThan(String value) {
            addCriterion("trnspt_flag >", value, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagGreaterThanOrEqualTo(String value) {
            addCriterion("trnspt_flag >=", value, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagLessThan(String value) {
            addCriterion("trnspt_flag <", value, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagLessThanOrEqualTo(String value) {
            addCriterion("trnspt_flag <=", value, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagLike(String value) {
            addCriterion("trnspt_flag like", value, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagNotLike(String value) {
            addCriterion("trnspt_flag not like", value, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagIn(List<String> values) {
            addCriterion("trnspt_flag in", values, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagNotIn(List<String> values) {
            addCriterion("trnspt_flag not in", values, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagBetween(String value1, String value2) {
            addCriterion("trnspt_flag between", value1, value2, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptFlagNotBetween(String value1, String value2) {
            addCriterion("trnspt_flag not between", value1, value2, "trnsptFlag");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdIsNull() {
            addCriterion("trnspt_type_id is null");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdIsNotNull() {
            addCriterion("trnspt_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdEqualTo(Integer value) {
            addCriterion("trnspt_type_id =", value, "trnsptTypeId");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdNotEqualTo(Integer value) {
            addCriterion("trnspt_type_id <>", value, "trnsptTypeId");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdGreaterThan(Integer value) {
            addCriterion("trnspt_type_id >", value, "trnsptTypeId");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("trnspt_type_id >=", value, "trnsptTypeId");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdLessThan(Integer value) {
            addCriterion("trnspt_type_id <", value, "trnsptTypeId");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("trnspt_type_id <=", value, "trnsptTypeId");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdIn(List<Integer> values) {
            addCriterion("trnspt_type_id in", values, "trnsptTypeId");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdNotIn(List<Integer> values) {
            addCriterion("trnspt_type_id not in", values, "trnsptTypeId");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("trnspt_type_id between", value1, value2, "trnsptTypeId");
            return (Criteria) this;
        }

        public Criteria andTrnsptTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("trnspt_type_id not between", value1, value2, "trnsptTypeId");
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

        public Criteria andSendtimeIsNull() {
            addCriterion("sendtime is null");
            return (Criteria) this;
        }

        public Criteria andSendtimeIsNotNull() {
            addCriterion("sendtime is not null");
            return (Criteria) this;
        }

        public Criteria andSendtimeEqualTo(Date value) {
            addCriterion("sendtime =", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotEqualTo(Date value) {
            addCriterion("sendtime <>", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThan(Date value) {
            addCriterion("sendtime >", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeGreaterThanOrEqualTo(Date value) {
            addCriterion("sendtime >=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThan(Date value) {
            addCriterion("sendtime <", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeLessThanOrEqualTo(Date value) {
            addCriterion("sendtime <=", value, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeIn(List<Date> values) {
            addCriterion("sendtime in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotIn(List<Date> values) {
            addCriterion("sendtime not in", values, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeBetween(Date value1, Date value2) {
            addCriterion("sendtime between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andSendtimeNotBetween(Date value1, Date value2) {
            addCriterion("sendtime not between", value1, value2, "sendtime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNull() {
            addCriterion("arrivetime is null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIsNotNull() {
            addCriterion("arrivetime is not null");
            return (Criteria) this;
        }

        public Criteria andArrivetimeEqualTo(Date value) {
            addCriterion("arrivetime =", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotEqualTo(Date value) {
            addCriterion("arrivetime <>", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThan(Date value) {
            addCriterion("arrivetime >", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeGreaterThanOrEqualTo(Date value) {
            addCriterion("arrivetime >=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThan(Date value) {
            addCriterion("arrivetime <", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeLessThanOrEqualTo(Date value) {
            addCriterion("arrivetime <=", value, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeIn(List<Date> values) {
            addCriterion("arrivetime in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotIn(List<Date> values) {
            addCriterion("arrivetime not in", values, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeBetween(Date value1, Date value2) {
            addCriterion("arrivetime between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andArrivetimeNotBetween(Date value1, Date value2) {
            addCriterion("arrivetime not between", value1, value2, "arrivetime");
            return (Criteria) this;
        }

        public Criteria andProductcountIsNull() {
            addCriterion("productcount is null");
            return (Criteria) this;
        }

        public Criteria andProductcountIsNotNull() {
            addCriterion("productcount is not null");
            return (Criteria) this;
        }

        public Criteria andProductcountEqualTo(Integer value) {
            addCriterion("productcount =", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotEqualTo(Integer value) {
            addCriterion("productcount <>", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountGreaterThan(Integer value) {
            addCriterion("productcount >", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("productcount >=", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountLessThan(Integer value) {
            addCriterion("productcount <", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountLessThanOrEqualTo(Integer value) {
            addCriterion("productcount <=", value, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountIn(List<Integer> values) {
            addCriterion("productcount in", values, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotIn(List<Integer> values) {
            addCriterion("productcount not in", values, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountBetween(Integer value1, Integer value2) {
            addCriterion("productcount between", value1, value2, "productcount");
            return (Criteria) this;
        }

        public Criteria andProductcountNotBetween(Integer value1, Integer value2) {
            addCriterion("productcount not between", value1, value2, "productcount");
            return (Criteria) this;
        }

        public Criteria andSendcountIsNull() {
            addCriterion("sendcount is null");
            return (Criteria) this;
        }

        public Criteria andSendcountIsNotNull() {
            addCriterion("sendcount is not null");
            return (Criteria) this;
        }

        public Criteria andSendcountEqualTo(Integer value) {
            addCriterion("sendcount =", value, "sendcount");
            return (Criteria) this;
        }

        public Criteria andSendcountNotEqualTo(Integer value) {
            addCriterion("sendcount <>", value, "sendcount");
            return (Criteria) this;
        }

        public Criteria andSendcountGreaterThan(Integer value) {
            addCriterion("sendcount >", value, "sendcount");
            return (Criteria) this;
        }

        public Criteria andSendcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("sendcount >=", value, "sendcount");
            return (Criteria) this;
        }

        public Criteria andSendcountLessThan(Integer value) {
            addCriterion("sendcount <", value, "sendcount");
            return (Criteria) this;
        }

        public Criteria andSendcountLessThanOrEqualTo(Integer value) {
            addCriterion("sendcount <=", value, "sendcount");
            return (Criteria) this;
        }

        public Criteria andSendcountIn(List<Integer> values) {
            addCriterion("sendcount in", values, "sendcount");
            return (Criteria) this;
        }

        public Criteria andSendcountNotIn(List<Integer> values) {
            addCriterion("sendcount not in", values, "sendcount");
            return (Criteria) this;
        }

        public Criteria andSendcountBetween(Integer value1, Integer value2) {
            addCriterion("sendcount between", value1, value2, "sendcount");
            return (Criteria) this;
        }

        public Criteria andSendcountNotBetween(Integer value1, Integer value2) {
            addCriterion("sendcount not between", value1, value2, "sendcount");
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

        public Criteria andHeightflagIsNull() {
            addCriterion("heightflag is null");
            return (Criteria) this;
        }

        public Criteria andHeightflagIsNotNull() {
            addCriterion("heightflag is not null");
            return (Criteria) this;
        }

        public Criteria andHeightflagEqualTo(String value) {
            addCriterion("heightflag =", value, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagNotEqualTo(String value) {
            addCriterion("heightflag <>", value, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagGreaterThan(String value) {
            addCriterion("heightflag >", value, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagGreaterThanOrEqualTo(String value) {
            addCriterion("heightflag >=", value, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagLessThan(String value) {
            addCriterion("heightflag <", value, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagLessThanOrEqualTo(String value) {
            addCriterion("heightflag <=", value, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagLike(String value) {
            addCriterion("heightflag like", value, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagNotLike(String value) {
            addCriterion("heightflag not like", value, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagIn(List<String> values) {
            addCriterion("heightflag in", values, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagNotIn(List<String> values) {
            addCriterion("heightflag not in", values, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagBetween(String value1, String value2) {
            addCriterion("heightflag between", value1, value2, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeightflagNotBetween(String value1, String value2) {
            addCriterion("heightflag not between", value1, value2, "heightflag");
            return (Criteria) this;
        }

        public Criteria andHeigtharearIsNull() {
            addCriterion("heigtharear is null");
            return (Criteria) this;
        }

        public Criteria andHeigtharearIsNotNull() {
            addCriterion("heigtharear is not null");
            return (Criteria) this;
        }

        public Criteria andHeigtharearEqualTo(String value) {
            addCriterion("heigtharear =", value, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearNotEqualTo(String value) {
            addCriterion("heigtharear <>", value, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearGreaterThan(String value) {
            addCriterion("heigtharear >", value, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearGreaterThanOrEqualTo(String value) {
            addCriterion("heigtharear >=", value, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearLessThan(String value) {
            addCriterion("heigtharear <", value, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearLessThanOrEqualTo(String value) {
            addCriterion("heigtharear <=", value, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearLike(String value) {
            addCriterion("heigtharear like", value, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearNotLike(String value) {
            addCriterion("heigtharear not like", value, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearIn(List<String> values) {
            addCriterion("heigtharear in", values, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearNotIn(List<String> values) {
            addCriterion("heigtharear not in", values, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearBetween(String value1, String value2) {
            addCriterion("heigtharear between", value1, value2, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andHeigtharearNotBetween(String value1, String value2) {
            addCriterion("heigtharear not between", value1, value2, "heigtharear");
            return (Criteria) this;
        }

        public Criteria andScheduletypeIsNull() {
            addCriterion("scheduletype is null");
            return (Criteria) this;
        }

        public Criteria andScheduletypeIsNotNull() {
            addCriterion("scheduletype is not null");
            return (Criteria) this;
        }

        public Criteria andScheduletypeEqualTo(String value) {
            addCriterion("scheduletype =", value, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeNotEqualTo(String value) {
            addCriterion("scheduletype <>", value, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeGreaterThan(String value) {
            addCriterion("scheduletype >", value, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeGreaterThanOrEqualTo(String value) {
            addCriterion("scheduletype >=", value, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeLessThan(String value) {
            addCriterion("scheduletype <", value, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeLessThanOrEqualTo(String value) {
            addCriterion("scheduletype <=", value, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeLike(String value) {
            addCriterion("scheduletype like", value, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeNotLike(String value) {
            addCriterion("scheduletype not like", value, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeIn(List<String> values) {
            addCriterion("scheduletype in", values, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeNotIn(List<String> values) {
            addCriterion("scheduletype not in", values, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeBetween(String value1, String value2) {
            addCriterion("scheduletype between", value1, value2, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andScheduletypeNotBetween(String value1, String value2) {
            addCriterion("scheduletype not between", value1, value2, "scheduletype");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNull() {
            addCriterion("productname is null");
            return (Criteria) this;
        }

        public Criteria andProductnameIsNotNull() {
            addCriterion("productname is not null");
            return (Criteria) this;
        }

        public Criteria andProductnameEqualTo(String value) {
            addCriterion("productname =", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotEqualTo(String value) {
            addCriterion("productname <>", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThan(String value) {
            addCriterion("productname >", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameGreaterThanOrEqualTo(String value) {
            addCriterion("productname >=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThan(String value) {
            addCriterion("productname <", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLessThanOrEqualTo(String value) {
            addCriterion("productname <=", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameLike(String value) {
            addCriterion("productname like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotLike(String value) {
            addCriterion("productname not like", value, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameIn(List<String> values) {
            addCriterion("productname in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotIn(List<String> values) {
            addCriterion("productname not in", values, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameBetween(String value1, String value2) {
            addCriterion("productname between", value1, value2, "productname");
            return (Criteria) this;
        }

        public Criteria andProductnameNotBetween(String value1, String value2) {
            addCriterion("productname not between", value1, value2, "productname");
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

        public Criteria andPpackageIsNull() {
            addCriterion("ppackage is null");
            return (Criteria) this;
        }

        public Criteria andPpackageIsNotNull() {
            addCriterion("ppackage is not null");
            return (Criteria) this;
        }

        public Criteria andPpackageEqualTo(String value) {
            addCriterion("ppackage =", value, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageNotEqualTo(String value) {
            addCriterion("ppackage <>", value, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageGreaterThan(String value) {
            addCriterion("ppackage >", value, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageGreaterThanOrEqualTo(String value) {
            addCriterion("ppackage >=", value, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageLessThan(String value) {
            addCriterion("ppackage <", value, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageLessThanOrEqualTo(String value) {
            addCriterion("ppackage <=", value, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageLike(String value) {
            addCriterion("ppackage like", value, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageNotLike(String value) {
            addCriterion("ppackage not like", value, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageIn(List<String> values) {
            addCriterion("ppackage in", values, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageNotIn(List<String> values) {
            addCriterion("ppackage not in", values, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageBetween(String value1, String value2) {
            addCriterion("ppackage between", value1, value2, "ppackage");
            return (Criteria) this;
        }

        public Criteria andPpackageNotBetween(String value1, String value2) {
            addCriterion("ppackage not between", value1, value2, "ppackage");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNull() {
            addCriterion("workstatus is null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIsNotNull() {
            addCriterion("workstatus is not null");
            return (Criteria) this;
        }

        public Criteria andWorkstatusEqualTo(String value) {
            addCriterion("workstatus =", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotEqualTo(String value) {
            addCriterion("workstatus <>", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThan(String value) {
            addCriterion("workstatus >", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusGreaterThanOrEqualTo(String value) {
            addCriterion("workstatus >=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThan(String value) {
            addCriterion("workstatus <", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLessThanOrEqualTo(String value) {
            addCriterion("workstatus <=", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusLike(String value) {
            addCriterion("workstatus like", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotLike(String value) {
            addCriterion("workstatus not like", value, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusIn(List<String> values) {
            addCriterion("workstatus in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotIn(List<String> values) {
            addCriterion("workstatus not in", values, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusBetween(String value1, String value2) {
            addCriterion("workstatus between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andWorkstatusNotBetween(String value1, String value2) {
            addCriterion("workstatus not between", value1, value2, "workstatus");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNull() {
            addCriterion("ordertype is null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIsNotNull() {
            addCriterion("ordertype is not null");
            return (Criteria) this;
        }

        public Criteria andOrdertypeEqualTo(String value) {
            addCriterion("ordertype =", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotEqualTo(String value) {
            addCriterion("ordertype <>", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThan(String value) {
            addCriterion("ordertype >", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeGreaterThanOrEqualTo(String value) {
            addCriterion("ordertype >=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThan(String value) {
            addCriterion("ordertype <", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLessThanOrEqualTo(String value) {
            addCriterion("ordertype <=", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeLike(String value) {
            addCriterion("ordertype like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotLike(String value) {
            addCriterion("ordertype not like", value, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeIn(List<String> values) {
            addCriterion("ordertype in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotIn(List<String> values) {
            addCriterion("ordertype not in", values, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeBetween(String value1, String value2) {
            addCriterion("ordertype between", value1, value2, "ordertype");
            return (Criteria) this;
        }

        public Criteria andOrdertypeNotBetween(String value1, String value2) {
            addCriterion("ordertype not between", value1, value2, "ordertype");
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