package com.example.users;

import android.content.Intent;
import android.os.Bundle;

import com.google.android.material.snackbar.Snackbar;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.core.view.WindowCompat;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import com.example.users.databinding.ActivityMainRegistroBinding;

public class MainRegistro extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setTheme(R.style.Base_Theme_Users);
        setContentView(R.layout.activity_main_registro);


    }
    public void bienve(View vista){
        Intent Inicio=new Intent(getApplicationContext(), MainExito.class);
        startActivity(Inicio);

    }
    public void cerar(View vista){
        finish();

    }
}