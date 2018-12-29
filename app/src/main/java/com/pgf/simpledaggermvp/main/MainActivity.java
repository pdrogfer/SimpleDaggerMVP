package com.pgf.simpledaggermvp.main;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.pgf.simpledaggermvp.R;
import com.pgf.simpledaggermvp.main.MainActivityComponent;
import com.pgf.simpledaggermvp.mvp_base.BaseActivity;

import javax.inject.Inject;

/*
* 1: add dagger and mockito dependencies
* 2: override Application class
* 3: declare overriden application in manifest
* 4: add AppComponent and AppModule
* 5: appApplication has instance of appComponent, initializes it in onCreate, which
*    instantiates appModule, which has a reference to appApplication
* 6: appComponent lists modules (appModule)
* 7: add base classes for activity, component, module, presenter and view
*
*/
public class MainActivity extends BaseActivity {

    private MainActivityComponent mainActivityComponent;

    @Inject
    MainActivityPresenter mainActivityPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // init component
        mainActivityComponent = DaggerMainActivityComponent
                .builder()
                .appComponent(appApplication.getAppComponent())
                .mainActivityModule(new MainActivityModule(this))
                .build();

        mainActivityComponent.inject(this);

        mainActivityPresenter.onCreate();
    }
}
