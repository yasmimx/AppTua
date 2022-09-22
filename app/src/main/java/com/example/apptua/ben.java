package com.example.apptua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class ben extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ben);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton bt4 = (ImageButton) findViewById(R.id.imgbtnvoltar);

        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ben.this, personagens.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton bt5 = (ImageButton) findViewById(R.id.imgbtnpersonagem);

        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ben.this, personagens.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton bt6 = (ImageButton) findViewById(R.id.imgbtnhome);

        bt6.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(ben.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });


    }
}