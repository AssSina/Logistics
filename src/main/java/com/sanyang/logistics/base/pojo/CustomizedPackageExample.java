package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class CustomizedPackageExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CustomizedPackageExample() {
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

        public Criteria andPidIsNull() {
            addCriterion("pid is null");
            return (Criteria) this;
        }

        public Criteria andPidIsNotNull() {
            addCriterion("pid is not null");
            return (Criteria) this;
        }

        public Criteria andPidEqualTo(Integer value) {
            addCriterion("pid =", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotEqualTo(Integer value) {
            addCriterion("pid <>", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThan(Integer value) {
            addCriterion("pid >", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidGreaterThanOrEqualTo(Integer value) {
            addCriterion("pid >=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThan(Integer value) {
            addCriterion("pid <", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidLessThanOrEqualTo(Integer value) {
            addCriterion("pid <=", value, "pid");
            return (Criteria) this;
        }

        public Criteria andPidIn(List<Integer> values) {
            addCriterion("pid in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotIn(List<Integer> values) {
            addCriterion("pid not in", values, "pid");
            return (Criteria) this;
        }

        public Criteria andPidBetween(Integer value1, Integer value2) {
            addCriterion("pid between", value1, value2, "pid");
            return (Criteria) this;
        }

        public Criteria andPidNotBetween(Integer value1, Integer value2) {
            addCriterion("pid not between", value1, value2, "pid");
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

        public Criteria andRulesIsNull() {
            addCriterion("rules is null");
            return (Criteria) this;
        }

        public Criteria andRulesIsNotNull() {
            addCriterion("rules is not null");
            return (Criteria) this;
        }

        public Criteria andRulesEqualTo(String value) {
            addCriterion("rules =", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotEqualTo(String value) {
            addCriterion("rules <>", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesGreaterThan(String value) {
            addCriterion("rules >", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesGreaterThanOrEqualTo(String value) {
            addCriterion("rules >=", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesLessThan(String value) {
            addCriterion("rules <", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesLessThanOrEqualTo(String value) {
            addCriterion("rules <=", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesLike(String value) {
            addCriterion("rules like", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotLike(String value) {
            addCriterion("rules not like", value, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesIn(List<String> values) {
            addCriterion("rules in", values, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotIn(List<String> values) {
            addCriterion("rules not in", values, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesBetween(String value1, String value2) {
            addCriterion("rules between", value1, value2, "rules");
            return (Criteria) this;
        }

        public Criteria andRulesNotBetween(String value1, String value2) {
            addCriterion("rules not between", value1, value2, "rules");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionIsNull() {
            addCriterion("rule_description is null");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionIsNotNull() {
            addCriterion("rule_description is not null");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionEqualTo(String value) {
            addCriterion("rule_description =", value, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionNotEqualTo(String value) {
            addCriterion("rule_description <>", value, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionGreaterThan(String value) {
            addCriterion("rule_description >", value, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("rule_description >=", value, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionLessThan(String value) {
            addCriterion("rule_description <", value, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionLessThanOrEqualTo(String value) {
            addCriterion("rule_description <=", value, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionLike(String value) {
            addCriterion("rule_description like", value, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionNotLike(String value) {
            addCriterion("rule_description not like", value, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionIn(List<String> values) {
            addCriterion("rule_description in", values, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionNotIn(List<String> values) {
            addCriterion("rule_description not in", values, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionBetween(String value1, String value2) {
            addCriterion("rule_description between", value1, value2, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andRuleDescriptionNotBetween(String value1, String value2) {
            addCriterion("rule_description not between", value1, value2, "ruleDescription");
            return (Criteria) this;
        }

        public Criteria andUnitWeightIsNull() {
            addCriterion("unit_weight is null");
            return (Criteria) this;
        }

        public Criteria andUnitWeightIsNotNull() {
            addCriterion("unit_weight is not null");
            return (Criteria) this;
        }

        public Criteria andUnitWeightEqualTo(Double value) {
            addCriterion("unit_weight =", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotEqualTo(Double value) {
            addCriterion("unit_weight <>", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightGreaterThan(Double value) {
            addCriterion("unit_weight >", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightGreaterThanOrEqualTo(Double value) {
            addCriterion("unit_weight >=", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightLessThan(Double value) {
            addCriterion("unit_weight <", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightLessThanOrEqualTo(Double value) {
            addCriterion("unit_weight <=", value, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightIn(List<Double> values) {
            addCriterion("unit_weight in", values, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotIn(List<Double> values) {
            addCriterion("unit_weight not in", values, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightBetween(Double value1, Double value2) {
            addCriterion("unit_weight between", value1, value2, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitWeightNotBetween(Double value1, Double value2) {
            addCriterion("unit_weight not between", value1, value2, "unitWeight");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeIsNull() {
            addCriterion("unit_volume is null");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeIsNotNull() {
            addCriterion("unit_volume is not null");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeEqualTo(Float value) {
            addCriterion("unit_volume =", value, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeNotEqualTo(Float value) {
            addCriterion("unit_volume <>", value, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeGreaterThan(Float value) {
            addCriterion("unit_volume >", value, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeGreaterThanOrEqualTo(Float value) {
            addCriterion("unit_volume >=", value, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeLessThan(Float value) {
            addCriterion("unit_volume <", value, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeLessThanOrEqualTo(Float value) {
            addCriterion("unit_volume <=", value, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeIn(List<Float> values) {
            addCriterion("unit_volume in", values, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeNotIn(List<Float> values) {
            addCriterion("unit_volume not in", values, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeBetween(Float value1, Float value2) {
            addCriterion("unit_volume between", value1, value2, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitVolumeNotBetween(Float value1, Float value2) {
            addCriterion("unit_volume not between", value1, value2, "unitVolume");
            return (Criteria) this;
        }

        public Criteria andUnitLengthIsNull() {
            addCriterion("unit_length is null");
            return (Criteria) this;
        }

        public Criteria andUnitLengthIsNotNull() {
            addCriterion("unit_length is not null");
            return (Criteria) this;
        }

        public Criteria andUnitLengthEqualTo(Float value) {
            addCriterion("unit_length =", value, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitLengthNotEqualTo(Float value) {
            addCriterion("unit_length <>", value, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitLengthGreaterThan(Float value) {
            addCriterion("unit_length >", value, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitLengthGreaterThanOrEqualTo(Float value) {
            addCriterion("unit_length >=", value, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitLengthLessThan(Float value) {
            addCriterion("unit_length <", value, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitLengthLessThanOrEqualTo(Float value) {
            addCriterion("unit_length <=", value, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitLengthIn(List<Float> values) {
            addCriterion("unit_length in", values, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitLengthNotIn(List<Float> values) {
            addCriterion("unit_length not in", values, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitLengthBetween(Float value1, Float value2) {
            addCriterion("unit_length between", value1, value2, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitLengthNotBetween(Float value1, Float value2) {
            addCriterion("unit_length not between", value1, value2, "unitLength");
            return (Criteria) this;
        }

        public Criteria andUnitWidthIsNull() {
            addCriterion("unit_width is null");
            return (Criteria) this;
        }

        public Criteria andUnitWidthIsNotNull() {
            addCriterion("unit_width is not null");
            return (Criteria) this;
        }

        public Criteria andUnitWidthEqualTo(Float value) {
            addCriterion("unit_width =", value, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitWidthNotEqualTo(Float value) {
            addCriterion("unit_width <>", value, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitWidthGreaterThan(Float value) {
            addCriterion("unit_width >", value, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitWidthGreaterThanOrEqualTo(Float value) {
            addCriterion("unit_width >=", value, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitWidthLessThan(Float value) {
            addCriterion("unit_width <", value, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitWidthLessThanOrEqualTo(Float value) {
            addCriterion("unit_width <=", value, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitWidthIn(List<Float> values) {
            addCriterion("unit_width in", values, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitWidthNotIn(List<Float> values) {
            addCriterion("unit_width not in", values, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitWidthBetween(Float value1, Float value2) {
            addCriterion("unit_width between", value1, value2, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitWidthNotBetween(Float value1, Float value2) {
            addCriterion("unit_width not between", value1, value2, "unitWidth");
            return (Criteria) this;
        }

        public Criteria andUnitHeightIsNull() {
            addCriterion("unit_height is null");
            return (Criteria) this;
        }

        public Criteria andUnitHeightIsNotNull() {
            addCriterion("unit_height is not null");
            return (Criteria) this;
        }

        public Criteria andUnitHeightEqualTo(Float value) {
            addCriterion("unit_height =", value, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitHeightNotEqualTo(Float value) {
            addCriterion("unit_height <>", value, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitHeightGreaterThan(Float value) {
            addCriterion("unit_height >", value, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitHeightGreaterThanOrEqualTo(Float value) {
            addCriterion("unit_height >=", value, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitHeightLessThan(Float value) {
            addCriterion("unit_height <", value, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitHeightLessThanOrEqualTo(Float value) {
            addCriterion("unit_height <=", value, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitHeightIn(List<Float> values) {
            addCriterion("unit_height in", values, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitHeightNotIn(List<Float> values) {
            addCriterion("unit_height not in", values, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitHeightBetween(Float value1, Float value2) {
            addCriterion("unit_height between", value1, value2, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitHeightNotBetween(Float value1, Float value2) {
            addCriterion("unit_height not between", value1, value2, "unitHeight");
            return (Criteria) this;
        }

        public Criteria andUnitFlagIsNull() {
            addCriterion("unit_flag is null");
            return (Criteria) this;
        }

        public Criteria andUnitFlagIsNotNull() {
            addCriterion("unit_flag is not null");
            return (Criteria) this;
        }

        public Criteria andUnitFlagEqualTo(String value) {
            addCriterion("unit_flag =", value, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagNotEqualTo(String value) {
            addCriterion("unit_flag <>", value, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagGreaterThan(String value) {
            addCriterion("unit_flag >", value, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagGreaterThanOrEqualTo(String value) {
            addCriterion("unit_flag >=", value, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagLessThan(String value) {
            addCriterion("unit_flag <", value, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagLessThanOrEqualTo(String value) {
            addCriterion("unit_flag <=", value, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagLike(String value) {
            addCriterion("unit_flag like", value, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagNotLike(String value) {
            addCriterion("unit_flag not like", value, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagIn(List<String> values) {
            addCriterion("unit_flag in", values, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagNotIn(List<String> values) {
            addCriterion("unit_flag not in", values, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagBetween(String value1, String value2) {
            addCriterion("unit_flag between", value1, value2, "unitFlag");
            return (Criteria) this;
        }

        public Criteria andUnitFlagNotBetween(String value1, String value2) {
            addCriterion("unit_flag not between", value1, value2, "unitFlag");
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