package com.example.mymobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class FavouritesPage extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_favourites_page);
    }

    public void openProfilePage(View view) {
        Intent intent = new Intent(this, CartPage.class);
        startActivity(intent);
    }

    public void openCartPage(View view) {
        Intent intent = new Intent(this, CartPage.class);
        startActivity(intent);
    }

    public void goBack(View view) {
        Intent intent = new Intent(this, MainActivity.class);
        startActivity(intent);
    }
}