package com.example.foodandbeverageapp;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import com.example.foodandbeverageapp.adapter.drinksAdapter;
import com.example.foodandbeverageapp.adapter.foodsAdapter;
import com.example.foodandbeverageapp.model.drinks;
import com.example.foodandbeverageapp.model.foods;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView foodsRecycler;
    foodsAdapter foodsAdapter;

    RecyclerView drinksRecycler;
    drinksAdapter drinksAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        //add foods data
        List<foods> foodsList = new ArrayList<>();

        foodsList.add(new foods("Lawless Burgerbar", "Rp135.000", R.drawable.lawless_burger));
        foodsList.add(new foods("McDonalds", "Rp45.000", R.drawable.mcd));
        foodsList.add(new foods("Dominos", "Rp75.000", R.drawable.dominos));
        foodsList.add(new foods("Pizza Hut", "Rp85.000", R.drawable.pizza_hut));
        foodsList.add(new foods("Lawless Burgerbar", "Rp135.000", R.drawable.lawless_burger));
        foodsList.add(new foods("McDonalds", "Rp45.000", R.drawable.mcd));
        foodsList.add(new foods("Dominos", "Rp75.000", R.drawable.dominos));
        foodsList.add(new foods("Pizza Hut", "Rp85.000", R.drawable.pizza_hut));

        setFoodsRecycler(foodsList);

        //add drinks data
        List<drinks> drinksList = new ArrayList<>();

        drinksList.add(new drinks("Orange Juice", "Rp15.000", R.drawable.orange_juice));
        drinksList.add(new drinks("Apple Juice", "Rp20.000", R.drawable.apple_juice));
        drinksList.add(new drinks("Avocado Juice", "Rp25.000", R.drawable.avocado_juice));
        drinksList.add(new drinks("Mineral Water", "Rp10.000", R.drawable.mineral_water));
        drinksList.add(new drinks("Orange Juice", "Rp15.000", R.drawable.orange_juice));
        drinksList.add(new drinks("Apple Juice", "Rp20.000", R.drawable.apple_juice));
        drinksList.add(new drinks("Avocado Juice", "Rp25.000", R.drawable.avocado_juice));
        drinksList.add(new drinks("Mineral Water", "Rp10.000", R.drawable.mineral_water));

        setDrinksRecycler(drinksList);

    }

    private void setDrinksRecycler(List<drinks> drinksList) {
        drinksRecycler = findViewById(R.id.drinks_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        drinksRecycler.setLayoutManager(layoutManager);
        drinksAdapter = new drinksAdapter(this, drinksList);
        drinksRecycler.setAdapter(drinksAdapter);
    }

    private void setFoodsRecycler(List<foods> foodsList){

        foodsRecycler = findViewById(R.id.foods_recycler);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        foodsRecycler.setLayoutManager(layoutManager);
        foodsAdapter = new foodsAdapter(this, foodsList);
        foodsRecycler.setAdapter(foodsAdapter);

    }


}