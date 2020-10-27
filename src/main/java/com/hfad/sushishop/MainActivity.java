package com.hfad.sushishop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {
                if (position == 0) {
                    Intent intent = new Intent(MainActivity.this,SushiCategoryActivity.class);
                    startActivity(intent);
                }else if (position == 1){
                    Intent intent = new Intent(MainActivity.this, PizzaCategoryActivity.class);
                    startActivity(intent);
                }else {
                    Intent intent = new Intent(MainActivity.this, CityCategoryActivity.class);
                    startActivity(intent);
                }
            }
        };
        ListView listView = findViewById(R.id.list_options);
        listView.setOnItemClickListener(onItemClickListener);
    }
}