package com.example.paseformulario;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView nombre,apellido,telefono,correo,fecha,tv;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        nombre=findViewById(R.id.rnombre);
        apellido=findViewById(R.id.rapellido);
        telefono=findViewById(R.id.rtelefono);
        correo=findViewById(R.id.rcorreo);
        fecha=findViewById(R.id.rfecha);
        tv=findViewById(R.id.tvconfirm);

        // Mostración

        nombre.setText("Nombre: "+ getIntent().getStringExtra("nombre"));
        apellido.setText("Apellido: "+ getIntent().getStringExtra("apellido"));
        telefono.setText("Telefono: "+ getIntent().getStringExtra("telefono"));
        correo.setText("Correo: "+ getIntent().getStringExtra("correo"));
        fecha.setText("Fecha Nacimiento: "+ getIntent().getStringExtra("fecha"));
        tv.setText("Usuario Registrado");

    }

    public void Regresar(View vw){
        Intent volver= new Intent (this, MainActivity.class);
        startActivity(volver);
    }
}