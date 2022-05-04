package com.example.mymobileproject;

import android.content.Intent;
import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;
import androidx.recyclerview.widget.RecyclerView;
import androidx.recyclerview.widget.StaggeredGridLayoutManager;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.mymobileproject.adapter.SectionAdapter;
import com.example.mymobileproject.model.Section;
import com.example.mymobileproject.viewmodel.SectionViewModel;

import java.util.ArrayList;
import java.util.List;

public class SectionFragment extends Fragment {

    RecyclerView sectionRecycler;
    SectionAdapter sectionAdapter;

    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
    }

    public static SectionFragment newInstance() {
        return new SectionFragment();
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_section, container, false);
        SectionViewModel mViewModel = new ViewModelProvider(this).get(SectionViewModel.class);

        final Observer<List<Section>> nameObserver = new Observer<List<Section>>() {
            @Override
            public void onChanged(List<Section> sections) {
                sectionAdapter = new SectionAdapter(requireContext(), sections);
                sectionRecycler.setAdapter(sectionAdapter);
            }
        };

        sectionRecycler=view.findViewById(R.id.sectionRecycler);
        mViewModel.getSectionList().observe(getViewLifecycleOwner(), nameObserver);
        RecyclerView.LayoutManager manager = new StaggeredGridLayoutManager(2, StaggeredGridLayoutManager.VERTICAL);
        sectionRecycler.setLayoutManager(manager);

        return view;
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        ImageButton back_button = (ImageButton) view.findViewById(R.id.back_button);
        back_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame, new TypeFragment()).commit();
            }
        });
    }

}
