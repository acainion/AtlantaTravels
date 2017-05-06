package com.example.acainion.atlantatravels;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

/**
 * Created by acainion on 4/29/17.
 */

public class HiddenTreasuresActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_activities);

        // String array of guides (Creating a guide object)
        ArrayList<Guide> guides = new ArrayList<Guide>();

        guides.add(new Guide(getString(R.string.hiddenTreasures_guide_1), getString(R.string.hiddenTreasures_guide_description_1)));
        guides.add(new Guide(getString(R.string.hiddenTreasures_guide_2), getString(R.string.hiddenTreasures_guide_description_2)));
        guides.add(new Guide(getString(R.string.hiddenTreasures_guide_3), getString(R.string.hiddenTreasures_guide_description_3)));
        guides.add(new Guide(getString(R.string.hiddenTreasures_guide_4), getString(R.string.hiddenTreasures_guide_description_4)));
        guides.add(new Guide(getString(R.string.hiddenTreasures_guide_5), getString(R.string.hiddenTreasures_guide_description_5)));
        guides.add(new Guide(getString(R.string.hiddenTreasures_guide_6), getString(R.string.hiddenTreasures_guide_description_6)));

        GuideAdapter itemsAdapter = new GuideAdapter(this, guides, R.color.category_hiddenTreasures);

        // Create list View by Id
        ListView listView = (ListView) findViewById(R.id.list);

        // Attach adapter to listView
        listView.setAdapter(itemsAdapter);

    }
}
