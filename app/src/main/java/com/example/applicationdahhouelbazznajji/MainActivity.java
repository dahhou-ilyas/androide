package com.example.applicationdahhouelbazznajji;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentTransaction;

// Importations

public class MainActivity extends AppCompatActivity {
    Button bouton_explicite, bouton_implicite;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        bouton_explicite=(Button) findViewById(R.id.button);
        bouton_implicite=(Button) findViewById(R.id.button2);

        bouton_explicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(getBaseContext(),DeuxiemeActivite.class);
                System.out.println("test");
                intent.putExtra("nom","dahhou");
                intent.putExtra("prenome","ilyas");
                startActivity(intent);
            }
        });

        bouton_implicite.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent=new Intent(Intent.ACTION_VIEW);
                intent.setData(Uri.parse("http://www.inpt.ac.ma"));
                startActivity(intent);
            }
        });
    }
}

