package com.example.laptop.randomjar;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.app.ListActivity;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

import android.content.Intent;
import java.util.Random;

public class mylists extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_mylists);


        Button randomButton = (Button) findViewById(R.id.randomButton);
        ArrayAdapter<String> adapter;
        String[] mTestArray = getResources().getStringArray(R.array.testArray);

        adapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, mTestArray);
        ListView myListView = (ListView) findViewById(R.id.myListView);
        myListView.setAdapter(adapter);


        myListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {
                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position));
                        Toast.makeText(mylists.this, food, Toast.LENGTH_LONG).show();
                    }
                }
        );

        randomButton.setOnClickListener(
                new Button.OnClickListener() {
                    public void onClick(View v) {
                        String[] mTestArray = getResources().getStringArray(R.array.testArray);
                        String randomString = mTestArray[new Random().nextInt(mTestArray.length)];
                        Toast.makeText(mylists.this, randomString, Toast.LENGTH_LONG).show();
                    }
                }
        );


    }
    public void onClick(View view){
        Intent i = new Intent(this, MainActivity.class);
        startActivity(i);
    }
}