package com.example.thehungrybitch;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class StartersActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_starters);

        ListView startersList = findViewById(R.id.List_View_Starters);

        dishes[] dishMenu = {
                new dishes("Mushroom and tofu maki", "Toasted seaweed wrapped in sushi rice, filled with chestnut mushroom and smoked tofu", 999),
                new dishes("Egg and avocado uramaki", "Pasta in a sauce made from free range eggs and fresh avocado", 1999),
                new dishes("Melon and lemon soup", "Fresh melon and lemon combined into creamy soup", 1199),
                new dishes("Coconut and chocolate mousse", "A creamy mousse made with fresh coconut and milk chocolate", 899),
                new dishes("Spinach and cabbage wontons", "Thin wonton cases stuffed with fresh spinach and chinese cabbage", 799),
                new dishes("Broccoli and cucumber soup", "Fresh broccoli and cucumber combined into creamy soup", 899),
                new dishes("Chilli and aubergine dip", "A dip made from scotch bonnet chilli and fresh aubergine", 999),
                new dishes("Chickpea and chilli gyoza", "Thin pastry cases stuffed with fresh chickpea and green chilli", 699),
                new dishes("Sprout and pineapple soup", "Fresh sprout and pineapple combined into creamy soup", 899),
                new dishes("Egusi and borscht soup", "Egusi and borscht combined into creamy soup", 1299)
        };

        ArrayAdapter<dishes> startersDishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishMenu);
        startersList.setAdapter(startersDishesAdapter);
    }
}