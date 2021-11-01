package com.example.a3l1_3hwork1_3.ui.character_detail;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

import com.bumptech.glide.Glide;
import com.example.a3l1_3hwork1_3.data.models.Charakter;
import com.example.a3l1_3hwork1_3.databinding.FragmentDetailBinding;

public class DetailFragment extends Fragment {
    private FragmentDetailBinding ui;
    private Charakter charakter;

    @Override
    public void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        assert getArguments() != null;
        charakter = (Charakter) getArguments().getSerializable("details");
    }

    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        ui = FragmentDetailBinding.inflate(inflater, container, false);
        return ui.getRoot();
    }

    @Override
    public void onViewCreated(@NonNull View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);
        setData();

    }

    private void setData() {
        Glide
                .with(ui.getRoot())
                .load(charakter.getImage())
                .circleCrop()
                .into(ui.detailPhoto);
       ui.name.setText(charakter.getName());
       ui.status.setText(charakter.getStatus());
    }
}