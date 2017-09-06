package com.simcoder.tinder;

/**
 * Created by manel on 9/5/2017.
 */

public class cards {
    private String userId;
    private String name;
    public cards (String userId, String name){
        this.userId = userId;
        this.name = name;
    }

    public String getUserId(){
        return userId;
    }
    public void setUserID(String userID){
        this.userId = userId;
    }

    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
}
