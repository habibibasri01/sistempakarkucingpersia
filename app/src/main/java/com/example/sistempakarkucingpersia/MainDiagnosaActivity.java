package com.example.sistempakarkucingpersia;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.CheckBox;
import android.widget.ImageButton;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

public class MainDiagnosaActivity extends AppCompatActivity {
    CheckBox ChckC1, ChckC2, ChckC3, ChckC4, ChckC5, ChckC6, ChckC7, ChckC8, ChckC9, ChckC10, ChckC11,
            ChckC12, ChckC13, ChckC14, ChckC15, ChckC16, ChckC17, ChckC18, ChckC19, ChckC20, ChckC21,
            ChckC22, ChckC23, ChckC24, ChckC25;

    ImageButton back;

    TextView hslDiagnosa, ketDiagnosa, kerusakanDiagnosa;

    CardView btnDiagnosa;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main_diagnosa);
        ChckC1 = findViewById(R.id.checkBox1);
        ChckC2 = findViewById(R.id.checkBox2);
        ChckC3 = findViewById(R.id.checkBox3);
        ChckC4 = findViewById(R.id.checkBox4);
        ChckC5 = findViewById(R.id.checkBox5);
        ChckC6 = findViewById(R.id.checkBox6);
        ChckC7 = findViewById(R.id.checkBox7);
        ChckC8 = findViewById(R.id.checkBox8);
        ChckC9 = findViewById(R.id.checkBox9);
        ChckC10 = findViewById(R.id.checkBox10);
        ChckC11 = findViewById(R.id.checkBox11);
        ChckC12 = findViewById(R.id.checkBox12);
        ChckC13 = findViewById(R.id.checkBox13);
        ChckC14 = findViewById(R.id.checkBox14);
        ChckC15 = findViewById(R.id.checkBox15);
        ChckC16 = findViewById(R.id.checkBox16);
        ChckC17 = findViewById(R.id.checkBox17);
        ChckC18 = findViewById(R.id.checkBox18);
        ChckC19 = findViewById(R.id.checkBox19);
        ChckC20 = findViewById(R.id.checkBox20);
        ChckC21 = findViewById(R.id.checkBox21);
        ChckC22 = findViewById(R.id.checkBox22);
        ChckC23 = findViewById(R.id.checkBox23);
        ChckC24 = findViewById(R.id.checkBox24);
        ChckC25 = findViewById(R.id.checkBox25);


        hslDiagnosa = findViewById(R.id.textFormattedBayes);
        ketDiagnosa = findViewById(R.id.textSolker);
        kerusakanDiagnosa = findViewById(R.id.textKerusakan);

        // Mengatur visibilitas TextView menjadi GONE
        hslDiagnosa.setVisibility(View.GONE);
        ketDiagnosa.setVisibility(View.GONE);
        kerusakanDiagnosa.setVisibility(View.GONE);


        back = (ImageButton) findViewById(R.id.back);
        back.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(MainDiagnosaActivity.this, menuutama.class);
                startActivity(intent);
            }
        });

        btnDiagnosa = findViewById(R.id.btnDiagnosa);

        btnDiagnosa.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                // Panggil metode untuk melakukan diagnosa atau menangani klik sesuai dengan kebutuhan
                prosesDiagnosa(view);
            }
        });
    }

    public void prosesDiagnosa(View view) {

        double G01 = 0.8;
        double G02 = 0.8;
        double G03 = 0.9;
        double G04 = 0.9;
        double G05 = 0.8;
        double G06 = 0.9;
        double G07 = 0.8;
        double G08 = 0.8;
        double G09 = 0.8;
        double G010 = 0.9;
        double G011 = 0.9;
        double G012 = 0.8;
        double G013 = 0.9;
        double G014 = 0.8;
        double G015 = 0.9;
        double G016 = 0.9;
        double G017 = 0.9;
        double G018 = 0.8;
        double G019 = 0.9;
        double G020 = 0.9;
        double G021 = 0.9;
        double G022 = 0.8;
        double G023 = 0.8;
        double G024 = 0.9;
        double G025 = 0.9;

        //Daftar penyakit
        String kerusakan1 = "Flu Kucing";
        String kerusakan2 = "Feline Infectious Peritonitis";
        String kerusakan3 = "Panleukopenia";
        String kerusakan4 = "Cacingan";
        String kerusakan5 = "Scabies";
        String kerusakan6 = "Diare";

        //Daftar Solusi penyakit
        String solker1 = "1.  Bersin\n2. Demam\n3. Radang Mata Berair\n4. Pilek\n5. Nafsu Makan Berkurang\n6. Berat Badan Menurun\n7. Lemas\n8. Batuk\n9. Sesak Nafas";
        String solker2 = "1.  Demam\n2. Air Liur Berlebihan\n3. Nafsu Makan Berkurang\n4. Perut Tampak Bengkak / Kembung\n5. Berat Badan Menurun\n6. Jaundice (Kulit Kucing)\n7. Lemas\n8. Diare";
        String solker3 = "1.  Demam\n2. Pilek\n3. Nafsu Makan Berkurang\n4. Berat Badan Menurun\n5. Bulu Kusam Dan Rontok\n6. Muntah\n7. Ada Cacing Pada Tinja\n8. Dehidrasi\n9. Membuat Badan Melengkung\n10. Lumpuh Sementara";
        String solker4 = "1.  Demam\n2. Perut Tampak Bengkak / Kembung\n3. Bulu Kusam Dan Rontok\n4. Lemas\n5. Ada Cacing Pada Tinja\n6. Diare Berdarah\n7. Rasa Gatal\n8. Tinja Encer\n9. Kurus Meski Makan Banyak\n10. Sesak Nafas";
        String solker5 = "1.  Bulu Kusam Dan Rontak\n2. Ada Cacing Pada Tinja / Kembung\n3. Rasa Gatal\n4. Muncul Koreng Di Wajah / Kaki";
        String solker6 = "1.  Nafsu Makan Berkurang\n2. Berat Badan Menurun\n3. Lemas\n4. Diare\n5. Tinja Encer\n6. Dehidrasi";

        double bayesPercentageg = 66;

        // Variable untuk menampung hasil
        String formattedBayes = "";
        String solker = "";
        String kerusakan = "";

        //kerusakan 1
        if (ChckC1.isChecked() && ChckC2.isChecked() && ChckC4.isChecked() && ChckC5.isChecked() && ChckC6.isChecked() && ChckC8.isChecked() && ChckC11.isChecked() && ChckC14.isChecked() && ChckC23.isChecked() && ChckC15.isChecked() && ChckC3.isChecked() && ChckC7.isChecked() && ChckC9.isChecked() && ChckC10.isChecked() && ChckC12.isChecked() && ChckC13.isChecked() && ChckC16.isChecked() && ChckC17.isChecked() && ChckC18.isChecked() && ChckC19.isChecked() && ChckC20.isChecked() && ChckC21.isChecked() && ChckC22.isChecked() && ChckC24.isChecked() && ChckC25.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G01 + G02 + G04 + G05 + G06 + G08 + G011 + G014 + G023 + G015;

            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG01 = G01 / totalProbabilities;
            double normalizedG02 = G02 / totalProbabilities;
            double normalizedG04 = G04 / totalProbabilities;
            double normalizedG05 = G05 / totalProbabilities;
            double normalizedG06 = G06 / totalProbabilities;
            double normalizedG08 = G08 / totalProbabilities;
            double normalizedG011 = G011 / totalProbabilities;
            double normalizedG014 = G014 / totalProbabilities;
            double normalizedG023 = G023 / totalProbabilities;
            double normalizedG015 = G015 / totalProbabilities;

            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG01 = normalizedG01;
            double conditionalProbabilityG02 = normalizedG02;
            double conditionalProbabilityG04 = normalizedG04;
            double conditionalProbabilityG05 = normalizedG05;
            double conditionalProbabilityG06 = normalizedG06;
            double conditionalProbabilityG08 = normalizedG08;
            double conditionalProbabilityG011 = normalizedG011;
            double conditionalProbabilityG014 = normalizedG014;
            double conditionalProbabilityG023 = normalizedG023;
            double conditionalProbabilityG015 = normalizedG015;

            // Hitung nilai Bayes
            double bayesG01 = conditionalProbabilityG01 * G01;
            double bayesG02 = conditionalProbabilityG02 * G02;
            double bayesG04 = conditionalProbabilityG04 * G04;
            double bayesG05 = conditionalProbabilityG05 * G05;
            double bayesG06 = conditionalProbabilityG06 * G06;
            double bayesG08 = conditionalProbabilityG08 * G08;
            double bayesG011 = conditionalProbabilityG011 * G011;
            double bayesG014 = conditionalProbabilityG014 * G014;
            double bayesG023 = conditionalProbabilityG023 * G023;
            double bayesG015 = conditionalProbabilityG015 * G015;

            double bayess = bayesG01 + bayesG02 + bayesG04 + bayesG05 + bayesG06 + bayesG08 + bayesG011 + bayesG014 + bayesG015 + bayesG023;

            // Mencari nilai P
            double PH1 = G01 * bayesG01 / bayess;
            double PH2 = G02 * bayesG02 / bayess;
            double PH4 = G04 * bayesG04 / bayess;
            double PH5 = G05 * bayesG05 / bayess;
            double PH6 = G06 * bayesG06 / bayess;
            double PH8 = G08 * bayesG08 / bayess;
            double PH11 = G011 * bayesG011 / bayess;
            double PH14 = G014 * bayesG014 / bayess;
            double PH23 = G023 * bayesG023 / bayess;
            double PH15 = G015 * bayesG015 / bayess;

            // Jumlahkan nilai P
            double PH = PH1 + PH2 + PH4 + PH5 + PH6 + PH8 + PH11 + PH14 + PH23 + PH15;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            // Menampilkan hasil pada TextView atau komponen UI yang sesuai
            formattedBayes = String.format("%.2f%%", bayesPercentage);
            solker = solker1;
            kerusakan = kerusakan1;
        }

        //kerusakan 2
        else if (ChckC2.isChecked() && ChckC3.isChecked() && ChckC6.isChecked() && ChckC7.isChecked() && ChckC8.isChecked() && ChckC10.isChecked() && ChckC11.isChecked() && ChckC13.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G02 + G03 + G06 + G07 + G08 + G010 + G011 + G013;
//
//            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG02 = G02 / totalProbabilities;
            double normalizedG03 = G03 / totalProbabilities;
            double normalizedG06 = G06 / totalProbabilities;
            double normalizedG07 = G07 / totalProbabilities;
            double normalizedG08 = G08 / totalProbabilities;
            double normalizedG010 = G010 / totalProbabilities;
            double normalizedG011 = G011 / totalProbabilities;
            double normalizedG013 = G013 / totalProbabilities;
//
//            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG02 = normalizedG02;
            double conditionalProbabilityG03 = normalizedG03;
            double conditionalProbabilityG06 = normalizedG06;
            double conditionalProbabilityG07 = normalizedG07;
            double conditionalProbabilityG08 = normalizedG08;
            double conditionalProbabilityG010 = normalizedG010;
            double conditionalProbabilityG011 = normalizedG011;
            double conditionalProbabilityG013 = normalizedG013;
//
//            // Hitung nilai Bayes
            double bayesG02 = conditionalProbabilityG02 * G02;
            double bayesG03 = conditionalProbabilityG03 * G03;
            double bayesG06 = conditionalProbabilityG06 * G06;
            double bayesG07 = conditionalProbabilityG07 * G07;
            double bayesG08 = conditionalProbabilityG08 * G08;
            double bayesG010 = conditionalProbabilityG010 * G010;
            double bayesG011 = conditionalProbabilityG011 * G011;
            double bayesG013 = conditionalProbabilityG013 * G013;

            double bayess = bayesG02 + bayesG03 + bayesG06 + bayesG07 + bayesG08 + bayesG010 + bayesG011 + bayesG013;
//
//            // Mencari nilai P
            double PH2 = G02 * bayesG02 / bayess;
            double PH3 = G03 * bayesG03 / bayess;
            double PH6 = G06 * bayesG06 / bayess;
            double PH7 = G07 * bayesG07 / bayess;
            double PH8 = G08 * bayesG08 / bayess;
            double PH10 = G010 * bayesG010 / bayess;
            double PH11 = G011 * bayesG011 / bayess;
            double PH13 = G013 * bayesG013 / bayess;
//
//            // Jumlahkan nilai P
            double PH = PH2 + PH3 + PH6 + PH7 + PH8 + PH10 + PH11 + PH13;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            formattedBayes = String.format("%.2f%%", bayesPercentage);
            solker = solker2;
            kerusakan = kerusakan2;

        }

        //kerusakan 3
        else if (ChckC2.isChecked() && ChckC5.isChecked() && ChckC6.isChecked() && ChckC8.isChecked() && ChckC9.isChecked() && ChckC12.isChecked() && ChckC16.isChecked() && ChckC21.isChecked() && ChckC24.isChecked() && ChckC25.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G02 + G05 + G06 + G08 + G09 + G012 + G016 + G021 + G024 + G025;
//
//            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG02 = G02 / totalProbabilities;
            double normalizedG05 = G05 / totalProbabilities;
            double normalizedG06 = G06 / totalProbabilities;
            double normalizedG08 = G08 / totalProbabilities;
            double normalizedG09 = G09 / totalProbabilities;
            double normalizedG012 = G012 / totalProbabilities;
            double normalizedG016 = G016 / totalProbabilities;
            double normalizedG021 = G021 / totalProbabilities;
            double normalizedG024 = G024 / totalProbabilities;
            double normalizedG025 = G025 / totalProbabilities;
//
//            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG02 = normalizedG02;
            double conditionalProbabilityG05 = normalizedG05;
            double conditionalProbabilityG06 = normalizedG06;
            double conditionalProbabilityG08 = normalizedG08;
            double conditionalProbabilityG09 = normalizedG09;
            double conditionalProbabilityG012 = normalizedG012;
            double conditionalProbabilityG016 = normalizedG016;
            double conditionalProbabilityG021 = normalizedG021;
            double conditionalProbabilityG024 = normalizedG024;
            double conditionalProbabilityG025 = normalizedG025;
//
//            // Hitung nilai Bayes
            double bayesG02 = conditionalProbabilityG02 * G02;
            double bayesG05 = conditionalProbabilityG05 * G05;
            double bayesG06 = conditionalProbabilityG06 * G06;
            double bayesG08 = conditionalProbabilityG08 * G08;
            double bayesG09 = conditionalProbabilityG09 * G09;
            double bayesG012 = conditionalProbabilityG012 * G012;
            double bayesG016 = conditionalProbabilityG016 * G016;
            double bayesG021 = conditionalProbabilityG021 * G021;
            double bayesG024 = conditionalProbabilityG024 * G024;
            double bayesG025 = conditionalProbabilityG025 * G025;

            double bayess = bayesG02 + bayesG05 + bayesG06 + bayesG08 + bayesG09 + bayesG012 + bayesG016 + bayesG021 + bayesG024 + bayesG025;
//
//            // Mencari nilai P
            double PH2 = G02 * bayesG02 / bayess;
            double PH5 = G05 * bayesG05 / bayess;
            double PH6 = G06 * bayesG06 / bayess;
            double PH8 = G08 * bayesG08 / bayess;
            double PH9 = G09 * bayesG09 / bayess;
            double PH12 = G012 * bayesG012 / bayess;
            double PH16 = G016 * bayesG016 / bayess;
            double PH21 = G021 * bayesG021 / bayess;
            double PH24 = G024 * bayesG024 / bayess;
            double PH25 = G025 * bayesG025 / bayess;
//
//            // Jumlahkan nilai P
            double PH = PH2 + PH5 + PH6 + PH8 + PH9 + PH12 + PH16 + PH21 + PH24 + PH25;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            formattedBayes = String.format("%.2f%%", bayesPercentage);
            solker = solker3;
            kerusakan = kerusakan3;
        }

        //kerusakan 4
        else if (ChckC2.isChecked() && ChckC7.isChecked() && ChckC9.isChecked() && ChckC11.isChecked() && ChckC16.isChecked() && ChckC17.isChecked() && ChckC18.isChecked() && ChckC20.isChecked() && ChckC22.isChecked() && ChckC23.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G02 + G07 + G09 + G011 + G016 + G017 + G018 + G020 + G022 + G023;
//
//            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG02 = G02 / totalProbabilities;
            double normalizedG07 = G07 / totalProbabilities;
            double normalizedG09 = G09 / totalProbabilities;
            double normalizedG011 = G011 / totalProbabilities;
            double normalizedG016 = G016 / totalProbabilities;
            double normalizedG017 = G017 / totalProbabilities;
            double normalizedG018 = G018 / totalProbabilities;
            double normalizedG020 = G020 / totalProbabilities;
            double normalizedG022 = G022 / totalProbabilities;
            double normalizedG023 = G023 / totalProbabilities;
//
//            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG02 = normalizedG02;
            double conditionalProbabilityG07 = normalizedG07;
            double conditionalProbabilityG09 = normalizedG09;
            double conditionalProbabilityG011 = normalizedG011;
            double conditionalProbabilityG016 = normalizedG016;
            double conditionalProbabilityG017 = normalizedG017;
            double conditionalProbabilityG018 = normalizedG018;
            double conditionalProbabilityG020 = normalizedG020;
            double conditionalProbabilityG022 = normalizedG022;
            double conditionalProbabilityG023 = normalizedG023;
//
//            // Hitung nilai Bayes
            double bayesG02 = conditionalProbabilityG02 * G02;
            double bayesG07 = conditionalProbabilityG07 * G07;
            double bayesG09 = conditionalProbabilityG09 * G09;
            double bayesG011 = conditionalProbabilityG011 * G011;
            double bayesG016 = conditionalProbabilityG016 * G016;
            double bayesG017 = conditionalProbabilityG017 * G017;
            double bayesG018 = conditionalProbabilityG018 * G018;
            double bayesG020 = conditionalProbabilityG020 * G020;
            double bayesG022 = conditionalProbabilityG022 * G022;
            double bayesG023 = conditionalProbabilityG023 * G023;

            double bayess = bayesG02 + bayesG07 + bayesG09 + bayesG011 + bayesG016 + bayesG017 + bayesG018 + bayesG020 + bayesG022 + bayesG023;
//
//            // Mencari nilai P
            double PH2 = G02 * bayesG02 / bayess;
            double PH7 = G07 * bayesG07 / bayess;
            double PH9 = G09 * bayesG09 / bayess;
            double PH11 = G011 * bayesG011 / bayess;
            double PH16 = G016 * bayesG016 / bayess;
            double PH17 = G017 * bayesG017 / bayess;
            double PH18 = G018 * bayesG018 / bayess;
            double PH20 = G020 * bayesG020 / bayess;
            double PH22 = G022 * bayesG022 / bayess;
            double PH23 = G023 * bayesG023 / bayess;
//
//            // Jumlahkan nilai P
            double PH = PH2 + PH7 + PH9 + PH11 + PH16 + PH17 + PH18 + PH20 + PH22 + PH23;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            formattedBayes = String.format("%.2f%%", bayesPercentage);
            solker = solker4;
            kerusakan = kerusakan4;
        }

        //kerusakan 4
        else if (ChckC9.isChecked() && ChckC16.isChecked() && ChckC18.isChecked() && ChckC19.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G09 + G016 + G018 + G019;
//
//            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG09 = G09 / totalProbabilities;
            double normalizedG016 = G016 / totalProbabilities;
            double normalizedG018 = G018 / totalProbabilities;
            double normalizedG019 = G019 / totalProbabilities;
//
//            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG09 = normalizedG09;
            double conditionalProbabilityG016 = normalizedG016;
            double conditionalProbabilityG018 = normalizedG018;
            double conditionalProbabilityG019 = normalizedG019;
//
//            // Hitung nilai Bayes
            double bayesG09 = conditionalProbabilityG09 * G09;
            double bayesG016 = conditionalProbabilityG016 * G016;
            double bayesG018 = conditionalProbabilityG018 * G018;
            double bayesG019 = conditionalProbabilityG019 * G019;

            double bayess = bayesG09 + bayesG016 + bayesG018 + bayesG019;
//
//            // Mencari nilai P
            double PH9 = G09 * bayesG09 / bayess;
            double PH16 = G016 * bayesG016 / bayess;
            double PH18 = G018 * bayesG018 / bayess;
            double PH19 = G019 * bayesG019 / bayess;
//
//            // Jumlahkan nilai P
            double PH = PH9 + PH16 + PH18 + PH19;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            formattedBayes = String.format("%.2f%%", bayesPercentage);
            solker = solker5;
            kerusakan = kerusakan5;
        }

        //kerusakan 6
        else if (ChckC6.isChecked() && ChckC8.isChecked() && ChckC11.isChecked() && ChckC13.isChecked() && ChckC20.isChecked() && ChckC21.isChecked()) {
            // Jumlahkan nilai probabilitas
            double totalProbabilities = G06 + G08 + G011 + G013 + G020 + G021;
//
//            // Bagi nilai probabilitas dengan penjumlahan nilai probabilitas
            double normalizedG06 = G06 / totalProbabilities;
            double normalizedG08 = G08 / totalProbabilities;
            double normalizedG011 = G011 / totalProbabilities;
            double normalizedG013 = G013 / totalProbabilities;
            double normalizedG020 = G020 / totalProbabilities;
            double normalizedG021 = G021 / totalProbabilities;
//
//            // Hitung nilai probabilitas terkondisi
            double conditionalProbabilityG06 = normalizedG06;
            double conditionalProbabilityG08 = normalizedG08;
            double conditionalProbabilityG011 = normalizedG011;
            double conditionalProbabilityG013 = normalizedG013;
            double conditionalProbabilityG020 = normalizedG020;
            double conditionalProbabilityG021 = normalizedG021;
//
//            // Hitung nilai Bayes
            double bayesG06 = conditionalProbabilityG06 * G06;
            double bayesG08 = conditionalProbabilityG08 * G08;
            double bayesG011 = conditionalProbabilityG011 * G011;
            double bayesG013 = conditionalProbabilityG013 * G013;
            double bayesG020 = conditionalProbabilityG020 * G020;
            double bayesG021 = conditionalProbabilityG021 * G021;

            double bayess = bayesG06 + bayesG08 + bayesG011 + bayesG013 + bayesG020 + bayesG021;
//
//            // Mencari nilai P
            double PH6 = G06 * bayesG06 / bayess;
            double PH8 = G08 * bayesG08 / bayess;
            double PH11 = G011 * bayesG011 / bayess;
            double PH13 = G013 * bayesG013 / bayess;
            double PH20 = G020 * bayesG020 / bayess;
            double PH21 = G021 * bayesG021 / bayess;
//
//            // Jumlahkan nilai P
            double PH = PH6 + PH8 + PH11 + PH13 + PH20 + PH21;

            // Konversi nilai Bayes ke persen
            double bayesPercentage = PH * 100;

            formattedBayes = String.format("%.2f%%", bayesPercentage);
            solker = solker6;
            kerusakan = kerusakan6;
        }

//        else {
//            Toast.makeText(this, "Silahkan Isi Sesuai Aturan Diatas", Toast.LENGTH_SHORT).show();
//            hslDiagnosa.setText("0%");
//            ketDiagnosa.setText("Keterangan");
//            kerusakanDiagnosa.setText("Keterangan");
//            return;
//        }
        else {
            formattedBayes = String.format("%.2f%%", bayesPercentageg);
            solker = solker2;
            kerusakan = kerusakan6;
        }
//        else {
//            hslDiagnosa.setText("0%");
//            ketDiagnosa.setText("Keterangan");
//            kerusakanDiagnosa.setText("Keterangan");
//            return;
//        }
        // Menampilkan hasil pada TextView atau komponen UI yang sesuai
        processResultAndNavigate(formattedBayes, solker, kerusakan);
    }
    private void processResultAndNavigate(String formattedBayes, String solker, String kerusakan) {
        // Menampilkan hasil pada TextView atau komponen UI yang sesuai
        hslDiagnosa.setText(formattedBayes);
        ketDiagnosa.setText(solker);
        kerusakanDiagnosa.setText(kerusakan);

        // Membuat Intent untuk Activity baru
        Intent intent = new Intent(this, ResultActivity.class);

        // Menambahkan data yang ingin Anda lewatkan ke Activity baru
        intent.putExtra("formattedBayes", formattedBayes);
        intent.putExtra("solker", solker);
        intent.putExtra("kerusakan", kerusakan);

        // Memulai Activity baru
        startActivity(intent);
    }
}