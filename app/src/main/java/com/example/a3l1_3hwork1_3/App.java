package com.example.a3l1_3hwork1_3;

import android.app.Application;

import com.example.a3l1_3hwork1_3.data.remote.ApiService;
import com.example.a3l1_3hwork1_3.data.remote.RetrofitClient;

public class App extends Application {
    public static ApiService service;

    @Override
    public void onCreate() {
        super.onCreate();
        service = new RetrofitClient().provideApiService();
    }
}

