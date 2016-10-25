package com.feicuiedu.junittestdemo.apiTest;

import okhttp3.OkHttpClient;
import okhttp3.ResponseBody;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Call;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;
import retrofit2.http.Body;

/**
 * Created by 123 on 2016/9/25.
 */
public class RetrofitClient implements RetrofitApi{

    public static final String BASE_URL = "http://admin.syfeicuiedu.com";

    private static RetrofitClient netClient;
    private RetrofitApi retrofitApi;
    public Retrofit retrofit;

    private RetrofitClient(){

        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);

        OkHttpClient okHttpClient = new OkHttpClient.Builder()
                .addInterceptor(interceptor)
                .build();

        retrofit = new Retrofit.Builder()
                .baseUrl(BASE_URL)
                .client(okHttpClient)
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        retrofitApi = retrofit.create(RetrofitApi.class);
    }

    public static RetrofitClient getInstance() {
        if (netClient==null){
            netClient = new RetrofitClient();
        }
        return netClient;
    }

    public RetrofitApi getRetrofitApi(){
        if (retrofitApi!=null) {
            retrofitApi = retrofit.create(RetrofitApi.class);
        }
            return retrofitApi;
    }

    @Override
    public Call<ResponseBody> getRequest() {
        return retrofitApi.getRequest();
    }

    @Override
    public Call<UserResult> getUserRequest(@Body User user) {
        return retrofitApi.getUserRequest(user);
    }
}
