package com.kelompok_10;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;

import com.kelompok_10.karina.KarinaActivity;
import com.kelompok_10.tamamul.TamamulActivity;
import com.kelompok_10.yudha.YudhaActivity;

public class MainActivity extends AppCompatActivity {

    Button btnKarina, btnTamamul, btnYudha;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);



        btnKarina = findViewById(R.id.btnKarina);
        btnTamamul = findViewById(R.id.btnTamamul);
        btnYudha = findViewById(R.id.btnYudha);

        btnKarina.setOnClickListener(v -> startActivity(new Intent(this, KarinaActivity.class)));
        btnTamamul.setOnClickListener(v -> startActivity(new Intent(this, TamamulActivity.class)));
        btnYudha.setOnClickListener(v -> startActivity(new Intent(this, YudhaActivity.class)));
    }
}
