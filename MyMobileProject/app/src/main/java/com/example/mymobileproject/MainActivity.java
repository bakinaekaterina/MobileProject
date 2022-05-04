package com.example.mymobileproject;

import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.mymobileproject.adapter.CategoryAdapter;
import com.example.mymobileproject.adapter.TypeAdapter;
import com.example.mymobileproject.model.Category;
import com.example.mymobileproject.model.Type;
import com.example.mymobileproject.viewmodel.CategoryViewModel;
import com.example.mymobileproject.viewmodel.TypeViewModel;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {

        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        CategoryFragment categoryFragment = new CategoryFragment();
        fragmentTransaction.replace(R.id.frame, categoryFragment);
        fragmentTransaction.commit();
    }


    public void openProfilePage(View view) {
        ProfileFragment fragmentProfile = new ProfileFragment();
        FragmentTransaction fragmentTransaction = getSupportFragmentManager().beginTransaction();
        fragmentTransaction.replace(R.id.frame, fragmentProfile);
        fragmentTransaction.commit();
    }

    public void openCartPage(View view) {
        Intent intent = new Intent(this, CartPage.class);
        startActivity(intent);
    }



}
//bottom navigation


