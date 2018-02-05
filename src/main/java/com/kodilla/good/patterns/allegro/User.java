package com.kodilla.good.patterns.allegro;

public class User {
    private String username;
    private String realName;
    private String eMail;

    public User(String username, String realName) {
        this.username = username;
        this.realName = realName;
        this.eMail = eMail;
    }

    public String getUsername() {
        return username;
    }

    public String getRealName() {
        return realName;
    }

    public String geteMail() {
        return eMail;
    }
}
