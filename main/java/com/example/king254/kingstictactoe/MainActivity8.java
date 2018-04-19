package com.example.king254.kingstictactoe;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity8 extends Activity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);

        Button ButtonX = findViewById(R.id.choice_X);
        Button ButtonO = findViewById(R.id.choice_O);

        ButtonX.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Player1Selected = new Intent(MainActivity8.this,MainActivity4.class);
                startActivity(Player1Selected);
            }
        });

        ButtonO.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent Player2Selected = new Intent(MainActivity8.this,MainActivity4.class);
                startActivity(Player2Selected);
            }
        });

    }
}
