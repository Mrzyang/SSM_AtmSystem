package com.wust.pojo;

public class UserCard {
    private int id;
    private int userId;
    private long cardNumber;
    private String password;
    private double balance;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public long getCardNumber() {
        return cardNumber;
    }

    public void setCardNumber(long cardNumber) {
        this.cardNumber = cardNumber;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    @Override
    public String toString() {
        return "UserCard{" +
                "id=" + id +
                ", userId=" + userId +
                ", cardNumber=" + cardNumber +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
