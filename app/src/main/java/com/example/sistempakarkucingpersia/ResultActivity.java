package com.example.sistempakarkucingpersia;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ResultActivity extends AppCompatActivity {

    ImageButton back;

    Button ulang, cek;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_result);

        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, MainDiagnosaActivity.class);
                startActivity(intent);
            }
        });

        ulang = (Button) findViewById(R.id.ulang);
        ulang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, MainDiagnosaActivity.class);
                startActivity(intent);
            }
        });

        cek = (Button) findViewById(R.id.cek);
        cek.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(ResultActivity.this, penyakit.class);
                startActivity(intent);
            }
        });

        TextView textFormattedBayesResult = findViewById(R.id.textFormattedBayes);
        TextView textSolkerResult = findViewById(R.id.textSolker);
        TextView textKerusakanResult = findViewById(R.id.textKerusakan);

        // Mendapatkan data yang dikirimkan dari MainDiagnosaActivity
        String formattedBayes = getIntent().getStringExtra("formattedBayes");
        String solker = getIntent().getStringExtra("solker");
        String kerusakan = getIntent().getStringExtra("kerusakan");

        // Mendapatkan waktu saat ini
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        String waktuTextView = sdf.format(new Date());

        // Menampilkan data pada TextView yang sesuai
        textFormattedBayesResult.setText(formattedBayes);
        textSolkerResult.setText(solker);
        textKerusakanResult.setText(kerusakan);

        // Menyimpan hasil diagnosa ke SharedPreferences
        saveToSharedPreferences(formattedBayes, solker, kerusakan, System.currentTimeMillis(), waktuTextView);


    }
    private void saveToSharedPreferences(String formattedBayes, String solker, String kerusakan, long timestamp, String waktu) {
        SharedPreferences sharedPreferences = getSharedPreferences("riwayat_diagnosa", Context.MODE_PRIVATE);
        SharedPreferences.Editor editor = sharedPreferences.edit();

        // Menambahkan 1 ke jumlah riwayat
        int riwayatCount = sharedPreferences.getInt("riwayatCount", 0);
        editor.putInt("riwayatCount", riwayatCount + 1);

        // Menyimpan data hasil diagnosa ke SharedPreferences
        editor.putString("formattedBayes_" + riwayatCount, formattedBayes);
        editor.putString("solker_" + riwayatCount, solker);
        editor.putString("kerusakan_" + riwayatCount, kerusakan);
        editor.putLong("timestamp_" + riwayatCount, timestamp);
        editor.putString("waktu_" + riwayatCount, waktu);

        // Commit perubahan
        editor.apply();
    }

}
