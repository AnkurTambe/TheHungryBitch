package com.example.thehungrybitch;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class DesertsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deserts);

        ListView desertsList = findViewById(R.id.List_View_Deserts);

        dishes[] dishMenu = {
                new dishes("Cocoa and blackcurrant cake", "Moist cake made with cocoa and fresh blackcurrant", 499),
                new dishes("Mulberry and cardamom crumble", "Fresh mulberry and green cardamom topped with butter crumble", 699),
                new dishes("Lemon scones with chilli jam", "Vegan scones served with chilli jam and fresh coconut cream", 599),
                new dishes("Potato and banana vegan crepes", "Crispy vegan crepes filled with fresh potato and banana", 599),
                new dishes("Cinnamon and treacle buns", "Crumbly buns made with cinnamon and dark treacle", 499),
        };

        ArrayAdapter<dishes> desertsDishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishMenu);
        desertsList.setAdapter(desertsDishesAdapter);
    }
}