package com.edchristy99.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class halaman2 extends AppCompatActivity {
    private Button btnHitung;

    private TextView tvNama;

    @Override

    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_halaman2);
        btnHitung = (Button) findViewById(R.id.btn_halamanhitung);
        tvNama = findViewById(R.id.tv_nama);



        String Nama = getIntent().getStringExtra("nama");
        tvNama.setText(Nama);
        btnHitung.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent moveIntent = new Intent(halaman2.this, hitung.class);
                startActivity(moveIntent);

            }
        });

    }


}
