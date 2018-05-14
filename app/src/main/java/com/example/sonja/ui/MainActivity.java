package com.example.sonja.ui;


import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;

import android.preference.PreferenceManager;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;

import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity  {

    Button btn_logIn;
    Button btn_forgotPassword;
    Button btn_createAccount;
    SharedPreferences sharedPrefs;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        btn_logIn = findViewById(R.id.btn_login);
        btn_logIn.getBackground().setAlpha(1);

        btn_forgotPassword = findViewById(R.id.btn_forgot_password);
        btn_forgotPassword.getBackground().setAlpha(1);

        btn_createAccount = findViewById(R.id.btn_create_account);
        btn_createAccount.getBackground().setAlpha(1);

        SharedPreferences sharedPrefs = PreferenceManager.getDefaultSharedPreferences(this);

        System.out.println("First run:" + sharedPrefs.getBoolean("firstrun", true));



    }


  /*  Entwurf--
  Soll testen, ob App das erste Mal geöffnet wird. Scheitert daran, wie es in den SharedPreferences als Boolean gescheitert ist.

  @Override
    protected void onResume() {
        super.onResume();
         if (sharedPrefs.getBoolean("firstrun", true)) {

            System.out.println("Als firstrun identifiziert");

            sharedPrefs.edit().putBoolean("firstrun", false).apply();

            Intent intent = new Intent(this, Onboarding.class);
            startActivity(intent);
            this.finish();
        }
    }*/

    public void onClickLogin(View v) {
        //ruft Screen2 auf
        Intent intent = new Intent(this, NeueFahrt2.class);
        startActivity(intent);
        this.finish();

    }


    public void onClick(View v) {
        //ruft NeueFahrt1 auf
        Intent intent = new Intent(this, NeueFahrt1.class);

        startActivity(intent);
        this.finish();
    }

    public void onClick_ForgotPassword(View v) {
        //if password is forgotten (ruft jetzt erstmal Screen2 auf, solange es keine anderen gibt)
        Intent intent = new Intent(this, NeueFahrt2.class);
        startActivity(intent);
        this.finish();
    }
    public void onClick_CreateAccount(View v) {
        //Weiterleitung an Profilerstellung
        System.out.println("onClick_CreateAccount");
        Intent intent = new Intent(this, Onboarding.class);
        startActivity(intent);
        this.finish();

    }


}