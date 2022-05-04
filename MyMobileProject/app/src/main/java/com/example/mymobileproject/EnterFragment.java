package com.example.mymobileproject;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;
import androidx.lifecycle.ViewModelProvider;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageButton;

import com.example.mymobileproject.databinding.FragmentEnterBinding;
import com.example.mymobileproject.viewmodel.EnterViewModel;

public class EnterFragment extends Fragment {

    private EnterViewModel enter;
    private FragmentEnterBinding binding;

    public EnterFragment () {
    }

    public static EnterFragment newInstance() { return new EnterFragment();}

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        enter = new ViewModelProvider(this).get(EnterViewModel.class);
        enter.giveEnter("");
        return inflater.inflate(R.layout.fragment_enter, container, false);
    }

    public void onViewCreated (@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        binding = FragmentEnterBinding.bind(view);
        enter.getmEnterList().observe(getViewLifecycleOwner(), enter1 -> {
            binding.editemail.setText(enter1.getEmail());
        });


        ImageButton enter_button = (ImageButton) view.findViewById(R.id.enter_button);
        enter_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                requireActivity().getSupportFragmentManager().beginTransaction().replace(R.id.frame, new CategoryFragment()).commit();
            }
        });
    }


}