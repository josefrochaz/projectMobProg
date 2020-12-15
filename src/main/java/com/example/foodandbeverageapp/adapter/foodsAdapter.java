package com.example.foodandbeverageapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.foodandbeverageapp.DetailsActivity;
import com.example.foodandbeverageapp.R;
import com.example.foodandbeverageapp.model.foods;

import java.util.List;

public class foodsAdapter extends RecyclerView.Adapter<foodsAdapter.foodsViewHolder> {

    Context context;
    List<foods> foodsList;

    public foodsAdapter(Context context, List<foods> foodsList) {
        this.context = context;
        this.foodsList = foodsList;
    }

    @NonNull
    @Override
    public foodsViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {

        View view = LayoutInflater.from(context).inflate(R.layout.foods_row_item, parent, false);

        return new foodsViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull foodsViewHolder holder, int position) {

        holder.foodImage.setImageResource(foodsList.get(position).getImageUrl());
        holder.name.setText(foodsList.get(position).getName());
        holder.price.setText(foodsList.get(position).getPrice());

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(context, DetailsActivity.class);
                context.startActivity(intent);
            }
        });

    }

    @Override
    public int getItemCount() {
        return foodsList.size();
    }


    public static final class foodsViewHolder extends RecyclerView.ViewHolder{

        ImageView foodImage;
        TextView price, name;


        public foodsViewHolder(@NonNull View itemView) {
            super(itemView);

            foodImage = itemView.findViewById(R.id.menu_image);
            name = itemView.findViewById(R.id.tv_menu_title);
            price = itemView.findViewById(R.id.tv_menu_price);

        }
    }


}
