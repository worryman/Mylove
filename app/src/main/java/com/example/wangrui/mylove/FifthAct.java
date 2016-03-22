package com.example.wangrui.mylove;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

/**
 * Created by wangrui on 2016/2/25.
 */
public class FifthAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifth);
        Button no=(Button)findViewById(R.id.no);
        Button yes=(Button)findViewById(R.id.yes);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(FifthAct.this, EndAct.class);
                startActivity(intent);
            }

        });
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(FifthAct.this,SixthAct.class);
                startActivity(intent);
            }
        });
    }
}
