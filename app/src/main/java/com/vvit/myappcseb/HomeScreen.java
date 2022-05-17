package com.vvit.myappcseb;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;

public class HomeScreen extends AppCompatActivity {
    RecyclerView movie_list;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home_screen);
        movie_list = findViewById(R.id._movie_list);


        ArrayList<Movie> myMovieList = new ArrayList<>();
        Movie movie = new Movie();
        movie.setTitle("ABC");
        movie.setRelease_date("01-01-2022");
        myMovieList.add(movie);
        movie.setTitle("DEF");
        movie.setRelease_date("01-01-2022");
        myMovieList.add(movie);
        movie.setTitle("GHI");
        movie.setRelease_date("01-01-2022");
        myMovieList.add(movie);
        movie.setTitle("JKL");
        movie.setRelease_date("01-01-2022");
        myMovieList.add(movie);

        MovieAdapter adapter = new MovieAdapter(myMovieList,HomeScreen.this);
        movie_list.setLayoutManager(new LinearLayoutManager(this));
        movie_list.setAdapter(adapter);


    }
}