package com.example.foodandbeverageapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodandbeverageapp.R;
import com.example.foodandbeverageapp.model.drinks;

import java.util.List;

public class drinksAdapter extends RecyclerView.Adapter<drinksAdapter.drinksViewHolder> {

    Context context;
    List<drinks> drinksList;

    public drinksAdapter(Context context, List<drinks> drinksList) {
        this.context = context;
        this.drinksList = drinksList;
    }

    @NonNull
    @Override
    public drinksViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.drinks_row_item, parent, false);

        return new drinksViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull drinksViewHolder holder, int position) {

        holder.drinksImage.setImageResource(drinksList.get(position).getDrinksImageUrl());
        holder.name.setText(drinksList.get(position).getDrinksName());
        holder.price.setText(drinksList.get(position).getDrinksPrice());

    }

    @Override
    public int getItemCount() {

        return drinksList.size();
    }

    public static final class drinksViewHolder extends RecyclerView.ViewHolder{

        ImageView drinksImage;
        TextView price, name;

        public drinksViewHolder(View itemView){
            super(itemView);

            drinksImage = itemView.findViewById(R.id.drinks_image);
            name = itemView.findViewById(R.id.tv_drinks_title);
            price = itemView.findViewById(R.id.tv_drinks_price);

        }

    }

}
