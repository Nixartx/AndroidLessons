package com.nixart.tasks;

import androidx.lifecycle.ViewModelProvider;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ProgressBar;
import android.widget.TextView;

public class ProgressBarFragment extends Fragment {

    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container,
                             @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_progress_bar, container, false);
        ProgressBar indicatorBar = (ProgressBar) view.findViewById(R.id.indicator);
        TextView statusView = (TextView) view.findViewById(R.id.statusView);
        Button btnFetch = (Button)view.findViewById(R.id.progressBtn);

        MyViewModel model = new ViewModelProvider(requireActivity()).get(MyViewModel.class);

        model.getValue().observe(getViewLifecycleOwner(), value -> {
            indicatorBar.setProgress(value);
            statusView.setText("Status: " + value);
        });
        btnFetch.setOnClickListener(v -> model.execute());
        return view;
    }
}