package com.example.namanbansal.activitylifecycle;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;
// first activity
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"onCreate finished" ,Toast.LENGTH_SHORT ).show();
        Log.v("MainActivity", "onCreate");
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStart finished" ,Toast.LENGTH_SHORT ).show();
        Log.v("MainActivity", "onStart");
    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResume finished" ,Toast.LENGTH_SHORT ).show();
        Log.v("MainActivity", "onResume");
    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPause finished" ,Toast.LENGTH_SHORT ).show();
        Log.v("MainActivity", "onPause");
    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestart finished" ,Toast.LENGTH_SHORT ).show();
        Log.v("MainActivity", "onRestart");
    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroy finished" ,Toast.LENGTH_SHORT ).show();
        Log.v("MainActivity", "onDestroy");
    }
}
