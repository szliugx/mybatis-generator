package com.youban.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class CCardExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public CCardExample() {
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

        public Criteria andCardIdIsNull() {
            addCriterion("card_id is null");
            return (Criteria) this;
        }

        public Criteria andCardIdIsNotNull() {
            addCriterion("card_id is not null");
            return (Criteria) this;
        }

        public Criteria andCardIdEqualTo(String value) {
            addCriterion("card_id =", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotEqualTo(String value) {
            addCriterion("card_id <>", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThan(String value) {
            addCriterion("card_id >", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("card_id >=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThan(String value) {
            addCriterion("card_id <", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLessThanOrEqualTo(String value) {
            addCriterion("card_id <=", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdLike(String value) {
            addCriterion("card_id like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotLike(String value) {
            addCriterion("card_id not like", value, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdIn(List<String> values) {
            addCriterion("card_id in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotIn(List<String> values) {
            addCriterion("card_id not in", values, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdBetween(String value1, String value2) {
            addCriterion("card_id between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andCardIdNotBetween(String value1, String value2) {
            addCriterion("card_id not between", value1, value2, "cardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdIsNull() {
            addCriterion("wechat_card_id is null");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdIsNotNull() {
            addCriterion("wechat_card_id is not null");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdEqualTo(String value) {
            addCriterion("wechat_card_id =", value, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdNotEqualTo(String value) {
            addCriterion("wechat_card_id <>", value, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdGreaterThan(String value) {
            addCriterion("wechat_card_id >", value, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdGreaterThanOrEqualTo(String value) {
            addCriterion("wechat_card_id >=", value, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdLessThan(String value) {
            addCriterion("wechat_card_id <", value, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdLessThanOrEqualTo(String value) {
            addCriterion("wechat_card_id <=", value, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdLike(String value) {
            addCriterion("wechat_card_id like", value, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdNotLike(String value) {
            addCriterion("wechat_card_id not like", value, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdIn(List<String> values) {
            addCriterion("wechat_card_id in", values, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdNotIn(List<String> values) {
            addCriterion("wechat_card_id not in", values, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdBetween(String value1, String value2) {
            addCriterion("wechat_card_id between", value1, value2, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andWechatCardIdNotBetween(String value1, String value2) {
            addCriterion("wechat_card_id not between", value1, value2, "wechatCardId");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNull() {
            addCriterion("card_name is null");
            return (Criteria) this;
        }

        public Criteria andCardNameIsNotNull() {
            addCriterion("card_name is not null");
            return (Criteria) this;
        }

        public Criteria andCardNameEqualTo(String value) {
            addCriterion("card_name =", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotEqualTo(String value) {
            addCriterion("card_name <>", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThan(String value) {
            addCriterion("card_name >", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameGreaterThanOrEqualTo(String value) {
            addCriterion("card_name >=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThan(String value) {
            addCriterion("card_name <", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLessThanOrEqualTo(String value) {
            addCriterion("card_name <=", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameLike(String value) {
            addCriterion("card_name like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotLike(String value) {
            addCriterion("card_name not like", value, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameIn(List<String> values) {
            addCriterion("card_name in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotIn(List<String> values) {
            addCriterion("card_name not in", values, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameBetween(String value1, String value2) {
            addCriterion("card_name between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardNameNotBetween(String value1, String value2) {
            addCriterion("card_name not between", value1, value2, "cardName");
            return (Criteria) this;
        }

        public Criteria andCardStatusIsNull() {
            addCriterion("card_status is null");
            return (Criteria) this;
        }

        public Criteria andCardStatusIsNotNull() {
            addCriterion("card_status is not null");
            return (Criteria) this;
        }

        public Criteria andCardStatusEqualTo(Byte value) {
            addCriterion("card_status =", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotEqualTo(Byte value) {
            addCriterion("card_status <>", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusGreaterThan(Byte value) {
            addCriterion("card_status >", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("card_status >=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusLessThan(Byte value) {
            addCriterion("card_status <", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusLessThanOrEqualTo(Byte value) {
            addCriterion("card_status <=", value, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusIn(List<Byte> values) {
            addCriterion("card_status in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotIn(List<Byte> values) {
            addCriterion("card_status not in", values, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusBetween(Byte value1, Byte value2) {
            addCriterion("card_status between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("card_status not between", value1, value2, "cardStatus");
            return (Criteria) this;
        }

        public Criteria andCardSourceIsNull() {
            addCriterion("card_source is null");
            return (Criteria) this;
        }

        public Criteria andCardSourceIsNotNull() {
            addCriterion("card_source is not null");
            return (Criteria) this;
        }

        public Criteria andCardSourceEqualTo(String value) {
            addCriterion("card_source =", value, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceNotEqualTo(String value) {
            addCriterion("card_source <>", value, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceGreaterThan(String value) {
            addCriterion("card_source >", value, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceGreaterThanOrEqualTo(String value) {
            addCriterion("card_source >=", value, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceLessThan(String value) {
            addCriterion("card_source <", value, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceLessThanOrEqualTo(String value) {
            addCriterion("card_source <=", value, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceLike(String value) {
            addCriterion("card_source like", value, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceNotLike(String value) {
            addCriterion("card_source not like", value, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceIn(List<String> values) {
            addCriterion("card_source in", values, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceNotIn(List<String> values) {
            addCriterion("card_source not in", values, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceBetween(String value1, String value2) {
            addCriterion("card_source between", value1, value2, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardSourceNotBetween(String value1, String value2) {
            addCriterion("card_source not between", value1, value2, "cardSource");
            return (Criteria) this;
        }

        public Criteria andCardUrlIsNull() {
            addCriterion("card_url is null");
            return (Criteria) this;
        }

        public Criteria andCardUrlIsNotNull() {
            addCriterion("card_url is not null");
            return (Criteria) this;
        }

        public Criteria andCardUrlEqualTo(String value) {
            addCriterion("card_url =", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlNotEqualTo(String value) {
            addCriterion("card_url <>", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlGreaterThan(String value) {
            addCriterion("card_url >", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlGreaterThanOrEqualTo(String value) {
            addCriterion("card_url >=", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlLessThan(String value) {
            addCriterion("card_url <", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlLessThanOrEqualTo(String value) {
            addCriterion("card_url <=", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlLike(String value) {
            addCriterion("card_url like", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlNotLike(String value) {
            addCriterion("card_url not like", value, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlIn(List<String> values) {
            addCriterion("card_url in", values, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlNotIn(List<String> values) {
            addCriterion("card_url not in", values, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlBetween(String value1, String value2) {
            addCriterion("card_url between", value1, value2, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardUrlNotBetween(String value1, String value2) {
            addCriterion("card_url not between", value1, value2, "cardUrl");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeIsNull() {
            addCriterion("card_put_type is null");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeIsNotNull() {
            addCriterion("card_put_type is not null");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeEqualTo(String value) {
            addCriterion("card_put_type =", value, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeNotEqualTo(String value) {
            addCriterion("card_put_type <>", value, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeGreaterThan(String value) {
            addCriterion("card_put_type >", value, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeGreaterThanOrEqualTo(String value) {
            addCriterion("card_put_type >=", value, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeLessThan(String value) {
            addCriterion("card_put_type <", value, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeLessThanOrEqualTo(String value) {
            addCriterion("card_put_type <=", value, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeLike(String value) {
            addCriterion("card_put_type like", value, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeNotLike(String value) {
            addCriterion("card_put_type not like", value, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeIn(List<String> values) {
            addCriterion("card_put_type in", values, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeNotIn(List<String> values) {
            addCriterion("card_put_type not in", values, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeBetween(String value1, String value2) {
            addCriterion("card_put_type between", value1, value2, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andCardPutTypeNotBetween(String value1, String value2) {
            addCriterion("card_put_type not between", value1, value2, "cardPutType");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNull() {
            addCriterion("description is null");
            return (Criteria) this;
        }

        public Criteria andDescriptionIsNotNull() {
            addCriterion("description is not null");
            return (Criteria) this;
        }

        public Criteria andDescriptionEqualTo(String value) {
            addCriterion("description =", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotEqualTo(String value) {
            addCriterion("description <>", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThan(String value) {
            addCriterion("description >", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionGreaterThanOrEqualTo(String value) {
            addCriterion("description >=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThan(String value) {
            addCriterion("description <", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLessThanOrEqualTo(String value) {
            addCriterion("description <=", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionLike(String value) {
            addCriterion("description like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotLike(String value) {
            addCriterion("description not like", value, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionIn(List<String> values) {
            addCriterion("description in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotIn(List<String> values) {
            addCriterion("description not in", values, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionBetween(String value1, String value2) {
            addCriterion("description between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andDescriptionNotBetween(String value1, String value2) {
            addCriterion("description not between", value1, value2, "description");
            return (Criteria) this;
        }

        public Criteria andBindUserIsNull() {
            addCriterion("bind_user is null");
            return (Criteria) this;
        }

        public Criteria andBindUserIsNotNull() {
            addCriterion("bind_user is not null");
            return (Criteria) this;
        }

        public Criteria andBindUserEqualTo(Byte value) {
            addCriterion("bind_user =", value, "bindUser");
            return (Criteria) this;
        }

        public Criteria andBindUserNotEqualTo(Byte value) {
            addCriterion("bind_user <>", value, "bindUser");
            return (Criteria) this;
        }

        public Criteria andBindUserGreaterThan(Byte value) {
            addCriterion("bind_user >", value, "bindUser");
            return (Criteria) this;
        }

        public Criteria andBindUserGreaterThanOrEqualTo(Byte value) {
            addCriterion("bind_user >=", value, "bindUser");
            return (Criteria) this;
        }

        public Criteria andBindUserLessThan(Byte value) {
            addCriterion("bind_user <", value, "bindUser");
            return (Criteria) this;
        }

        public Criteria andBindUserLessThanOrEqualTo(Byte value) {
            addCriterion("bind_user <=", value, "bindUser");
            return (Criteria) this;
        }

        public Criteria andBindUserIn(List<Byte> values) {
            addCriterion("bind_user in", values, "bindUser");
            return (Criteria) this;
        }

        public Criteria andBindUserNotIn(List<Byte> values) {
            addCriterion("bind_user not in", values, "bindUser");
            return (Criteria) this;
        }

        public Criteria andBindUserBetween(Byte value1, Byte value2) {
            addCriterion("bind_user between", value1, value2, "bindUser");
            return (Criteria) this;
        }

        public Criteria andBindUserNotBetween(Byte value1, Byte value2) {
            addCriterion("bind_user not between", value1, value2, "bindUser");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNull() {
            addCriterion("inventory is null");
            return (Criteria) this;
        }

        public Criteria andInventoryIsNotNull() {
            addCriterion("inventory is not null");
            return (Criteria) this;
        }

        public Criteria andInventoryEqualTo(Integer value) {
            addCriterion("inventory =", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotEqualTo(Integer value) {
            addCriterion("inventory <>", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThan(Integer value) {
            addCriterion("inventory >", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryGreaterThanOrEqualTo(Integer value) {
            addCriterion("inventory >=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThan(Integer value) {
            addCriterion("inventory <", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryLessThanOrEqualTo(Integer value) {
            addCriterion("inventory <=", value, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryIn(List<Integer> values) {
            addCriterion("inventory in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotIn(List<Integer> values) {
            addCriterion("inventory not in", values, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryBetween(Integer value1, Integer value2) {
            addCriterion("inventory between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andInventoryNotBetween(Integer value1, Integer value2) {
            addCriterion("inventory not between", value1, value2, "inventory");
            return (Criteria) this;
        }

        public Criteria andGiveNumIsNull() {
            addCriterion("give_num is null");
            return (Criteria) this;
        }

        public Criteria andGiveNumIsNotNull() {
            addCriterion("give_num is not null");
            return (Criteria) this;
        }

        public Criteria andGiveNumEqualTo(Integer value) {
            addCriterion("give_num =", value, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGiveNumNotEqualTo(Integer value) {
            addCriterion("give_num <>", value, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGiveNumGreaterThan(Integer value) {
            addCriterion("give_num >", value, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGiveNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("give_num >=", value, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGiveNumLessThan(Integer value) {
            addCriterion("give_num <", value, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGiveNumLessThanOrEqualTo(Integer value) {
            addCriterion("give_num <=", value, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGiveNumIn(List<Integer> values) {
            addCriterion("give_num in", values, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGiveNumNotIn(List<Integer> values) {
            addCriterion("give_num not in", values, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGiveNumBetween(Integer value1, Integer value2) {
            addCriterion("give_num between", value1, value2, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGiveNumNotBetween(Integer value1, Integer value2) {
            addCriterion("give_num not between", value1, value2, "giveNum");
            return (Criteria) this;
        }

        public Criteria andGetLimitIsNull() {
            addCriterion("get_limit is null");
            return (Criteria) this;
        }

        public Criteria andGetLimitIsNotNull() {
            addCriterion("get_limit is not null");
            return (Criteria) this;
        }

        public Criteria andGetLimitEqualTo(Integer value) {
            addCriterion("get_limit =", value, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetLimitNotEqualTo(Integer value) {
            addCriterion("get_limit <>", value, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetLimitGreaterThan(Integer value) {
            addCriterion("get_limit >", value, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_limit >=", value, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetLimitLessThan(Integer value) {
            addCriterion("get_limit <", value, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetLimitLessThanOrEqualTo(Integer value) {
            addCriterion("get_limit <=", value, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetLimitIn(List<Integer> values) {
            addCriterion("get_limit in", values, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetLimitNotIn(List<Integer> values) {
            addCriterion("get_limit not in", values, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetLimitBetween(Integer value1, Integer value2) {
            addCriterion("get_limit between", value1, value2, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("get_limit not between", value1, value2, "getLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitIsNull() {
            addCriterion("get_day_limit is null");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitIsNotNull() {
            addCriterion("get_day_limit is not null");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitEqualTo(Integer value) {
            addCriterion("get_day_limit =", value, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitNotEqualTo(Integer value) {
            addCriterion("get_day_limit <>", value, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitGreaterThan(Integer value) {
            addCriterion("get_day_limit >", value, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitGreaterThanOrEqualTo(Integer value) {
            addCriterion("get_day_limit >=", value, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitLessThan(Integer value) {
            addCriterion("get_day_limit <", value, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitLessThanOrEqualTo(Integer value) {
            addCriterion("get_day_limit <=", value, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitIn(List<Integer> values) {
            addCriterion("get_day_limit in", values, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitNotIn(List<Integer> values) {
            addCriterion("get_day_limit not in", values, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitBetween(Integer value1, Integer value2) {
            addCriterion("get_day_limit between", value1, value2, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andGetDayLimitNotBetween(Integer value1, Integer value2) {
            addCriterion("get_day_limit not between", value1, value2, "getDayLimit");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeIsNull() {
            addCriterion("sel_goods_type is null");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeIsNotNull() {
            addCriterion("sel_goods_type is not null");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeEqualTo(Boolean value) {
            addCriterion("sel_goods_type =", value, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeNotEqualTo(Boolean value) {
            addCriterion("sel_goods_type <>", value, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeGreaterThan(Boolean value) {
            addCriterion("sel_goods_type >", value, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeGreaterThanOrEqualTo(Boolean value) {
            addCriterion("sel_goods_type >=", value, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeLessThan(Boolean value) {
            addCriterion("sel_goods_type <", value, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeLessThanOrEqualTo(Boolean value) {
            addCriterion("sel_goods_type <=", value, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeIn(List<Boolean> values) {
            addCriterion("sel_goods_type in", values, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeNotIn(List<Boolean> values) {
            addCriterion("sel_goods_type not in", values, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeBetween(Boolean value1, Boolean value2) {
            addCriterion("sel_goods_type between", value1, value2, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andSelGoodsTypeNotBetween(Boolean value1, Boolean value2) {
            addCriterion("sel_goods_type not between", value1, value2, "selGoodsType");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendIsNull() {
            addCriterion("can_give_friend is null");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendIsNotNull() {
            addCriterion("can_give_friend is not null");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendEqualTo(Byte value) {
            addCriterion("can_give_friend =", value, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendNotEqualTo(Byte value) {
            addCriterion("can_give_friend <>", value, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendGreaterThan(Byte value) {
            addCriterion("can_give_friend >", value, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendGreaterThanOrEqualTo(Byte value) {
            addCriterion("can_give_friend >=", value, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendLessThan(Byte value) {
            addCriterion("can_give_friend <", value, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendLessThanOrEqualTo(Byte value) {
            addCriterion("can_give_friend <=", value, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendIn(List<Byte> values) {
            addCriterion("can_give_friend in", values, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendNotIn(List<Byte> values) {
            addCriterion("can_give_friend not in", values, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendBetween(Byte value1, Byte value2) {
            addCriterion("can_give_friend between", value1, value2, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanGiveFriendNotBetween(Byte value1, Byte value2) {
            addCriterion("can_give_friend not between", value1, value2, "canGiveFriend");
            return (Criteria) this;
        }

        public Criteria andCanSharedIsNull() {
            addCriterion("can_shared is null");
            return (Criteria) this;
        }

        public Criteria andCanSharedIsNotNull() {
            addCriterion("can_shared is not null");
            return (Criteria) this;
        }

        public Criteria andCanSharedEqualTo(Boolean value) {
            addCriterion("can_shared =", value, "canShared");
            return (Criteria) this;
        }

        public Criteria andCanSharedNotEqualTo(Boolean value) {
            addCriterion("can_shared <>", value, "canShared");
            return (Criteria) this;
        }

        public Criteria andCanSharedGreaterThan(Boolean value) {
            addCriterion("can_shared >", value, "canShared");
            return (Criteria) this;
        }

        public Criteria andCanSharedGreaterThanOrEqualTo(Boolean value) {
            addCriterion("can_shared >=", value, "canShared");
            return (Criteria) this;
        }

        public Criteria andCanSharedLessThan(Boolean value) {
            addCriterion("can_shared <", value, "canShared");
            return (Criteria) this;
        }

        public Criteria andCanSharedLessThanOrEqualTo(Boolean value) {
            addCriterion("can_shared <=", value, "canShared");
            return (Criteria) this;
        }

        public Criteria andCanSharedIn(List<Boolean> values) {
            addCriterion("can_shared in", values, "canShared");
            return (Criteria) this;
        }

        public Criteria andCanSharedNotIn(List<Boolean> values) {
            addCriterion("can_shared not in", values, "canShared");
            return (Criteria) this;
        }

        public Criteria andCanSharedBetween(Boolean value1, Boolean value2) {
            addCriterion("can_shared between", value1, value2, "canShared");
            return (Criteria) this;
        }

        public Criteria andCanSharedNotBetween(Boolean value1, Boolean value2) {
            addCriterion("can_shared not between", value1, value2, "canShared");
            return (Criteria) this;
        }

        public Criteria andIsWechatIsNull() {
            addCriterion("is_wechat is null");
            return (Criteria) this;
        }

        public Criteria andIsWechatIsNotNull() {
            addCriterion("is_wechat is not null");
            return (Criteria) this;
        }

        public Criteria andIsWechatEqualTo(Boolean value) {
            addCriterion("is_wechat =", value, "isWechat");
            return (Criteria) this;
        }

        public Criteria andIsWechatNotEqualTo(Boolean value) {
            addCriterion("is_wechat <>", value, "isWechat");
            return (Criteria) this;
        }

        public Criteria andIsWechatGreaterThan(Boolean value) {
            addCriterion("is_wechat >", value, "isWechat");
            return (Criteria) this;
        }

        public Criteria andIsWechatGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_wechat >=", value, "isWechat");
            return (Criteria) this;
        }

        public Criteria andIsWechatLessThan(Boolean value) {
            addCriterion("is_wechat <", value, "isWechat");
            return (Criteria) this;
        }

        public Criteria andIsWechatLessThanOrEqualTo(Boolean value) {
            addCriterion("is_wechat <=", value, "isWechat");
            return (Criteria) this;
        }

        public Criteria andIsWechatIn(List<Boolean> values) {
            addCriterion("is_wechat in", values, "isWechat");
            return (Criteria) this;
        }

        public Criteria andIsWechatNotIn(List<Boolean> values) {
            addCriterion("is_wechat not in", values, "isWechat");
            return (Criteria) this;
        }

        public Criteria andIsWechatBetween(Boolean value1, Boolean value2) {
            addCriterion("is_wechat between", value1, value2, "isWechat");
            return (Criteria) this;
        }

        public Criteria andIsWechatNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_wechat not between", value1, value2, "isWechat");
            return (Criteria) this;
        }

        public Criteria andStatusIsNull() {
            addCriterion("status is null");
            return (Criteria) this;
        }

        public Criteria andStatusIsNotNull() {
            addCriterion("status is not null");
            return (Criteria) this;
        }

        public Criteria andStatusEqualTo(Boolean value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Boolean value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Boolean value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Boolean value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Boolean value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Boolean value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Boolean> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Boolean> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Boolean value1, Boolean value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Boolean value1, Boolean value2) {
            addCriterion("status not between", value1, value2, "status");
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