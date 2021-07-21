package com.example.app2;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void mensaje1(View v){
        Toast.makeText(this, "Me has presionado tío", Toast.LENGTH_LONG).show();
    }

    public void mensaje2(View v){
        Toast.makeText(this, "Has presionado el 2 :v", Toast.LENGTH_LONG).show();
    }
}