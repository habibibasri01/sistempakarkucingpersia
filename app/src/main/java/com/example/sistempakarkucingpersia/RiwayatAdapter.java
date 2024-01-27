package com.example.sistempakarkucingpersia;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Locale;

public class RiwayatAdapter extends RecyclerView.Adapter<RiwayatAdapter.RiwayatViewHolder> {

    private List<RiwayatItem> riwayatList;

    public RiwayatAdapter(List<RiwayatItem> riwayatList) {
        this.riwayatList = riwayatList;
    }

    @NonNull
    @Override
    public RiwayatViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_riwayat, parent, false);
        return new RiwayatViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull RiwayatViewHolder holder, int position) {
        RiwayatItem riwayatItem = riwayatList.get(position);

        // Menggunakan SimpleDateFormat untuk mengonversi timestamp menjadi string yang dapat dibaca
        try {
            SimpleDateFormat sdf = new SimpleDateFormat("dd MMM yyyy HH:mm:ss", Locale.getDefault());
            String formattedDate = sdf.format(new Date(riwayatItem.getTimestamp()));

            holder.formattedBayesTextView.setText(riwayatItem.getFormattedBayes());
            holder.solkerTextView.setText(riwayatItem.getSolker());
            holder.kerusakanTextView.setText(riwayatItem.getKerusakan());
            holder.waktuTextView.setText(formattedDate);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Override
    public int getItemCount() {
        return riwayatList.size();
    }

    static class RiwayatViewHolder extends RecyclerView.ViewHolder {
        TextView formattedBayesTextView, solkerTextView, kerusakanTextView, waktuTextView;

        public RiwayatViewHolder(@NonNull View itemView) {
            super(itemView);
            formattedBayesTextView = itemView.findViewById(R.id.textFormattedBayes);
            solkerTextView = itemView.findViewById(R.id.textSolker);
            kerusakanTextView = itemView.findViewById(R.id.textKerusakan);
            waktuTextView = itemView.findViewById(R.id.textWaktu);

            // Pemeriksaan null tidak diperlukan di sini karena kita yakin bahwa setiap TextView ada di layout item_riwayat.xml
        }
    }
}
