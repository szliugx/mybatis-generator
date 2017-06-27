package com.youban.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class BusOrderExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public BusOrderExample() {
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

        public Criteria andIdIsNull() {
            addCriterion("id is null");
            return (Criteria) this;
        }

        public Criteria andIdIsNotNull() {
            addCriterion("id is not null");
            return (Criteria) this;
        }

        public Criteria andIdEqualTo(Integer value) {
            addCriterion("id =", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotEqualTo(Integer value) {
            addCriterion("id <>", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThan(Integer value) {
            addCriterion("id >", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("id >=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThan(Integer value) {
            addCriterion("id <", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdLessThanOrEqualTo(Integer value) {
            addCriterion("id <=", value, "id");
            return (Criteria) this;
        }

        public Criteria andIdIn(List<Integer> values) {
            addCriterion("id in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotIn(List<Integer> values) {
            addCriterion("id not in", values, "id");
            return (Criteria) this;
        }

        public Criteria andIdBetween(Integer value1, Integer value2) {
            addCriterion("id between", value1, value2, "id");
            return (Criteria) this;
        }

        public Criteria andIdNotBetween(Integer value1, Integer value2) {
            addCriterion("id not between", value1, value2, "id");
            return (Criteria) this;
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

        public Criteria andUserIdIsNull() {
            addCriterion("user_id is null");
            return (Criteria) this;
        }

        public Criteria andUserIdIsNotNull() {
            addCriterion("user_id is not null");
            return (Criteria) this;
        }

        public Criteria andUserIdEqualTo(Long value) {
            addCriterion("user_id =", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotEqualTo(Long value) {
            addCriterion("user_id <>", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThan(Long value) {
            addCriterion("user_id >", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdGreaterThanOrEqualTo(Long value) {
            addCriterion("user_id >=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThan(Long value) {
            addCriterion("user_id <", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdLessThanOrEqualTo(Long value) {
            addCriterion("user_id <=", value, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdIn(List<Long> values) {
            addCriterion("user_id in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotIn(List<Long> values) {
            addCriterion("user_id not in", values, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdBetween(Long value1, Long value2) {
            addCriterion("user_id between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andUserIdNotBetween(Long value1, Long value2) {
            addCriterion("user_id not between", value1, value2, "userId");
            return (Criteria) this;
        }

        public Criteria andPartneridIsNull() {
            addCriterion("partnerid is null");
            return (Criteria) this;
        }

        public Criteria andPartneridIsNotNull() {
            addCriterion("partnerid is not null");
            return (Criteria) this;
        }

        public Criteria andPartneridEqualTo(String value) {
            addCriterion("partnerid =", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotEqualTo(String value) {
            addCriterion("partnerid <>", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridGreaterThan(String value) {
            addCriterion("partnerid >", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridGreaterThanOrEqualTo(String value) {
            addCriterion("partnerid >=", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridLessThan(String value) {
            addCriterion("partnerid <", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridLessThanOrEqualTo(String value) {
            addCriterion("partnerid <=", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridLike(String value) {
            addCriterion("partnerid like", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotLike(String value) {
            addCriterion("partnerid not like", value, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridIn(List<String> values) {
            addCriterion("partnerid in", values, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotIn(List<String> values) {
            addCriterion("partnerid not in", values, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridBetween(String value1, String value2) {
            addCriterion("partnerid between", value1, value2, "partnerid");
            return (Criteria) this;
        }

        public Criteria andPartneridNotBetween(String value1, String value2) {
            addCriterion("partnerid not between", value1, value2, "partnerid");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNull() {
            addCriterion("orderno is null");
            return (Criteria) this;
        }

        public Criteria andOrdernoIsNotNull() {
            addCriterion("orderno is not null");
            return (Criteria) this;
        }

        public Criteria andOrdernoEqualTo(String value) {
            addCriterion("orderno =", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotEqualTo(String value) {
            addCriterion("orderno <>", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThan(String value) {
            addCriterion("orderno >", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoGreaterThanOrEqualTo(String value) {
            addCriterion("orderno >=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThan(String value) {
            addCriterion("orderno <", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLessThanOrEqualTo(String value) {
            addCriterion("orderno <=", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoLike(String value) {
            addCriterion("orderno like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotLike(String value) {
            addCriterion("orderno not like", value, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoIn(List<String> values) {
            addCriterion("orderno in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotIn(List<String> values) {
            addCriterion("orderno not in", values, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoBetween(String value1, String value2) {
            addCriterion("orderno between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrdernoNotBetween(String value1, String value2) {
            addCriterion("orderno not between", value1, value2, "orderno");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNull() {
            addCriterion("orderstatus is null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIsNotNull() {
            addCriterion("orderstatus is not null");
            return (Criteria) this;
        }

        public Criteria andOrderstatusEqualTo(Byte value) {
            addCriterion("orderstatus =", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotEqualTo(Byte value) {
            addCriterion("orderstatus <>", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThan(Byte value) {
            addCriterion("orderstatus >", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("orderstatus >=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThan(Byte value) {
            addCriterion("orderstatus <", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusLessThanOrEqualTo(Byte value) {
            addCriterion("orderstatus <=", value, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusIn(List<Byte> values) {
            addCriterion("orderstatus in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotIn(List<Byte> values) {
            addCriterion("orderstatus not in", values, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusBetween(Byte value1, Byte value2) {
            addCriterion("orderstatus between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andOrderstatusNotBetween(Byte value1, Byte value2) {
            addCriterion("orderstatus not between", value1, value2, "orderstatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNull() {
            addCriterion("paystatus is null");
            return (Criteria) this;
        }

        public Criteria andPaystatusIsNotNull() {
            addCriterion("paystatus is not null");
            return (Criteria) this;
        }

        public Criteria andPaystatusEqualTo(Byte value) {
            addCriterion("paystatus =", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotEqualTo(Byte value) {
            addCriterion("paystatus <>", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThan(Byte value) {
            addCriterion("paystatus >", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("paystatus >=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThan(Byte value) {
            addCriterion("paystatus <", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusLessThanOrEqualTo(Byte value) {
            addCriterion("paystatus <=", value, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusIn(List<Byte> values) {
            addCriterion("paystatus in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotIn(List<Byte> values) {
            addCriterion("paystatus not in", values, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusBetween(Byte value1, Byte value2) {
            addCriterion("paystatus between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andPaystatusNotBetween(Byte value1, Byte value2) {
            addCriterion("paystatus not between", value1, value2, "paystatus");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNull() {
            addCriterion("totalprice is null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIsNotNull() {
            addCriterion("totalprice is not null");
            return (Criteria) this;
        }

        public Criteria andTotalpriceEqualTo(Long value) {
            addCriterion("totalprice =", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotEqualTo(Long value) {
            addCriterion("totalprice <>", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThan(Long value) {
            addCriterion("totalprice >", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceGreaterThanOrEqualTo(Long value) {
            addCriterion("totalprice >=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThan(Long value) {
            addCriterion("totalprice <", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceLessThanOrEqualTo(Long value) {
            addCriterion("totalprice <=", value, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceIn(List<Long> values) {
            addCriterion("totalprice in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotIn(List<Long> values) {
            addCriterion("totalprice not in", values, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceBetween(Long value1, Long value2) {
            addCriterion("totalprice between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andTotalpriceNotBetween(Long value1, Long value2) {
            addCriterion("totalprice not between", value1, value2, "totalprice");
            return (Criteria) this;
        }

        public Criteria andRefordernoIsNull() {
            addCriterion("reforderno is null");
            return (Criteria) this;
        }

        public Criteria andRefordernoIsNotNull() {
            addCriterion("reforderno is not null");
            return (Criteria) this;
        }

        public Criteria andRefordernoEqualTo(String value) {
            addCriterion("reforderno =", value, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoNotEqualTo(String value) {
            addCriterion("reforderno <>", value, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoGreaterThan(String value) {
            addCriterion("reforderno >", value, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoGreaterThanOrEqualTo(String value) {
            addCriterion("reforderno >=", value, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoLessThan(String value) {
            addCriterion("reforderno <", value, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoLessThanOrEqualTo(String value) {
            addCriterion("reforderno <=", value, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoLike(String value) {
            addCriterion("reforderno like", value, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoNotLike(String value) {
            addCriterion("reforderno not like", value, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoIn(List<String> values) {
            addCriterion("reforderno in", values, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoNotIn(List<String> values) {
            addCriterion("reforderno not in", values, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoBetween(String value1, String value2) {
            addCriterion("reforderno between", value1, value2, "reforderno");
            return (Criteria) this;
        }

        public Criteria andRefordernoNotBetween(String value1, String value2) {
            addCriterion("reforderno not between", value1, value2, "reforderno");
            return (Criteria) this;
        }

        public Criteria andAppcodeIsNull() {
            addCriterion("appcode is null");
            return (Criteria) this;
        }

        public Criteria andAppcodeIsNotNull() {
            addCriterion("appcode is not null");
            return (Criteria) this;
        }

        public Criteria andAppcodeEqualTo(String value) {
            addCriterion("appcode =", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotEqualTo(String value) {
            addCriterion("appcode <>", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeGreaterThan(String value) {
            addCriterion("appcode >", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeGreaterThanOrEqualTo(String value) {
            addCriterion("appcode >=", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeLessThan(String value) {
            addCriterion("appcode <", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeLessThanOrEqualTo(String value) {
            addCriterion("appcode <=", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeLike(String value) {
            addCriterion("appcode like", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotLike(String value) {
            addCriterion("appcode not like", value, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeIn(List<String> values) {
            addCriterion("appcode in", values, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotIn(List<String> values) {
            addCriterion("appcode not in", values, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeBetween(String value1, String value2) {
            addCriterion("appcode between", value1, value2, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppcodeNotBetween(String value1, String value2) {
            addCriterion("appcode not between", value1, value2, "appcode");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNull() {
            addCriterion("appkey is null");
            return (Criteria) this;
        }

        public Criteria andAppkeyIsNotNull() {
            addCriterion("appkey is not null");
            return (Criteria) this;
        }

        public Criteria andAppkeyEqualTo(String value) {
            addCriterion("appkey =", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotEqualTo(String value) {
            addCriterion("appkey <>", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThan(String value) {
            addCriterion("appkey >", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyGreaterThanOrEqualTo(String value) {
            addCriterion("appkey >=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThan(String value) {
            addCriterion("appkey <", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLessThanOrEqualTo(String value) {
            addCriterion("appkey <=", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyLike(String value) {
            addCriterion("appkey like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotLike(String value) {
            addCriterion("appkey not like", value, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyIn(List<String> values) {
            addCriterion("appkey in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotIn(List<String> values) {
            addCriterion("appkey not in", values, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyBetween(String value1, String value2) {
            addCriterion("appkey between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andAppkeyNotBetween(String value1, String value2) {
            addCriterion("appkey not between", value1, value2, "appkey");
            return (Criteria) this;
        }

        public Criteria andSpcodeIsNull() {
            addCriterion("spcode is null");
            return (Criteria) this;
        }

        public Criteria andSpcodeIsNotNull() {
            addCriterion("spcode is not null");
            return (Criteria) this;
        }

        public Criteria andSpcodeEqualTo(String value) {
            addCriterion("spcode =", value, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeNotEqualTo(String value) {
            addCriterion("spcode <>", value, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeGreaterThan(String value) {
            addCriterion("spcode >", value, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeGreaterThanOrEqualTo(String value) {
            addCriterion("spcode >=", value, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeLessThan(String value) {
            addCriterion("spcode <", value, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeLessThanOrEqualTo(String value) {
            addCriterion("spcode <=", value, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeLike(String value) {
            addCriterion("spcode like", value, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeNotLike(String value) {
            addCriterion("spcode not like", value, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeIn(List<String> values) {
            addCriterion("spcode in", values, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeNotIn(List<String> values) {
            addCriterion("spcode not in", values, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeBetween(String value1, String value2) {
            addCriterion("spcode between", value1, value2, "spcode");
            return (Criteria) this;
        }

        public Criteria andSpcodeNotBetween(String value1, String value2) {
            addCriterion("spcode not between", value1, value2, "spcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeIsNull() {
            addCriterion("selfplatformcode is null");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeIsNotNull() {
            addCriterion("selfplatformcode is not null");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeEqualTo(Long value) {
            addCriterion("selfplatformcode =", value, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeNotEqualTo(Long value) {
            addCriterion("selfplatformcode <>", value, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeGreaterThan(Long value) {
            addCriterion("selfplatformcode >", value, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeGreaterThanOrEqualTo(Long value) {
            addCriterion("selfplatformcode >=", value, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeLessThan(Long value) {
            addCriterion("selfplatformcode <", value, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeLessThanOrEqualTo(Long value) {
            addCriterion("selfplatformcode <=", value, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeIn(List<Long> values) {
            addCriterion("selfplatformcode in", values, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeNotIn(List<Long> values) {
            addCriterion("selfplatformcode not in", values, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeBetween(Long value1, Long value2) {
            addCriterion("selfplatformcode between", value1, value2, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andSelfplatformcodeNotBetween(Long value1, Long value2) {
            addCriterion("selfplatformcode not between", value1, value2, "selfplatformcode");
            return (Criteria) this;
        }

        public Criteria andAmountIsNull() {
            addCriterion("amount is null");
            return (Criteria) this;
        }

        public Criteria andAmountIsNotNull() {
            addCriterion("amount is not null");
            return (Criteria) this;
        }

        public Criteria andAmountEqualTo(String value) {
            addCriterion("amount =", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotEqualTo(String value) {
            addCriterion("amount <>", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThan(String value) {
            addCriterion("amount >", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountGreaterThanOrEqualTo(String value) {
            addCriterion("amount >=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThan(String value) {
            addCriterion("amount <", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLessThanOrEqualTo(String value) {
            addCriterion("amount <=", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountLike(String value) {
            addCriterion("amount like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotLike(String value) {
            addCriterion("amount not like", value, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountIn(List<String> values) {
            addCriterion("amount in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotIn(List<String> values) {
            addCriterion("amount not in", values, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountBetween(String value1, String value2) {
            addCriterion("amount between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andAmountNotBetween(String value1, String value2) {
            addCriterion("amount not between", value1, value2, "amount");
            return (Criteria) this;
        }

        public Criteria andResultIsNull() {
            addCriterion("result is null");
            return (Criteria) this;
        }

        public Criteria andResultIsNotNull() {
            addCriterion("result is not null");
            return (Criteria) this;
        }

        public Criteria andResultEqualTo(String value) {
            addCriterion("result =", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotEqualTo(String value) {
            addCriterion("result <>", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThan(String value) {
            addCriterion("result >", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultGreaterThanOrEqualTo(String value) {
            addCriterion("result >=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThan(String value) {
            addCriterion("result <", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLessThanOrEqualTo(String value) {
            addCriterion("result <=", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultLike(String value) {
            addCriterion("result like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotLike(String value) {
            addCriterion("result not like", value, "result");
            return (Criteria) this;
        }

        public Criteria andResultIn(List<String> values) {
            addCriterion("result in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotIn(List<String> values) {
            addCriterion("result not in", values, "result");
            return (Criteria) this;
        }

        public Criteria andResultBetween(String value1, String value2) {
            addCriterion("result between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andResultNotBetween(String value1, String value2) {
            addCriterion("result not between", value1, value2, "result");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNull() {
            addCriterion("paytime is null");
            return (Criteria) this;
        }

        public Criteria andPaytimeIsNotNull() {
            addCriterion("paytime is not null");
            return (Criteria) this;
        }

        public Criteria andPaytimeEqualTo(Integer value) {
            addCriterion("paytime =", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotEqualTo(Integer value) {
            addCriterion("paytime <>", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThan(Integer value) {
            addCriterion("paytime >", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("paytime >=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThan(Integer value) {
            addCriterion("paytime <", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeLessThanOrEqualTo(Integer value) {
            addCriterion("paytime <=", value, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeIn(List<Integer> values) {
            addCriterion("paytime in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotIn(List<Integer> values) {
            addCriterion("paytime not in", values, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeBetween(Integer value1, Integer value2) {
            addCriterion("paytime between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andPaytimeNotBetween(Integer value1, Integer value2) {
            addCriterion("paytime not between", value1, value2, "paytime");
            return (Criteria) this;
        }

        public Criteria andTraceidIsNull() {
            addCriterion("traceid is null");
            return (Criteria) this;
        }

        public Criteria andTraceidIsNotNull() {
            addCriterion("traceid is not null");
            return (Criteria) this;
        }

        public Criteria andTraceidEqualTo(String value) {
            addCriterion("traceid =", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotEqualTo(String value) {
            addCriterion("traceid <>", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidGreaterThan(String value) {
            addCriterion("traceid >", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidGreaterThanOrEqualTo(String value) {
            addCriterion("traceid >=", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidLessThan(String value) {
            addCriterion("traceid <", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidLessThanOrEqualTo(String value) {
            addCriterion("traceid <=", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidLike(String value) {
            addCriterion("traceid like", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotLike(String value) {
            addCriterion("traceid not like", value, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidIn(List<String> values) {
            addCriterion("traceid in", values, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotIn(List<String> values) {
            addCriterion("traceid not in", values, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidBetween(String value1, String value2) {
            addCriterion("traceid between", value1, value2, "traceid");
            return (Criteria) this;
        }

        public Criteria andTraceidNotBetween(String value1, String value2) {
            addCriterion("traceid not between", value1, value2, "traceid");
            return (Criteria) this;
        }

        public Criteria andReserveIsNull() {
            addCriterion("reserve is null");
            return (Criteria) this;
        }

        public Criteria andReserveIsNotNull() {
            addCriterion("reserve is not null");
            return (Criteria) this;
        }

        public Criteria andReserveEqualTo(String value) {
            addCriterion("reserve =", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotEqualTo(String value) {
            addCriterion("reserve <>", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveGreaterThan(String value) {
            addCriterion("reserve >", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveGreaterThanOrEqualTo(String value) {
            addCriterion("reserve >=", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLessThan(String value) {
            addCriterion("reserve <", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLessThanOrEqualTo(String value) {
            addCriterion("reserve <=", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveLike(String value) {
            addCriterion("reserve like", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotLike(String value) {
            addCriterion("reserve not like", value, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveIn(List<String> values) {
            addCriterion("reserve in", values, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotIn(List<String> values) {
            addCriterion("reserve not in", values, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveBetween(String value1, String value2) {
            addCriterion("reserve between", value1, value2, "reserve");
            return (Criteria) this;
        }

        public Criteria andReserveNotBetween(String value1, String value2) {
            addCriterion("reserve not between", value1, value2, "reserve");
            return (Criteria) this;
        }

        public Criteria andBankorderidIsNull() {
            addCriterion("bankorderid is null");
            return (Criteria) this;
        }

        public Criteria andBankorderidIsNotNull() {
            addCriterion("bankorderid is not null");
            return (Criteria) this;
        }

        public Criteria andBankorderidEqualTo(String value) {
            addCriterion("bankorderid =", value, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidNotEqualTo(String value) {
            addCriterion("bankorderid <>", value, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidGreaterThan(String value) {
            addCriterion("bankorderid >", value, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidGreaterThanOrEqualTo(String value) {
            addCriterion("bankorderid >=", value, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidLessThan(String value) {
            addCriterion("bankorderid <", value, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidLessThanOrEqualTo(String value) {
            addCriterion("bankorderid <=", value, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidLike(String value) {
            addCriterion("bankorderid like", value, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidNotLike(String value) {
            addCriterion("bankorderid not like", value, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidIn(List<String> values) {
            addCriterion("bankorderid in", values, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidNotIn(List<String> values) {
            addCriterion("bankorderid not in", values, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidBetween(String value1, String value2) {
            addCriterion("bankorderid between", value1, value2, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankorderidNotBetween(String value1, String value2) {
            addCriterion("bankorderid not between", value1, value2, "bankorderid");
            return (Criteria) this;
        }

        public Criteria andBankjournalIsNull() {
            addCriterion("bankjournal is null");
            return (Criteria) this;
        }

        public Criteria andBankjournalIsNotNull() {
            addCriterion("bankjournal is not null");
            return (Criteria) this;
        }

        public Criteria andBankjournalEqualTo(String value) {
            addCriterion("bankjournal =", value, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalNotEqualTo(String value) {
            addCriterion("bankjournal <>", value, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalGreaterThan(String value) {
            addCriterion("bankjournal >", value, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalGreaterThanOrEqualTo(String value) {
            addCriterion("bankjournal >=", value, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalLessThan(String value) {
            addCriterion("bankjournal <", value, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalLessThanOrEqualTo(String value) {
            addCriterion("bankjournal <=", value, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalLike(String value) {
            addCriterion("bankjournal like", value, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalNotLike(String value) {
            addCriterion("bankjournal not like", value, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalIn(List<String> values) {
            addCriterion("bankjournal in", values, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalNotIn(List<String> values) {
            addCriterion("bankjournal not in", values, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalBetween(String value1, String value2) {
            addCriterion("bankjournal between", value1, value2, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andBankjournalNotBetween(String value1, String value2) {
            addCriterion("bankjournal not between", value1, value2, "bankjournal");
            return (Criteria) this;
        }

        public Criteria andSignIsNull() {
            addCriterion("sign is null");
            return (Criteria) this;
        }

        public Criteria andSignIsNotNull() {
            addCriterion("sign is not null");
            return (Criteria) this;
        }

        public Criteria andSignEqualTo(String value) {
            addCriterion("sign =", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotEqualTo(String value) {
            addCriterion("sign <>", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThan(String value) {
            addCriterion("sign >", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignGreaterThanOrEqualTo(String value) {
            addCriterion("sign >=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThan(String value) {
            addCriterion("sign <", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLessThanOrEqualTo(String value) {
            addCriterion("sign <=", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignLike(String value) {
            addCriterion("sign like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotLike(String value) {
            addCriterion("sign not like", value, "sign");
            return (Criteria) this;
        }

        public Criteria andSignIn(List<String> values) {
            addCriterion("sign in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotIn(List<String> values) {
            addCriterion("sign not in", values, "sign");
            return (Criteria) this;
        }

        public Criteria andSignBetween(String value1, String value2) {
            addCriterion("sign between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andSignNotBetween(String value1, String value2) {
            addCriterion("sign not between", value1, value2, "sign");
            return (Criteria) this;
        }

        public Criteria andMd5IsNull() {
            addCriterion("md5 is null");
            return (Criteria) this;
        }

        public Criteria andMd5IsNotNull() {
            addCriterion("md5 is not null");
            return (Criteria) this;
        }

        public Criteria andMd5EqualTo(String value) {
            addCriterion("md5 =", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotEqualTo(String value) {
            addCriterion("md5 <>", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThan(String value) {
            addCriterion("md5 >", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5GreaterThanOrEqualTo(String value) {
            addCriterion("md5 >=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThan(String value) {
            addCriterion("md5 <", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5LessThanOrEqualTo(String value) {
            addCriterion("md5 <=", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Like(String value) {
            addCriterion("md5 like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotLike(String value) {
            addCriterion("md5 not like", value, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5In(List<String> values) {
            addCriterion("md5 in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotIn(List<String> values) {
            addCriterion("md5 not in", values, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5Between(String value1, String value2) {
            addCriterion("md5 between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andMd5NotBetween(String value1, String value2) {
            addCriterion("md5 not between", value1, value2, "md5");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoIsNull() {
            addCriterion("acceptvouchermobileno is null");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoIsNotNull() {
            addCriterion("acceptvouchermobileno is not null");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoEqualTo(String value) {
            addCriterion("acceptvouchermobileno =", value, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoNotEqualTo(String value) {
            addCriterion("acceptvouchermobileno <>", value, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoGreaterThan(String value) {
            addCriterion("acceptvouchermobileno >", value, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoGreaterThanOrEqualTo(String value) {
            addCriterion("acceptvouchermobileno >=", value, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoLessThan(String value) {
            addCriterion("acceptvouchermobileno <", value, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoLessThanOrEqualTo(String value) {
            addCriterion("acceptvouchermobileno <=", value, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoLike(String value) {
            addCriterion("acceptvouchermobileno like", value, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoNotLike(String value) {
            addCriterion("acceptvouchermobileno not like", value, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoIn(List<String> values) {
            addCriterion("acceptvouchermobileno in", values, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoNotIn(List<String> values) {
            addCriterion("acceptvouchermobileno not in", values, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoBetween(String value1, String value2) {
            addCriterion("acceptvouchermobileno between", value1, value2, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andAcceptvouchermobilenoNotBetween(String value1, String value2) {
            addCriterion("acceptvouchermobileno not between", value1, value2, "acceptvouchermobileno");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberIsNull() {
            addCriterion("idcardnumber is null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberIsNotNull() {
            addCriterion("idcardnumber is not null");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberEqualTo(String value) {
            addCriterion("idcardnumber =", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberNotEqualTo(String value) {
            addCriterion("idcardnumber <>", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberGreaterThan(String value) {
            addCriterion("idcardnumber >", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberGreaterThanOrEqualTo(String value) {
            addCriterion("idcardnumber >=", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberLessThan(String value) {
            addCriterion("idcardnumber <", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberLessThanOrEqualTo(String value) {
            addCriterion("idcardnumber <=", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberLike(String value) {
            addCriterion("idcardnumber like", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberNotLike(String value) {
            addCriterion("idcardnumber not like", value, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberIn(List<String> values) {
            addCriterion("idcardnumber in", values, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberNotIn(List<String> values) {
            addCriterion("idcardnumber not in", values, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberBetween(String value1, String value2) {
            addCriterion("idcardnumber between", value1, value2, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andIdcardnumberNotBetween(String value1, String value2) {
            addCriterion("idcardnumber not between", value1, value2, "idcardnumber");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNull() {
            addCriterion("createtime is null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIsNotNull() {
            addCriterion("createtime is not null");
            return (Criteria) this;
        }

        public Criteria andCreatetimeEqualTo(Integer value) {
            addCriterion("createtime =", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotEqualTo(Integer value) {
            addCriterion("createtime <>", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThan(Integer value) {
            addCriterion("createtime >", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("createtime >=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThan(Integer value) {
            addCriterion("createtime <", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("createtime <=", value, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeIn(List<Integer> values) {
            addCriterion("createtime in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotIn(List<Integer> values) {
            addCriterion("createtime not in", values, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeBetween(Integer value1, Integer value2) {
            addCriterion("createtime between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andCreatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("createtime not between", value1, value2, "createtime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNull() {
            addCriterion("updatetime is null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIsNotNull() {
            addCriterion("updatetime is not null");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeEqualTo(Integer value) {
            addCriterion("updatetime =", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotEqualTo(Integer value) {
            addCriterion("updatetime <>", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThan(Integer value) {
            addCriterion("updatetime >", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("updatetime >=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThan(Integer value) {
            addCriterion("updatetime <", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeLessThanOrEqualTo(Integer value) {
            addCriterion("updatetime <=", value, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeIn(List<Integer> values) {
            addCriterion("updatetime in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotIn(List<Integer> values) {
            addCriterion("updatetime not in", values, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeBetween(Integer value1, Integer value2) {
            addCriterion("updatetime between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andUpdatetimeNotBetween(Integer value1, Integer value2) {
            addCriterion("updatetime not between", value1, value2, "updatetime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeIsNull() {
            addCriterion("traveltime is null");
            return (Criteria) this;
        }

        public Criteria andTraveltimeIsNotNull() {
            addCriterion("traveltime is not null");
            return (Criteria) this;
        }

        public Criteria andTraveltimeEqualTo(Integer value) {
            addCriterion("traveltime =", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeNotEqualTo(Integer value) {
            addCriterion("traveltime <>", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeGreaterThan(Integer value) {
            addCriterion("traveltime >", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("traveltime >=", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeLessThan(Integer value) {
            addCriterion("traveltime <", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeLessThanOrEqualTo(Integer value) {
            addCriterion("traveltime <=", value, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeIn(List<Integer> values) {
            addCriterion("traveltime in", values, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeNotIn(List<Integer> values) {
            addCriterion("traveltime not in", values, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeBetween(Integer value1, Integer value2) {
            addCriterion("traveltime between", value1, value2, "traveltime");
            return (Criteria) this;
        }

        public Criteria andTraveltimeNotBetween(Integer value1, Integer value2) {
            addCriterion("traveltime not between", value1, value2, "traveltime");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNull() {
            addCriterion("seller_id is null");
            return (Criteria) this;
        }

        public Criteria andSellerIdIsNotNull() {
            addCriterion("seller_id is not null");
            return (Criteria) this;
        }

        public Criteria andSellerIdEqualTo(Integer value) {
            addCriterion("seller_id =", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotEqualTo(Integer value) {
            addCriterion("seller_id <>", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThan(Integer value) {
            addCriterion("seller_id >", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("seller_id >=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThan(Integer value) {
            addCriterion("seller_id <", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdLessThanOrEqualTo(Integer value) {
            addCriterion("seller_id <=", value, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdIn(List<Integer> values) {
            addCriterion("seller_id in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotIn(List<Integer> values) {
            addCriterion("seller_id not in", values, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdBetween(Integer value1, Integer value2) {
            addCriterion("seller_id between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerIdNotBetween(Integer value1, Integer value2) {
            addCriterion("seller_id not between", value1, value2, "sellerId");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIsNull() {
            addCriterion("seller_type is null");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIsNotNull() {
            addCriterion("seller_type is not null");
            return (Criteria) this;
        }

        public Criteria andSellerTypeEqualTo(Byte value) {
            addCriterion("seller_type =", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotEqualTo(Byte value) {
            addCriterion("seller_type <>", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeGreaterThan(Byte value) {
            addCriterion("seller_type >", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("seller_type >=", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeLessThan(Byte value) {
            addCriterion("seller_type <", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeLessThanOrEqualTo(Byte value) {
            addCriterion("seller_type <=", value, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeIn(List<Byte> values) {
            addCriterion("seller_type in", values, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotIn(List<Byte> values) {
            addCriterion("seller_type not in", values, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeBetween(Byte value1, Byte value2) {
            addCriterion("seller_type between", value1, value2, "sellerType");
            return (Criteria) this;
        }

        public Criteria andSellerTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("seller_type not between", value1, value2, "sellerType");
            return (Criteria) this;
        }

        public Criteria andChannelIsNull() {
            addCriterion("channel is null");
            return (Criteria) this;
        }

        public Criteria andChannelIsNotNull() {
            addCriterion("channel is not null");
            return (Criteria) this;
        }

        public Criteria andChannelEqualTo(Integer value) {
            addCriterion("channel =", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotEqualTo(Integer value) {
            addCriterion("channel <>", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThan(Integer value) {
            addCriterion("channel >", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelGreaterThanOrEqualTo(Integer value) {
            addCriterion("channel >=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThan(Integer value) {
            addCriterion("channel <", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelLessThanOrEqualTo(Integer value) {
            addCriterion("channel <=", value, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelIn(List<Integer> values) {
            addCriterion("channel in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotIn(List<Integer> values) {
            addCriterion("channel not in", values, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelBetween(Integer value1, Integer value2) {
            addCriterion("channel between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andChannelNotBetween(Integer value1, Integer value2) {
            addCriterion("channel not between", value1, value2, "channel");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNull() {
            addCriterion("shop_code is null");
            return (Criteria) this;
        }

        public Criteria andShopCodeIsNotNull() {
            addCriterion("shop_code is not null");
            return (Criteria) this;
        }

        public Criteria andShopCodeEqualTo(Byte value) {
            addCriterion("shop_code =", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotEqualTo(Byte value) {
            addCriterion("shop_code <>", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThan(Byte value) {
            addCriterion("shop_code >", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeGreaterThanOrEqualTo(Byte value) {
            addCriterion("shop_code >=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThan(Byte value) {
            addCriterion("shop_code <", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeLessThanOrEqualTo(Byte value) {
            addCriterion("shop_code <=", value, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeIn(List<Byte> values) {
            addCriterion("shop_code in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotIn(List<Byte> values) {
            addCriterion("shop_code not in", values, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeBetween(Byte value1, Byte value2) {
            addCriterion("shop_code between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andShopCodeNotBetween(Byte value1, Byte value2) {
            addCriterion("shop_code not between", value1, value2, "shopCode");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeIsNull() {
            addCriterion("cancel_expire_time is null");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeIsNotNull() {
            addCriterion("cancel_expire_time is not null");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeEqualTo(Integer value) {
            addCriterion("cancel_expire_time =", value, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeNotEqualTo(Integer value) {
            addCriterion("cancel_expire_time <>", value, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeGreaterThan(Integer value) {
            addCriterion("cancel_expire_time >", value, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancel_expire_time >=", value, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeLessThan(Integer value) {
            addCriterion("cancel_expire_time <", value, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeLessThanOrEqualTo(Integer value) {
            addCriterion("cancel_expire_time <=", value, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeIn(List<Integer> values) {
            addCriterion("cancel_expire_time in", values, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeNotIn(List<Integer> values) {
            addCriterion("cancel_expire_time not in", values, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeBetween(Integer value1, Integer value2) {
            addCriterion("cancel_expire_time between", value1, value2, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelExpireTimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cancel_expire_time not between", value1, value2, "cancelExpireTime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeIsNull() {
            addCriterion("cancelexpiretime is null");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeIsNotNull() {
            addCriterion("cancelexpiretime is not null");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeEqualTo(Integer value) {
            addCriterion("cancelexpiretime =", value, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeNotEqualTo(Integer value) {
            addCriterion("cancelexpiretime <>", value, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeGreaterThan(Integer value) {
            addCriterion("cancelexpiretime >", value, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeGreaterThanOrEqualTo(Integer value) {
            addCriterion("cancelexpiretime >=", value, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeLessThan(Integer value) {
            addCriterion("cancelexpiretime <", value, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeLessThanOrEqualTo(Integer value) {
            addCriterion("cancelexpiretime <=", value, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeIn(List<Integer> values) {
            addCriterion("cancelexpiretime in", values, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeNotIn(List<Integer> values) {
            addCriterion("cancelexpiretime not in", values, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeBetween(Integer value1, Integer value2) {
            addCriterion("cancelexpiretime between", value1, value2, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andCancelexpiretimeNotBetween(Integer value1, Integer value2) {
            addCriterion("cancelexpiretime not between", value1, value2, "cancelexpiretime");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNull() {
            addCriterion("remark1 is null");
            return (Criteria) this;
        }

        public Criteria andRemark1IsNotNull() {
            addCriterion("remark1 is not null");
            return (Criteria) this;
        }

        public Criteria andRemark1EqualTo(String value) {
            addCriterion("remark1 =", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotEqualTo(String value) {
            addCriterion("remark1 <>", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThan(String value) {
            addCriterion("remark1 >", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1GreaterThanOrEqualTo(String value) {
            addCriterion("remark1 >=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThan(String value) {
            addCriterion("remark1 <", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1LessThanOrEqualTo(String value) {
            addCriterion("remark1 <=", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Like(String value) {
            addCriterion("remark1 like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotLike(String value) {
            addCriterion("remark1 not like", value, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1In(List<String> values) {
            addCriterion("remark1 in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotIn(List<String> values) {
            addCriterion("remark1 not in", values, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1Between(String value1, String value2) {
            addCriterion("remark1 between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andRemark1NotBetween(String value1, String value2) {
            addCriterion("remark1 not between", value1, value2, "remark1");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNull() {
            addCriterion("paychannel is null");
            return (Criteria) this;
        }

        public Criteria andPaychannelIsNotNull() {
            addCriterion("paychannel is not null");
            return (Criteria) this;
        }

        public Criteria andPaychannelEqualTo(String value) {
            addCriterion("paychannel =", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotEqualTo(String value) {
            addCriterion("paychannel <>", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThan(String value) {
            addCriterion("paychannel >", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelGreaterThanOrEqualTo(String value) {
            addCriterion("paychannel >=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThan(String value) {
            addCriterion("paychannel <", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLessThanOrEqualTo(String value) {
            addCriterion("paychannel <=", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelLike(String value) {
            addCriterion("paychannel like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotLike(String value) {
            addCriterion("paychannel not like", value, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelIn(List<String> values) {
            addCriterion("paychannel in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotIn(List<String> values) {
            addCriterion("paychannel not in", values, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelBetween(String value1, String value2) {
            addCriterion("paychannel between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaychannelNotBetween(String value1, String value2) {
            addCriterion("paychannel not between", value1, value2, "paychannel");
            return (Criteria) this;
        }

        public Criteria andPaycodeIsNull() {
            addCriterion("paycode is null");
            return (Criteria) this;
        }

        public Criteria andPaycodeIsNotNull() {
            addCriterion("paycode is not null");
            return (Criteria) this;
        }

        public Criteria andPaycodeEqualTo(String value) {
            addCriterion("paycode =", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotEqualTo(String value) {
            addCriterion("paycode <>", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeGreaterThan(String value) {
            addCriterion("paycode >", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeGreaterThanOrEqualTo(String value) {
            addCriterion("paycode >=", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeLessThan(String value) {
            addCriterion("paycode <", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeLessThanOrEqualTo(String value) {
            addCriterion("paycode <=", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeLike(String value) {
            addCriterion("paycode like", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotLike(String value) {
            addCriterion("paycode not like", value, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeIn(List<String> values) {
            addCriterion("paycode in", values, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotIn(List<String> values) {
            addCriterion("paycode not in", values, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeBetween(String value1, String value2) {
            addCriterion("paycode between", value1, value2, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaycodeNotBetween(String value1, String value2) {
            addCriterion("paycode not between", value1, value2, "paycode");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNull() {
            addCriterion("paytype is null");
            return (Criteria) this;
        }

        public Criteria andPaytypeIsNotNull() {
            addCriterion("paytype is not null");
            return (Criteria) this;
        }

        public Criteria andPaytypeEqualTo(String value) {
            addCriterion("paytype =", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotEqualTo(String value) {
            addCriterion("paytype <>", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThan(String value) {
            addCriterion("paytype >", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeGreaterThanOrEqualTo(String value) {
            addCriterion("paytype >=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThan(String value) {
            addCriterion("paytype <", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLessThanOrEqualTo(String value) {
            addCriterion("paytype <=", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeLike(String value) {
            addCriterion("paytype like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotLike(String value) {
            addCriterion("paytype not like", value, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeIn(List<String> values) {
            addCriterion("paytype in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotIn(List<String> values) {
            addCriterion("paytype not in", values, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeBetween(String value1, String value2) {
            addCriterion("paytype between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaytypeNotBetween(String value1, String value2) {
            addCriterion("paytype not between", value1, value2, "paytype");
            return (Criteria) this;
        }

        public Criteria andPaykeyIsNull() {
            addCriterion("paykey is null");
            return (Criteria) this;
        }

        public Criteria andPaykeyIsNotNull() {
            addCriterion("paykey is not null");
            return (Criteria) this;
        }

        public Criteria andPaykeyEqualTo(String value) {
            addCriterion("paykey =", value, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyNotEqualTo(String value) {
            addCriterion("paykey <>", value, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyGreaterThan(String value) {
            addCriterion("paykey >", value, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyGreaterThanOrEqualTo(String value) {
            addCriterion("paykey >=", value, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyLessThan(String value) {
            addCriterion("paykey <", value, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyLessThanOrEqualTo(String value) {
            addCriterion("paykey <=", value, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyLike(String value) {
            addCriterion("paykey like", value, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyNotLike(String value) {
            addCriterion("paykey not like", value, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyIn(List<String> values) {
            addCriterion("paykey in", values, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyNotIn(List<String> values) {
            addCriterion("paykey not in", values, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyBetween(String value1, String value2) {
            addCriterion("paykey between", value1, value2, "paykey");
            return (Criteria) this;
        }

        public Criteria andPaykeyNotBetween(String value1, String value2) {
            addCriterion("paykey not between", value1, value2, "paykey");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNull() {
            addCriterion("order_type is null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIsNotNull() {
            addCriterion("order_type is not null");
            return (Criteria) this;
        }

        public Criteria andOrderTypeEqualTo(Boolean value) {
            addCriterion("order_type =", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotEqualTo(Boolean value) {
            addCriterion("order_type <>", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThan(Boolean value) {
            addCriterion("order_type >", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("order_type >=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThan(Boolean value) {
            addCriterion("order_type <", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("order_type <=", value, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeIn(List<Boolean> values) {
            addCriterion("order_type in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotIn(List<Boolean> values) {
            addCriterion("order_type not in", values, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("order_type between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andOrderTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("order_type not between", value1, value2, "orderType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNull() {
            addCriterion("source_type is null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIsNotNull() {
            addCriterion("source_type is not null");
            return (Criteria) this;
        }

        public Criteria andSourceTypeEqualTo(Boolean value) {
            addCriterion("source_type =", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotEqualTo(Boolean value) {
            addCriterion("source_type <>", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThan(Boolean value) {
            addCriterion("source_type >", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("source_type >=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThan(Boolean value) {
            addCriterion("source_type <", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("source_type <=", value, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeIn(List<Boolean> values) {
            addCriterion("source_type in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotIn(List<Boolean> values) {
            addCriterion("source_type not in", values, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("source_type between", value1, value2, "sourceType");
            return (Criteria) this;
        }

        public Criteria andSourceTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("source_type not between", value1, value2, "sourceType");
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