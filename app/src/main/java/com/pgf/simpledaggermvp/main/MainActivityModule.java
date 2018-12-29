package com.pgf.simpledaggermvp.main;

import dagger.Module;
import dagger.Provides;

@Module
public class MainActivityModule {

    MainActivity mainActivity;

    public MainActivityModule(MainActivity mainActivity) {
        this.mainActivity = mainActivity;
    }

    @Provides
    MainActivity providesMainActivity() {
        return mainActivity;
    }

    @Provides
    MainActivityPresenter providesMainActivityPresenter() {
        return new MainActivityPresenter(new MainActivityView(mainActivity));
    }
}
