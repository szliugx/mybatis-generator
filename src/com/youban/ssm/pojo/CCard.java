package com.youban.ssm.pojo;

public class CCard {
    private Integer id;

    private Long ocId;

    private String cardId;

    private String wechatCardId;

    private String cardName;

    private Byte cardStatus;

    private String cardSource;

    private String cardUrl;

    private String cardPutType;

    private String description;

    private Byte bindUser;

    private Integer inventory;

    private Integer giveNum;

    private Integer getLimit;

    private Integer getDayLimit;

    private Boolean selGoodsType;

    private Byte canGiveFriend;

    private Boolean canShared;

    private Boolean isWechat;

    private Boolean status;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Long getOcId() {
        return ocId;
    }

    public void setOcId(Long ocId) {
        this.ocId = ocId;
    }

    public String getCardId() {
        return cardId;
    }

    public void setCardId(String cardId) {
        this.cardId = cardId == null ? null : cardId.trim();
    }

    public String getWechatCardId() {
        return wechatCardId;
    }

    public void setWechatCardId(String wechatCardId) {
        this.wechatCardId = wechatCardId == null ? null : wechatCardId.trim();
    }

    public String getCardName() {
        return cardName;
    }

    public void setCardName(String cardName) {
        this.cardName = cardName == null ? null : cardName.trim();
    }

    public Byte getCardStatus() {
        return cardStatus;
    }

    public void setCardStatus(Byte cardStatus) {
        this.cardStatus = cardStatus;
    }

    public String getCardSource() {
        return cardSource;
    }

    public void setCardSource(String cardSource) {
        this.cardSource = cardSource == null ? null : cardSource.trim();
    }

    public String getCardUrl() {
        return cardUrl;
    }

    public void setCardUrl(String cardUrl) {
        this.cardUrl = cardUrl == null ? null : cardUrl.trim();
    }

    public String getCardPutType() {
        return cardPutType;
    }

    public void setCardPutType(String cardPutType) {
        this.cardPutType = cardPutType == null ? null : cardPutType.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }

    public Byte getBindUser() {
        return bindUser;
    }

    public void setBindUser(Byte bindUser) {
        this.bindUser = bindUser;
    }

    public Integer getInventory() {
        return inventory;
    }

    public void setInventory(Integer inventory) {
        this.inventory = inventory;
    }

    public Integer getGiveNum() {
        return giveNum;
    }

    public void setGiveNum(Integer giveNum) {
        this.giveNum = giveNum;
    }

    public Integer getGetLimit() {
        return getLimit;
    }

    public void setGetLimit(Integer getLimit) {
        this.getLimit = getLimit;
    }

    public Integer getGetDayLimit() {
        return getDayLimit;
    }

    public void setGetDayLimit(Integer getDayLimit) {
        this.getDayLimit = getDayLimit;
    }

    public Boolean getSelGoodsType() {
        return selGoodsType;
    }

    public void setSelGoodsType(Boolean selGoodsType) {
        this.selGoodsType = selGoodsType;
    }

    public Byte getCanGiveFriend() {
        return canGiveFriend;
    }

    public void setCanGiveFriend(Byte canGiveFriend) {
        this.canGiveFriend = canGiveFriend;
    }

    public Boolean getCanShared() {
        return canShared;
    }

    public void setCanShared(Boolean canShared) {
        this.canShared = canShared;
    }

    public Boolean getIsWechat() {
        return isWechat;
    }

    public void setIsWechat(Boolean isWechat) {
        this.isWechat = isWechat;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}