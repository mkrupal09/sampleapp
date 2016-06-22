package com.example.krupal_pc.myapplication;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;
import android.util.Log;

import java.io.IOException;
import java.util.HashMap;

import connection.ApiService;
import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Created by krupal-pc on 6/21/2016.
 */

public class SampleApiCalling extends AppCompatActivity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HashMap<String, String> params = new HashMap<>();
        params.put("north", "44.1");
        params.put("south", "-9.9");
        params.put("east", "-22.4");
        params.put("west", "55.2");
        params.put("lang", "de");
        params.put("username", "demo");

        Call<ResponseBody> call = ApiService.getInstance().getGeoNames(params);
        Log.d("Request",call.request().url().toString());
        call.enqueue(new Callback<ResponseBody>() {
            @Override
            public void onResponse(Call<ResponseBody> call, Response<ResponseBody> response) {
                try {
                    Log.d("Response", response.body().string());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

            @Override
            public void onFailure(Call<ResponseBody> call, Throwable t) {

            }
        });
    }
}
