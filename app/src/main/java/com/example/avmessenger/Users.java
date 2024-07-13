package com.example.avmessenger;

public class Users
{
    String profilepic,mail,userName,password,UserId,lastMessage,status;

    public Users(String id, String namee, String emaill, String password, String cPassword, String imageuri)
    {
        this.UserId = id;
        this.userName = namee;
        this.mail = emaill;
        this.password = password;
        this.profilepic= imageuri;
        this.status = status;
    }

    public String getProfilepic()
    {
        return profilepic;
    }

    public void setProfilepic(String profilepic) {
        this.profilepic = profilepic;
    }

    public String getMail() {
        return mail;
    }

    public void setMail(String mail) {
        this.mail = mail;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUserId() {
        return UserId;
    }

    public void setUserId(String userId) {
        UserId = userId;
    }

    public String getLastMessage() {
        return lastMessage;
    }

    public void setLastMessage(String lastMessage) {
        this.lastMessage = lastMessage;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
}
