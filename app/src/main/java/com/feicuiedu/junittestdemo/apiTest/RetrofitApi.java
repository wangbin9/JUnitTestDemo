package com.feicuiedu.junittestdemo.apiTest;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.Body;
import retrofit2.http.GET;
import retrofit2.http.POST;

/**
 * Created by 123 on 2016/9/25.
 */
public interface RetrofitApi {

    @GET("https://api.github.com/users/gqq")
    Call<ResponseBody> getRequest();

    @POST("/Handler/UserHandler.ashx?action=register")
    Call<UserResult> getUserRequest(@Body User user);
}
