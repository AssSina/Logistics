package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class TruckDimExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public TruckDimExample() {
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

        public Criteria andLicenseIsNull() {
            addCriterion("license is null");
            return (Criteria) this;
        }

        public Criteria andLicenseIsNotNull() {
            addCriterion("license is not null");
            return (Criteria) this;
        }

        public Criteria andLicenseEqualTo(String value) {
            addCriterion("license =", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotEqualTo(String value) {
            addCriterion("license <>", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThan(String value) {
            addCriterion("license >", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseGreaterThanOrEqualTo(String value) {
            addCriterion("license >=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThan(String value) {
            addCriterion("license <", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLessThanOrEqualTo(String value) {
            addCriterion("license <=", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseLike(String value) {
            addCriterion("license like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotLike(String value) {
            addCriterion("license not like", value, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseIn(List<String> values) {
            addCriterion("license in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotIn(List<String> values) {
            addCriterion("license not in", values, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseBetween(String value1, String value2) {
            addCriterion("license between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andLicenseNotBetween(String value1, String value2) {
            addCriterion("license not between", value1, value2, "license");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyIsNull() {
            addCriterion("carry_capcty is null");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyIsNotNull() {
            addCriterion("carry_capcty is not null");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyEqualTo(String value) {
            addCriterion("carry_capcty =", value, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyNotEqualTo(String value) {
            addCriterion("carry_capcty <>", value, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyGreaterThan(String value) {
            addCriterion("carry_capcty >", value, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyGreaterThanOrEqualTo(String value) {
            addCriterion("carry_capcty >=", value, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyLessThan(String value) {
            addCriterion("carry_capcty <", value, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyLessThanOrEqualTo(String value) {
            addCriterion("carry_capcty <=", value, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyLike(String value) {
            addCriterion("carry_capcty like", value, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyNotLike(String value) {
            addCriterion("carry_capcty not like", value, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyIn(List<String> values) {
            addCriterion("carry_capcty in", values, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyNotIn(List<String> values) {
            addCriterion("carry_capcty not in", values, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyBetween(String value1, String value2) {
            addCriterion("carry_capcty between", value1, value2, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andCarryCapctyNotBetween(String value1, String value2) {
            addCriterion("carry_capcty not between", value1, value2, "carryCapcty");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdIsNull() {
            addCriterion("owner_type_id is null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdIsNotNull() {
            addCriterion("owner_type_id is not null");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdEqualTo(Integer value) {
            addCriterion("owner_type_id =", value, "ownerTypeId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdNotEqualTo(Integer value) {
            addCriterion("owner_type_id <>", value, "ownerTypeId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdGreaterThan(Integer value) {
            addCriterion("owner_type_id >", value, "ownerTypeId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("owner_type_id >=", value, "ownerTypeId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdLessThan(Integer value) {
            addCriterion("owner_type_id <", value, "ownerTypeId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdLessThanOrEqualTo(Integer value) {
            addCriterion("owner_type_id <=", value, "ownerTypeId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdIn(List<Integer> values) {
            addCriterion("owner_type_id in", values, "ownerTypeId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdNotIn(List<Integer> values) {
            addCriterion("owner_type_id not in", values, "ownerTypeId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdBetween(Integer value1, Integer value2) {
            addCriterion("owner_type_id between", value1, value2, "ownerTypeId");
            return (Criteria) this;
        }

        public Criteria andOwnerTypeIdNotBetween(Integer value1, Integer value2) {
            addCriterion("owner_type_id not between", value1, value2, "ownerTypeId");
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

        public Criteria andTrucktypeIsNull() {
            addCriterion("trucktype is null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIsNotNull() {
            addCriterion("trucktype is not null");
            return (Criteria) this;
        }

        public Criteria andTrucktypeEqualTo(String value) {
            addCriterion("trucktype =", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotEqualTo(String value) {
            addCriterion("trucktype <>", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeGreaterThan(String value) {
            addCriterion("trucktype >", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeGreaterThanOrEqualTo(String value) {
            addCriterion("trucktype >=", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeLessThan(String value) {
            addCriterion("trucktype <", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeLessThanOrEqualTo(String value) {
            addCriterion("trucktype <=", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeLike(String value) {
            addCriterion("trucktype like", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotLike(String value) {
            addCriterion("trucktype not like", value, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeIn(List<String> values) {
            addCriterion("trucktype in", values, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotIn(List<String> values) {
            addCriterion("trucktype not in", values, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeBetween(String value1, String value2) {
            addCriterion("trucktype between", value1, value2, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTrucktypeNotBetween(String value1, String value2) {
            addCriterion("trucktype not between", value1, value2, "trucktype");
            return (Criteria) this;
        }

        public Criteria andTruckstatusIsNull() {
            addCriterion("truckstatus is null");
            return (Criteria) this;
        }

        public Criteria andTruckstatusIsNotNull() {
            addCriterion("truckstatus is not null");
            return (Criteria) this;
        }

        public Criteria andTruckstatusEqualTo(String value) {
            addCriterion("truckstatus =", value, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusNotEqualTo(String value) {
            addCriterion("truckstatus <>", value, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusGreaterThan(String value) {
            addCriterion("truckstatus >", value, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusGreaterThanOrEqualTo(String value) {
            addCriterion("truckstatus >=", value, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusLessThan(String value) {
            addCriterion("truckstatus <", value, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusLessThanOrEqualTo(String value) {
            addCriterion("truckstatus <=", value, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusLike(String value) {
            addCriterion("truckstatus like", value, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusNotLike(String value) {
            addCriterion("truckstatus not like", value, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusIn(List<String> values) {
            addCriterion("truckstatus in", values, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusNotIn(List<String> values) {
            addCriterion("truckstatus not in", values, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusBetween(String value1, String value2) {
            addCriterion("truckstatus between", value1, value2, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTruckstatusNotBetween(String value1, String value2) {
            addCriterion("truckstatus not between", value1, value2, "truckstatus");
            return (Criteria) this;
        }

        public Criteria andTrucklocationIsNull() {
            addCriterion("trucklocation is null");
            return (Criteria) this;
        }

        public Criteria andTrucklocationIsNotNull() {
            addCriterion("trucklocation is not null");
            return (Criteria) this;
        }

        public Criteria andTrucklocationEqualTo(String value) {
            addCriterion("trucklocation =", value, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationNotEqualTo(String value) {
            addCriterion("trucklocation <>", value, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationGreaterThan(String value) {
            addCriterion("trucklocation >", value, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationGreaterThanOrEqualTo(String value) {
            addCriterion("trucklocation >=", value, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationLessThan(String value) {
            addCriterion("trucklocation <", value, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationLessThanOrEqualTo(String value) {
            addCriterion("trucklocation <=", value, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationLike(String value) {
            addCriterion("trucklocation like", value, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationNotLike(String value) {
            addCriterion("trucklocation not like", value, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationIn(List<String> values) {
            addCriterion("trucklocation in", values, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationNotIn(List<String> values) {
            addCriterion("trucklocation not in", values, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationBetween(String value1, String value2) {
            addCriterion("trucklocation between", value1, value2, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTrucklocationNotBetween(String value1, String value2) {
            addCriterion("trucklocation not between", value1, value2, "trucklocation");
            return (Criteria) this;
        }

        public Criteria andTruckageIsNull() {
            addCriterion("truckage is null");
            return (Criteria) this;
        }

        public Criteria andTruckageIsNotNull() {
            addCriterion("truckage is not null");
            return (Criteria) this;
        }

        public Criteria andTruckageEqualTo(Integer value) {
            addCriterion("truckage =", value, "truckage");
            return (Criteria) this;
        }

        public Criteria andTruckageNotEqualTo(Integer value) {
            addCriterion("truckage <>", value, "truckage");
            return (Criteria) this;
        }

        public Criteria andTruckageGreaterThan(Integer value) {
            addCriterion("truckage >", value, "truckage");
            return (Criteria) this;
        }

        public Criteria andTruckageGreaterThanOrEqualTo(Integer value) {
            addCriterion("truckage >=", value, "truckage");
            return (Criteria) this;
        }

        public Criteria andTruckageLessThan(Integer value) {
            addCriterion("truckage <", value, "truckage");
            return (Criteria) this;
        }

        public Criteria andTruckageLessThanOrEqualTo(Integer value) {
            addCriterion("truckage <=", value, "truckage");
            return (Criteria) this;
        }

        public Criteria andTruckageIn(List<Integer> values) {
            addCriterion("truckage in", values, "truckage");
            return (Criteria) this;
        }

        public Criteria andTruckageNotIn(List<Integer> values) {
            addCriterion("truckage not in", values, "truckage");
            return (Criteria) this;
        }

        public Criteria andTruckageBetween(Integer value1, Integer value2) {
            addCriterion("truckage between", value1, value2, "truckage");
            return (Criteria) this;
        }

        public Criteria andTruckageNotBetween(Integer value1, Integer value2) {
            addCriterion("truckage not between", value1, value2, "truckage");
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