package com.example.demo.model;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Register {
    @Id
    private int userId;
    private String userName;
    private int userAge;
    private String userFrom;
    private String userTo;
    private String userDate;
    private int userCount;
    public int getUserId() {
        return userId;
    }
    public void setUserId(int userId) {
        this.userId = userId;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
    public int getUserAge() {
        return userAge;
    }
    public void setUserAge(int userAge) {
        this.userAge = userAge;
    }
    public String getUserFrom() {
        return userFrom;
    }
    public void setUserFrom(String userFrom) {
        this.userFrom = userFrom;
    }
    public String getUserTo() {
        return userTo;
    }
    public void setUserTo(String userTo) {
        this.userTo = userTo;
    }
    public String getUserDate() {
        return userDate;
    }
    public void setUserDate(String userDate) {
        this.userDate = userDate;
    }
    public int getUserCount() {
        return userCount;
    }
    public void setUserCount(int userCount) {
        this.userCount = userCount;
    }
    public Register(int userId, String userName, int userAge, String userFrom, String userTo, String userDate,
            int userCount) {
        this.userId = userId;
        this.userName = userName;
        this.userAge = userAge;
        this.userFrom = userFrom;
        this.userTo = userTo;
        this.userDate = userDate;
        this.userCount = userCount;
    }
    public Register() {
    }
   
}

