package com.example.apptua;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton bt = (ImageButton) findViewById(R.id.imgbtnpersonagem);

        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, personagens.class);
                startActivity(it);
            }
        });

        Button bt1 = (Button) findViewById(R.id.btntrailerum);;
        bt1.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/5_4SW8HHfUs")));
            }
        });

        Button bt2 = (Button) findViewById(R.id.btntrailerdois);;
        bt2.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/28bTDcMnIh8")));
            }
        });

        Button bt3 = (Button) findViewById(R.id.btntrailertres);;
        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/uoaC6EXnMOM")));
            }
        });


        Button bt4 = (Button) findViewById(R.id.btnrenovacao);;
        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                startActivity(new Intent(Intent.ACTION_VIEW,
                        Uri.parse("https://youtu.be/aTQ2T5NgFeY")));
            }
        });
    }
}