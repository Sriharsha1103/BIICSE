package com.vvit.myappcseb;

import android.app.Activity;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MovieAdapter extends RecyclerView.Adapter<MovieAdapter.MovieHolder> {
    ArrayList<Movie> myMovieList;
    Activity activity;

    public MovieAdapter(ArrayList<Movie> myMovieList, Activity activity) {
        this.myMovieList = myMovieList;
        this.activity = activity;
    }

    @NonNull
    @Override
    public MovieAdapter.MovieHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.row_movie,parent,false);
        MovieHolder holder = new MovieHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull MovieAdapter.MovieHolder holder, int position) {
        Movie movie = myMovieList.get(position);
        holder.title.setText(movie.getTitle());
        holder.release_date.setText(movie.getRelease_date());
    }

    @Override
    public int getItemCount() {
        return myMovieList.size();
    }

    public class MovieHolder extends RecyclerView.ViewHolder {
        TextView title,release_date;

        public MovieHolder(@NonNull View itemView) {
            super(itemView);
            title = itemView.findViewById(R.id._movie_title);
            release_date = itemView.findViewById(R.id._movie_release_date);
        }
    }
}
