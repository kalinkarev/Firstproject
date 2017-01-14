package com.example.kalin.buckyslistview;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

/**
 * Created by Kalin on 4.1.2017 г..
 */

class CustomAdapter extends ArrayAdapter<String> {

    public CustomAdapter(Context context, String[] foods) {
        super(context, R.layout.custom_row, foods);
                    // for each indivitual row
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        LayoutInflater kalinsInfaltor = LayoutInflater.from(getContext()); // prepare for rendering
        View customView = kalinsInfaltor.inflate(R.layout.custom_row, parent, false);

        String singleFoodItem = getItem(position);
        TextView  kalinsText = (TextView) customView.findViewById(R.id.kalinsText);
        ImageView kalinsImage = (ImageView) customView.findViewById(R.id.kalinsImage);

        kalinsText.setText(singleFoodItem);
        kalinsImage.setImageResource(R.mipmap.android); // change dinamicaly
        return customView;
    }
}