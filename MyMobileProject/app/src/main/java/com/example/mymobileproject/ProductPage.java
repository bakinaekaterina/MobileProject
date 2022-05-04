package com.example.mymobileproject;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class ProductPage extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_product_page);

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
        Intent intent = new Intent(this, CartPage.class);
        startActivity(intent);
    }


    public void addToCart(View view) {
        Toast toast = Toast.makeText(ProductPage.this, "Done", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.CENTER, 0, 0);
        LinearLayout toastImage = (LinearLayout) toast.getView();
        ImageView imageView = new ImageView(ProductPage.this);
        imageView.setImageResource(R.drawable.ic_addcart_button2);
        toastImage.addView(imageView, 0);
        toast.show();
    }


}