package com.pgf.simpledaggermvp.dependency_injection;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class AppModule {

    AppApplication appApplication;

    public AppModule(AppApplication appApplication) {
        this.appApplication = appApplication;
    }

    @Singleton
    @Provides
    AppApplication providesAppApplication() {
        return appApplication;
    }
}
