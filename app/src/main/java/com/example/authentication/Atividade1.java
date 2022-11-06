package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

public class Atividade1 extends AppCompatActivity {

    Button btParticipar1;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_atividade1);

        btParticipar1 = findViewById(R.id.btParticipar1);

        btParticipar1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Toast.makeText(Atividade1.this, "Atividade Adicionada", Toast.LENGTH_LONG).show();
            }
        });
    }
}