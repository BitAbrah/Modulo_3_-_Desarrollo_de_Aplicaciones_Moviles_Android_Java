package com.example.sumaapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private EditText ednum1, ednum2;
    private TextView tvr;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ednum1=findViewById(R.id.editnumero1);
        ednum2=findViewById(R.id.editnumero2);
        tvr=findViewById(R.id.tvresultado);


    }


    public void sumar(View v){
        int valor1=Integer.parseInt(ednum1.getText().toString());
        int valor2=Integer.parseInt(ednum2.getText().toString());
        int suma=valor1+valor2;
        tvr.setText("El resultado es: "+suma);
    }

    public void restar(View v){
        int valor1=Integer.parseInt(ednum1.getText().toString());
        int valor2=Integer.parseInt(ednum2.getText().toString());
        int resta=valor1-valor2;
        tvr.setText("El resultado es: "+resta);
    }

    public void multiplicar(View v){
        int valor1=Integer.parseInt(ednum1.getText().toString());
        int valor2=Integer.parseInt(ednum2.getText().toString());
        int multi=valor1*valor2;
        tvr.setText("El resultado es: "+multi);
    }

    public void dividir(View v){
        int valor1=Integer.parseInt(ednum1.getText().toString());
        int valor2=Integer.parseInt(ednum2.getText().toString());
        if (valor2<=0){
            tvr.setText("No se puede dividir por 0 ¡pestelurri!");
        } else {
        float divide=valor1/valor2;
        tvr.setText("El resultado es: "+divide);}
    }
}