package com.generic_corp.demoapplicationmadebyekaghni;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class ApiClient {
    public static final String Base_Url = "https://dummy.restapiexample.com/";
    public static Retrofit retrofit = null;
    public static final Retrofit getClient(){
        if (retrofit==null){
            retrofit = new Retrofit.Builder()
                    .baseUrl(Base_Url)
                    .addConverterFactory(GsonConverterFactory.create()).build();

        }
        return retrofit;

    }
}
