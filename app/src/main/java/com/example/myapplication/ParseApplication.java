package com.example.myapplication;

import android.app.Application;

import com.parse.Parse;
import com.parse.ParseObject;

public class ParseApplication extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        ParseObject.registerSubclass(Post.class);

        Parse.initialize(new Parse.Configuration.Builder(this)
                .applicationId("q2UI2EGDv8gg7Exrx5VLmdpahhInj7F5aPzjlB12")
                .clientKey("hGwd88UelQzHPBPB5TJkfKxnOa04ZiJnrOlHX9Xy")
                .server("https://parseapi.back4app.com")
                .build()
        );
    }
}
