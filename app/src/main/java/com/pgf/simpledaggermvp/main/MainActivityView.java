package com.pgf.simpledaggermvp.main;

import android.content.Context;
import android.widget.Toast;

import com.pgf.simpledaggermvp.mvp_base.BaseActivityView;

public class MainActivityView extends BaseActivityView {

    public MainActivityView(Context context) {
        super(context);
    }

    public void initView() {

        Toast.makeText(baseActivity, "View started", Toast.LENGTH_SHORT).show();
    }
}
