package com.abbass.samih.samihshoppinglist2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class SignUpActivity extends AppCompatActivity {

    private EditText etEmail,etPassword,etRePassword,etPhone,etName;
    private Button btnSave;



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);
        etEmail=(EditText)findViewById(R.id.etEmail);
        etPassword=(EditText)findViewById(R.id.etPassword);
        etRePassword=(EditText)findViewById(R.id.etRePassword);
        etPhone=(EditText)findViewById(R.id.etPhone);
        etName=(EditText)findViewById(R.id.etName);
        btnSave= (Button) findViewById(R.id.btnSave);


        btnSave.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

            }
        });

    }
}
