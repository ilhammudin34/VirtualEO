package com.example.virtualeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getSupportActionBar().hide();
        setContentView(R.layout.activity_main);

        button = (Button) findViewById(R.id.buttonLogIn);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openhome();
            }
        });

        button = (Button) findViewById(R.id.buttonNewAc);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) { opensignup();
            }
        });
    }

    public void openhome(){
        Intent intent = new Intent(this, home.class);
        startActivity(intent);
    }
    public void opensignup() {
        Intent intent = new Intent(this, signup.class);
        startActivity(intent);
    }


    }