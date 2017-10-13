package com.example.zhanggang.myservice;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG", "onCreate: "+1111 );
    }

    public void onClick(View view) {
        Intent intent = new Intent(MainActivity.this, MusicService.class);
        switch (view.getId()){
            case R.id.main_start:  //开启服务
                startService(intent);
                break;
            case R.id.main_stop:  //停止服务
                stopService(intent);
                break;
        }
    }
}
