package com.eclairiose.viddli;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class LoginActivity extends AppCompatActivity {

    Spinner spinner;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

    }

    public void moveToRegistration(View view) {
        startActivity(new Intent(LoginActivity.this,Registration.class));
    }

    public void moveToHomeScreen(View view) {
        startActivity(new Intent(LoginActivity.this,Home.class));
    }
}