package com.example.apptua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class luther extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_luther);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ImageButton bt = (ImageButton) findViewById(R.id.imgbtnvoltar);

        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(luther.this, personagens.class);
                startActivity(it);
            }
        });

        ImageButton bt3 = (ImageButton) findViewById(R.id.imgbtnhome);

        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(luther.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton bt4 = (ImageButton) findViewById(R.id.imgbtnpersonagem);

        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(luther.this, personagens.class);
                startActivity(it);
                finish();
            }
        });
    }
}