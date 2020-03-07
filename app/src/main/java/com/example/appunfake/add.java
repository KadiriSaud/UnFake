package com.example.appunfake;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class add extends AppCompatActivity {

    EditText t1, t2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add);
        t1 = (EditText) findViewById(R.id.t1);
        t2 = (EditText) findViewById(R.id.t2);
    }

    public void getRecord(View view) {
        SQL db = new SQL(this);
        db.ID(t1.getText().toString(), t2.getText().toString());

        String res = db.ID(t1.getText().toString(), t2.getText().toString());

        Toast.makeText(this, res, Toast.LENGTH_LONG).show();
        t1.setText("");
        t2.setText("");


    }
}