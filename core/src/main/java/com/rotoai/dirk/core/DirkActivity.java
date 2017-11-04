package com.rotoai.dirk.core;

import android.support.v7.app.AppCompatActivity;

public abstract class DirkActivity<T> extends AppCompatActivity {

    protected abstract T getCoreComponent();

}
