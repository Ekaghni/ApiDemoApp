package com.generic_corp.demoapplicationmadebyekaghni;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;
import android.widget.LinearLayout;
import android.widget.Toast;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class MainActivity extends AppCompatActivity {
    public RecyclerView recyclerView;
    List<Post> xyz;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        recyclerView = findViewById(R.id.recyclerview);
//        recyclerView.setHasFixedSize(true);
//        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        xyz = new ArrayList<>();

        Retrofit retrofit = new Retrofit.Builder().baseUrl("https://run.mocky.io/")
                .addConverterFactory(GsonConverterFactory.create())
                .build();

        JSONPlaceHolder jsonPlaceHolder = retrofit.create(JSONPlaceHolder.class);

        Call<JSONResponse> call = jsonPlaceHolder.getPost();
        call.enqueue(new Callback<JSONResponse>() {
            @Override
            public void onResponse(Call<JSONResponse> call, Response<JSONResponse> response) {
//                if (!response.isSuccessful()){
//                    Toast.makeText(MainActivity.this, response.code(), Toast.LENGTH_SHORT).show();
//                    return;
//                }
                JSONResponse jsonResponse = response.body();
                xyz = new ArrayList<>(Arrays.asList(jsonResponse.getDatas()));

//                postList = (List<Post>) response.body();
//                PostAdapter postAdapter = new PostAdapter(MainActivity.this ,postList);

                //recyclerView.setAdapter(postAdapter);

                adt(xyz);
            }

            @Override
            public void onFailure(Call<JSONResponse> call, Throwable t) {

                Toast.makeText(MainActivity.this, t.getMessage() , Toast.LENGTH_SHORT).show();
            }

        });

    }

    public void adt(List<Post> abc){
        PostAdapter postAdapter = new PostAdapter(this,abc);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));
        recyclerView.setAdapter(postAdapter);
    }

}