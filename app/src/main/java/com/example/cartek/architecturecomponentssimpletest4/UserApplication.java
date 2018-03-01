package com.example.cartek.architecturecomponentssimpletest4;

import android.app.Application;

import io.realm.Realm;

/**
 * Created by CarTek on 2018/3/1.
 */

public class UserApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
    }
}
