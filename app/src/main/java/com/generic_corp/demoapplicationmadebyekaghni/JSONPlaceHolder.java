package com.generic_corp.demoapplicationmadebyekaghni;

//import android.telecom.Call;
import retrofit2.Call;
import retrofit2.http.GET;


import java.util.List;

public interface JSONPlaceHolder {
    @GET("v3/848cefe6-c088-437b-9fb1-bcc59b207f24")
    Call<JSONResponse> getPost();
}
