package com.example.miprimeraapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void pulsacionBtnEntrar(View v){

        Log.v("BBDD","Cargando registros");
        //Recogemos el dato del interfaz
        EditText texto = findViewById(R.id.textoNombre);
        String cadena = texto.getText().toString();

        //El intent lo que hace es guardar la opcion para pasar de donde hasta donde
        Intent i = new Intent(this,SegundoActivity.class);

        //Empaqueto el texto con el intent para mandarlo junto
        i.putExtra("textoapasar",cadena);

        startActivity(i);
    }
}