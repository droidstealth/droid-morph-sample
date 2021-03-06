package com.stealth.morph.sample;

import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;


public class AppMorphingSample extends ActionBarActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_app_morphing_sample);
        if (savedInstanceState == null) {
            getSupportFragmentManager().beginTransaction()
                    .add(R.id.container, new AppMorphingFragment())
                    .commit();
        }
    }
}
