package com.example.apptua;

import static androidx.constraintlayout.motion.widget.Debug.getLocation;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.app.ActivityCompat;

import android.Manifest;
import android.app.SearchManager;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.view.WindowManager;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.Toast;

import com.google.android.gms.location.FusedLocationProviderClient;
import com.google.android.gms.location.LocationServices;

import java.io.UnsupportedEncodingException;
import java.net.URLEncoder;

public class MainActivity extends AppCompatActivity {

    FusedLocationProviderClient fusedLocationClient;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        fusedLocationClient = LocationServices.getFusedLocationProviderClient(this);

        getLocation();

        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);

        ImageButton bt = (ImageButton) findViewById(R.id.imgbtnpersonagem);

        bt.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                Intent it = new Intent(MainActivity.this, personagens.class);
                startActivity(it);
            }
        });


    }

    @Override
    public void onRequestPermissionsResult(int requestCode, @NonNull String[] permissions, @NonNull int[] grantResults) {
        super.onRequestPermissionsResult(requestCode, permissions, grantResults);
        if(requestCode == 10){
            if(grantResults.length == 1 && grantResults[0] == PackageManager.PERMISSION_GRANTED){
                getLocation();
            }
            else{
                {
                    Toast.makeText(MainActivity.this, "Permissão de localização negada.",Toast.LENGTH_SHORT).show();
                }
            }
        }
    }

    public void getLocation(){
        if(ActivityCompat.checkSelfPermission(MainActivity.this, Manifest.permission.ACCESS_COARSE_LOCATION) == PackageManager.PERMISSION_GRANTED){
        }
        else{
            requestPermission();
        }
    }
    private void requestPermission(){
        ActivityCompat.requestPermissions(MainActivity.this,
                new String[]{Manifest.permission.ACCESS_COARSE_LOCATION}, 10);
    }

    public void Trailer (View view) {
        Uri uri = Uri.parse("https://youtu.be/5_4SW8HHfUs");
        Intent trailer = new Intent(Intent.ACTION_VIEW, Uri.parse("https://youtu.be/5_4SW8HHfUs"));
        startActivity(trailer);
    }

    public void Pesquisa (View view){
        Intent pesquisa = new Intent(Intent.ACTION_WEB_SEARCH);
        String query = "Elenco de The Umbrella Academy";
        pesquisa.putExtra(SearchManager.QUERY, query);
        startActivity(pesquisa);
    }

    public void verMapa(View view)
    {
        //coordenadas, onde geo:latitude,longitude; z = o nível de zoom
        Uri location = Uri.parse("geo:-33.0360972,-97.4180556,11z");
        Intent mapIntent = new Intent(Intent.ACTION_VIEW, location);
        startActivity(mapIntent);

    }

    public void Email(View view) throws UnsupportedEncodingException {

        //formata o conteúdo do email
        String uriText =
                "mailto:yasmimborgesdias@gmail.com" +
                        "?subject=" + URLEncoder.encode("Voltamosﾠnoﾠtempoﾠeﾠprecisamosﾠdaﾠsuaﾠajuda!", "utf-8") +

                        "&body=" + URLEncoder.encode("Dallasﾠestáﾠcomﾠumﾠnovoﾠapocalipse,ﾠdigaﾠemﾠqueﾠanoﾠestá:ㅤ", "utf-8");
        Uri uri = Uri.parse(uriText);
        //inicia a Intent
        Intent email = new Intent(Intent.ACTION_SENDTO);
        //Define o conteúdo
        email.setData(uri);
        //Inicia a activity para enviar o email
        startActivity(email);

    }
}