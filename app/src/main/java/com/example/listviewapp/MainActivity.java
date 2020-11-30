package com.example.listviewapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Toast;

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

        //alternate way to do a list...
        //ArrayList<String> peeps = new ArrayList<String>(asList("Morgan", "Simba", "Atlas"));

        ArrayAdapter<String> arrayAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, peeps);
        listView.setAdapter(arrayAdapter);
        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Log.i("doggo tapped:", peeps.get(position));

                Toast.makeText(getApplicationContext(), "Ollo " + peeps.get(position), Toast.LENGTH_SHORT).show();

            }
        });


    }
}