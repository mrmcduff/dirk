package com.rotoai.dirk.sample;

import android.app.Application;
import android.content.SharedPreferences;

import javax.inject.Singleton;

import dagger.Component;
import io.reactivex.Observable;
import io.reactivex.subjects.PublishSubject;

@Singleton
@Component(modules = AppModule.class)
public interface AppComponent {

    void inject(SampleApplication application);

    Application getApplication();

    SharedPreferences getSharedPreferences();

    Observable<Boolean> getTapObservable();

    Observable<Integer> getCountObservable();

    PublishSubject<Boolean> getTapSubject();

    PublishSubject<Integer> getCountSubject();
}
