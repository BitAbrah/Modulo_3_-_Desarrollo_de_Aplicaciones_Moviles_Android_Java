package com.example.admindb;

import androidx.appcompat.app.AppCompatActivity;

import android.content.ContentValues;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    private EditText ednombre,edcodigo,edprecio;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ednombre=findViewById(R.id.nombre);
        edcodigo=findViewById(R.id.codigo);
        edprecio=findViewById(R.id.precio);

    }

    public void crearProducto(View v){
        admindb admin = new admindb(this, "productos", null, 1);
        SQLiteDatabase base=admin.getWritableDatabase();

        String nombre=ednombre.getText().toString();
        String codigo=edcodigo.getText().toString();
        String precio=edprecio.getText().toString();

        if (!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()) {

            ContentValues crear = new ContentValues();
            crear.put("Nombre", nombre);
            crear.put("Codigo", codigo);
            crear.put("Precio", precio);

            base.insert("Producto", null, crear);
            base.close();
            ednombre.setText("");
            edcodigo.setText("");
            edprecio.setText("");
            Toast.makeText(this, "listoco el registroco", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "Llene todos los campos cumpita", Toast.LENGTH_LONG).show();


        }

    }

    public void buscarProducto (View v){
        admindb admin = new admindb(this,"productos", null,1);
        SQLiteDatabase base=admin.getWritableDatabase();

        String codigo=edcodigo.getText().toString();

        if(!codigo.isEmpty()){

            Cursor fila=base.rawQuery("Select Nombre, Precio from Producto where Codigo ="+codigo,null);
            if (fila.moveToFirst()){
                ednombre.setText(fila.getString(0));
                edprecio.setText(fila.getString(1));
                base.close();
            } else {
                edcodigo.setText("");
                ednombre.setText("");
                edprecio.setText("");
                Toast.makeText(this,"El producto con el codigo ingresado no existe", Toast.LENGTH_LONG).show();
            }
        } else {
            edcodigo.setText("");
            ednombre.setText("");
            edprecio.setText("");
            Toast.makeText(this,"Debe ingresar un código de producto", Toast.LENGTH_LONG).show();
        }
    }

    public void modificar (View v){
        admindb admin = new admindb (this, "productos", null, 1);
        SQLiteDatabase base = admin.getWritableDatabase();

        String nombre=ednombre.getText().toString();
        String codigo=edcodigo.getText().toString();
        String precio=edprecio.getText().toString();

        if (!codigo.isEmpty() && !nombre.isEmpty() && !precio.isEmpty()) {
            ContentValues modificacion = new ContentValues();
            modificacion.put("codigo ", codigo);
            modificacion.put("nombre ", nombre);
            modificacion.put("precio ", precio);

            base.update("producto", modificacion, "codigo=" + codigo, null);
            base.close();
            edcodigo.setText("");
            ednombre.setText("");
            edprecio.setText("");
            Toast.makeText(this, "Producto modificado", Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "Debes completar todos los campos", Toast.LENGTH_LONG).show();
        }
        
    }

    public void eliminar (View v){
        admindb admin = new admindb (this, "productos", null, 1);
        SQLiteDatabase base = admin.getWritableDatabase();


        String codigo=edcodigo.getText().toString();


        if (!codigo.isEmpty() ) {

            int cantidad = base.delete("producto", "codigo="+codigo, null);
            base.close();
            edcodigo.setText("");
            ednombre.setText("");
            edprecio.setText("");
            Toast.makeText(this, "Producto borrado, cantidad="+cantidad, Toast.LENGTH_LONG).show();

        } else {
            Toast.makeText(this, "Ingrese un código válido", Toast.LENGTH_LONG).show();
        }

    }
}