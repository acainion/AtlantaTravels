package com.example.acainion.atlantatravels;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

import static com.example.acainion.atlantatravels.R.id.goodEats;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Set the content of the activity to use the activity_main.xml layout file
        setContentView(R.layout.activity_main);

        // Find the View that shows the activities category
        TextView activities = (TextView) findViewById(R.id.activities);

        // Set a click listener on that View
        activities.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the numbers category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ActivitiesActivity}
                Intent activitiesIntent = new Intent(MainActivity.this, ActivitiesActivity.class);

                // Start the new activity
                startActivity(activitiesIntent);
            }
        });

        // Find the View that shows the shopping category
        TextView shopping = (TextView) findViewById(R.id.shopping);

        // Set a click listener on that View
        shopping.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the family category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link ShoppingActivity}
                Intent shoppingIntent = new Intent(MainActivity.this, ShoppingActivity.class);

                // Start the new activity
                startActivity(shoppingIntent);
            }
        });

        // Find the View that shows the Good Eats category
        TextView goodEats = (TextView) findViewById(R.id.goodEats);

        // Set a click listener on that View
        goodEats.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the colors category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link GoodEatsActivity}
                Intent goodEatsIntent = new Intent(MainActivity.this, GoodEatsActivity.class);

                // Start the new activity
                startActivity(goodEatsIntent);
            }
        });

        // Find the View that shows the Night Life category
        TextView nightLife = (TextView) findViewById(R.id.nightLife);
        // Set a click listener on that View
        nightLife.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link NightLifeActivity}
                Intent nightLifeIntent = new Intent(MainActivity.this, NightLifeActivity.class);

                // Start the new activity
                startActivity(nightLifeIntent);
            }
        });

        // Find the View that shows the Hidden Treasures category
        TextView hiddenTreasures = (TextView) findViewById(R.id.hiddenTreasures);

        // Set a click listener on that View
        hiddenTreasures.setOnClickListener(new View.OnClickListener() {
            // The code in this method will be executed when the phrases category is clicked on.
            @Override
            public void onClick(View view) {
                // Create a new intent to open the {@link HiddenTreasuresActivity}
                Intent hiddenTreasuresIntent = new Intent(MainActivity.this, HiddenTreasuresActivity.class);

                // Start the new activity
                startActivity(hiddenTreasuresIntent);
            }
        });
    }

}
