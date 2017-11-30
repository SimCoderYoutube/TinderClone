package com.simcoder.tinder.Chat;

/**
 * Created by manel on 10/31/2017.
 */

public class ChatObject {
    private String message;
    private Boolean currentUser;
    public ChatObject(String message, Boolean currentUser){
        this.message = message;
        this.currentUser = currentUser;
    }

    public String getMessage(){
        return message;
    }
    public void setMessage(String userID){
        this.message = message;
    }

    public Boolean getCurrentUser(){
        return currentUser;
    }
    public void setCurrentUser(Boolean currentUser){
        this.currentUser = currentUser;
    }
}
