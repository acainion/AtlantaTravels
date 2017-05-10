package com.example.acainion.atlantatravels;


import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by acainion on 4/29/17.
 */

public class ActivitiesActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        // String array of guides (Creating a guide object)
        ArrayList<Guide> guides = new ArrayList<Guide>();

        guides.add(new Guide(getString(R.string.activities_guide_1), getString(R.string.activities_guide_description_1), R.drawable.atlanta_aquarium));
        guides.add(new Guide(getString(R.string.activities_guide_2), getString(R.string.activities_guide_description_2), R.drawable.atlanta_worldofcoke));
        guides.add(new Guide(getString(R.string.activities_guide_3), getString(R.string.activities_guide_description_3), R.drawable.atlanta_centennialpark));
        guides.add(new Guide(getString(R.string.activities_guide_4), getString(R.string.activities_guide_description_4), R.drawable.atlanta_cnn));
        guides.add(new Guide(getString(R.string.activities_guide_5), getString(R.string.activities_guide_description_5), R.drawable.atlanta_highmuseum));
        guides.add(new Guide(getString(R.string.activities_guide_6), getString(R.string.activities_guide_description_6), R.drawable.atlanta_foxtheatre));
        guides.add(new Guide(getString(R.string.activities_guide_7), getString(R.string.activities_guide_description_7), R.drawable.atlanta_fernbank));
        guides.add(new Guide(getString(R.string.activities_guide_8), getString(R.string.activities_guide_description_8), R.drawable.atlanta_martinlutherking));
        guides.add(new Guide(getString(R.string.activities_guide_9), getString(R.string.activities_guide_description_9), R.drawable.atlanta_historycenter));
        guides.add(new Guide(getString(R.string.activities_guide_10), getString(R.string.activities_guide_description_10), R.drawable.atlanta_botanical));

        GuideAdapter itemsAdapter = new GuideAdapter(this, guides, R.color.category_activities);

        // Create list View by Id
        ListView listView = (ListView) findViewById(R.id.list);

        // Attach adapter to listView
        listView.setAdapter(itemsAdapter);

    }
}
