package com.pgf.simpledaggermvp.main;

import android.content.Context;
import android.util.AttributeSet;
import android.view.ViewGroup;
import android.widget.Toast;

public class MainActivityView extends ViewGroup {

    MainActivity mainActivity;

    //region inherited methods
    public MainActivityView(Context context) {
        super(context);

        this.mainActivity = (MainActivity) context;
    }

    public MainActivityView(Context context, AttributeSet attrs) {
        super(context, attrs);
    }

    @Override
    protected void onLayout(boolean changed, int l, int t, int r, int b) {

    }

    //endregion

    public void initView() {

        Toast.makeText(mainActivity, "View started", Toast.LENGTH_SHORT).show();
    }
}
