package com.example.sistempakarkucingpersia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageButton;

public class penyakit5 extends AppCompatActivity {

    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit5);

        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(penyakit5.this, penyakit.class);
                startActivity(intent);
            }
        });

    }
}