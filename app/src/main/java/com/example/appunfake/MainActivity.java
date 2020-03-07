package com.example.appunfake;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText etUser, etPass, etNewName, etpass2, etpass3;

    Button btnLogIn, btnLogIn2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        etUser = (EditText) findViewById(R.id.etName);
        etPass = (EditText) findViewById(R.id.etPass);
        etNewName = (EditText) findViewById(R.id.etNewName);
        etpass2 = (EditText) findViewById(R.id.etPass2);
        etpass3 = (EditText) findViewById(R.id.etPass3);


        btnLogIn = (Button) findViewById(R.id.btnLog);
        btnLogIn2 = (Button) findViewById(R.id.btnLog2);

        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Check();
            }

        });
    }

    public void OpenAnotherActivity() {
        Intent intent = new Intent(this, idActivity.class);
        startActivity(intent);
    }

    public void Check() {
        if (etUser.getText().toString().equals("admin") && etPass.getText().toString().equals("1234")) {
            OpenAnotherActivity();
        }
        else {
            Toast.makeText(this, "Login Failed Try Sign up", Toast.LENGTH_SHORT).show();
            btnLogIn2.setOnClickListener(new View.OnClickListener() {
                @Override
                public void onClick(View v) {
                    Check2();
                }

            });

        }
    }
    public void Check2(){
        if (etpass2.getText().toString().equals("1234") == etpass3.getText().toString().equals("1234")) {
            if (etNewName.getText().toString().equals("admin") && etpass2.getText().toString().equals("1234")) {
                Toast.makeText(this, "GO Login", Toast.LENGTH_SHORT).show();
            } else {
                Toast.makeText(this, "INVALID DATA", Toast.LENGTH_SHORT).show();
            }
        } else {
            Toast.makeText(this, "Password didn't match", Toast.LENGTH_SHORT).show();

        }
    }
public void browser1(View view){
        Intent browserIntent=new Intent(Intent.ACTION_VIEW, Uri.parse("https://frhns0107.github.io/unfake/"));
        startActivity(browserIntent);
}
}