package com.example.thehungrybitch;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    CardView starterCard;
    CardView mainsCard;
    CardView desertsCard;
    TextView emailAddress;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        findViews();
        starterCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent startersActivityIntent = new Intent(MainActivity.this, StartersActivity.class);
                startActivity(startersActivityIntent);
            }
        });

        mainsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent mainsActivityIntent = new Intent(MainActivity.this, MainCoursesActivity.class);
                startActivity(mainsActivityIntent);
            }
        });

        desertsCard.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent desertsActivityIntent = new Intent(MainActivity.this, DesertsActivity.class);
                startActivity(desertsActivityIntent);
            }
        });

        emailAddress.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent emailAddressIntent = new Intent(Intent.ACTION_SENDTO);
                emailAddressIntent.setData(Uri.parse("mailto:thehungrybitch@example.com"));
                startActivity(emailAddressIntent);
            }
        });
    }

    private void findViews() {
        starterCard = findViewById(R.id.card_starters);
        mainsCard = findViewById(R.id.card_mains);
        desertsCard = findViewById(R.id.card_deserts);
        emailAddress = findViewById(R.id.email_address);
    }
}