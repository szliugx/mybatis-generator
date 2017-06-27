package com.youban.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class InstOcExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public InstOcExample() {
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

        public Criteria andOcIdIsNull() {
            addCriterion("oc_id is null");
            return (Criteria) this;
        }

        public Criteria andOcIdIsNotNull() {
            addCriterion("oc_id is not null");
            return (Criteria) this;
        }

        public Criteria andOcIdEqualTo(Long value) {
            addCriterion("oc_id =", value, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcIdNotEqualTo(Long value) {
            addCriterion("oc_id <>", value, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcIdGreaterThan(Long value) {
            addCriterion("oc_id >", value, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcIdGreaterThanOrEqualTo(Long value) {
            addCriterion("oc_id >=", value, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcIdLessThan(Long value) {
            addCriterion("oc_id <", value, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcIdLessThanOrEqualTo(Long value) {
            addCriterion("oc_id <=", value, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcIdIn(List<Long> values) {
            addCriterion("oc_id in", values, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcIdNotIn(List<Long> values) {
            addCriterion("oc_id not in", values, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcIdBetween(Long value1, Long value2) {
            addCriterion("oc_id between", value1, value2, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcIdNotBetween(Long value1, Long value2) {
            addCriterion("oc_id not between", value1, value2, "ocId");
            return (Criteria) this;
        }

        public Criteria andOcNameIsNull() {
            addCriterion("oc_name is null");
            return (Criteria) this;
        }

        public Criteria andOcNameIsNotNull() {
            addCriterion("oc_name is not null");
            return (Criteria) this;
        }

        public Criteria andOcNameEqualTo(String value) {
            addCriterion("oc_name =", value, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameNotEqualTo(String value) {
            addCriterion("oc_name <>", value, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameGreaterThan(String value) {
            addCriterion("oc_name >", value, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameGreaterThanOrEqualTo(String value) {
            addCriterion("oc_name >=", value, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameLessThan(String value) {
            addCriterion("oc_name <", value, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameLessThanOrEqualTo(String value) {
            addCriterion("oc_name <=", value, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameLike(String value) {
            addCriterion("oc_name like", value, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameNotLike(String value) {
            addCriterion("oc_name not like", value, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameIn(List<String> values) {
            addCriterion("oc_name in", values, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameNotIn(List<String> values) {
            addCriterion("oc_name not in", values, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameBetween(String value1, String value2) {
            addCriterion("oc_name between", value1, value2, "ocName");
            return (Criteria) this;
        }

        public Criteria andOcNameNotBetween(String value1, String value2) {
            addCriterion("oc_name not between", value1, value2, "ocName");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNull() {
            addCriterion("intime is null");
            return (Criteria) this;
        }

        public Criteria andIntimeIsNotNull() {
            addCriterion("intime is not null");
            return (Criteria) this;
        }

        public Criteria andIntimeEqualTo(Integer value) {
            addCriterion("intime =", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotEqualTo(Integer value) {
            addCriterion("intime <>", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThan(Integer value) {
            addCriterion("intime >", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("intime >=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThan(Integer value) {
            addCriterion("intime <", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeLessThanOrEqualTo(Integer value) {
            addCriterion("intime <=", value, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeIn(List<Integer> values) {
            addCriterion("intime in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotIn(List<Integer> values) {
            addCriterion("intime not in", values, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeBetween(Integer value1, Integer value2) {
            addCriterion("intime between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andIntimeNotBetween(Integer value1, Integer value2) {
            addCriterion("intime not between", value1, value2, "intime");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNull() {
            addCriterion("uptime is null");
            return (Criteria) this;
        }

        public Criteria andUptimeIsNotNull() {
            addCriterion("uptime is not null");
            return (Criteria) this;
        }

        public Criteria andUptimeEqualTo(Integer value) {
            addCriterion("uptime =", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotEqualTo(Integer value) {
            addCriterion("uptime <>", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThan(Integer value) {
            addCriterion("uptime >", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("uptime >=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThan(Integer value) {
            addCriterion("uptime <", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeLessThanOrEqualTo(Integer value) {
            addCriterion("uptime <=", value, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeIn(List<Integer> values) {
            addCriterion("uptime in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotIn(List<Integer> values) {
            addCriterion("uptime not in", values, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeBetween(Integer value1, Integer value2) {
            addCriterion("uptime between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andUptimeNotBetween(Integer value1, Integer value2) {
            addCriterion("uptime not between", value1, value2, "uptime");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNull() {
            addCriterion("is_test is null");
            return (Criteria) this;
        }

        public Criteria andIsTestIsNotNull() {
            addCriterion("is_test is not null");
            return (Criteria) this;
        }

        public Criteria andIsTestEqualTo(Boolean value) {
            addCriterion("is_test =", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotEqualTo(Boolean value) {
            addCriterion("is_test <>", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThan(Boolean value) {
            addCriterion("is_test >", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_test >=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThan(Boolean value) {
            addCriterion("is_test <", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestLessThanOrEqualTo(Boolean value) {
            addCriterion("is_test <=", value, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestIn(List<Boolean> values) {
            addCriterion("is_test in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotIn(List<Boolean> values) {
            addCriterion("is_test not in", values, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestBetween(Boolean value1, Boolean value2) {
            addCriterion("is_test between", value1, value2, "isTest");
            return (Criteria) this;
        }

        public Criteria andIsTestNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_test not between", value1, value2, "isTest");
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