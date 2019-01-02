package com.example.rpereira.listviewviewholder.utils;

import android.view.View;
import android.widget.TextView;

import com.example.rpereira.listviewviewholder.R;

public class ViewHolder {

    final TextView name;
    final TextView description;

    public ViewHolder(View view) {
        name = (TextView) view.findViewById(R.id.idtvName);
        description = (TextView) view.findViewById(R.id.idtvDescription);
    }

}
