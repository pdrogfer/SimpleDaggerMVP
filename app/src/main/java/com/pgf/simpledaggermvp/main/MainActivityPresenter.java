package com.pgf.simpledaggermvp.main;

public class MainActivityPresenter {

    MainActivityView view;

    public MainActivityPresenter(MainActivityView view) {
        this.view = view;
    }

    public void onCreate() {

        view.initView();
    }
}
