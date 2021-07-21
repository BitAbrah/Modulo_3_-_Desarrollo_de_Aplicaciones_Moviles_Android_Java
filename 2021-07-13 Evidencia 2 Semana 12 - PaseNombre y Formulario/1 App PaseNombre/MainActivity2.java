package com.example.pasenombre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {
    private TextView tv1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        tv1=findViewById(R.id.tvnombre);
        String nombre=getIntent().getStringExtra("nombre");
        tv1.setText(""+nombre);
    }

    public void Regresar(View vw){
        Intent volver= new Intent (this, MainActivity.class);
        startActivity(volver);
    }


}