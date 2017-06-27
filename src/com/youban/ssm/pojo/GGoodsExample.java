package com.youban.ssm.pojo;

import java.util.ArrayList;
import java.util.List;

public class GGoodsExample {
    protected String orderByClause;

    protected boolean distinct;

    protected List<Criteria> oredCriteria;

    public GGoodsExample() {
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

        public Criteria andCategoryIdIsNull() {
            addCriterion("category_id is null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIsNotNull() {
            addCriterion("category_id is not null");
            return (Criteria) this;
        }

        public Criteria andCategoryIdEqualTo(Integer value) {
            addCriterion("category_id =", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotEqualTo(Integer value) {
            addCriterion("category_id <>", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThan(Integer value) {
            addCriterion("category_id >", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdGreaterThanOrEqualTo(Integer value) {
            addCriterion("category_id >=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThan(Integer value) {
            addCriterion("category_id <", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdLessThanOrEqualTo(Integer value) {
            addCriterion("category_id <=", value, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdIn(List<Integer> values) {
            addCriterion("category_id in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotIn(List<Integer> values) {
            addCriterion("category_id not in", values, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdBetween(Integer value1, Integer value2) {
            addCriterion("category_id between", value1, value2, "categoryId");
            return (Criteria) this;
        }

        public Criteria andCategoryIdNotBetween(Integer value1, Integer value2) {
            addCriterion("category_id not between", value1, value2, "categoryId");
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

        public Criteria andChannelTypeIsNull() {
            addCriterion("channel_type is null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIsNotNull() {
            addCriterion("channel_type is not null");
            return (Criteria) this;
        }

        public Criteria andChannelTypeEqualTo(Byte value) {
            addCriterion("channel_type =", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotEqualTo(Byte value) {
            addCriterion("channel_type <>", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThan(Byte value) {
            addCriterion("channel_type >", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("channel_type >=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThan(Byte value) {
            addCriterion("channel_type <", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeLessThanOrEqualTo(Byte value) {
            addCriterion("channel_type <=", value, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeIn(List<Byte> values) {
            addCriterion("channel_type in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotIn(List<Byte> values) {
            addCriterion("channel_type not in", values, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeBetween(Byte value1, Byte value2) {
            addCriterion("channel_type between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andChannelTypeNotBetween(Byte value1, Byte value2) {
            addCriterion("channel_type not between", value1, value2, "channelType");
            return (Criteria) this;
        }

        public Criteria andBizcodeIsNull() {
            addCriterion("bizcode is null");
            return (Criteria) this;
        }

        public Criteria andBizcodeIsNotNull() {
            addCriterion("bizcode is not null");
            return (Criteria) this;
        }

        public Criteria andBizcodeEqualTo(String value) {
            addCriterion("bizcode =", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeNotEqualTo(String value) {
            addCriterion("bizcode <>", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeGreaterThan(String value) {
            addCriterion("bizcode >", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeGreaterThanOrEqualTo(String value) {
            addCriterion("bizcode >=", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeLessThan(String value) {
            addCriterion("bizcode <", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeLessThanOrEqualTo(String value) {
            addCriterion("bizcode <=", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeLike(String value) {
            addCriterion("bizcode like", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeNotLike(String value) {
            addCriterion("bizcode not like", value, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeIn(List<String> values) {
            addCriterion("bizcode in", values, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeNotIn(List<String> values) {
            addCriterion("bizcode not in", values, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeBetween(String value1, String value2) {
            addCriterion("bizcode between", value1, value2, "bizcode");
            return (Criteria) this;
        }

        public Criteria andBizcodeNotBetween(String value1, String value2) {
            addCriterion("bizcode not between", value1, value2, "bizcode");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIsNull() {
            addCriterion("goodsno is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIsNotNull() {
            addCriterion("goodsno is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnoEqualTo(String value) {
            addCriterion("goodsno =", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotEqualTo(String value) {
            addCriterion("goodsno <>", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThan(String value) {
            addCriterion("goodsno >", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoGreaterThanOrEqualTo(String value) {
            addCriterion("goodsno >=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThan(String value) {
            addCriterion("goodsno <", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLessThanOrEqualTo(String value) {
            addCriterion("goodsno <=", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoLike(String value) {
            addCriterion("goodsno like", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotLike(String value) {
            addCriterion("goodsno not like", value, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoIn(List<String> values) {
            addCriterion("goodsno in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotIn(List<String> values) {
            addCriterion("goodsno not in", values, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoBetween(String value1, String value2) {
            addCriterion("goodsno between", value1, value2, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodsnoNotBetween(String value1, String value2) {
            addCriterion("goodsno not between", value1, value2, "goodsno");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryIsNull() {
            addCriterion("goodssummary is null");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryIsNotNull() {
            addCriterion("goodssummary is not null");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryEqualTo(String value) {
            addCriterion("goodssummary =", value, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryNotEqualTo(String value) {
            addCriterion("goodssummary <>", value, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryGreaterThan(String value) {
            addCriterion("goodssummary >", value, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryGreaterThanOrEqualTo(String value) {
            addCriterion("goodssummary >=", value, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryLessThan(String value) {
            addCriterion("goodssummary <", value, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryLessThanOrEqualTo(String value) {
            addCriterion("goodssummary <=", value, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryLike(String value) {
            addCriterion("goodssummary like", value, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryNotLike(String value) {
            addCriterion("goodssummary not like", value, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryIn(List<String> values) {
            addCriterion("goodssummary in", values, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryNotIn(List<String> values) {
            addCriterion("goodssummary not in", values, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryBetween(String value1, String value2) {
            addCriterion("goodssummary between", value1, value2, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodssummaryNotBetween(String value1, String value2) {
            addCriterion("goodssummary not between", value1, value2, "goodssummary");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNull() {
            addCriterion("goodsname is null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIsNotNull() {
            addCriterion("goodsname is not null");
            return (Criteria) this;
        }

        public Criteria andGoodsnameEqualTo(String value) {
            addCriterion("goodsname =", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotEqualTo(String value) {
            addCriterion("goodsname <>", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThan(String value) {
            addCriterion("goodsname >", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameGreaterThanOrEqualTo(String value) {
            addCriterion("goodsname >=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThan(String value) {
            addCriterion("goodsname <", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLessThanOrEqualTo(String value) {
            addCriterion("goodsname <=", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameLike(String value) {
            addCriterion("goodsname like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotLike(String value) {
            addCriterion("goodsname not like", value, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameIn(List<String> values) {
            addCriterion("goodsname in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotIn(List<String> values) {
            addCriterion("goodsname not in", values, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameBetween(String value1, String value2) {
            addCriterion("goodsname between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andGoodsnameNotBetween(String value1, String value2) {
            addCriterion("goodsname not between", value1, value2, "goodsname");
            return (Criteria) this;
        }

        public Criteria andTitleIsNull() {
            addCriterion("title is null");
            return (Criteria) this;
        }

        public Criteria andTitleIsNotNull() {
            addCriterion("title is not null");
            return (Criteria) this;
        }

        public Criteria andTitleEqualTo(String value) {
            addCriterion("title =", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotEqualTo(String value) {
            addCriterion("title <>", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThan(String value) {
            addCriterion("title >", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleGreaterThanOrEqualTo(String value) {
            addCriterion("title >=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThan(String value) {
            addCriterion("title <", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLessThanOrEqualTo(String value) {
            addCriterion("title <=", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleLike(String value) {
            addCriterion("title like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotLike(String value) {
            addCriterion("title not like", value, "title");
            return (Criteria) this;
        }

        public Criteria andTitleIn(List<String> values) {
            addCriterion("title in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotIn(List<String> values) {
            addCriterion("title not in", values, "title");
            return (Criteria) this;
        }

        public Criteria andTitleBetween(String value1, String value2) {
            addCriterion("title between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andTitleNotBetween(String value1, String value2) {
            addCriterion("title not between", value1, value2, "title");
            return (Criteria) this;
        }

        public Criteria andNumIsNull() {
            addCriterion("num is null");
            return (Criteria) this;
        }

        public Criteria andNumIsNotNull() {
            addCriterion("num is not null");
            return (Criteria) this;
        }

        public Criteria andNumEqualTo(Integer value) {
            addCriterion("num =", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotEqualTo(Integer value) {
            addCriterion("num <>", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThan(Integer value) {
            addCriterion("num >", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumGreaterThanOrEqualTo(Integer value) {
            addCriterion("num >=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThan(Integer value) {
            addCriterion("num <", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumLessThanOrEqualTo(Integer value) {
            addCriterion("num <=", value, "num");
            return (Criteria) this;
        }

        public Criteria andNumIn(List<Integer> values) {
            addCriterion("num in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotIn(List<Integer> values) {
            addCriterion("num not in", values, "num");
            return (Criteria) this;
        }

        public Criteria andNumBetween(Integer value1, Integer value2) {
            addCriterion("num between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andNumNotBetween(Integer value1, Integer value2) {
            addCriterion("num not between", value1, value2, "num");
            return (Criteria) this;
        }

        public Criteria andSalenumIsNull() {
            addCriterion("salenum is null");
            return (Criteria) this;
        }

        public Criteria andSalenumIsNotNull() {
            addCriterion("salenum is not null");
            return (Criteria) this;
        }

        public Criteria andSalenumEqualTo(Integer value) {
            addCriterion("salenum =", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumNotEqualTo(Integer value) {
            addCriterion("salenum <>", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumGreaterThan(Integer value) {
            addCriterion("salenum >", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumGreaterThanOrEqualTo(Integer value) {
            addCriterion("salenum >=", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumLessThan(Integer value) {
            addCriterion("salenum <", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumLessThanOrEqualTo(Integer value) {
            addCriterion("salenum <=", value, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumIn(List<Integer> values) {
            addCriterion("salenum in", values, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumNotIn(List<Integer> values) {
            addCriterion("salenum not in", values, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumBetween(Integer value1, Integer value2) {
            addCriterion("salenum between", value1, value2, "salenum");
            return (Criteria) this;
        }

        public Criteria andSalenumNotBetween(Integer value1, Integer value2) {
            addCriterion("salenum not between", value1, value2, "salenum");
            return (Criteria) this;
        }

        public Criteria andListpriceIsNull() {
            addCriterion("listprice is null");
            return (Criteria) this;
        }

        public Criteria andListpriceIsNotNull() {
            addCriterion("listprice is not null");
            return (Criteria) this;
        }

        public Criteria andListpriceEqualTo(Integer value) {
            addCriterion("listprice =", value, "listprice");
            return (Criteria) this;
        }

        public Criteria andListpriceNotEqualTo(Integer value) {
            addCriterion("listprice <>", value, "listprice");
            return (Criteria) this;
        }

        public Criteria andListpriceGreaterThan(Integer value) {
            addCriterion("listprice >", value, "listprice");
            return (Criteria) this;
        }

        public Criteria andListpriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("listprice >=", value, "listprice");
            return (Criteria) this;
        }

        public Criteria andListpriceLessThan(Integer value) {
            addCriterion("listprice <", value, "listprice");
            return (Criteria) this;
        }

        public Criteria andListpriceLessThanOrEqualTo(Integer value) {
            addCriterion("listprice <=", value, "listprice");
            return (Criteria) this;
        }

        public Criteria andListpriceIn(List<Integer> values) {
            addCriterion("listprice in", values, "listprice");
            return (Criteria) this;
        }

        public Criteria andListpriceNotIn(List<Integer> values) {
            addCriterion("listprice not in", values, "listprice");
            return (Criteria) this;
        }

        public Criteria andListpriceBetween(Integer value1, Integer value2) {
            addCriterion("listprice between", value1, value2, "listprice");
            return (Criteria) this;
        }

        public Criteria andListpriceNotBetween(Integer value1, Integer value2) {
            addCriterion("listprice not between", value1, value2, "listprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNull() {
            addCriterion("saleprice is null");
            return (Criteria) this;
        }

        public Criteria andSalepriceIsNotNull() {
            addCriterion("saleprice is not null");
            return (Criteria) this;
        }

        public Criteria andSalepriceEqualTo(Integer value) {
            addCriterion("saleprice =", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotEqualTo(Integer value) {
            addCriterion("saleprice <>", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThan(Integer value) {
            addCriterion("saleprice >", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceGreaterThanOrEqualTo(Integer value) {
            addCriterion("saleprice >=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThan(Integer value) {
            addCriterion("saleprice <", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceLessThanOrEqualTo(Integer value) {
            addCriterion("saleprice <=", value, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceIn(List<Integer> values) {
            addCriterion("saleprice in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotIn(List<Integer> values) {
            addCriterion("saleprice not in", values, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceBetween(Integer value1, Integer value2) {
            addCriterion("saleprice between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andSalepriceNotBetween(Integer value1, Integer value2) {
            addCriterion("saleprice not between", value1, value2, "saleprice");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeIsNull() {
            addCriterion("goodstypecode is null");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeIsNotNull() {
            addCriterion("goodstypecode is not null");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeEqualTo(String value) {
            addCriterion("goodstypecode =", value, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeNotEqualTo(String value) {
            addCriterion("goodstypecode <>", value, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeGreaterThan(String value) {
            addCriterion("goodstypecode >", value, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeGreaterThanOrEqualTo(String value) {
            addCriterion("goodstypecode >=", value, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeLessThan(String value) {
            addCriterion("goodstypecode <", value, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeLessThanOrEqualTo(String value) {
            addCriterion("goodstypecode <=", value, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeLike(String value) {
            addCriterion("goodstypecode like", value, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeNotLike(String value) {
            addCriterion("goodstypecode not like", value, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeIn(List<String> values) {
            addCriterion("goodstypecode in", values, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeNotIn(List<String> values) {
            addCriterion("goodstypecode not in", values, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeBetween(String value1, String value2) {
            addCriterion("goodstypecode between", value1, value2, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andGoodstypecodeNotBetween(String value1, String value2) {
            addCriterion("goodstypecode not between", value1, value2, "goodstypecode");
            return (Criteria) this;
        }

        public Criteria andValiditytypeIsNull() {
            addCriterion("validitytype is null");
            return (Criteria) this;
        }

        public Criteria andValiditytypeIsNotNull() {
            addCriterion("validitytype is not null");
            return (Criteria) this;
        }

        public Criteria andValiditytypeEqualTo(Byte value) {
            addCriterion("validitytype =", value, "validitytype");
            return (Criteria) this;
        }

        public Criteria andValiditytypeNotEqualTo(Byte value) {
            addCriterion("validitytype <>", value, "validitytype");
            return (Criteria) this;
        }

        public Criteria andValiditytypeGreaterThan(Byte value) {
            addCriterion("validitytype >", value, "validitytype");
            return (Criteria) this;
        }

        public Criteria andValiditytypeGreaterThanOrEqualTo(Byte value) {
            addCriterion("validitytype >=", value, "validitytype");
            return (Criteria) this;
        }

        public Criteria andValiditytypeLessThan(Byte value) {
            addCriterion("validitytype <", value, "validitytype");
            return (Criteria) this;
        }

        public Criteria andValiditytypeLessThanOrEqualTo(Byte value) {
            addCriterion("validitytype <=", value, "validitytype");
            return (Criteria) this;
        }

        public Criteria andValiditytypeIn(List<Byte> values) {
            addCriterion("validitytype in", values, "validitytype");
            return (Criteria) this;
        }

        public Criteria andValiditytypeNotIn(List<Byte> values) {
            addCriterion("validitytype not in", values, "validitytype");
            return (Criteria) this;
        }

        public Criteria andValiditytypeBetween(Byte value1, Byte value2) {
            addCriterion("validitytype between", value1, value2, "validitytype");
            return (Criteria) this;
        }

        public Criteria andValiditytypeNotBetween(Byte value1, Byte value2) {
            addCriterion("validitytype not between", value1, value2, "validitytype");
            return (Criteria) this;
        }

        public Criteria andCoverIsNull() {
            addCriterion("cover is null");
            return (Criteria) this;
        }

        public Criteria andCoverIsNotNull() {
            addCriterion("cover is not null");
            return (Criteria) this;
        }

        public Criteria andCoverEqualTo(String value) {
            addCriterion("cover =", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotEqualTo(String value) {
            addCriterion("cover <>", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThan(String value) {
            addCriterion("cover >", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverGreaterThanOrEqualTo(String value) {
            addCriterion("cover >=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThan(String value) {
            addCriterion("cover <", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLessThanOrEqualTo(String value) {
            addCriterion("cover <=", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverLike(String value) {
            addCriterion("cover like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotLike(String value) {
            addCriterion("cover not like", value, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverIn(List<String> values) {
            addCriterion("cover in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotIn(List<String> values) {
            addCriterion("cover not in", values, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverBetween(String value1, String value2) {
            addCriterion("cover between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andCoverNotBetween(String value1, String value2) {
            addCriterion("cover not between", value1, value2, "cover");
            return (Criteria) this;
        }

        public Criteria andAbberviationIsNull() {
            addCriterion("abberviation is null");
            return (Criteria) this;
        }

        public Criteria andAbberviationIsNotNull() {
            addCriterion("abberviation is not null");
            return (Criteria) this;
        }

        public Criteria andAbberviationEqualTo(String value) {
            addCriterion("abberviation =", value, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationNotEqualTo(String value) {
            addCriterion("abberviation <>", value, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationGreaterThan(String value) {
            addCriterion("abberviation >", value, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationGreaterThanOrEqualTo(String value) {
            addCriterion("abberviation >=", value, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationLessThan(String value) {
            addCriterion("abberviation <", value, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationLessThanOrEqualTo(String value) {
            addCriterion("abberviation <=", value, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationLike(String value) {
            addCriterion("abberviation like", value, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationNotLike(String value) {
            addCriterion("abberviation not like", value, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationIn(List<String> values) {
            addCriterion("abberviation in", values, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationNotIn(List<String> values) {
            addCriterion("abberviation not in", values, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationBetween(String value1, String value2) {
            addCriterion("abberviation between", value1, value2, "abberviation");
            return (Criteria) this;
        }

        public Criteria andAbberviationNotBetween(String value1, String value2) {
            addCriterion("abberviation not between", value1, value2, "abberviation");
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

        public Criteria andSortIsNull() {
            addCriterion("sort is null");
            return (Criteria) this;
        }

        public Criteria andSortIsNotNull() {
            addCriterion("sort is not null");
            return (Criteria) this;
        }

        public Criteria andSortEqualTo(Integer value) {
            addCriterion("sort =", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotEqualTo(Integer value) {
            addCriterion("sort <>", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThan(Integer value) {
            addCriterion("sort >", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortGreaterThanOrEqualTo(Integer value) {
            addCriterion("sort >=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThan(Integer value) {
            addCriterion("sort <", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortLessThanOrEqualTo(Integer value) {
            addCriterion("sort <=", value, "sort");
            return (Criteria) this;
        }

        public Criteria andSortIn(List<Integer> values) {
            addCriterion("sort in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotIn(List<Integer> values) {
            addCriterion("sort not in", values, "sort");
            return (Criteria) this;
        }

        public Criteria andSortBetween(Integer value1, Integer value2) {
            addCriterion("sort between", value1, value2, "sort");
            return (Criteria) this;
        }

        public Criteria andSortNotBetween(Integer value1, Integer value2) {
            addCriterion("sort not between", value1, value2, "sort");
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

        public Criteria andStatusEqualTo(Byte value) {
            addCriterion("status =", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotEqualTo(Byte value) {
            addCriterion("status <>", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThan(Byte value) {
            addCriterion("status >", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusGreaterThanOrEqualTo(Byte value) {
            addCriterion("status >=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThan(Byte value) {
            addCriterion("status <", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusLessThanOrEqualTo(Byte value) {
            addCriterion("status <=", value, "status");
            return (Criteria) this;
        }

        public Criteria andStatusIn(List<Byte> values) {
            addCriterion("status in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotIn(List<Byte> values) {
            addCriterion("status not in", values, "status");
            return (Criteria) this;
        }

        public Criteria andStatusBetween(Byte value1, Byte value2) {
            addCriterion("status between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andStatusNotBetween(Byte value1, Byte value2) {
            addCriterion("status not between", value1, value2, "status");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNull() {
            addCriterion("is_active is null");
            return (Criteria) this;
        }

        public Criteria andIsActiveIsNotNull() {
            addCriterion("is_active is not null");
            return (Criteria) this;
        }

        public Criteria andIsActiveEqualTo(Boolean value) {
            addCriterion("is_active =", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotEqualTo(Boolean value) {
            addCriterion("is_active <>", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThan(Boolean value) {
            addCriterion("is_active >", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveGreaterThanOrEqualTo(Boolean value) {
            addCriterion("is_active >=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThan(Boolean value) {
            addCriterion("is_active <", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveLessThanOrEqualTo(Boolean value) {
            addCriterion("is_active <=", value, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveIn(List<Boolean> values) {
            addCriterion("is_active in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotIn(List<Boolean> values) {
            addCriterion("is_active not in", values, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsActiveNotBetween(Boolean value1, Boolean value2) {
            addCriterion("is_active not between", value1, value2, "isActive");
            return (Criteria) this;
        }

        public Criteria andIsSueIsNull() {
            addCriterion("is_sue is null");
            return (Criteria) this;
        }

        public Criteria andIsSueIsNotNull() {
            addCriterion("is_sue is not null");
            return (Criteria) this;
        }

        public Criteria andIsSueEqualTo(Byte value) {
            addCriterion("is_sue =", value, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsSueNotEqualTo(Byte value) {
            addCriterion("is_sue <>", value, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsSueGreaterThan(Byte value) {
            addCriterion("is_sue >", value, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsSueGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_sue >=", value, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsSueLessThan(Byte value) {
            addCriterion("is_sue <", value, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsSueLessThanOrEqualTo(Byte value) {
            addCriterion("is_sue <=", value, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsSueIn(List<Byte> values) {
            addCriterion("is_sue in", values, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsSueNotIn(List<Byte> values) {
            addCriterion("is_sue not in", values, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsSueBetween(Byte value1, Byte value2) {
            addCriterion("is_sue between", value1, value2, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsSueNotBetween(Byte value1, Byte value2) {
            addCriterion("is_sue not between", value1, value2, "isSue");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountIsNull() {
            addCriterion("is_show_discount is null");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountIsNotNull() {
            addCriterion("is_show_discount is not null");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountEqualTo(Byte value) {
            addCriterion("is_show_discount =", value, "isShowDiscount");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountNotEqualTo(Byte value) {
            addCriterion("is_show_discount <>", value, "isShowDiscount");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountGreaterThan(Byte value) {
            addCriterion("is_show_discount >", value, "isShowDiscount");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountGreaterThanOrEqualTo(Byte value) {
            addCriterion("is_show_discount >=", value, "isShowDiscount");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountLessThan(Byte value) {
            addCriterion("is_show_discount <", value, "isShowDiscount");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountLessThanOrEqualTo(Byte value) {
            addCriterion("is_show_discount <=", value, "isShowDiscount");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountIn(List<Byte> values) {
            addCriterion("is_show_discount in", values, "isShowDiscount");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountNotIn(List<Byte> values) {
            addCriterion("is_show_discount not in", values, "isShowDiscount");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountBetween(Byte value1, Byte value2) {
            addCriterion("is_show_discount between", value1, value2, "isShowDiscount");
            return (Criteria) this;
        }

        public Criteria andIsShowDiscountNotBetween(Byte value1, Byte value2) {
            addCriterion("is_show_discount not between", value1, value2, "isShowDiscount");
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