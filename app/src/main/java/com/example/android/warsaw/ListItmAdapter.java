package com.example.android.warsaw;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.TextView;

import java.util.ArrayList;

public class ListItmAdapter extends ArrayAdapter<ListItm> {

    public ListItmAdapter (Context context, ArrayList<ListItm> items) {
        super(context, 0, items);
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {


        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(
                    R.layout.list_item, parent, false);
        }

        ListItm currentItem = getItem(position);

        TextView theTitle = convertView.findViewById(R.id.name);
        theTitle.setText(currentItem.getName());

        TextView theDescription = convertView.findViewById(R.id.description);
        theDescription.setText(currentItem.getDescription());

        ImageView theImage = convertView.findViewById(R.id.image);
        theImage.setImageResource(currentItem.getImage());

        return convertView;
    }
}

