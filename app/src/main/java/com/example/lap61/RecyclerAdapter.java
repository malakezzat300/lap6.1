package com.example.lap61;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;
import java.util.zip.Inflater;

class RecyclerAdapter extends RecyclerView.Adapter<RecyclerAdapter.ViewHolder> {


    private final ArrayList<Cake> cakes;

    public RecyclerAdapter(ArrayList<Cake> vales) {
        cakes = vales;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup recyclerView, int viewType) {
        LayoutInflater layoutInflater = LayoutInflater.from(recyclerView.getContext());
        View view = layoutInflater.inflate(R.layout.cake_row,recyclerView);
        ViewHolder viewHolder = new ViewHolder(view);
        return viewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        holder.imageView.setImageResource(cakes.get(position).getImage());
        holder.nameText.setText(cakes.get(position).getName());
        holder.desText.setText(cakes.get(position).getDes());
    }

    @Override
    public int getItemCount() {
        return cakes.size();
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        TextView nameText,desText;
        ImageView imageView;
        public ViewHolder(@NonNull View itemView) {
            super(itemView);
            nameText = itemView.findViewById(R.id.nameText);
            desText = itemView.findViewById(R.id.desText);
            imageView = itemView.findViewById(R.id.imageView);
        }
    }
}
