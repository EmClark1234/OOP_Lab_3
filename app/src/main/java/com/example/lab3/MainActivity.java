package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        final Button nxtBtn = findViewById(R.id.button);
        nxtBtn.setOnClickListener((click) -> {nxtBtn.setText("You clicked me"); } );
    }
}