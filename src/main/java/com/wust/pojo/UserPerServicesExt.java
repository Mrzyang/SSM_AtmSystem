package com.wust.pojo;

import java.util.Date;

public class UserPerServicesExt extends  UserPerServices{
    private String projectName;
    private long cardNum;
    private double buyMoney;         //理财产品单价
    private int allocationTime;    // 定期理财时长，单位：年
    private double yieldRate;    //利率
    private int num;              //一次性购买数量

    public String getProjectName() {
        return projectName;
    }

    public void setProjectName(String projectName) {
        this.projectName = projectName;
    }

    public long getCardNum() {
        return cardNum;
    }

    public void setCardNum(long cardNum) {
        this.cardNum = cardNum;
    }

    public double getBuyMoney() {
        return buyMoney;
    }

    public void setBuyMoney(double buyMoney) {
        this.buyMoney = buyMoney;
    }

    public int getAllocationTime() {
        return allocationTime;
    }

    public void setAllocationTime(int allocationTime) {
        this.allocationTime = allocationTime;
    }


    public double getYieldRate() {
        return yieldRate;
    }

    public void setYieldRate(double yieldRate) {
        this.yieldRate = yieldRate;
    }

    public int getNum() {
        return num;
    }

    public void setNum(int num) {
        this.num = num;
    }

    @Override
    public String toString() {
        return "UserPerServicesExt{" +
                "projectName='" + projectName + '\'' +
                ", cardNum=" + cardNum +
                ", buyMoney=" + buyMoney +
                ", allocationTime=" + allocationTime +
                ", yieldRate=" + yieldRate +
                ", num=" + num +
                '}';
    }
}
