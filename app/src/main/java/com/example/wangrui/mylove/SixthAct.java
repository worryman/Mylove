package com.example.wangrui.mylove;

import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;
import android.os.Environment;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;

/**
 * Created by wangrui on 2016/2/25.
 */
public class SixthAct extends Activity {
    private MediaPlayer mediaPlayer;
    private boolean isPause=false;
    private File file;

    private void play(){

//            mediaPlayer.reset();//从新设置要播放的音乐
            //           mediaPlayer.setDataSource(file.getAbsolutePath());
//            mediaPlayer.prepare();//预加载音频
            mediaPlayer=MediaPlayer.create(this,R.raw.song1);
            mediaPlayer.start();//播放音乐


        return ;
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixth);

       play();
        Button no=(Button)findViewById(R.id.no);
        Button yes=(Button)findViewById(R.id.yes);

        no.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent = new Intent(SixthAct.this, EndAct.class);
                startActivity(intent);
            }

        });
        yes.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mediaPlayer.stop();
                Intent intent = new Intent(SixthAct.this,SeventhAct.class);
                startActivity(intent);
            }
        });

    }


}
