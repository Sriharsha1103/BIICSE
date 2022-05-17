package com.vvit.myappcseb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        MyAsyncTask object = new MyAsyncTask();
        object.execute();

        Intent intent = new Intent(this, HomeScreen.class);
        startActivity(intent);
    }
}