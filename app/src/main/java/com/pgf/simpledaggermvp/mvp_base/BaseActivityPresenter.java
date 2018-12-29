package com.pgf.simpledaggermvp.mvp_base;

public abstract class BaseActivityPresenter<VIEW extends BaseActivityView> {

    protected VIEW view;

    public BaseActivityPresenter(VIEW view) {
        this.view = view;
    }

    public abstract void onCreate();
}
