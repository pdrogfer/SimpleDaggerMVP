package com.pgf.simpledaggermvp.dependency_injection;

import com.pgf.simpledaggermvp.mvp_base.BaseActivity;

import dagger.Component;

@Component(modules = {AppModule.class})
public interface AppComponent {

    void inject(BaseActivity baseActivity);
}
