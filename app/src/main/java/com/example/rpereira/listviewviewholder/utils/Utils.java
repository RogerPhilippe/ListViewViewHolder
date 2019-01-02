package com.example.rpereira.listviewviewholder.utils;

import com.example.rpereira.listviewviewholder.model.Items;

import java.util.ArrayList;
import java.util.List;

public class Utils {

    private Items items;

    public List<Items> getItemsList(int size) {
        List<Items> list = new ArrayList<>();

        for(int i = 0; i < size; i++) {
            Items items = new Items.Builder()
                    .setID(i)
                    .setNome("Item "+i)
                    .setDescricao("Uso geral")
                    .build();
            list.add(items);
        }

        return list;
    }

}
