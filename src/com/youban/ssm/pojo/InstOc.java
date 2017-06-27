package com.youban.ssm.pojo;

public class InstOc {
    private Long ocId;

    private String ocName;

    private Integer intime;

    private Integer uptime;

    private Boolean isTest;

    public Long getOcId() {
        return ocId;
    }

    public void setOcId(Long ocId) {
        this.ocId = ocId;
    }

    public String getOcName() {
        return ocName;
    }

    public void setOcName(String ocName) {
        this.ocName = ocName == null ? null : ocName.trim();
    }

    public Integer getIntime() {
        return intime;
    }

    public void setIntime(Integer intime) {
        this.intime = intime;
    }

    public Integer getUptime() {
        return uptime;
    }

    public void setUptime(Integer uptime) {
        this.uptime = uptime;
    }

    public Boolean getIsTest() {
        return isTest;
    }

    public void setIsTest(Boolean isTest) {
        this.isTest = isTest;
    }
}