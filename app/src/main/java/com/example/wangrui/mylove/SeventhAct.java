package com.example.wangrui.mylove;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.telephony.SmsManager;
import android.view.View;
import android.widget.Button;

import java.util.List;

/**
 * Created by wangrui on 2016/2/25.
 */
public class SeventhAct extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_seventh);
        Button no=(Button)findViewById(R.id.no);
        Button yes=(Button)findViewById(R.id.yes);
        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(SeventhAct.this, EndAct.class);
                startActivity(intent);
            }

        });
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                sendMsg();
                Intent intent = new Intent(SeventhAct.this,FinalAct.class);
                startActivity(intent);
            }
        });
    }
    public void sendMsg(){
        String content = "我愿意!";
        SmsManager smsManager = SmsManager.getDefault();
        List<String> divideContents = smsManager.divideMessage(content);
        for (String text : divideContents) {
            smsManager.sendTextMessage("18735380870", null, text, null, null);
        }
    }
}
