package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class ScheduleExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public ScheduleExample() {
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

        public Criteria andRegionIdIsNull() {
            addCriterion("region_id is null");
            return (Criteria) this;
        }

        public Criteria andRegionIdIsNotNull() {
            addCriterion("region_id is not null");
            return (Criteria) this;
        }

        public Criteria andRegionIdEqualTo(Integer value) {
            addCriterion("region_id =", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotEqualTo(Integer value) {
            addCriterion("region_id <>", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThan(Integer value) {
            addCriterion("region_id >", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("region_id >=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThan(Integer value) {
            addCriterion("region_id <", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdLessThanOrEqualTo(Integer value) {
            addCriterion("region_id <=", value, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdIn(List<Integer> values) {
            addCriterion("region_id in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotIn(List<Integer> values) {
            addCriterion("region_id not in", values, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdBetween(Integer value1, Integer value2) {
            addCriterion("region_id between", value1, value2, "regionId");
            return (Criteria) this;
        }

        public Criteria andRegionIdNotBetween(Integer value1, Integer value2) {
            addCriterion("region_id not between", value1, value2, "regionId");
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

        public Criteria andExecDoneFlagIsNull() {
            addCriterion("exec_done_flag is null");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagIsNotNull() {
            addCriterion("exec_done_flag is not null");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagEqualTo(String value) {
            addCriterion("exec_done_flag =", value, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagNotEqualTo(String value) {
            addCriterion("exec_done_flag <>", value, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagGreaterThan(String value) {
            addCriterion("exec_done_flag >", value, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagGreaterThanOrEqualTo(String value) {
            addCriterion("exec_done_flag >=", value, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagLessThan(String value) {
            addCriterion("exec_done_flag <", value, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagLessThanOrEqualTo(String value) {
            addCriterion("exec_done_flag <=", value, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagLike(String value) {
            addCriterion("exec_done_flag like", value, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagNotLike(String value) {
            addCriterion("exec_done_flag not like", value, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagIn(List<String> values) {
            addCriterion("exec_done_flag in", values, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagNotIn(List<String> values) {
            addCriterion("exec_done_flag not in", values, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagBetween(String value1, String value2) {
            addCriterion("exec_done_flag between", value1, value2, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andExecDoneFlagNotBetween(String value1, String value2) {
            addCriterion("exec_done_flag not between", value1, value2, "execDoneFlag");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdIsNull() {
            addCriterion("sched_type_id is null");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdIsNotNull() {
            addCriterion("sched_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdEqualTo(Integer value) {
            addCriterion("sched_type_id =", value, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdNotEqualTo(Integer value) {
            addCriterion("sched_type_id <>", value, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdGreaterThan(Integer value) {
            addCriterion("sched_type_id >", value, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("sched_type_id >=", value, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdLessThan(Integer value) {
            addCriterion("sched_type_id <", value, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("sched_type_id <=", value, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdIn(List<Integer> values) {
            addCriterion("sched_type_id in", values, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdNotIn(List<Integer> values) {
            addCriterion("sched_type_id not in", values, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("sched_type_id between", value1, value2, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andSchedTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("sched_type_id not between", value1, value2, "schedTypeId");
            return (Criteria) this;
        }

        public Criteria andDriverTypeIsNull() {
            addCriterion("driver_type is null");
            return (Criteria) this;
        }

        public Criteria andDriverTypeIsNotNull() {
            addCriterion("driver_type is not null");
            return (Criteria) this;
        }

        public Criteria andDriverTypeEqualTo(Integer value) {
            addCriterion("driver_type =", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeNotEqualTo(Integer value) {
            addCriterion("driver_type <>", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeGreaterThan(Integer value) {
            addCriterion("driver_type >", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_type >=", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeLessThan(Integer value) {
            addCriterion("driver_type <", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeLessThanOrEqualTo(Integer value) {
            addCriterion("driver_type <=", value, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeIn(List<Integer> values) {
            addCriterion("driver_type in", values, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeNotIn(List<Integer> values) {
            addCriterion("driver_type not in", values, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeBetween(Integer value1, Integer value2) {
            addCriterion("driver_type between", value1, value2, "driverType");
            return (Criteria) this;
        }

        public Criteria andDriverTypeNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_type not between", value1, value2, "driverType");
            return (Criteria) this;
        }

        public Criteria andTruckIdIsNull() {
            addCriterion("truck_id is null");
            return (Criteria) this;
        }

        public Criteria andTruckIdIsNotNull() {
            addCriterion("truck_id is not null");
            return (Criteria) this;
        }

        public Criteria andTruckIdEqualTo(Integer value) {
            addCriterion("truck_id =", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotEqualTo(Integer value) {
            addCriterion("truck_id <>", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThan(Integer value) {
            addCriterion("truck_id >", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("truck_id >=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThan(Integer value) {
            addCriterion("truck_id <", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdLessThanOrEqualTo(Integer value) {
            addCriterion("truck_id <=", value, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdIn(List<Integer> values) {
            addCriterion("truck_id in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotIn(List<Integer> values) {
            addCriterion("truck_id not in", values, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdBetween(Integer value1, Integer value2) {
            addCriterion("truck_id between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andTruckIdNotBetween(Integer value1, Integer value2) {
            addCriterion("truck_id not between", value1, value2, "truckId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNull() {
            addCriterion("driver_id is null");
            return (Criteria) this;
        }

        public Criteria andDriverIdIsNotNull() {
            addCriterion("driver_id is not null");
            return (Criteria) this;
        }

        public Criteria andDriverIdEqualTo(Integer value) {
            addCriterion("driver_id =", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotEqualTo(Integer value) {
            addCriterion("driver_id <>", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThan(Integer value) {
            addCriterion("driver_id >", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("driver_id >=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThan(Integer value) {
            addCriterion("driver_id <", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdLessThanOrEqualTo(Integer value) {
            addCriterion("driver_id <=", value, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdIn(List<Integer> values) {
            addCriterion("driver_id in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotIn(List<Integer> values) {
            addCriterion("driver_id not in", values, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdBetween(Integer value1, Integer value2) {
            addCriterion("driver_id between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andDriverIdNotBetween(Integer value1, Integer value2) {
            addCriterion("driver_id not between", value1, value2, "driverId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdIsNull() {
            addCriterion("third_party_id is null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdIsNotNull() {
            addCriterion("third_party_id is not null");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdEqualTo(Integer value) {
            addCriterion("third_party_id =", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotEqualTo(Integer value) {
            addCriterion("third_party_id <>", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdGreaterThan(Integer value) {
            addCriterion("third_party_id >", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("third_party_id >=", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdLessThan(Integer value) {
            addCriterion("third_party_id <", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdLessThanOrEqualTo(Integer value) {
            addCriterion("third_party_id <=", value, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdIn(List<Integer> values) {
            addCriterion("third_party_id in", values, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotIn(List<Integer> values) {
            addCriterion("third_party_id not in", values, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdBetween(Integer value1, Integer value2) {
            addCriterion("third_party_id between", value1, value2, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andThirdPartyIdNotBetween(Integer value1, Integer value2) {
            addCriterion("third_party_id not between", value1, value2, "thirdPartyId");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNull() {
            addCriterion("end_date is null");
            return (Criteria) this;
        }

        public Criteria andEndDateIsNotNull() {
            addCriterion("end_date is not null");
            return (Criteria) this;
        }

        public Criteria andEndDateEqualTo(Date value) {
            addCriterion("end_date =", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotEqualTo(Date value) {
            addCriterion("end_date <>", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThan(Date value) {
            addCriterion("end_date >", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateGreaterThanOrEqualTo(Date value) {
            addCriterion("end_date >=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThan(Date value) {
            addCriterion("end_date <", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateLessThanOrEqualTo(Date value) {
            addCriterion("end_date <=", value, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateIn(List<Date> values) {
            addCriterion("end_date in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotIn(List<Date> values) {
            addCriterion("end_date not in", values, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateBetween(Date value1, Date value2) {
            addCriterion("end_date between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andEndDateNotBetween(Date value1, Date value2) {
            addCriterion("end_date not between", value1, value2, "endDate");
            return (Criteria) this;
        }

        public Criteria andHacountIsNull() {
            addCriterion("hacount is null");
            return (Criteria) this;
        }

        public Criteria andHacountIsNotNull() {
            addCriterion("hacount is not null");
            return (Criteria) this;
        }

        public Criteria andHacountEqualTo(Integer value) {
            addCriterion("hacount =", value, "hacount");
            return (Criteria) this;
        }

        public Criteria andHacountNotEqualTo(Integer value) {
            addCriterion("hacount <>", value, "hacount");
            return (Criteria) this;
        }

        public Criteria andHacountGreaterThan(Integer value) {
            addCriterion("hacount >", value, "hacount");
            return (Criteria) this;
        }

        public Criteria andHacountGreaterThanOrEqualTo(Integer value) {
            addCriterion("hacount >=", value, "hacount");
            return (Criteria) this;
        }

        public Criteria andHacountLessThan(Integer value) {
            addCriterion("hacount <", value, "hacount");
            return (Criteria) this;
        }

        public Criteria andHacountLessThanOrEqualTo(Integer value) {
            addCriterion("hacount <=", value, "hacount");
            return (Criteria) this;
        }

        public Criteria andHacountIn(List<Integer> values) {
            addCriterion("hacount in", values, "hacount");
            return (Criteria) this;
        }

        public Criteria andHacountNotIn(List<Integer> values) {
            addCriterion("hacount not in", values, "hacount");
            return (Criteria) this;
        }

        public Criteria andHacountBetween(Integer value1, Integer value2) {
            addCriterion("hacount between", value1, value2, "hacount");
            return (Criteria) this;
        }

        public Criteria andHacountNotBetween(Integer value1, Integer value2) {
            addCriterion("hacount not between", value1, value2, "hacount");
            return (Criteria) this;
        }

        public Criteria andPcountIsNull() {
            addCriterion("pcount is null");
            return (Criteria) this;
        }

        public Criteria andPcountIsNotNull() {
            addCriterion("pcount is not null");
            return (Criteria) this;
        }

        public Criteria andPcountEqualTo(Integer value) {
            addCriterion("pcount =", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountNotEqualTo(Integer value) {
            addCriterion("pcount <>", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountGreaterThan(Integer value) {
            addCriterion("pcount >", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountGreaterThanOrEqualTo(Integer value) {
            addCriterion("pcount >=", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountLessThan(Integer value) {
            addCriterion("pcount <", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountLessThanOrEqualTo(Integer value) {
            addCriterion("pcount <=", value, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountIn(List<Integer> values) {
            addCriterion("pcount in", values, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountNotIn(List<Integer> values) {
            addCriterion("pcount not in", values, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountBetween(Integer value1, Integer value2) {
            addCriterion("pcount between", value1, value2, "pcount");
            return (Criteria) this;
        }

        public Criteria andPcountNotBetween(Integer value1, Integer value2) {
            addCriterion("pcount not between", value1, value2, "pcount");
            return (Criteria) this;
        }

        public Criteria andSchstatusIsNull() {
            addCriterion("schstatus is null");
            return (Criteria) this;
        }

        public Criteria andSchstatusIsNotNull() {
            addCriterion("schstatus is not null");
            return (Criteria) this;
        }

        public Criteria andSchstatusEqualTo(String value) {
            addCriterion("schstatus =", value, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusNotEqualTo(String value) {
            addCriterion("schstatus <>", value, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusGreaterThan(String value) {
            addCriterion("schstatus >", value, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusGreaterThanOrEqualTo(String value) {
            addCriterion("schstatus >=", value, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusLessThan(String value) {
            addCriterion("schstatus <", value, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusLessThanOrEqualTo(String value) {
            addCriterion("schstatus <=", value, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusLike(String value) {
            addCriterion("schstatus like", value, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusNotLike(String value) {
            addCriterion("schstatus not like", value, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusIn(List<String> values) {
            addCriterion("schstatus in", values, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusNotIn(List<String> values) {
            addCriterion("schstatus not in", values, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusBetween(String value1, String value2) {
            addCriterion("schstatus between", value1, value2, "schstatus");
            return (Criteria) this;
        }

        public Criteria andSchstatusNotBetween(String value1, String value2) {
            addCriterion("schstatus not between", value1, value2, "schstatus");
            return (Criteria) this;
        }

        public Criteria andFromaddressIsNull() {
            addCriterion("fromaddress is null");
            return (Criteria) this;
        }

        public Criteria andFromaddressIsNotNull() {
            addCriterion("fromaddress is not null");
            return (Criteria) this;
        }

        public Criteria andFromaddressEqualTo(String value) {
            addCriterion("fromaddress =", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotEqualTo(String value) {
            addCriterion("fromaddress <>", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThan(String value) {
            addCriterion("fromaddress >", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressGreaterThanOrEqualTo(String value) {
            addCriterion("fromaddress >=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThan(String value) {
            addCriterion("fromaddress <", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLessThanOrEqualTo(String value) {
            addCriterion("fromaddress <=", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressLike(String value) {
            addCriterion("fromaddress like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotLike(String value) {
            addCriterion("fromaddress not like", value, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressIn(List<String> values) {
            addCriterion("fromaddress in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotIn(List<String> values) {
            addCriterion("fromaddress not in", values, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressBetween(String value1, String value2) {
            addCriterion("fromaddress between", value1, value2, "fromaddress");
            return (Criteria) this;
        }

        public Criteria andFromaddressNotBetween(String value1, String value2) {
            addCriterion("fromaddress not between", value1, value2, "fromaddress");
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

        public Criteria andCunameIsNull() {
            addCriterion("cuname is null");
            return (Criteria) this;
        }

        public Criteria andCunameIsNotNull() {
            addCriterion("cuname is not null");
            return (Criteria) this;
        }

        public Criteria andCunameEqualTo(String value) {
            addCriterion("cuname =", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotEqualTo(String value) {
            addCriterion("cuname <>", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameGreaterThan(String value) {
            addCriterion("cuname >", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameGreaterThanOrEqualTo(String value) {
            addCriterion("cuname >=", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLessThan(String value) {
            addCriterion("cuname <", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLessThanOrEqualTo(String value) {
            addCriterion("cuname <=", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameLike(String value) {
            addCriterion("cuname like", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotLike(String value) {
            addCriterion("cuname not like", value, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameIn(List<String> values) {
            addCriterion("cuname in", values, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotIn(List<String> values) {
            addCriterion("cuname not in", values, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameBetween(String value1, String value2) {
            addCriterion("cuname between", value1, value2, "cuname");
            return (Criteria) this;
        }

        public Criteria andCunameNotBetween(String value1, String value2) {
            addCriterion("cuname not between", value1, value2, "cuname");
            return (Criteria) this;
        }

        public Criteria andCuphoneIsNull() {
            addCriterion("cuphone is null");
            return (Criteria) this;
        }

        public Criteria andCuphoneIsNotNull() {
            addCriterion("cuphone is not null");
            return (Criteria) this;
        }

        public Criteria andCuphoneEqualTo(String value) {
            addCriterion("cuphone =", value, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneNotEqualTo(String value) {
            addCriterion("cuphone <>", value, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneGreaterThan(String value) {
            addCriterion("cuphone >", value, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneGreaterThanOrEqualTo(String value) {
            addCriterion("cuphone >=", value, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneLessThan(String value) {
            addCriterion("cuphone <", value, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneLessThanOrEqualTo(String value) {
            addCriterion("cuphone <=", value, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneLike(String value) {
            addCriterion("cuphone like", value, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneNotLike(String value) {
            addCriterion("cuphone not like", value, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneIn(List<String> values) {
            addCriterion("cuphone in", values, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneNotIn(List<String> values) {
            addCriterion("cuphone not in", values, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneBetween(String value1, String value2) {
            addCriterion("cuphone between", value1, value2, "cuphone");
            return (Criteria) this;
        }

        public Criteria andCuphoneNotBetween(String value1, String value2) {
            addCriterion("cuphone not between", value1, value2, "cuphone");
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