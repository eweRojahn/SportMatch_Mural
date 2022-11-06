package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Mural extends AppCompatActivity {

    TextView btAtividade1,btAtividade2,btAtividade3;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mural);

        btAtividade1 = findViewById(R.id.textViewAtividade1);
        btAtividade2 = findViewById(R.id.textViewAtividade2);
        btAtividade3 = findViewById(R.id.textViewAtividade3);

        btAtividade1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Atividade1.class));
            }
        });

        btAtividade2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Atividade2.class));
            }
        });
        btAtividade3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(getApplicationContext(), Atividade3.class));
            }
        });
    }
}