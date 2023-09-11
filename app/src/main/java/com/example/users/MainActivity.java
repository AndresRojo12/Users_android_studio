package com.example.users;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setTheme(R.style.Base_Theme_Users);
            setContentView(R.layout.activity_main);
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
        }
    }

    public void registro(View vista){
        Intent ventanaRegistro=new Intent(getApplicationContext(),MainRegistro.class);
        startActivity(ventanaRegistro);

    }
    public void inicio(View vista){
        Intent ventanaInicio=new Intent(getApplicationContext(), MainMenu.class);
        startActivity(ventanaInicio);

    }
    public void bienve(View vista){
        Intent Inicio=new Intent(getApplicationContext(), MainExito.class);
        startActivity(Inicio);

    }
}