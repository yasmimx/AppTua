package com.example.apptua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;

public class cinco extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cinco);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton bt5 = (ImageButton) findViewById(R.id.imgbtnpersonagem);

        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(cinco.this, personagens.class);
                startActivity(it);
                finish();
            }
        });

        Switch btn5 = (Switch) findViewById(R.id.switch1);

        btn5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    Toast.makeText(cinco.this, "Lanterna Ativada", Toast.LENGTH_SHORT).show();
                }
            }
        });

        ImageButton bt4 = (ImageButton) findViewById(R.id.imgbtnvoltar);

        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(cinco.this, personagens.class);
                startActivity(it);
                finish();
            }
        });


    }
}

