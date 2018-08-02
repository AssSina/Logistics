package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class InWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InWarehouseExample() {
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

        public Criteria andInWarehouseIdIsNull() {
            addCriterion("in_warehouse_id is null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdIsNotNull() {
            addCriterion("in_warehouse_id is not null");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdEqualTo(Integer value) {
            addCriterion("in_warehouse_id =", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdNotEqualTo(Integer value) {
            addCriterion("in_warehouse_id <>", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdGreaterThan(Integer value) {
            addCriterion("in_warehouse_id >", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("in_warehouse_id >=", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdLessThan(Integer value) {
            addCriterion("in_warehouse_id <", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdLessThanOrEqualTo(Integer value) {
            addCriterion("in_warehouse_id <=", value, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdIn(List<Integer> values) {
            addCriterion("in_warehouse_id in", values, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdNotIn(List<Integer> values) {
            addCriterion("in_warehouse_id not in", values, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdBetween(Integer value1, Integer value2) {
            addCriterion("in_warehouse_id between", value1, value2, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andInWarehouseIdNotBetween(Integer value1, Integer value2) {
            addCriterion("in_warehouse_id not between", value1, value2, "inWarehouseId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdIsNull() {
            addCriterion("rcpt_prod_id is null");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdIsNotNull() {
            addCriterion("rcpt_prod_id is not null");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdEqualTo(Integer value) {
            addCriterion("rcpt_prod_id =", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdNotEqualTo(Integer value) {
            addCriterion("rcpt_prod_id <>", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdGreaterThan(Integer value) {
            addCriterion("rcpt_prod_id >", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("rcpt_prod_id >=", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdLessThan(Integer value) {
            addCriterion("rcpt_prod_id <", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdLessThanOrEqualTo(Integer value) {
            addCriterion("rcpt_prod_id <=", value, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdIn(List<Integer> values) {
            addCriterion("rcpt_prod_id in", values, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdNotIn(List<Integer> values) {
            addCriterion("rcpt_prod_id not in", values, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdBetween(Integer value1, Integer value2) {
            addCriterion("rcpt_prod_id between", value1, value2, "rcptProdId");
            return (Criteria) this;
        }

        public Criteria andRcptProdIdNotBetween(Integer value1, Integer value2) {
            addCriterion("rcpt_prod_id not between", value1, value2, "rcptProdId");
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

        public Criteria andStoreAmtIsNull() {
            addCriterion("store_amt is null");
            return (Criteria) this;
        }

        public Criteria andStoreAmtIsNotNull() {
            addCriterion("store_amt is not null");
            return (Criteria) this;
        }

        public Criteria andStoreAmtEqualTo(Integer value) {
            addCriterion("store_amt =", value, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andStoreAmtNotEqualTo(Integer value) {
            addCriterion("store_amt <>", value, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andStoreAmtGreaterThan(Integer value) {
            addCriterion("store_amt >", value, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andStoreAmtGreaterThanOrEqualTo(Integer value) {
            addCriterion("store_amt >=", value, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andStoreAmtLessThan(Integer value) {
            addCriterion("store_amt <", value, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andStoreAmtLessThanOrEqualTo(Integer value) {
            addCriterion("store_amt <=", value, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andStoreAmtIn(List<Integer> values) {
            addCriterion("store_amt in", values, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andStoreAmtNotIn(List<Integer> values) {
            addCriterion("store_amt not in", values, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andStoreAmtBetween(Integer value1, Integer value2) {
            addCriterion("store_amt between", value1, value2, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andStoreAmtNotBetween(Integer value1, Integer value2) {
            addCriterion("store_amt not between", value1, value2, "storeAmt");
            return (Criteria) this;
        }

        public Criteria andMemoIsNull() {
            addCriterion("memo is null");
            return (Criteria) this;
        }

        public Criteria andMemoIsNotNull() {
            addCriterion("memo is not null");
            return (Criteria) this;
        }

        public Criteria andMemoEqualTo(String value) {
            addCriterion("memo =", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotEqualTo(String value) {
            addCriterion("memo <>", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThan(String value) {
            addCriterion("memo >", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoGreaterThanOrEqualTo(String value) {
            addCriterion("memo >=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThan(String value) {
            addCriterion("memo <", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLessThanOrEqualTo(String value) {
            addCriterion("memo <=", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoLike(String value) {
            addCriterion("memo like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotLike(String value) {
            addCriterion("memo not like", value, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoIn(List<String> values) {
            addCriterion("memo in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotIn(List<String> values) {
            addCriterion("memo not in", values, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoBetween(String value1, String value2) {
            addCriterion("memo between", value1, value2, "memo");
            return (Criteria) this;
        }

        public Criteria andMemoNotBetween(String value1, String value2) {
            addCriterion("memo not between", value1, value2, "memo");
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