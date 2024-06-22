package com.microservices.spring.SecurityExample.Model;

public class User {
    private String userName;
    private String passWord;
    private String role;
    private String authentication;


    public User(String userName, String passWord, String role, String authentication) {
        this.userName = userName;
        this.passWord = passWord;
        this.role = role;
        this.authentication = authentication;
    }
    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassWord() {
        return passWord;
    }

    public void setPassWord(String passWord) {
        this.passWord = passWord;
    }

    public String getRole() {
        return role;
    }

    public void setRole(String role) {
        this.role = role;
    }

    public String getAuthentication() {
        return authentication;
    }

    public void setAuthentication(String authentication) {
        this.authentication = authentication;
    }


}
