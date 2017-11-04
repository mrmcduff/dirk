package com.rotoai.dirk.sample;

import android.app.Application;
import android.content.Context;
import android.content.SharedPreferences;

import dagger.Module;
import dagger.Provides;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

@Module
public class AppModule {

    private final Application application;

    public AppModule(Application application) {
        this.application = application;
    }

    @Provides
    Application provideApplication() {
        return application;
    }

    @Provides
    SharedPreferences provideSharedPrefs() {
        return application.getSharedPreferences("demo-prefs", Context.MODE_PRIVATE);
    }

    @Provides
    PublishSubject<Boolean> provideTapSubject() {
        return PublishSubject.create();
    }

    @Provides
    Observable<Boolean> provideTapObservable(PublishSubject<Boolean> tapPublishSubject) {
        return tapPublishSubject;
    }

    @Provides
    PublishSubject<Integer> provideCountSubject() {
        return PublishSubject.create();
    }

    @Provides
    Observable<Integer> provideCountObservable(PublishSubject<Integer> countPublishSubject) {
        return countPublishSubject;
    }
}
