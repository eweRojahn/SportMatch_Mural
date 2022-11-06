package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Atividade3 extends AppCompatActivity {

    Button btParticipar3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade3);

        btParticipar3 = findViewById(R.id.btParticipar3);

        btParticipar3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Atividade3.this, "Atividade Adicionada", Toast.LENGTH_LONG).show();
            }
        });

    }
}