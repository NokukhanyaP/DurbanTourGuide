package com.example.nokukhanya.durbantourguide;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import static com.example.nokukhanya.durbantourguide.R.id.btnMalls;
import static com.example.nokukhanya.durbantourguide.R.id.btnBeach;


public class WelcomeActivity extends AppCompatActivity {

   Button malls,restuarents,accomodation,beach,events;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_welcome);

        malls=(Button)findViewById(R.id.btnMalls);
        restuarents=(Button)findViewById(R.id.btnRestuarents);
        accomodation=(Button)findViewById(R.id.btnHotels);
        beach=(Button)findViewById(R.id.btnBeach);


        restuarents.setOnClickListener(new View.OnClickListener()
        {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, MainActivity.class);
                startActivity(intent);
            }
        });

        beach.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this,Beach.class);
                startActivity(intent);
            }
        });

        accomodation.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this,Accomodation.class);
                startActivity(intent);
            }
        });

        malls.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(WelcomeActivity.this, Malls.class);
                startActivity(intent);
            }
        });


    }
}
