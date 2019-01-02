package com.example.rpereira.listviewviewholder.utils;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.rpereira.listviewviewholder.R;
import com.example.rpereira.listviewviewholder.model.Items;

import java.util.List;

public class ListViewAdapter extends ArrayAdapter<Items> {

    private Context mContext;

    private List<Items> mListItems;

    public ListViewAdapter(Context context, List<Items> resource) {
        super(context, 0, resource);
        mContext = context;
        mListItems = resource;
    }

    @Override
    public View getView(int position, View convertView, ViewGroup parent) {
        View view;
        ViewHolder holder;

        if(convertView == null) {
            view = LayoutInflater.from(mContext).inflate(R.layout.listview_layout, parent, false);
            holder = new ViewHolder(view);
            view.setTag(holder);
        } else {
            view = convertView;
            holder = (ViewHolder) view.getTag();
        }

        Items currentItem = mListItems.get(position);

        TextView name = (TextView) view.findViewById(R.id.idtvName);
        name.setText(currentItem.getmNome());

        TextView description = (TextView) view.findViewById(R.id.idtvDescription);
        description.setText(currentItem.getmDescricao());

        return view;
    }

}
