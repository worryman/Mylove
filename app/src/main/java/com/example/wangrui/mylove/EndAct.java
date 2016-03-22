package com.example.wangrui.mylove;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by wangrui on 2016/2/24.
 */
public class EndAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_end);
        Button onceagain=(Button)findViewById(R.id.onceagain);
        onceagain.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(EndAct.this,BeginAct.class);
                startActivity(intent);
            }
        });
    }
}
