package com.hfad.sushishop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class SushiCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushi_category);

        ArrayAdapter<Sushi> sushiArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Sushi.sushis);
        ListView listView = findViewById(R.id.sushi_list);
        listView.setAdapter(sushiArrayAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                Intent intent = new Intent(SushiCategoryActivity.this,SushiActivity.class);
                intent.putExtra(SushiActivity.EXTRA_SUSHIID,(int) id);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(onItemClickListener);
    }
}