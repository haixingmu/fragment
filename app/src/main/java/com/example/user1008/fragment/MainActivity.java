package com.example.user1008.fragment;

import android.app.Activity;
import android.app.FragmentManager;
import android.app.FragmentTransaction;
import android.content.Intent;
import android.os.Bundle;
import android.widget.RadioGroup;

public class MainActivity extends Activity implements RadioGroup.OnCheckedChangeListener{

    private RadioGroup rg;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        rg=(RadioGroup) findViewById(R.id.rg);
        rg.setOnCheckedChangeListener(this);


    }

    @Override
    public void onCheckedChanged(RadioGroup group, int checkedId) {
        switch(checkedId){
            case R.id.radioButton1:
                Intent intent=new Intent(this,MainActivity2.class);
                startActivity(intent);
                break;
            case R.id.radioButton2:
                MyFragment2 fragment2=new MyFragment2();
               FragmentManager fragmentManager=getFragmentManager();
               FragmentTransaction transaction=fragmentManager.beginTransaction();
               transaction.add(R.id.frame,fragment2);
               transaction.commit();
                break;
            case R.id.radioButton3:
                break;
            case R.id.radioButton4:
                break;

        }
    }
}
