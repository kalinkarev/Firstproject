package com.example.kalin.buckyslistview;

import android.app.Activity;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListAdapter;
import android.widget.ListView;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        String[] foods = {"Bacon", "Ham", "Tune", "Candy", "Meatball", "Potato"};

        // Adapter of java code to list items
        //ListAdapter kalinsAdapter = new ArrayAdapter<String>(this, android.R.layout.simple_list_item_1, foods);
                                                                // how to be formated the list items  this is the array

        ListAdapter kalinsAdapter = new CustomAdapter(this, foods);
        ListView kalinsListView = (ListView) findViewById(R.id.kalinsListView);
        kalinsListView.setAdapter(kalinsAdapter); // what to convert to kalinsAdapter

        kalinsListView.setOnItemClickListener(
                new AdapterView.OnItemClickListener() {

                    @Override
                    public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                        String food = String.valueOf(parent.getItemAtPosition(position)); // when tap each have a position; get he int position and give a value and convert it
                                                                                          //to a Sting
                        Toast.makeText(MainActivity.this, food, Toast.LENGTH_LONG).show();
                    }

                }
        );

    }
}