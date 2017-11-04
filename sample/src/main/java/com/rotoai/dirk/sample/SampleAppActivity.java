package com.rotoai.dirk.sample;

import com.rotoai.dirk.core.DirkActivity;


public abstract class SampleAppActivity extends DirkActivity<AppComponent> {

    @Override
    protected AppComponent getCoreComponent() {
        SampleApplication application = (SampleApplication) getApplication();
        return application.getAppComponent();
    }

}
