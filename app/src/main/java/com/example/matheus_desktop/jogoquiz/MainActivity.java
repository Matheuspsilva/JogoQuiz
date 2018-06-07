package com.example.matheus_desktop.jogoquiz;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
    }

    public void btnJogarOnClick(View v){
        Intent intent = new Intent(this, QuizActivity.class);
        startActivity(intent);
    }
}
