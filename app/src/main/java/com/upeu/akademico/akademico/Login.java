package com.upeu.akademico.akademico;

import android.content.Intent;
import android.graphics.Typeface;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import com.upeu.akademico.akademico.grade.MainPrimary;

public class Login extends AppCompatActivity {

    TextView textLogin;
    Button btnLogIn;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        btnLogIn = (Button)findViewById(R.id.btnLogIn);
        textLogin = (TextView)findViewById(R.id.textLogin);
        String font_path = "fonts/Moonlights.ttf";
        Typeface fuente = Typeface.createFromAsset(getAssets(),font_path);
        textLogin.setTypeface(fuente);


        btnLogIn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                startActivity(new Intent(getApplicationContext(), MainPrimary.class));
            }
        });
    }
}
