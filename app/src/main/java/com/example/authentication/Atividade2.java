package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Atividade2 extends AppCompatActivity {

    Button btParticipar2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade2);


        btParticipar2 = findViewById(R.id.btParticipar2);

        btParticipar2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Atividade2.this, "Atividade Adicionada", Toast.LENGTH_LONG).show();
            }
        });

    }
}