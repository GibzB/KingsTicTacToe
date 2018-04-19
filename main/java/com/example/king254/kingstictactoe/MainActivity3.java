package com.example.king254.kingstictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity3 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main3);

        Button ThreebyThree = findViewById(R.id.threebythree);
        Button FivebyFive = findViewById(R.id.fivebyfive);

        ThreebyThree.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Player1Selected = new Intent(MainActivity3.this,MainActivity8.class);
                startActivity(Player1Selected);
            }
        });

        FivebyFive.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Player2Selected = new Intent(MainActivity3.this,MainActivity8.class);
                startActivity(Player2Selected);
            }
        });
    }
}