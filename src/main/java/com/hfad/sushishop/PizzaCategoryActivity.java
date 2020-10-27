package com.hfad.sushishop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;

public class PizzaCategoryActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza_category);

        ArrayAdapter<Sushi> pizzaArrayAdapter = new ArrayAdapter<>(this,android.R.layout.simple_list_item_1,Sushi.pizzas);
        ListView listView = findViewById(R.id.pizza_list);
        listView.setAdapter(pizzaArrayAdapter);

        AdapterView.OnItemClickListener onItemClickListener = new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> listView, View view, int position, long id) {
                Intent intent = new Intent(PizzaCategoryActivity.this,PizzaActivity.class);
                intent.putExtra(PizzaActivity.EXTRA_PIZZAID,(int) id);
                startActivity(intent);
            }
        };
        listView.setOnItemClickListener(onItemClickListener);
    }
}