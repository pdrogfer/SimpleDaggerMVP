package com.pgf.simpledaggermvp.mvp_base;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;

public abstract class BaseActivityView extends ViewGroup {

    Context context;

    protected BaseActivity baseActivity;

    //region inherited methods
    public BaseActivityView(Context context) {
        super(context);

        this.context = context;
        this.baseActivity = (BaseActivity) context;
    }

    public BaseActivityView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }
    //endregion

    public abstract void initView();
}
