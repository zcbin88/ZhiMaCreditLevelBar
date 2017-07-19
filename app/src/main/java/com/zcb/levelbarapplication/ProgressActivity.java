package com.zcb.levelbarapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.zcb.levelbarapplication.view.SpringProgressView;

public class ProgressActivity extends AppCompatActivity {

    private SpringProgressView myProgressView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_progress);
        myProgressView= (SpringProgressView) findViewById(R.id.myProgressView);

        myProgressView.setMaxCount(1000);
        myProgressView.setCurrentCount(900);

    }
}
