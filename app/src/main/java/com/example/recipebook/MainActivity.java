package com.example.recipebook;



import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.content.Intent;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void launchView(View v){
        Intent i = new Intent(this, ViewActivity.class);
        startActivity(i);
    }

    public void launchAdd(View v){
        Intent i = new Intent(this, AddActivity.class);
        startActivity(i);
    }
}
