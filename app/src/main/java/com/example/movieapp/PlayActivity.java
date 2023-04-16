package com.example.movieapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.text.Html;
import android.widget.TextView;

public class PlayActivity extends AppCompatActivity {
    TextView paragra;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_play);
        paragra=findViewById(R.id.pragram1);
        String text= "<font color=#FFFFFF>Black Widow is a 2021 American superhero film based on Marvel Comics featuring the character of the same name. Produced by Marvel Studios and distributed by Walt Disney Studios Motion Pictures, it is the 24th film in the Marvel Cinematic Universe (MCU)...</font> <font color=#EF5050>Read More</font>";
        paragra.setText(Html.fromHtml(text));
    }
}