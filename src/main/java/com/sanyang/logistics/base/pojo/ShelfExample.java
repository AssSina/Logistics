package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ShelfExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ShelfExample() {
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

        public Criteria andShelfNoIsNull() {
            addCriterion("shelf_no is null");
            return (Criteria) this;
        }

        public Criteria andShelfNoIsNotNull() {
            addCriterion("shelf_no is not null");
            return (Criteria) this;
        }

        public Criteria andShelfNoEqualTo(String value) {
            addCriterion("shelf_no =", value, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoNotEqualTo(String value) {
            addCriterion("shelf_no <>", value, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoGreaterThan(String value) {
            addCriterion("shelf_no >", value, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoGreaterThanOrEqualTo(String value) {
            addCriterion("shelf_no >=", value, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoLessThan(String value) {
            addCriterion("shelf_no <", value, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoLessThanOrEqualTo(String value) {
            addCriterion("shelf_no <=", value, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoLike(String value) {
            addCriterion("shelf_no like", value, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoNotLike(String value) {
            addCriterion("shelf_no not like", value, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoIn(List<String> values) {
            addCriterion("shelf_no in", values, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoNotIn(List<String> values) {
            addCriterion("shelf_no not in", values, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoBetween(String value1, String value2) {
            addCriterion("shelf_no between", value1, value2, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andShelfNoNotBetween(String value1, String value2) {
            addCriterion("shelf_no not between", value1, value2, "shelfNo");
            return (Criteria) this;
        }

        public Criteria andLayerIsNull() {
            addCriterion("layer is null");
            return (Criteria) this;
        }

        public Criteria andLayerIsNotNull() {
            addCriterion("layer is not null");
            return (Criteria) this;
        }

        public Criteria andLayerEqualTo(Integer value) {
            addCriterion("layer =", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotEqualTo(Integer value) {
            addCriterion("layer <>", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThan(Integer value) {
            addCriterion("layer >", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerGreaterThanOrEqualTo(Integer value) {
            addCriterion("layer >=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThan(Integer value) {
            addCriterion("layer <", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerLessThanOrEqualTo(Integer value) {
            addCriterion("layer <=", value, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerIn(List<Integer> values) {
            addCriterion("layer in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotIn(List<Integer> values) {
            addCriterion("layer not in", values, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerBetween(Integer value1, Integer value2) {
            addCriterion("layer between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andLayerNotBetween(Integer value1, Integer value2) {
            addCriterion("layer not between", value1, value2, "layer");
            return (Criteria) this;
        }

        public Criteria andPsnumIsNull() {
            addCriterion("psnum is null");
            return (Criteria) this;
        }

        public Criteria andPsnumIsNotNull() {
            addCriterion("psnum is not null");
            return (Criteria) this;
        }

        public Criteria andPsnumEqualTo(Integer value) {
            addCriterion("psnum =", value, "psnum");
            return (Criteria) this;
        }

        public Criteria andPsnumNotEqualTo(Integer value) {
            addCriterion("psnum <>", value, "psnum");
            return (Criteria) this;
        }

        public Criteria andPsnumGreaterThan(Integer value) {
            addCriterion("psnum >", value, "psnum");
            return (Criteria) this;
        }

        public Criteria andPsnumGreaterThanOrEqualTo(Integer value) {
            addCriterion("psnum >=", value, "psnum");
            return (Criteria) this;
        }

        public Criteria andPsnumLessThan(Integer value) {
            addCriterion("psnum <", value, "psnum");
            return (Criteria) this;
        }

        public Criteria andPsnumLessThanOrEqualTo(Integer value) {
            addCriterion("psnum <=", value, "psnum");
            return (Criteria) this;
        }

        public Criteria andPsnumIn(List<Integer> values) {
            addCriterion("psnum in", values, "psnum");
            return (Criteria) this;
        }

        public Criteria andPsnumNotIn(List<Integer> values) {
            addCriterion("psnum not in", values, "psnum");
            return (Criteria) this;
        }

        public Criteria andPsnumBetween(Integer value1, Integer value2) {
            addCriterion("psnum between", value1, value2, "psnum");
            return (Criteria) this;
        }

        public Criteria andPsnumNotBetween(Integer value1, Integer value2) {
            addCriterion("psnum not between", value1, value2, "psnum");
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

        public Criteria andVolumeIsNull() {
            addCriterion("volume is null");
            return (Criteria) this;
        }

        public Criteria andVolumeIsNotNull() {
            addCriterion("volume is not null");
            return (Criteria) this;
        }

        public Criteria andVolumeEqualTo(Integer value) {
            addCriterion("volume =", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotEqualTo(Integer value) {
            addCriterion("volume <>", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThan(Integer value) {
            addCriterion("volume >", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeGreaterThanOrEqualTo(Integer value) {
            addCriterion("volume >=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThan(Integer value) {
            addCriterion("volume <", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeLessThanOrEqualTo(Integer value) {
            addCriterion("volume <=", value, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeIn(List<Integer> values) {
            addCriterion("volume in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotIn(List<Integer> values) {
            addCriterion("volume not in", values, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeBetween(Integer value1, Integer value2) {
            addCriterion("volume between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andVolumeNotBetween(Integer value1, Integer value2) {
            addCriterion("volume not between", value1, value2, "volume");
            return (Criteria) this;
        }

        public Criteria andMaxBearingIsNull() {
            addCriterion("max_bearing is null");
            return (Criteria) this;
        }

        public Criteria andMaxBearingIsNotNull() {
            addCriterion("max_bearing is not null");
            return (Criteria) this;
        }

        public Criteria andMaxBearingEqualTo(Integer value) {
            addCriterion("max_bearing =", value, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andMaxBearingNotEqualTo(Integer value) {
            addCriterion("max_bearing <>", value, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andMaxBearingGreaterThan(Integer value) {
            addCriterion("max_bearing >", value, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andMaxBearingGreaterThanOrEqualTo(Integer value) {
            addCriterion("max_bearing >=", value, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andMaxBearingLessThan(Integer value) {
            addCriterion("max_bearing <", value, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andMaxBearingLessThanOrEqualTo(Integer value) {
            addCriterion("max_bearing <=", value, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andMaxBearingIn(List<Integer> values) {
            addCriterion("max_bearing in", values, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andMaxBearingNotIn(List<Integer> values) {
            addCriterion("max_bearing not in", values, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andMaxBearingBetween(Integer value1, Integer value2) {
            addCriterion("max_bearing between", value1, value2, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andMaxBearingNotBetween(Integer value1, Integer value2) {
            addCriterion("max_bearing not between", value1, value2, "maxBearing");
            return (Criteria) this;
        }

        public Criteria andChannelFlagIsNull() {
            addCriterion("channel_flag is null");
            return (Criteria) this;
        }

        public Criteria andChannelFlagIsNotNull() {
            addCriterion("channel_flag is not null");
            return (Criteria) this;
        }

        public Criteria andChannelFlagEqualTo(String value) {
            addCriterion("channel_flag =", value, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagNotEqualTo(String value) {
            addCriterion("channel_flag <>", value, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagGreaterThan(String value) {
            addCriterion("channel_flag >", value, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagGreaterThanOrEqualTo(String value) {
            addCriterion("channel_flag >=", value, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagLessThan(String value) {
            addCriterion("channel_flag <", value, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagLessThanOrEqualTo(String value) {
            addCriterion("channel_flag <=", value, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagLike(String value) {
            addCriterion("channel_flag like", value, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagNotLike(String value) {
            addCriterion("channel_flag not like", value, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagIn(List<String> values) {
            addCriterion("channel_flag in", values, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagNotIn(List<String> values) {
            addCriterion("channel_flag not in", values, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagBetween(String value1, String value2) {
            addCriterion("channel_flag between", value1, value2, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelFlagNotBetween(String value1, String value2) {
            addCriterion("channel_flag not between", value1, value2, "channelFlag");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNull() {
            addCriterion("channel_id is null");
            return (Criteria) this;
        }

        public Criteria andChannelIdIsNotNull() {
            addCriterion("channel_id is not null");
            return (Criteria) this;
        }

        public Criteria andChannelIdEqualTo(Integer value) {
            addCriterion("channel_id =", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotEqualTo(Integer value) {
            addCriterion("channel_id <>", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThan(Integer value) {
            addCriterion("channel_id >", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel_id >=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThan(Integer value) {
            addCriterion("channel_id <", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdLessThanOrEqualTo(Integer value) {
            addCriterion("channel_id <=", value, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdIn(List<Integer> values) {
            addCriterion("channel_id in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotIn(List<Integer> values) {
            addCriterion("channel_id not in", values, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdBetween(Integer value1, Integer value2) {
            addCriterion("channel_id between", value1, value2, "channelId");
            return (Criteria) this;
        }

        public Criteria andChannelIdNotBetween(Integer value1, Integer value2) {
            addCriterion("channel_id not between", value1, value2, "channelId");
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