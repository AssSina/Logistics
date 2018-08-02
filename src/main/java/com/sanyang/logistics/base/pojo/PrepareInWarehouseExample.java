package com.sanyang.logistics.base.pojo;

import java.util.ArrayList;
import java.util.List;

public class PrepareInWarehouseExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public PrepareInWarehouseExample() {
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

        public Criteria andPreindIsNull() {
            addCriterion("preind is null");
            return (Criteria) this;
        }

        public Criteria andPreindIsNotNull() {
            addCriterion("preind is not null");
            return (Criteria) this;
        }

        public Criteria andPreindEqualTo(Integer value) {
            addCriterion("preind =", value, "preind");
            return (Criteria) this;
        }

        public Criteria andPreindNotEqualTo(Integer value) {
            addCriterion("preind <>", value, "preind");
            return (Criteria) this;
        }

        public Criteria andPreindGreaterThan(Integer value) {
            addCriterion("preind >", value, "preind");
            return (Criteria) this;
        }

        public Criteria andPreindGreaterThanOrEqualTo(Integer value) {
            addCriterion("preind >=", value, "preind");
            return (Criteria) this;
        }

        public Criteria andPreindLessThan(Integer value) {
            addCriterion("preind <", value, "preind");
            return (Criteria) this;
        }

        public Criteria andPreindLessThanOrEqualTo(Integer value) {
            addCriterion("preind <=", value, "preind");
            return (Criteria) this;
        }

        public Criteria andPreindIn(List<Integer> values) {
            addCriterion("preind in", values, "preind");
            return (Criteria) this;
        }

        public Criteria andPreindNotIn(List<Integer> values) {
            addCriterion("preind not in", values, "preind");
            return (Criteria) this;
        }

        public Criteria andPreindBetween(Integer value1, Integer value2) {
            addCriterion("preind between", value1, value2, "preind");
            return (Criteria) this;
        }

        public Criteria andPreindNotBetween(Integer value1, Integer value2) {
            addCriterion("preind not between", value1, value2, "preind");
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

        public Criteria andPolicyIdIsNull() {
            addCriterion("policy_id is null");
            return (Criteria) this;
        }

        public Criteria andPolicyIdIsNotNull() {
            addCriterion("policy_id is not null");
            return (Criteria) this;
        }

        public Criteria andPolicyIdEqualTo(String value) {
            addCriterion("policy_id =", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotEqualTo(String value) {
            addCriterion("policy_id <>", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdGreaterThan(String value) {
            addCriterion("policy_id >", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdGreaterThanOrEqualTo(String value) {
            addCriterion("policy_id >=", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdLessThan(String value) {
            addCriterion("policy_id <", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdLessThanOrEqualTo(String value) {
            addCriterion("policy_id <=", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdLike(String value) {
            addCriterion("policy_id like", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotLike(String value) {
            addCriterion("policy_id not like", value, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdIn(List<String> values) {
            addCriterion("policy_id in", values, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotIn(List<String> values) {
            addCriterion("policy_id not in", values, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdBetween(String value1, String value2) {
            addCriterion("policy_id between", value1, value2, "policyId");
            return (Criteria) this;
        }

        public Criteria andPolicyIdNotBetween(String value1, String value2) {
            addCriterion("policy_id not between", value1, value2, "policyId");
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