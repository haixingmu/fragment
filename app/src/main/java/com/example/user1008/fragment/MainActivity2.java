package com.example.user1008.fragment;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.AttributeSet;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

/**
 * Created by user1008 on 2018/1/11.
 */

public class MainActivity2 extends Activity {

    private TextView textView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.main2);
        Button button=(Button) findViewById(R.id.button1);
        button.setText("改变");
        textView=(TextView) findViewById(R.id.text1);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                textView.setText("TextView的值改变了");
            }
        });
    }
}
