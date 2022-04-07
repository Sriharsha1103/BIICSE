package com.vvit.myappcseb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class SecondScreen extends AppCompatActivity {
    Button backButton;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_screen);
        backButton = findViewById(R.id.id_second_back);
        backButton.setBackgroundColor(getResources().getColor(R.color.teal_700));


    }
    public void handleBack(View view){
        Intent intent = new Intent(this, FirstScreen.class);
        startActivity(intent);
    }
}