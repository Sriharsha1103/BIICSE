package com.vvit.myappcseb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class FirstScreen extends AppCompatActivity {
//1. Create objects for components/Views/Widgets
    EditText input1,input2;
    Button addButton;
    TextView result;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_first_screen);

        //2. Map - relate - link objects with components
         input1 = findViewById(R.id.id_first_input1);
         input2 = findViewById(R.id.id_first_input2);
         addButton = findViewById(R.id.id_first_add_button);
         result = findViewById(R.id.id_first_result);

        //3. Method/Functionality
    }

    public void handleAddition(View view) {
        //3. Method/Functionality
        int value1 = Integer.parseInt(input1.getText().toString());
        int value2 = Integer.parseInt(input2.getText().toString());
        int resultValue = value1 + value2 ;
        result.setText(String.valueOf(resultValue));


        Intent intent = new Intent(this, SecondScreen.class);
        startActivity(intent);
    }


}