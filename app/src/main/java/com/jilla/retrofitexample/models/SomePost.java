package com.jilla.retrofitexample.models;

import com.google.gson.annotations.SerializedName;

public class SomePost {
    @SerializedName("id")
    Integer postID;

    @SerializedName("userId")
    Integer userID;

    @SerializedName("title")
    String title;

    @SerializedName("body")
    String body;

    @Override
    public String toString(){
        return postID+" "+userID+" "+title+" "+body;
    }

}
