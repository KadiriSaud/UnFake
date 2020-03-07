package com.example.appunfake;

import androidx.appcompat.app.AppCompatActivity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;


public class idActivity extends AppCompatActivity {
    EditText etid;
    Button btnCheck, button1;

    public void openNew() {
        Intent intent = new Intent(this, add.class);
        startActivity(intent);
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_id);


        etid = (EditText) findViewById(R.id.etid);

        btnCheck = (Button) findViewById(R.id.button);
        btnCheck.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Check();
            }
        });
        button1 = (Button) findViewById(R.id.button1);

        button1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                openNew();
            }

        });

    }
    public void start(View view){
        new SQL (this);
        startActivity(new Intent(this, add.class));

    }
    public void Check(){

        if (etid.getText().toString().equals("40007026012020")){
            Toast.makeText(this, "Correct ID", Toast.LENGTH_SHORT).show();
        }else{
            Toast.makeText(this, "No such ID", Toast.LENGTH_SHORT).show();
        }
    }
}
