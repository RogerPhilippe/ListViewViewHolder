package com.example.rpereira.listviewviewholder;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ListView;

import com.example.rpereira.listviewviewholder.model.Items;
import com.example.rpereira.listviewviewholder.utils.ListViewAdapter;
import com.example.rpereira.listviewviewholder.utils.Utils;

import java.util.List;

public class MainActivity extends AppCompatActivity {

    private ListView mMainListView;

    private List<Items> items;

    private Utils utils;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        utils = new Utils();

        items = utils.getItemsList(300);

        mMainListView = (ListView) findViewById(R.id.idlvMain);

        ListViewAdapter adapter = new ListViewAdapter(MainActivity.this, items);

        mMainListView.setAdapter(adapter);

    }

}
