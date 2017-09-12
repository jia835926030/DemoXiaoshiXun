package com.example.jiyun.demoxiaoshixun;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.e("TAG","onCreate--------------------------");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Log.e("TAG","onStart--------------");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Log.e("TAG","onRestart----------------------------");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Log.e("TAG","onResume---------------");
        Log.e("TAG","onResume---------------");
        Log.e("TAG","onResume---------------");
        Log.e("TAG","onResume---------------");
        Log.e("TAG","onResume---------------"); Log.e("TAG","onResume---------------"); Log.e("TAG","onResume---------------");



    }

    @Override
    protected void onPause() {
        super.onPause();
        Log.e("TAG","onPause--------------");
        Log.e("TAG","onPause--------------");
        Log.e("TAG","onPause--------------");
        Log.e("TAG","onPause--------------");
        Log.e("TAG","onPause--------------");
        Log.e("TAG","onPause--------------");
        Log.e("TAG","onPause--------------");
        Log.e("TAG","onPause--------------");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Log.e("TAG","onStop---------------");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e("TAG","onDestroy---------------");
    }
}
