package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class OutWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public OutWarehouseExample() {
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

        public Criteria andOutWarehouseIdIsNull() {
            addCriterion("out_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdIsNotNull() {
            addCriterion("out_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdEqualTo(Integer value) {
            addCriterion("out_warehouse_id =", value, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdNotEqualTo(Integer value) {
            addCriterion("out_warehouse_id <>", value, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdGreaterThan(Integer value) {
            addCriterion("out_warehouse_id >", value, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_warehouse_id >=", value, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdLessThan(Integer value) {
            addCriterion("out_warehouse_id <", value, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("out_warehouse_id <=", value, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdIn(List<Integer> values) {
            addCriterion("out_warehouse_id in", values, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdNotIn(List<Integer> values) {
            addCriterion("out_warehouse_id not in", values, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("out_warehouse_id between", value1, value2, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andOutWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("out_warehouse_id not between", value1, value2, "outWarehouseId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdIsNull() {
            addCriterion("pickout_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdIsNotNull() {
            addCriterion("pickout_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdEqualTo(Integer value) {
            addCriterion("pickout_prod_id =", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdNotEqualTo(Integer value) {
            addCriterion("pickout_prod_id <>", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdGreaterThan(Integer value) {
            addCriterion("pickout_prod_id >", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("pickout_prod_id >=", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdLessThan(Integer value) {
            addCriterion("pickout_prod_id <", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("pickout_prod_id <=", value, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdIn(List<Integer> values) {
            addCriterion("pickout_prod_id in", values, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdNotIn(List<Integer> values) {
            addCriterion("pickout_prod_id not in", values, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdBetween(Integer value1, Integer value2) {
            addCriterion("pickout_prod_id between", value1, value2, "pickoutProdId");
            return (Criteria) this;
        }

        public Criteria andPickoutProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("pickout_prod_id not between", value1, value2, "pickoutProdId");
            return (Criteria) this;
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

        public Criteria andPackageNameIsNull() {
            addCriterion("package_name is null");
            return (Criteria) this;
        }

        public Criteria andPackageNameIsNotNull() {
            addCriterion("package_name is not null");
            return (Criteria) this;
        }

        public Criteria andPackageNameEqualTo(String value) {
            addCriterion("package_name =", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotEqualTo(String value) {
            addCriterion("package_name <>", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThan(String value) {
            addCriterion("package_name >", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameGreaterThanOrEqualTo(String value) {
            addCriterion("package_name >=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThan(String value) {
            addCriterion("package_name <", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLessThanOrEqualTo(String value) {
            addCriterion("package_name <=", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameLike(String value) {
            addCriterion("package_name like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotLike(String value) {
            addCriterion("package_name not like", value, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameIn(List<String> values) {
            addCriterion("package_name in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotIn(List<String> values) {
            addCriterion("package_name not in", values, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameBetween(String value1, String value2) {
            addCriterion("package_name between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andPackageNameNotBetween(String value1, String value2) {
            addCriterion("package_name not between", value1, value2, "packageName");
            return (Criteria) this;
        }

        public Criteria andOutAmtIsNull() {
            addCriterion("out_amt is null");
            return (Criteria) this;
        }

        public Criteria andOutAmtIsNotNull() {
            addCriterion("out_amt is not null");
            return (Criteria) this;
        }

        public Criteria andOutAmtEqualTo(Integer value) {
            addCriterion("out_amt =", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotEqualTo(Integer value) {
            addCriterion("out_amt <>", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtGreaterThan(Integer value) {
            addCriterion("out_amt >", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("out_amt >=", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtLessThan(Integer value) {
            addCriterion("out_amt <", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtLessThanOrEqualTo(Integer value) {
            addCriterion("out_amt <=", value, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtIn(List<Integer> values) {
            addCriterion("out_amt in", values, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotIn(List<Integer> values) {
            addCriterion("out_amt not in", values, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtBetween(Integer value1, Integer value2) {
            addCriterion("out_amt between", value1, value2, "outAmt");
            return (Criteria) this;
        }

        public Criteria andOutAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("out_amt not between", value1, value2, "outAmt");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeIsNull() {
            addCriterion("backup_area_code is null");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeIsNotNull() {
            addCriterion("backup_area_code is not null");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeEqualTo(String value) {
            addCriterion("backup_area_code =", value, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeNotEqualTo(String value) {
            addCriterion("backup_area_code <>", value, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeGreaterThan(String value) {
            addCriterion("backup_area_code >", value, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeGreaterThanOrEqualTo(String value) {
            addCriterion("backup_area_code >=", value, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeLessThan(String value) {
            addCriterion("backup_area_code <", value, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeLessThanOrEqualTo(String value) {
            addCriterion("backup_area_code <=", value, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeLike(String value) {
            addCriterion("backup_area_code like", value, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeNotLike(String value) {
            addCriterion("backup_area_code not like", value, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeIn(List<String> values) {
            addCriterion("backup_area_code in", values, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeNotIn(List<String> values) {
            addCriterion("backup_area_code not in", values, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeBetween(String value1, String value2) {
            addCriterion("backup_area_code between", value1, value2, "backupAreaCode");
            return (Criteria) this;
        }

        public Criteria andBackupAreaCodeNotBetween(String value1, String value2) {
            addCriterion("backup_area_code not between", value1, value2, "backupAreaCode");
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