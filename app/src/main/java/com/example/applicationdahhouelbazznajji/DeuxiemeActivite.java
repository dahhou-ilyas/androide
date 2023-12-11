package com.example.applicationdahhouelbazznajji;

import android.os.Bundle;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

public class DeuxiemeActivite extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_deuxieme_activite);
        Bundle extras=getIntent().getExtras();

        Toast.makeText(getApplicationContext(),"nom et prenom :"+extras.get("nom")+" "+extras.get("prenome"),Toast.LENGTH_LONG).show();
    }
}
