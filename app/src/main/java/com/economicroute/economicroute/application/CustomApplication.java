package com.economicroute.economicroute.application;

import android.app.Application;

import io.realm.Realm;
import io.realm.RealmConfiguration;

public class CustomApplication extends Application {
    @Override
    public void onCreate() {
        super.onCreate();

        Realm.init(this);
        RealmConfiguration realmConfig = new RealmConfiguration.Builder()
                .name("economic_route_database.realm")
                .schemaVersion(0)
                .build();
        Realm.setDefaultConfiguration(realmConfig);

    }
}
