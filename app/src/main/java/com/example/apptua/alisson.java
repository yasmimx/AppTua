package com.example.apptua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageButton;

public class alisson extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_alisson);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ImageButton bt3 = (ImageButton) findViewById(R.id.imgbtnhome);

        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(alisson.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton bt4 = (ImageButton) findViewById(R.id.imgbtnpersonagem);

        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(alisson.this, personagens.class);
                startActivity(it);
                finish();
            }
        });
    }
}