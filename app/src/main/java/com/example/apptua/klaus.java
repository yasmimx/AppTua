package com.example.apptua;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.hardware.camera2.CameraManager;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.CompoundButton;
import android.widget.ImageButton;
import android.widget.Switch;
import android.widget.Toast;
import android.widget.ToggleButton;


public class klaus<cameraManager, toggleFlashLightOnOff> extends AppCompatActivity {

    boolean hasCameraFlash = false;
    boolean flashOn = false;
    private ToggleButton toggleFlashLightOnOff;
    private CameraManager cameraManager;
    private String getCameraID;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_klaus);


        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);


        ImageButton bt3 = (ImageButton) findViewById(R.id.imgbtnhome);

        bt3.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(klaus.this, MainActivity.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton bt4 = (ImageButton) findViewById(R.id.imgbtnvoltar);

        bt4.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(klaus.this, personagens.class);
                startActivity(it);
                finish();
            }
        });

        ImageButton bt5 = (ImageButton) findViewById(R.id.imgbtnpersonagem);

        bt5.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(klaus.this, personagens.class);
                startActivity(it);
                finish();
            }
        });

        Switch btn5 = (Switch) findViewById(R.id.switch1);

        btn5.setOnCheckedChangeListener(new CompoundButton.OnCheckedChangeListener() {
            @Override
            public void onCheckedChanged(CompoundButton buttonView, boolean isChecked) {
                if (isChecked) {

                    Toast.makeText(klaus.this, "Lanterna Ativada", Toast.LENGTH_SHORT).show();
                }
            }
        });

    }


}

