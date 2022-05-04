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

import com.example.mymobileproject.adapter.SectionAdapter;
import com.example.mymobileproject.adapter.TypeAdapter;
import com.example.mymobileproject.model.Section;
import com.example.mymobileproject.model.Type;
import com.example.mymobileproject.viewmodel.SectionViewModel;
import com.example.mymobileproject.viewmodel.TypeViewModel;

import java.util.List;

public class TypeFragment extends Fragment {

    RecyclerView typeRecycler;
    TypeAdapter typeAdapter;

    public void onCreate(Bundle savedInstanceState) { super.onCreate(savedInstanceState); }

    public static TypeFragment newInstance() {
        return new TypeFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_type, container, false);
        TypeViewModel mViewModel = new ViewModelProvider(this).get(TypeViewModel.class);
        final Observer<List<Type>> nameObserver = new Observer<List<Type>>() {
            @Override
            public void onChanged(List<Type> types) {
                typeAdapter = new TypeAdapter(requireContext(), types);
                typeRecycler.setAdapter(typeAdapter);
            }
        };

        typeRecycler=view.findViewById(R.id.typeRecycler);
        mViewModel.getTypeList().observe(getViewLifecycleOwner(), nameObserver);
        RecyclerView.LayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        typeRecycler.setLayoutManager(manager);

        return view;
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton back_button = (ImageButton) view.findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame, new SectionFragment()).commit();
            }
        });
    }

}
