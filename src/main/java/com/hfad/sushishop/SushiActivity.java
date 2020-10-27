package com.hfad.sushishop;

import androidx.appcompat.app.AppCompatActivity;

import android.app.Activity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

public class SushiActivity extends Activity {
    public static final String EXTRA_SUSHIID = "sushiId";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sushi);

        int sushiId = (int) getIntent().getExtras().get(EXTRA_SUSHIID);
        Sushi sushi = Sushi.sushis[sushiId];

        TextView name = findViewById(R.id.name);
        name.setText(sushi.getName());

        ImageView photo = findViewById(R.id.photo);
        photo.setImageResource(sushi.getImageResourceId());
        photo.setContentDescription(sushi.getName());
    }

    public void onSubmitButton(View view) {
        // thanks text
        TextView thanks = findViewById(R.id.thanks);
        thanks.setText("Thank you for your order!");
    }
}