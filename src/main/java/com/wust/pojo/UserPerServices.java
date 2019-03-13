package com.wust.pojo;

public class UserPerServices {
    private int userId;
    private long cardId;
    private int serviceId;
    private double buyNum;

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getCardId() {
        return cardId;
    }

    public void setCardId(long cardId) {
        this.cardId = cardId;
    }

    public int getServiceId() {
        return serviceId;
    }

    public void setServiceId(int serviceId) {
        this.serviceId = serviceId;
    }

    public double getBuyNum() {
        return buyNum;
    }

    public void setBuyNum(double buyNum) {
        this.buyNum = buyNum;
    }

    @Override
    public String toString() {
        return "UserPerServices{" +
                "userId=" + userId +
                ", cardId=" + cardId +
                ", serviceId=" + serviceId +
                ", buyNum=" + buyNum +
                '}';
    }
}
