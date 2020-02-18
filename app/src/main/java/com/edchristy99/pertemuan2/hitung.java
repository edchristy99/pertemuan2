package com.edchristy99.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class hitung extends AppCompatActivity {

    private Button btnTambah, btnKurang, btnBagi, btnKali;
    private EditText etAngka1, etAngka2;
    private TextView tvHasil;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hitung);
        btnTambah = findViewById(R.id.btn_tambah);
        btnKurang= findViewById(R.id.btn_kurang);
        btnBagi = findViewById(R.id.btn_bagi);
        btnKali = findViewById(R.id.btn_kali);
        etAngka1 = findViewById(R.id.et_angka1);
        etAngka2 = findViewById(R.id.et_angka2);
        tvHasil = findViewById(R.id.tv_hasil);

        btnTambah.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    String sAngka1 = etAngka1.getText().toString();
                    String sAngka2 = etAngka2.getText().toString();

                    double Angka1 = Double.parseDouble(sAngka1);
                    double Angka2 = Double.parseDouble(sAngka2);

                    double Hasil = Angka1 + Angka2;

                    String sHasil = String.valueOf(Hasil);
                    tvHasil.setText(sHasil);
                }
        });

        btnKurang.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAngka1 = etAngka1.getText().toString();
                String sAngka2 = etAngka2.getText().toString();

                double Angka1 = Double.parseDouble(sAngka1);
                double Angka2 = Double.parseDouble(sAngka2);

                double Hasil = Angka1-Angka2;

                String sHasil = String.valueOf(Hasil);
                tvHasil.setText(sHasil);
            }    });
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAngka1 = etAngka1.getText().toString();
                String sAngka2 = etAngka2.getText().toString();

                double Angka1 = Double.parseDouble(sAngka1);
                double Angka2 = Double.parseDouble(sAngka2);

                double Hasil = Angka1/Angka2;

                String sHasil = String.valueOf(Hasil);
                tvHasil.setText(sHasil);
            }    });
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String sAngka1 = etAngka1.getText().toString();
                String sAngka2 = etAngka2.getText().toString();

                double Angka1 = Double.parseDouble(sAngka1);
                double Angka2 = Double.parseDouble(sAngka2);

                double Hasil = Angka1*Angka2;

                String sHasil = String.valueOf(Hasil);
                tvHasil.setText(sHasil);
            }    });
    }
}
