package com.example.ejemplociclodevida;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    //Definimos el metodo callback onStart de la Actividad
    @Override
    protected void onStart() {
        super.onStart();

        //Aqui deberiamos leer los datos de la ultima sesion para continuar la actividad donde la dejo el usuario

        Toast.makeText(this, "Se ejecuta el metodo onStart", Toast.LENGTH_SHORT).show();
    }

    //Definimos el metodo callback onResume de la Actividad
    @Override
    protected void onResume() {
        super.onResume();

        Toast.makeText(this, "Se ejecuta el metodo onResume", Toast.LENGTH_SHORT).show();
    }

    //Definimos el metodo callback onPause de la Actividad
    @Override
    protected void onPause() {
        super.onPause();

        //Aqui deberiamos guardar la informacion para la siguiente sesion
        Toast.makeText(this, "Se ejecuta el metodo onPause", Toast.LENGTH_SHORT).show();
    }

    //Definimos el metodo callback onStop de la Actividad
    @Override
    protected void onStop() {
        super.onStop();

        Toast.makeText(this, "Se ejecuta el metodo onStop", Toast.LENGTH_SHORT).show();

    }

    //Definimos el metodo callback onRestart de la Actividad
    @Override
    protected void onRestart() {
        super.onRestart();

        Toast.makeText(this, "Se ejecuta el metodo onRestart", Toast.LENGTH_SHORT).show();
    }

    //Definimos el metodo callback onDestroy de la Actividad
    @Override
    protected void onDestroy() {
        super.onDestroy();

        Toast.makeText(this, "Se ejecuta el metodo onDestroy", Toast.LENGTH_SHORT).show();
    }

}