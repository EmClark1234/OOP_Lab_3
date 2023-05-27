package com.example.lab3;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button nxtBtn = findViewById(R.id.button);
        nxtBtn.setOnClickListener(new View.OnClickListener(){
            public void onClick(View v){
                nxtBtn.setText("hello");
            }
        });
    }
}