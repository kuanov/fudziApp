package com.hfad.sushishop;

import java.util.ArrayList;
import java.util.List;

public class Sushi {
    private String name;
    private String description;
    private int imageResourceId;

    public static final Sushi[] sushis = {
            new Sushi("California","It is Californian sushi",R.drawable.california),
            new Sushi("Philadelphia","It is Philadelphian sushi",R.drawable.phila),
            new Sushi("Sashimi","It is sashimi",R.drawable.sashimi)
    };
    public static final Sushi[] pizzas = {
            new Sushi("Margarita","Simple pizza with cheese and tomatoes",R.drawable.margarita),
            new Sushi("Bolognese","Sicilian pizza",R.drawable.bolognese),
            new Sushi("Salami","Italian pizza with sausages",R.drawable.salami)
    };

    private Sushi(String name, String description, int imageResourceId){
        this.name = name;
        this.description = description;
        this.imageResourceId = imageResourceId;
    }


    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public int getImageResourceId() {
        return imageResourceId;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
