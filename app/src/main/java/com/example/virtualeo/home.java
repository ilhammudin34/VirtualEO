package com.example.virtualeo;


import androidx.appcompat.app.AppCompatActivity;
import androidx.navigation.NavController;
import androidx.navigation.Navigation;
import androidx.navigation.ui.AppBarConfiguration;
import androidx.navigation.ui.NavigationUI;

import android.os.Bundle;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.widget.ImageButton;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class home extends AppCompatActivity {
    private ImageButton imageButton;
    private Button button;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        BottomNavigationView bottomNavigationView = findViewById(R.id.bottomNavigationView);
        NavController navController = Navigation.findNavController(this,  R.id.fragment);
        NavigationUI.setupWithNavController(bottomNavigationView, navController);
        AppBarConfiguration appBarConfiguration = new AppBarConfiguration.Builder(R.id.firstFragment, R.id.secondFragment, R.id.thirdFragment, R.id.fourthFragment).build();
        NavigationUI.setupActionBarWithNavController(this, navController, appBarConfiguration);



        imageButton = (ImageButton) findViewById(R.id.notifMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opennotifMain();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.profilMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openprofilMain();
            }
        });

        imageButton = (ImageButton) findViewById(R.id.kateringMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openkateringMain();
            }
        });

        button = (Button) findViewById(R.id.kateringMain2);
        button.setOnClickListener(new View.OnClickListener() {
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

        button = (Button) findViewById(R.id.kostuMain2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openkostumMain();;
            }
        });

        imageButton = (ImageButton) findViewById(R.id.aksesoMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaksesoMain();
            }
        });

        button = (Button) findViewById(R.id.aksesoMain2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openaksesoMain();;
            }
        });

        imageButton = (ImageButton) findViewById(R.id.suvenMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensuvenMain();
            }
        });

        button = (Button) findViewById(R.id.suvenMain2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opensuvenMain();;
            }
        });

        imageButton = (ImageButton) findViewById(R.id.undMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openundaMain();
            }
        });

        button = (Button) findViewById(R.id.undMain2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                openundaMain();;
            }
        });

        imageButton = (ImageButton) findViewById(R.id.gedungMain);
        imageButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengedungMain();
            }
        });

        button = (Button) findViewById(R.id.gedungMain2);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                opengedungMain();;
            }
        });


    }






    public void opennotifMain() {
        Intent intent = new Intent(this, notifMain.class);
        startActivity(intent);
    }

    public void openprofilMain() {
        Intent intent = new Intent(this, profilMain.class);
        startActivity(intent);
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

