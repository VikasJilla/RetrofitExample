package com.jilla.retrofitexample.network;

import com.jilla.retrofitexample.models.SomePost;
import com.jilla.retrofitexample.models.User;

import java.util.List;

import retrofit2.Call;
import retrofit2.http.GET;

public interface GetDataService {
    @GET("/posts")
    Call<List<SomePost>> getPosts();

    @GET("/users")
    Call<List<User>> getUsers();
}
