package com.shafira.project01.model;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.bumptech.glide.request.RequestOptions;
import com.shafira.project01.R;

import java.util.ArrayList;

public class Adapter extends RecyclerView.Adapter<Adapter.CardViewViewHolder> {
    private ArrayList<TV> listTV;

    public Adapter(ArrayList<TV> list) {
        this.listTV = list;
    }

    @NonNull
    @Override
    public CardViewViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int viewType) {
        View view = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_main, viewGroup, false);
        return new CardViewViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull final CardViewViewHolder holder, int position) {

        TV tv = listTV.get(position);
        Glide.with(holder.itemView.getContext())
                .load(tv.getGambar())
                .apply(new RequestOptions().override(350, 550))
                .into(holder.gambar);
        holder.judul.setText(tv.getJudul());
        holder.id.setText(tv.getId());
        holder.airedseason.setText(tv.getAiredseason());
        holder.firstaired.setText(tv.getFirstaired());
        holder.director.setText(tv.getDirector());
        holder.rating.setText(tv.getRating()+"");

    }

    @Override
    public int getItemCount() {
        return listTV.size();
    }

    class CardViewViewHolder extends RecyclerView.ViewHolder {
        ImageView gambar;
        TextView judul, firstaired, director, airedseason, id, rating;

        CardViewViewHolder(View itemView) {
            super(itemView);
            gambar = itemView.findViewById(R.id.gambar);
            judul = itemView.findViewById(R.id.judul);
            id = itemView.findViewById(R.id.id);
            airedseason = itemView.findViewById(R.id.airedseason);
            firstaired = itemView.findViewById(R.id.firstaired);
            director = itemView.findViewById(R.id.director);
            rating = itemView.findViewById(R.id.rating);
        }
    }
}

