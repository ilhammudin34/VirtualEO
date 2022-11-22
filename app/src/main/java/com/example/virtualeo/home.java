package com.example.virtualeo;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

public class home extends AppCompatActivity {
    private ImageButton imageButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        imageButton = (ImageButton) findViewById(R.id.kateringMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openkateringMain();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.kostuMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openkostumMain();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.aksesoMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaksesoMain();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.suvenMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensuvenMain();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.undMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openundaMain();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.gedungMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengedungMain();
            }
        });
    }

    public void openkateringMain() {
        Intent intent = new Intent(this, kateringMain.class);
        startActivity(intent);
    }

    public void openkostumMain() {
        Intent intent = new Intent(this, kostumMain.class);
        startActivity(intent);
    }

    public void openaksesoMain() {
        Intent intent = new Intent(this, aksesoMain.class);
        startActivity(intent);
    }

    public void opensuvenMain() {
        Intent intent = new Intent(this, suvenMain.class);
        startActivity(intent);
    }

    public void openundaMain() {
        Intent intent = new Intent(this, undaMain.class);
        startActivity(intent);
    }

    public void opengedungMain() {
        Intent intent = new Intent(this, gedungMain.class);
        startActivity(intent);
    }

}

