package com.edchristy99.pertemuan2;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity{
    private Button btnMasuk;
    private  EditText etNama;


    @Override
    public void onCreate (Bundle savedInstanceStase){
        super.onCreate(savedInstanceStase);
        setContentView(R.layout.activity_main);

        btnMasuk = (Button) findViewById(R.id.btn_masuk);
        etNama = (EditText) findViewById(R.id.et_nama);
    btnMasuk.setOnClickListener(new View.OnClickListener() {
        @Override
        public void onClick(View v) {
            String sNama = etNama.getText().toString();
            Intent moveIntent = new Intent(MainActivity.this, halaman2.class);
            moveIntent.putExtra("nama",sNama);
            startActivity(moveIntent);
        }
    });
    }

}
