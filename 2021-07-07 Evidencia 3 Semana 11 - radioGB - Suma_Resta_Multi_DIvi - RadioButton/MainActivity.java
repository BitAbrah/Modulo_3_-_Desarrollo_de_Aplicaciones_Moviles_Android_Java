package com.example.radiogb;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.RadioButton;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    private EditText ednum1, ednum2;
    private TextView tvr;
    private RadioButton rsuma, rresta, rmulti, rdivide;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ednum1=findViewById(R.id.editnumero1);
        ednum2=findViewById(R.id.editnumero2);
        tvr=findViewById(R.id.tvresultado);
        rsuma=findViewById(R.id.rdsuma);
        rresta=findViewById(R.id.rdresta);
        rmulti=findViewById(R.id.rdmulti);
        rdivide=findViewById(R.id.rddivide);
    }

    public void operar(View v){
        int valor1=Integer.parseInt(ednum1.getText().toString());
        int valor2=Integer.parseInt(ednum2.getText().toString());

        if (rsuma.isChecked()){
            int suma=valor1+valor2;
            tvr.setText("El resultado es: "+suma);
        } else if (rresta.isChecked()) {
            int resta=valor1-valor2;
            tvr.setText("El resultado es: "+resta);
        } else if (rmulti.isChecked()){
            int multi=valor1*valor2;
            tvr.setText("El resultado es: "+multi);
        } else if (rdivide.isChecked()){
            if (valor2<=0){
                tvr.setText("¬¬ en serio? no sabes mates?");
            } else {
                float divi=valor1/valor2;
                tvr.setText("El resultado es: "+divi);
            }
        }
    }


}