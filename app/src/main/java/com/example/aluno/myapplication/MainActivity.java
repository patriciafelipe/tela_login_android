package com.example.aluno.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;


public class MainActivity extends Activity {
private EditText log;
private EditText sen;
private Button bot;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        log = findViewById(R.id.login);
        sen = findViewById(R.id.senha);
        bot = findViewById(R.id.entrar);

        bot.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String text = log.getText().toString();
                String password = sen.getText().toString();
                String admin = "admin";
                String senha = "12345";

                if (text.equals(admin) && password.equals(senha))
                {
                    Toast.makeText(MainActivity.this, "Login Aceito", Toast.LENGTH_LONG).show();
                } else {
                    Toast.makeText(MainActivity.this, "Login Não Aceito", Toast.LENGTH_LONG).show();
                }
            }
});
        }
        }
