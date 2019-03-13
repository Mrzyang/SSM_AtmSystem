package com.wust.pojo;

import java.util.Date;

public class PersonalServices {
    private int id;
    private String name;
    private Date allocationTime;
    private double buyMoney;
    private double yield_rate;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }


    public Date getAllocationTime() {
        return allocationTime;
    }

    public void setAllocationTime(Date allocationTime) {
        this.allocationTime = allocationTime;
    }

    public double getBuyMoney() {
        return buyMoney;
    }

    public void setBuyMoney(double buyMoney) {
        this.buyMoney = buyMoney;
    }

    public double getYield_rate() {
        return yield_rate;
    }

    public void setYield_rate(double yield_rate) {
        this.yield_rate = yield_rate;
    }

    @Override
    public String toString() {
        return "PersonalServices{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", allocationTime=" + allocationTime +
                ", buyMoney=" + buyMoney +
                ", yield_rate=" + yield_rate +
                '}';
    }
}
