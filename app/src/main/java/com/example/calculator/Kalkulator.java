package com.example.calculator;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class Kalkulator extends AppCompatActivity {

    EditText txtAngka1, txtAngka2;
    Button btnPlus, btnMines, btnKali, btnBagi;
    double Angka1, Angka2, hasil;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kalkulator);
        txtAngka1 = (EditText) findViewById(R.id.txtAngka1);
        txtAngka2 = (EditText) findViewById(R.id.txtAngka2);

        btnPlus = (Button) findViewById(R.id.btnPlus);
        btnPlus.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txtAngka1.getText().length()>0) & (txtAngka2.getText().length()>0)) {
                    double Angka1 = Integer.parseInt(txtAngka1.getText().toString());
                    double Angka2 = Integer.parseInt(txtAngka2.getText().toString());
                    double hasil = Angka1 + Angka2;
                    Toast.makeText(Kalkulator.this, "Hasil : " + hasil, Toast.LENGTH_SHORT).show();
                } else {
                    Toast toast = Toast.makeText(Kalkulator.this, "Masukkan Angka 1 dan 2", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        btnMines = (Button) findViewById(R.id.btnMines);
        btnMines.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txtAngka1.getText().length()>0) & (txtAngka2.getText().length()>0)) {
                    double Angka1 = Integer.parseInt(txtAngka1.getText().toString());
                    double Angka2 = Integer.parseInt(txtAngka2.getText().toString());
                    double hasil = Angka1 - Angka2;
                    Toast.makeText(Kalkulator.this, "Hasil : " + hasil, Toast.LENGTH_SHORT).show();
                } else {
                    Toast toast = Toast.makeText(Kalkulator.this, "Masukkan Angka 1 dan 2", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        btnKali = (Button) findViewById(R.id.btnKali);
        btnKali.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txtAngka1.getText().length()>0) & (txtAngka2.getText().length()>0)) {
                    double Angka1 = Integer.parseInt(txtAngka1.getText().toString());
                    double Angka2 = Integer.parseInt(txtAngka2.getText().toString());
                    double hasil = Angka1 * Angka2;
                    Toast.makeText(Kalkulator.this, "Hasil : " + hasil, Toast.LENGTH_SHORT).show();
                } else {
                    Toast toast = Toast.makeText(Kalkulator.this, "Masukkan Angka 1 dan 2", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });

        btnBagi = (Button) findViewById(R.id.btnBagi);
        btnBagi.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if((txtAngka1.getText().length()>0) & (txtAngka2.getText().length()>0)) {
                    double Angka1 = Integer.parseInt(txtAngka1.getText().toString());
                    double Angka2 = Integer.parseInt(txtAngka2.getText().toString());
                    double hasil = Angka1 / Angka2;
                    Toast.makeText(Kalkulator.this, "Hasil : " + hasil, Toast.LENGTH_SHORT).show();
                } else {
                    Toast toast = Toast.makeText(Kalkulator.this, "Masukkan Angka 1 dan 2", Toast.LENGTH_SHORT);
                    toast.show();
                }
            }
        });
    }
}