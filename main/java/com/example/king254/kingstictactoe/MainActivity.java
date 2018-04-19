package com.example.king254.kingstictactoe;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends Activity {



    public Button buttonTap;

    public void init(){
        buttonTap = findViewById(R.id.buttonTap);
        buttonTap.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent TapToContinue = new Intent(MainActivity.this,MainActivity2.class);

                startActivity(TapToContinue);
            }
        });
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        init();


    }
}