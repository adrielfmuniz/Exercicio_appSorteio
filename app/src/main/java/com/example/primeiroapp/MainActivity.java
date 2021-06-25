package com.example.primeiroapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void alterarTexto (View view){

        TextView mudarTexto = findViewById(R.id.textoClique2);

        int x = new Random().nextInt(11);

        mudarTexto.setText("Número sorteado foi: "+ x);


    }
}