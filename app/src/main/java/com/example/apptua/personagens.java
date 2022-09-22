package com.example.apptua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class personagens extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_personagens);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton bt = (ImageButton) findViewById(R.id.imgbtnvoltar);

        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, MainActivity.class);
                startActivity(it);
            }
        });

        Button bt1 = (Button) findViewById(R.id.btnluther);

        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, luther.class);
                startActivity(it);
                finish();
            }
        });


        Button bt2 = (Button) findViewById(R.id.btndiego);

        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, diego.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton bt3 = (ImageButton) findViewById(R.id.imgbtnhome);

        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });

        Button bt4 = (Button) findViewById(R.id.dtnalisson);

        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, alisson.class);
                startActivity(it);
                finish();
            }
        });

        Button bt5 = (Button) findViewById(R.id.btnklaus);

        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, klaus.class);
                startActivity(it);
                finish();
            }
        });

        Button bt6 = (Button) findViewById(R.id.btncinco1);

        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, cinco.class);
                startActivity(it);
                finish();
            }
        });

        Button bt7 = (Button) findViewById(R.id.btnben);

        bt7.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, ben.class);
                startActivity(it);
                finish();
            }
        });

        Button bt8 = (Button) findViewById(R.id.btnvictor);

        bt8.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(personagens.this, vania.class);
                startActivity(it);
                finish();
            }
        });

    }
}