package com.hfad.sushishop;

import java.util.ArrayList;
import java.util.List;

public class City {
    private String name;
    private String address;
    private String number;

    public static final City[] cities = {
        new City("Aktobe","A.Moldagulova str, 13","87005456868"),
        new City("Atyrau","Eset-Batyr str, 22","87005456867")
    };

    public City(String name, String address, String number){
        this.name = name;
        this.address = address;
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public String getAddress() {
        return address;
    }

    public String getNumber() {
        return number;
    }
}
