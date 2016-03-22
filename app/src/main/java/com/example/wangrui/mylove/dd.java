//package com.example.wangrui.mylove;
//
//import android.app.Activity;
//import android.content.Intent;
//import android.media.MediaPlayer;
//import android.os.Bundle;
//import android.os.Environment;
//import android.util.Log;
//import android.view.View;
//import android.widget.Button;
//import android.widget.TextView;
//import android.widget.Toast;
//
//import java.io.File;
//
///**
// * Created by wangrui on 2016/2/25.
// */
//public class dd extends Activity {
//    private MediaPlayer mediaPlayer;
//    private boolean isPause=false;
//    private File file;
//
//
//    @Override
//    protected void onCreate(Bundle savedInstanceState) {
//        super.onCreate(savedInstanceState);
//
//
//        final Button button=(Button)findViewById(R.id.button);//播放
//        final Button button1=(Button)findViewById(R.id.button2);//暂停
//        final Button button2=(Button)findViewById(R.id.button3);//停止
//
//        if(!isFileExist()){
//            button.setEnabled(false);
//        } //对MediaPlayer对象添加事件监听，当播放完成时重新开始音乐播放
//
//        button.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                play();
//                if (isPause){
//                    button1.setText("暂停");
//                    isPause=false;
//                }
//                button1.setEnabled(true);
//                button2.setEnabled(true);
//                button.setEnabled(false);
//            }
//        });
//        //对暂停继续按钮添加时事件监听器
//        button1.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                if(mediaPlayer.isPlaying()&&!isPause){
//                    mediaPlayer.pause();
//                    isPause=true;
//                    ((Button)v).setText("继续");
//
//                    button.setEnabled(true);
//                }else{
//                    mediaPlayer.start();
//                    ((Button)v).setText("暂停");
//
//                    button.setEnabled(false);
//                }
//            }
//        });
//        //对停止按钮添加事件监听器
//        button2.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                mediaPlayer.stop();
//
//                button1.setEnabled(false);
//                button2.setEnabled(false);
//                button.setEnabled(true);
//            }
//        });
//        Button no=(Button)findViewById(R.id.no);
//        Button yes=(Button)findViewById(R.id.yes);
//        no.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//
//                Intent intent = new Intent(SixthAct.this, EndAct.class);
//                startActivity(intent);
//            }
//
//        });
//        yes.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View v) {
//                Intent intent = new Intent(SixthAct.this,SeventhAct.class);
//                startActivity(intent);
//            }
//        });
//
//    }
//    @Override
//    protected void onDestroy() {
//        if(mediaPlayer.isPlaying()){
//            mediaPlayer.stop();
//        }
//        mediaPlayer.release();
//        super.onDestroy();
//    }
//    //判断文件是否存在
//    private boolean  isFileExist(){
//        file=new File(Environment.getExternalStorageDirectory()+File.separator+"myMP32.mp3");
//        if(file.exists()){
//            //  mediaPlayer=new MediaPlayer();
//            mediaPlayer=MediaPlayer.create(this,R.raw.song1);
//            try {
////                mediaPlayer.setDataSource(file.getAbsolutePath());
////                mediaPlayer.prepare();//预加载音频
////                mediaPlayer.start();//播放音乐
//            }catch (Exception e) {
//                e.printStackTrace();
//            }
//            Toast.makeText(this,"file exist",Toast.LENGTH_LONG).show();
//            return true;
//        }else{
//            Toast.makeText(this,"file don't exist", Toast.LENGTH_LONG).show();
//        }
//        return false;
//    }
//    //播放音乐的方法
//    private void play(){
//        try{
//            mediaPlayer.reset();//从新设置要播放的音乐
//            //           mediaPlayer.setDataSource(file.getAbsolutePath());
////            mediaPlayer.prepare();//预加载音频
//            mediaPlayer=MediaPlayer.create(this,R.raw.song1);
//            mediaPlayer.start();//播放音乐
//
//        } catch (Exception e) {
//            e.printStackTrace();
//            Log.e("err", e.getMessage());
//        }
//        return ;
//    }
////
////}
//private void play(){
//        try{
//        mediaPlayer.reset();//从新设置要播放的音乐
//        //           mediaPlayer.setDataSource(file.getAbsolutePath());
////            mediaPlayer.prepare();//预加载音频
//        mediaPlayer=MediaPlayer.create(this,R.raw.song1);
//        mediaPlayer.start();//播放音乐
//
//        } catch (Exception e) {
//        e.printStackTrace();
//        Log.e("err", e.getMessage());
//        }
//        return ;
//        }