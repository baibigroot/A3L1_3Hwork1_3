package com.example.a3l1_3hwork1_3.ui;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.example.a3l1_3hwork1_3.R;
import com.example.a3l1_3hwork1_3.ui.charakter_list.CharacterFragment;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getSupportFragmentManager().beginTransaction().replace(R.id.nav_host_fragment, new CharacterFragment()).commit();
    }
}