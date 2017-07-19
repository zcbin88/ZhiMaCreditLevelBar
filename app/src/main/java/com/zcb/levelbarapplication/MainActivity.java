package com.zcb.levelbarapplication;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import com.zcb.levelbarapplication.view.UserLevelDial;
import com.zcb.levelbarapplication.view.UserLevelView;
import java.util.ArrayList;
import java.util.Random;

public class MainActivity extends AppCompatActivity implements View.OnClickListener{
    UserLevelView userLevelDial;
    private Button jiaochaBtn;
    private Button zhongdengBtn;
    private Button lianghaoBtn;
    private Button youxiuBtn;
    private Button jihaoBtn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        userLevelDial= (UserLevelView) findViewById(R.id.userLevel);
        initLevel();
        initEvent();
        userLevelDial.setCurrentDialvalue(630);



    }
    public void initLevel() {
        ArrayList<UserLevelDial> datas = new ArrayList<UserLevelDial>();

        UserLevelDial dial = new UserLevelDial();
        dial.dial_s = 350;
        dial.dial_e = 550;
        datas.add(dial);
        UserLevelDial dial2 = new UserLevelDial();
        dial2.dial_s = 551;
        dial2.dial_e = 600;
        datas.add(dial2);
        UserLevelDial dial3 = new UserLevelDial();
        dial3.dial_s = 601;
        dial3.dial_e = 650;
        datas.add(dial3);
        UserLevelDial dial4 = new UserLevelDial();
        dial4.dial_s = 651;
        dial4.dial_e = 700;
        datas.add(dial4);
        UserLevelDial dial5 = new UserLevelDial();
        dial5.dial_s = 701;
        dial5.dial_e = 950;
        datas.add(dial5);
        userLevelDial.setData(datas);
    }
    public void suiji(View view){
        int l = new Random().nextInt(950);
        userLevelDial.setCurrentDialvalue(l);
    }

    private void initEvent(){
        jiaochaBtn= (Button) findViewById(R.id.jiaocha);
        zhongdengBtn= (Button) findViewById(R.id.zhongdeng);
        lianghaoBtn= (Button) findViewById(R.id.lianghao);
        youxiuBtn= (Button) findViewById(R.id.youxiu);
        jihaoBtn= (Button) findViewById(R.id.jihao);

        jiaochaBtn.setOnClickListener(this);
        zhongdengBtn.setOnClickListener(this);
        lianghaoBtn.setOnClickListener(this);
        youxiuBtn.setOnClickListener(this);
        jihaoBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.jiaocha :
                userLevelDial.setCurrentDialvalue(450);
                break;
            case R.id.zhongdeng :
                userLevelDial.setCurrentDialvalue(580);
                break;
            case R.id.lianghao :
                userLevelDial.setCurrentDialvalue(630);
                break;
            case R.id.youxiu :
                userLevelDial.setCurrentDialvalue(680);
                break;
            case R.id.jihao :
                userLevelDial.setCurrentDialvalue(750);
                break;

        }
    }
}
