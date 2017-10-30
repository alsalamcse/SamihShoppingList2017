package com.abbass.samih.samihshoppinglist2017;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

public class AddItemActivity extends AppCompatActivity
{
    private EditText etName,etAmount,etUnits,etPrice;
    private ImageButton ibtnImage;
    private Button btnSave;


    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_add_item);

        etName= (EditText) findViewById(R.id.etName);
        etAmount= (EditText) findViewById(R.id.etAmount);
        etUnits= (EditText) findViewById(R.id.etUnits);
        etPrice= (EditText) findViewById(R.id.etPrice);
        ibtnImage= (ImageButton) findViewById(R.id.iBtnImage);
        btnSave= (Button) findViewById(R.id.btnSave);



    }
    public void dataHandler()
    {
        String stname=etName.getText().toString();
        String stAmount=etAmount.getText().toString();
        String stUntits=etUnits.getText().toString();
        String stPrice=etPrice.getText().toString();
        double amount=Double.parseDouble(stAmount);
        double price=Double.parseDouble(stPrice);



    }
}
