package com.example.android.quakereport;

import android.app.Activity;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import java.util.ArrayList;

/**
 * Created by Mateusz on 03.02.2018.
 */

public class EarthquakeAdapter extends ArrayAdapter<Earthquake> {



    public EarthquakeAdapter(Activity context, ArrayList<Earthquake> earthquakes){
        super(context,0,earthquakes);
    }


    @Override
    public View getView(int position, View convertView,  ViewGroup parent) {
        View listItemView = convertView;

        if (listItemView == null){
            listItemView = LayoutInflater.from(getContext()).inflate(R.layout.list_earthquake,parent,
                    false);

            Earthquake currentEarthquake = getItem(position);

            TextView place = (TextView) listItemView.findViewById(R.id.place);
            place.setText(currentEarthquake.getEarthquakePlace());

            TextView magnitude = (TextView) listItemView.findViewById(R.id.magnitude);
            magnitude.setText(currentEarthquake.getEarthquakeMagnitude());

            TextView date = (TextView) listItemView.findViewById(R.id.date);
            date.setText(currentEarthquake.getEarthquakeDate());
        }
        return listItemView;
    }
}
