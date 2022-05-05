package com.vvit.myappcseb;


import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class FruitAdapter extends RecyclerView.Adapter<FruitAdapter.FruitViewHolder> {
    List<String> myFruits;

    public FruitAdapter(List<String> myFruits) {
        this.myFruits = myFruits;
    }

    @NonNull
    @Override
    public FruitAdapter.FruitViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        LayoutInflater inflater = LayoutInflater.from(parent.getContext());
        View view = inflater.inflate(R.layout.row_fruit, parent, false);
        FruitViewHolder holder = new FruitViewHolder(view);
        return holder;
    }

    @Override
    public void onBindViewHolder(@NonNull FruitAdapter.FruitViewHolder holder, int position) {
        Fruit fruit = new Fruit(myFruits.get(position));
        holder.myFruitView.setText(fruit.getName());
    }

    @Override
    public int getItemCount() {
        return myFruits.size();
    }

    public class FruitViewHolder extends RecyclerView.ViewHolder {
        TextView myFruitView;
        public FruitViewHolder(@NonNull View itemView) {
            super(itemView);
            myFruitView = itemView.findViewById(R.id._fruit_name);
        }
    }
}
