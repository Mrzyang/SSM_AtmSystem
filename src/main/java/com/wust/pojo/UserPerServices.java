package com.wust.pojo;

import java.util.Date;

public class UserPerServices {
    private int userId;
    private long cardId;
    private int serviceId;
    private double buyNum;
    private double totalMoney; // 总价=buyMoney*num
    private Date buyTime;
    private Date dueTime;


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

    public Date getBuyTime() {
        return buyTime;
    }

    public void setBuyTime(Date buyTime) {
        this.buyTime = buyTime;
    }

    public Date getDueTime() {
        return dueTime;
    }

    public void setDueTime(Date dueTime) {
        this.dueTime = dueTime;
    }
    public double getTotalMoney() {
        return totalMoney;
    }

    public void setTotalMoney(double totalMoney) {
        this.totalMoney = totalMoney;
    }

    @Override
    public String toString() {
        return "UserPerServices{" +
                "userId=" + userId +
                ", cardId=" + cardId +
                ", serviceId=" + serviceId +
                ", buyNum=" + buyNum +
                ", totalMoney=" + totalMoney +
                ", buyTime=" + buyTime +
                ", dueTime=" + dueTime +
                '}';
    }
}
