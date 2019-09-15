package com.example.sweettalkapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.widget.TextView;

import com.like.LikeButton;

public class LineActivity extends AppCompatActivity {

    private PickupList lineList;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_line);

        printLine();
    }

    public void printLine(){
        TextView textView = findViewById(R.id.lineText);

        Intent intent = getIntent();

        if (intent.getIntExtra(MenuActivity.SELECTION, 0) == 0){
            lineList = new PickupList(0);
        }
        else if (intent.getIntExtra(MenuActivity.SELECTION, 0) == 1){
            lineList = new PickupList(1);
        }
        else if (intent.getIntExtra(MenuActivity.SELECTION, 0) == 2){
            lineList = new PickupList(2);
        }
        else if (intent.getIntExtra(MenuActivity.SELECTION, 0) == 3){
            lineList = new PickupList(3);
        }
        else if (intent.getIntExtra(MenuActivity.SELECTION, 0) == 4){
            lineList = new PickupList(4);
        }
        else if (intent.getIntExtra(MenuActivity.SELECTION, 0) == 5){
            lineList = new PickupList(5);
        }
        else{
            lineList = new PickupList((int) (Math.random() * 4));
        }

        textView.setText(lineList.generateLine());
    }

    public void goBack(View view){
// Create an Intent to start the second activity
        Intent backIntent = new Intent(this, MenuActivity.class);

// Start the new activity.
        startActivity(backIntent);
    }

    public void refresh(View view){
        printLine();
    }

}
