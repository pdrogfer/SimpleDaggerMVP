package com.pgf.simpledaggermvp.mvp_base;

import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.pgf.simpledaggermvp.dependency_injection.AppApplication;

public class BaseActivity extends AppCompatActivity {

    public AppApplication appApplication;

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        appApplication = (AppApplication) getApplication();
        appApplication.getAppComponent().inject(this);
    }
}
