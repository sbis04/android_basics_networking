package com.example.android.quakereport;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import java.util.ArrayList;

public class EarthquakeActivity extends AppCompatActivity {

    public static final String LOG_TAG = EarthquakeActivity.class.getName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.earthquake_activity);

        // Create a fake list of earthquake locations.
        ArrayList<Earthquake> earthquakes = new ArrayList<>();
        earthquakes.add(new Earthquake("7.2", "San Francisco", "Mar 2, 2010"));
        earthquakes.add(new Earthquake("7.9", "London", "Apr 10, 2009"));
        earthquakes.add(new Earthquake("8.0", "Tokyo", "Jan 1, 2012"));
        earthquakes.add(new Earthquake("6.2", "Mexico", "Mar 9, 2011"));
        earthquakes.add(new Earthquake("4.1", "Moscow", "Feb 12, 2017"));

        // Find a reference to the {@link ListView} in the layout
        ListView earthquakeListView = (ListView) findViewById(R.id.list);

        // Create a new {@link ArrayAdapter} of earthquakes
        EarthquakeAdapter earthquakeAdapter = new EarthquakeAdapter(this, earthquakes);

        // Set the adapter on the {@link ListView}
        // so the list can be populated in the user interface
        assert earthquakeListView != null;
        earthquakeListView.setAdapter(earthquakeAdapter);
    }
}
