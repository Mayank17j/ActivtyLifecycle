package com.example.lenovo.activtylifecycle;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        // Toast -> to showing any massage argu(context,message,duration)
        Toast.makeText(this,"onCreateFinished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onCreate");
        //Logi for Logcat massages
    }

    @Override
    protected void onStart() {
        super.onStart();
        Toast.makeText(this,"onStartFinished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onStart");

    }

    @Override
    protected void onResume() {
        super.onResume();
        Toast.makeText(this,"onResumeFinished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onResume");

    }

    @Override
    protected void onPause() {
        super.onPause();
        Toast.makeText(this,"onPauseFinished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onPause");

    }

    @Override
    protected void onStop() {
        super.onStop();
        Toast.makeText(this,"onStopFinished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onStop");

    }

    @Override
    protected void onRestart() {
        super.onRestart();
        Toast.makeText(this,"onRestartFinished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onRestart");

    }

    @Override
    protected void onDestroy() {
        super.onDestroy();
        Toast.makeText(this,"onDestroyFinished",Toast.LENGTH_SHORT).show();
        Log.i("MainActivity","onDestroy");

    }
}
