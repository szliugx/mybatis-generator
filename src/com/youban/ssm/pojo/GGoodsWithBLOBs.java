package com.youban.ssm.pojo;

public class GGoodsWithBLOBs extends GGoods {
    private String bookingnotice;

    private String description;

    public String getBookingnotice() {
        return bookingnotice;
    }

    public void setBookingnotice(String bookingnotice) {
        this.bookingnotice = bookingnotice == null ? null : bookingnotice.trim();
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description == null ? null : description.trim();
    }
}