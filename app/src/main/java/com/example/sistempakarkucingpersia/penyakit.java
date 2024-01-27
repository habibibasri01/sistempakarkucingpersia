package com.example.sistempakarkucingpersia;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class penyakit extends AppCompatActivity {

    Button po1,po2,po3,po4,po5,po6;

    ImageButton back;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_penyakit);

        po1 = (Button) findViewById(R.id.flu);
        po2 = (Button) findViewById(R.id.femilie);
        po3 = (Button) findViewById(R.id.panleukopenia);
        po4 = (Button) findViewById(R.id.cacingan);
        po5 = (Button) findViewById(R.id.scabies);
        po6 = (Button) findViewById(R.id.diare);
        back = (ImageButton) findViewById(R.id.back);

        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), menuutama.class));
            }
        });

        po1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), penyakit1.class));
            }
        });

        po2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), penyakit2.class));
            }
        });

        po3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), penyakit3.class));
            }
        });

        po4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), penyakit4.class));
            }
        });

        po5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), penyakit5.class));
            }
        });

        po6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), penyakit6.class));
            }
        });

    }
}