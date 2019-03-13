package com.wust.pojo;

public class User {
    private int id;
    private String username;
    private String password;
    private String telphone;
    private int authority;
    private int is_deleted;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public int getAuthority() {
        return authority;
    }

    public void setAuthority(int authority) {
        this.authority = authority;
    }

    public int getIs_deleted() {
        return is_deleted;
    }

    public void setIs_deleted(int is_deleted) {
        this.is_deleted = is_deleted;
    }

    public String getTelphone() {
        return telphone;
    }

    public void setTelphone(String telPhone) {
        this.telphone = telPhone;
    }

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", telphone='" + telphone + '\'' +
                ", authority=" + authority +
                ", is_deleted=" + is_deleted +
                '}';
    }
}
