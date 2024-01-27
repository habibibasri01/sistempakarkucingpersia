package com.example.sistempakarkucingpersia;

import java.text.SimpleDateFormat;
import java.util.Date;

public class RiwayatItem {
    private String formattedBayes;
    private String solker;
    private String kerusakan;

    private long timestamp; // Menambahkan timestamp

    public RiwayatItem(String formattedBayes, String solker, String kerusakan, long timestamp) {
        this.formattedBayes = formattedBayes;
        this.solker = solker;
        this.kerusakan = kerusakan;
        // Tambahkan waktu diagnosa saat objek dibuat
        this.timestamp = timestamp;
    }

    public String getFormattedBayes() {
        return formattedBayes;
    }

    public String getSolker() {
        return solker;
    }

    public String getKerusakan() {
        return kerusakan;
    }

    public long getTimestamp() {
        return timestamp;
    }


}
