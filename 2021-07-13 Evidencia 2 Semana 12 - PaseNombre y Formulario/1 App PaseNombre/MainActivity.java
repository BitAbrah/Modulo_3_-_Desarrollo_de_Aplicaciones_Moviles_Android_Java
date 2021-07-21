package com.example.pasenombre;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {
    private EditText editnombre;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        editnombre=findViewById(R.id.editnombre);

    }

    public void Pasar(View v){
        Intent siguiente= new Intent(this, MainActivity2.class);
        siguiente.putExtra("nombre",editnombre.getText().toString());
        startActivity(siguiente);
    }
}