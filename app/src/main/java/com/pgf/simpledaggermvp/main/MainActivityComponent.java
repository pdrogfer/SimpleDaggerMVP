package com.pgf.simpledaggermvp.main;

import com.pgf.simpledaggermvp.dependency_injection.AppComponent;

import dagger.Component;

@Component(dependencies = {AppComponent.class}, modules = {MainActivityModule.class})
public interface MainActivityComponent {

    void inject(MainActivity mainActivity);
}
