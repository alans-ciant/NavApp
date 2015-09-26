package com.ciandt.thegarage.navapp;

import android.app.Application;

import com.activeandroid.ActiveAndroid;
import com.activeandroid.Configuration;

/**
 * Created by carlos on 9/23/15.
 */
public class NavAplication extends com.activeandroid.app.Application {

    @Override
    public void onCreate() {
        super.onCreate();
        Configuration dbConfiguration = new Configuration.Builder(this).setDatabaseName("NavApp1.db").create();
        ActiveAndroid.initialize(dbConfiguration);
    }
}
