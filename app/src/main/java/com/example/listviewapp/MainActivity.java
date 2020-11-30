package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.ArrayAdapter;
import android.widget.ListView;

import java.lang.reflect.Array;
import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        ListView listView = (ListView) findViewById(R.id.myListView);

        ArrayList<String> peeps = new ArrayList<String>();
        peeps.add("Morgan");
        peeps.add("Simba");
        peeps.add("Atlas");
        peeps.add("Bruno");
        peeps.add("Lola");
        peeps.add("Tesla");
        peeps.add("Chappie");


        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, peeps);
        listView.setAdapter(arrayAdapter);


    }
}