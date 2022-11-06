package com.example.authentication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.database.DatabaseReference;
import com.google.firebase.database.FirebaseDatabase;

public class Register extends AppCompatActivity {

    EditText edNome, edEmail, edPassword, edTelephone;
    Button btCreate;
    TextView tvRegister;
    FirebaseAuth fAuth;

    FirebaseDatabase rootNode;
    DatabaseReference reference;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        edNome = findViewById(R.id.Nome);
        edEmail = findViewById(R.id.Email2);
        edPassword = findViewById(R.id.Senha2);
        edTelephone = findViewById(R.id.Telefone);
        btCreate = findViewById(R.id.btCreate);
        tvRegister = findViewById(R.id.PossuiRegistro);

        fAuth = FirebaseAuth.getInstance();

        if (fAuth.getCurrentUser() != null) {
            startActivity(new Intent(getApplicationContext(), MainActivity.class));
            finish();
        }

        btCreate.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View z) {
                String email = edEmail.getText().toString().trim();
                String password = edPassword.getText().toString().trim();

                if (TextUtils.isEmpty(email)) {
                    edEmail.setError("Email is Required.");
                    return;
                }
                if (TextUtils.isEmpty(password)) {
                    edPassword.setError("Password is Required.");
                    return;
                }
                if (password.length() < 6) {
                    edPassword.setError("Password >= 6 characters");
                    return;
                }

                // Gravar Dados Firebase

                rootNode = FirebaseDatabase.getInstance();
                reference = rootNode.getReference("https://my-application-de902-default-rtdb.firebaseio.com/");

                reference.setValue("Teste");

                // Criar Conta

                fAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener(task -> {
                    if (task.isSuccessful()) {
                        Toast.makeText(Register.this, "Usuario Criado!", Toast.LENGTH_SHORT).show();
                        startActivity(new Intent(getApplicationContext(), MainActivity.class));
                    } else {
                        Toast.makeText(Register.this, "Error!" + task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    }
                });
            }
        });

        tvRegister.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(),Login.class));
            }
        });

        }
    }