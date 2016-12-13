package com.example.alumnedam.examen;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.RadioButton;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    String nom;
    EditText etNom;

    private RadioButton suma;
    private RadioButton resta;
    private RadioButton division;
    private RadioButton multiplicacion;
    private RadioButton general;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        suma = (RadioButton) findViewById(R.id.btnSuma);
        resta = (RadioButton) findViewById(R.id.btnResta);
        division = (RadioButton) findViewById(R.id.btnDivisio);
        multiplicacion = (RadioButton) findViewById(R.id.btnMultiplicacio);
        general = (RadioButton) findViewById(R.id.btnGeneral);

        Button btnComenzar = (Button) findViewById(R.id.btnComenzar);
        btnComenzar.setOnClickListener(this);
    }

    public void onClick(View v) {


        if (v.getId() == R.id.btnComenzar) {

            etNom = (EditText) findViewById(R.id.etNom);
            nom = etNom.getText().toString();

            if(suma.isChecked()){

            }else if(resta.isChecked()){

            }else if(division.isChecked()){

            }else if(multiplicacion.isChecked()){

            }else{

            }

        Intent intent = new Intent(this, PreguntesActivity.class);
        intent.putExtra();
        startActivityForResult(intent, 1);
        }
    }


}
