package com.eclairiose.viddli.Model;

public class ModelCurrentUser {

    int userImage;
    String userName;

    public ModelCurrentUser(int userImage, String userName) {
        this.userImage = userImage;
        this.userName = userName;
    }

    public int getUserImage() {
        return userImage;
    }

    public void setUserImage(int userImage) {
        this.userImage = userImage;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }
}
