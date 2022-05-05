package com.vvit.myappcseb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class RecyclerViewDemo extends AppCompatActivity {
    RecyclerView myView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_recycler_view_demo);
        myView = findViewById(R.id._my_fruit_list);

        List<String> list= new ArrayList<>();
        list.addAll(Arrays.asList(getResources().
                getStringArray(R.array.my_fruits)));

        FruitAdapter adapter = new FruitAdapter(list);
        myView.setLayoutManager(new LinearLayoutManager(this));
        myView.setAdapter(adapter);
        myView.setHasFixedSize(true);


    }
}