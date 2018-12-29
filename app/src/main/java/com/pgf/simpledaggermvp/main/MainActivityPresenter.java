package com.pgf.simpledaggermvp.main;

import com.pgf.simpledaggermvp.mvp_base.BaseActivityPresenter;

public class MainActivityPresenter extends BaseActivityPresenter<MainActivityView> {

    public MainActivityPresenter(MainActivityView view) {
        super(view);
    }

    @Override
    public void onCreate() {
        view.initView();
    }


}
