package com.simcoder.tinder.Matches;

/**
 * Created by manel on 10/31/2017.
 */

public class MatchesObject {
    private String userId;
    public MatchesObject (String userId){
        this.userId = userId;
    }

    public String getUserId(){
        return userId;
    }
    public void setUserID(String userID){
        this.userId = userId;
    }
}
