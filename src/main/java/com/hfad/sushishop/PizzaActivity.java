package com.hfad.sushishop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class PizzaActivity extends Activity {

    public static final String EXTRA_PIZZAID = "pizzaId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pizza);

        int pizzaId = (int) getIntent().getExtras().get(EXTRA_PIZZAID);
        Sushi pizza = Sushi.pizzas[pizzaId];

        TextView name = findViewById(R.id.name_p);
        name.setText(pizza.getName());

        ImageView photo = findViewById(R.id.photo_p);
        photo.setImageResource(pizza.getImageResourceId());
        photo.setContentDescription(pizza.getName());

    }

    public void onSubmitButton(View view) {
        // thanks text
        TextView thanks = findViewById(R.id.thanks);
        thanks.setText("Thank you for your order!");
    }
}