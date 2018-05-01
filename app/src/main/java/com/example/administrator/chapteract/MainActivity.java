package com.example.administrator.chapteract;

import android.content.Intent;
import android.content.res.Configuration;
import android.os.PersistableBundle;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "MainActivity";
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        button = findViewById(R.id.startSecond);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.addFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
                startActivity(intent);
                // Intent intent = new Intent(getApplicationContext(), SecondActivity.class);
                // getApplicationContext().startActivity(intent);//不知道为啥不报错


            }
        });

        Log.d(TAG, "onCreate:task: " + getTaskId());
        if (savedInstanceState != null) {
            //取出数据
            String reData = savedInstanceState.getString("data_key");
            Log.d(TAG, "onCreate: reData" + reData);
        }
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        //保存数据
        super.onSaveInstanceState(outState);
        String data = "Error destroy";
        outState.putString("data_key", data);
        Log.d(TAG, "onSaveInstanceState: data:" + data);
    }

/*    @Override
    protected void onNewIntent(Intent intent) {
        super.onNewIntent(intent);
        *//*Log.d(TAG, "onNewIntent: ");*//*
        Log.d(TAG, "onNewIntent: time:"+intent.getLongExtra("time",0));
    }

    @Override
    protected void onRestoreInstanceState(Bundle savedInstanceState) {
        //取出数据
        super.onRestoreInstanceState(savedInstanceState);
        String reData = savedInstanceState.getString("data_key");
        Log.d(TAG, "onRestoreInstanceState:reData " + reData);
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.d(TAG, "onStart: ");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.d(TAG, "onRestart: ");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.d(TAG, "onResume: ");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.d(TAG, "onPause: ");
    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.d(TAG, "onStop: ");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.d(TAG, "onDestroy: ");
    }



    @Override
    public void onConfigurationChanged(Configuration newConfig) {
        super.onConfigurationChanged(newConfig);
        Log.d(TAG, "onConfigurationChanged: "+newConfig.orientation);
    }*/
}
