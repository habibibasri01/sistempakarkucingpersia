package com.example.sistempakarkucingpersia;

import android.content.Context;
import android.content.SharedPreferences;
import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import java.util.ArrayList;
import java.util.List;

public class RiwayatActivity extends AppCompatActivity {

    private RecyclerView recyclerView;
    private RiwayatAdapter riwayatAdapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_riwayat);

        recyclerView = findViewById(R.id.recyclerView);
        recyclerView.setLayoutManager(new LinearLayoutManager(this));

        // Mengambil dan menampilkan data riwayat diagnosa dari SharedPreferences
        List<RiwayatItem> riwayatList = retrieveRiwayatList();
        riwayatAdapter = new RiwayatAdapter(riwayatList);
        recyclerView.setAdapter(riwayatAdapter);
    }

    // ...

    private List<RiwayatItem> retrieveRiwayatList() {
        List<RiwayatItem> riwayatList = new ArrayList<>();

        SharedPreferences sharedPreferences = getSharedPreferences("riwayat_diagnosa", Context.MODE_PRIVATE);
        int riwayatCount = sharedPreferences.getInt("riwayatCount", 0);

        for (int i = 0; i < riwayatCount; i++) {
            String formattedBayes = sharedPreferences.getString("formattedBayes_" + i, "");
            String solker = sharedPreferences.getString("solker_" + i, "");
            String kerusakan = sharedPreferences.getString("kerusakan_" + i, "");
            long timestamp = sharedPreferences.getLong("timestamp_" + i, 0);

            RiwayatItem riwayatItem = new RiwayatItem(formattedBayes, solker, kerusakan, timestamp);
            riwayatList.add(riwayatItem);
        }

        return riwayatList;
    }

}
