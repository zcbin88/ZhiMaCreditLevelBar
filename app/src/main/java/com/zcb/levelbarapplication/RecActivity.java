package com.zcb.levelbarapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.LinearLayout;

import com.zcb.levelbarapplication.view.RecView;

public class RecActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_rec);
        init();
    }


    void init(){
        LinearLayout layout=(LinearLayout) findViewById(R.id.rec_layout);
        final RecView view=new RecView(this);
        view.setMinimumHeight(500);
        view.setMinimumWidth(300);
        //通知view组件重绘
        view.invalidate();
        layout.addView(view);
    }
}
