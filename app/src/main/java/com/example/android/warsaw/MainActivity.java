package com.example.android.warsaw;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    private TextView museums;
    private TextView restaurants;
    private TextView parks;
    private TextView hotels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        museums = findViewById(R.id.museums);
        restaurants = findViewById(R.id.restaurants);
        parks = findViewById(R.id.parks);
        hotels = findViewById(R.id.hotels);

        museums.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent museumsIntent = new Intent(MainActivity.this, CatalogActivity.class);
                museumsIntent.putExtra("page", 0);
                startActivity(museumsIntent);
            }
        });

        restaurants.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent restaurantsIntent = new Intent(MainActivity.this, CatalogActivity.class);
                restaurantsIntent.putExtra("page", 2);
                startActivity(restaurantsIntent);
            }
        });

        parks.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent parksIntent = new Intent(MainActivity.this, CatalogActivity.class);
                parksIntent.putExtra("page", 1);
                startActivity(parksIntent);
            }
        });

        hotels.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent hotelsIntent = new Intent(MainActivity.this, CatalogActivity.class);
                hotelsIntent.putExtra("page", 3);
                startActivity(hotelsIntent);
            }
        });


    }
}
