package com.example.king254.kingstictactoe;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity2 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button Player1 = findViewById(R.id.player1);
        Button Player2 = findViewById(R.id.player2);

        Player1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Player1Selected = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(Player1Selected);
            }
        });

        Player2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Player2Selected = new Intent(MainActivity2.this,MainActivity3.class);
                startActivity(Player2Selected);
            }
        });

    }
}
