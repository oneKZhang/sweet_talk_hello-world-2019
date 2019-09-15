package com.example.sweettalkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MenuActivity extends AppCompatActivity {

    public static String SELECTION = "Category name";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_menu);
    }

    public void classicsPressed(View view){
        Intent intent = new Intent(this, LineActivity.class);
        intent.putExtra(SELECTION, 0);

        startActivity(intent);

    }

    public void techPressed(View view){
        Intent intent = new Intent(this, LineActivity.class);
        intent.putExtra(SELECTION, 1);

        startActivity(intent);
    }

    public void sciencePressed(View view){
        Intent intent = new Intent(this, LineActivity.class);
        intent.putExtra(SELECTION, 2);

        startActivity(intent);
    }

    public void culturePressed(View view){
        Intent intent = new Intent(this, LineActivity.class);
        intent.putExtra(SELECTION, 3);

        startActivity(intent);
    }

    public void spicyPressed(View view){
        Intent intent = new Intent(this, LineActivity.class);
        intent.putExtra(SELECTION, 4);

        startActivity(intent);
    }

    public void purduePressed(View view){
        Intent intent = new Intent(this, LineActivity.class);
        intent.putExtra(SELECTION, 5);

        startActivity(intent);
    }
}
