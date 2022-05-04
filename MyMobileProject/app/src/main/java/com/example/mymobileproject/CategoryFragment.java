package com.example.mymobileproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.mymobileproject.adapter.CategoryAdapter;
import com.example.mymobileproject.model.Category;
import com.example.mymobileproject.viewmodel.CategoryViewModel;

import java.util.List;

public class CategoryFragment extends Fragment {

    RecyclerView categoryRecycler;
    CategoryAdapter categoryAdapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static CategoryFragment newInstance() {
        return new CategoryFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_category, container, false);
        CategoryViewModel mViewModel = new ViewModelProvider(this).get(CategoryViewModel.class);
        final Observer<List<Category>> nameObserver = new Observer<List<Category>>() {
            @Override
            public void onChanged(List<Category> categories) {
                categoryAdapter = new CategoryAdapter(requireContext(), categories);
                categoryRecycler.setAdapter(categoryAdapter);
            }
        };

        categoryRecycler=view.findViewById(R.id.categoryRecycler);
        mViewModel.getCategoryList().observe(getViewLifecycleOwner(), nameObserver);
        RecyclerView.LayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        categoryRecycler.setLayoutManager(manager);

        return view;


    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
            ImageButton favourites_button = (ImageButton) view.findViewById(R.id.favourites_button);
            favourites_button.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View view) {
                    requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame, new SectionFragment()).commit();
                }
            });
        }

}