package com.hfad.sushishop;

import java.util.ArrayList;
import java.util.List;

public class CityExpert {
    List<String> getCities(String color){
        List<String> cities = new ArrayList<String>();
        if (color.equals("Aktobe")){
            cities.add("A.Moldagulova 13");
            cities.add("87001232001");
        }else{
            cities.add("Eset-Batyr 21 str");
            cities.add("87785223312");
        }
        return cities;
    }
}
