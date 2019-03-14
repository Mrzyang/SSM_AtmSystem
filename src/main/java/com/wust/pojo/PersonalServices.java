package com.wust.pojo;


public class PersonalServices {
    private int id;
    private String name;
    private int allocationTime;    // 定期理财时长，单位：年
    private double buyMoney;
    private double yieldRate;
    private String description;

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


    public int getAllocationTime() {
        return allocationTime;
    }

    public void setAllocationTime(int allocationTime) {
        this.allocationTime = allocationTime;
    }

    public double getBuyMoney() {
        return buyMoney;
    }

    public void setBuyMoney(double buyMoney) {
        this.buyMoney = buyMoney;
    }


    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getYieldRate() {
        return yieldRate;
    }

    public void setYieldRate(double yieldRate) {
        this.yieldRate = yieldRate;
    }

    @Override
    public String toString() {
        return "PersonalServices{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", allocationTime=" + allocationTime +
                ", buyMoney=" + buyMoney +
                ", yieldRate=" + yieldRate +
                ", description='" + description + '\'' +
                '}';
    }
}
