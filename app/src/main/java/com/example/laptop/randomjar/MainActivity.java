package com.example.laptop.randomjar;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.content.Intent;
import android.view.View;
public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void onClick(View view){
        Intent i = new Intent(this, mylists.class);
        startActivity(i);
    }
    public void onClick1(View view){
        Intent i = new Intent(this, credits.class);
        startActivity(i);
    }
}





