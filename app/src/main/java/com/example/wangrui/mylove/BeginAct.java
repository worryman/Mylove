package com.example.wangrui.mylove;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;


public class BeginAct extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_begin);
        Button no=(Button)findViewById(R.id.no);
        Button yes=(Button)findViewById(R.id.yes);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent =new Intent(BeginAct.this,EndAct.class);
                startActivity(intent);
            }
        });
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(BeginAct.this,FirstAct.class);
                startActivity(intent);
            }
        });
    }
}
