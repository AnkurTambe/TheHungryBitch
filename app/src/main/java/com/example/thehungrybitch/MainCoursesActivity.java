package com.example.thehungrybitch;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import androidx.appcompat.app.AppCompatActivity;

public class MainCoursesActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_courses);

        ListView mainsList = findViewById(R.id.List_View_Mains);

        dishes[] dishMenu = {
                new dishes("Black pepper and chickpea vindaloo", "Hot vindaloo maade with hot black pepper and fresh chickpea", 1199),
                new dishes("Goji berry and cauliflower salad", "A crisp salad featuring fresh goji berry and cauliflower", 1299),
                new dishes("Thai basil and mulberry salad", "A crisp salad featuring fresh thai basil and mulberry", 1499),
                new dishes("Onion and apple ciabatta", "Warm ciabatta filled with caramalised onion and fresh apple", 1299),
                new dishes("Onion and olive bread", "Crunchy bread made with baby onion and olive", 1199),
                new dishes("Onion and mustard soup", "Dried onion and French mustard combined into smooth soup", 1299),
                new dishes("Samphire and rocket salad", "Samphire and fresh rocket served on a bed of lettuce", 1599),
                new dishes("Cocoa and chicory salad", "Cocoa and chicory served on a bed of lettuce", 1699),
                new dishes("Cauliflower and squash curry", "Mild curry made with fresh cauliflower and butternut squash", 1499),
                new dishes("Cauliflower and potato madras", "Medium-hot madras made with fresh cauliflower and new potato", 1399)
        };

        ArrayAdapter<dishes> mainsDishesAdapter = new ArrayAdapter<>(this, android.R.layout.simple_list_item_1, dishMenu);
        mainsList.setAdapter(mainsDishesAdapter);
    }

}
