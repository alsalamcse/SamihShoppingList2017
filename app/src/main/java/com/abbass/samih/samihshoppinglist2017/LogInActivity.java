package com.abbass.samih.samihshoppinglist2017;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btnSignIn,btnSignUp;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        btnSignIn= (Button) findViewById(R.id.btnIn);
        btnSignUp= (Button) findViewById(R.id.btnUP);
        btnSignUp.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {
        if(btnSignIn==view)
        {
            Intent i=new Intent(getBaseContext(),MainListActivity.class);
            startActivity(i);
        }
        if(btnSignUp==view)
        {
            Intent i=new Intent(getBaseContext(),SignUpActivity.class);
            startActivity(i);
        }
    }
}
