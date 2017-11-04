package com.rotoai.dirk.sample;

import android.app.Application;
import android.support.annotation.NonNull;

/**
 * Application override for DI.
 */
public class SampleApplication extends Application {

    private AppComponent appComponent;

    @Override
    public void onCreate() {
        super.onCreate();
        this.appComponent = DaggerAppComponent.builder()
                .appModule(new AppModule(this))
                .build();

        appComponent.inject(this);
    }

    @NonNull
    public AppComponent getAppComponent() {
        return appComponent;
    }
}
