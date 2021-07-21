package com.example.paseformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText nombre,apellido,telefono,correo,fecha_n;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        nombre=findViewById(R.id.tnombre);
        apellido=findViewById(R.id.tapellido);
        telefono=findViewById(R.id.ttelefono);
        correo=findViewById(R.id.tcorreo);
        fecha_n=findViewById(R.id.tfecha);
    }

    public void Pasar(View v){
        Intent siguiente= new Intent(this, MainActivity2.class);
        siguiente.putExtra("nombre",nombre.getText().toString());
        siguiente.putExtra("apellido",apellido.getText().toString());
        siguiente.putExtra("telefono",telefono.getText().toString());
        siguiente.putExtra("correo",correo.getText().toString());
        siguiente.putExtra("fecha",fecha_n.getText().toString());
        startActivity(siguiente);
    }
}