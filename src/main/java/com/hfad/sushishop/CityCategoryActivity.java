package com.hfad.sushishop;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ListView;
import android.widget.Spinner;
import android.widget.TextView;

import java.util.List;

public class CityCategoryActivity extends AppCompatActivity {

    private CityExpert cityExpert = new CityExpert();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_city_category);
    }

    public void getCity(View view){
        TextView data = (TextView) findViewById(R.id.aboutCity);
        Spinner city = (Spinner) findViewById(R.id.spinner);
        String chosenCity = String.valueOf(city.getSelectedItem());
        List<String> cityList = cityExpert.getCities(chosenCity);
        StringBuilder stringBuilder = new StringBuilder();
        for (String brand : cityList){
            stringBuilder.append(brand).append("\n");
        }
        data.setText(stringBuilder);
    }
}