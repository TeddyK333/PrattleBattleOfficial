package com.example.prattlebattle.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.prattlebattle.R;

import com.example.prattlebattle.model.PracticeAction;

import java.util.ArrayList;

public class ActionAdapter extends ArrayAdapter<PracticeAction> {
    public ActionAdapter(Context context, PracticeAction[] action) {
        super(context, 0, action);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        // Get the data item for this position
        PracticeAction action = getItem(position);
        // Check if an existing view is being reused, otherwise inflate the view
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.list_action, parent, false);
        }
        // Lookup view for data population
        TextView tvName = (TextView) convertView.findViewById(R.id.tvName);
        // Populate the data into the template view using the data object
        tvName.setText(action.text);
        // Return the completed view to render on screen
        return convertView;
    }
}
