package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.widget.TextView;

public class SegundoActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_segundo);

        //Recuperamos la informacion que nos manda desde la pestaña anterior
        Intent i = getIntent();
        //Aqui ponemos la clave del extra que le hemos metido el intent en el otro lado
        String cadena = i.getStringExtra("textoapasar");

        Log.v("Pantalla2", cadena);

        TextView textoEnPantalla = findViewById(R.id.muestraTexto);
        textoEnPantalla.setText(cadena);
    }
}