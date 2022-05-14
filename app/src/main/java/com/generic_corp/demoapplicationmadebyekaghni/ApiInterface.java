package com.generic_corp.demoapplicationmadebyekaghni;

import retrofit2.Call;
import retrofit2.http.GET;

public interface ApiInterface {
    @GET("api/v1/employees")
    Call<final_outer_class> getListData();
}
