package com.abbass.samih.samihshoppinglist2017;

import android.content.Intent;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;
import com.google.firebase.auth.FirebaseUser;

public class LogInActivity extends AppCompatActivity implements View.OnClickListener
{
    private Button btnSignIn,btnSignUp;



    private FirebaseAuth auth;
    private FirebaseUser firebaseUser;
    private EditText etEmail;
    private EditText etPassword;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_log_in);
        etEmail = (EditText) findViewById(R.id.etEmail);
        etPassword = (EditText) findViewById(R.id.etPassword);
        btnSignIn= (Button) findViewById(R.id.btnIn);
        btnSignUp= (Button) findViewById(R.id.btnUP);
        btnSignUp.setOnClickListener(this);
        btnSignIn.setOnClickListener(this);
        auth = FirebaseAuth.getInstance();
        firebaseUser = auth.getCurrentUser();

    }

    @Override
    public void onClick(View view) {
        if(btnSignIn==view)
        {
            dataHandler();
        }
        if(btnSignUp==view)
        {
            Intent i=new Intent(getBaseContext(),SignUpActivity.class);
            startActivity(i);
        }
    }

    private void dataHandler() {
        String stemail = etEmail.getText().toString();
        String stpassword = etPassword.getText().toString();
        signIn(stemail, stpassword);
    }
    private void signIn(String email, String passw) {
        auth.signInWithEmailAndPassword(email,passw).addOnCompleteListener(LogInActivity.this, new OnCompleteListener<AuthResult>() {
            @Override
            public void onComplete(@NonNull Task<AuthResult> task) {
                if(task.isSuccessful())
                {
                    Toast.makeText(LogInActivity.this, "signIn Successful.", Toast.LENGTH_SHORT).show();
                    // Intent intent=new Intent(LogInActivity.this,MainFCMActivity.class);
                    //   startActivity(intent);
                    Intent i=new Intent(getBaseContext(),MainListActivity.class);
                    startActivity(i);
                     finish();
                }
                else
                {
                    Toast.makeText(LogInActivity.this, "signIn failed."+task.getException().getMessage(), Toast.LENGTH_SHORT).show();
                    task.getException().printStackTrace();
                }
            }
        });
    }

}
