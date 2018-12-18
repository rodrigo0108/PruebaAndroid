package com.example.diego.abarrotesapp.controller;

import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.diego.abarrotesapp.R;
import com.example.diego.abarrotesapp.model.Item;

import java.util.List;

public class ItemAdapter extends RecyclerView.Adapter<ItemViewHolder>  {

    List<Item> itemList;

    public ItemAdapter(List<Item> itemList) {
        this.itemList = itemList;
    }

    @NonNull
    @Override
    public ItemViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {
        View v = LayoutInflater.from(viewGroup.getContext()).inflate(R.layout.activity_item, viewGroup, false);
        ItemViewHolder pvh = new ItemViewHolder(v);
        return pvh;
    }

    @Override
    public void onBindViewHolder(@NonNull ItemViewHolder itemViewHolder, int i) {

        itemViewHolder.textViewName.setText(itemList.get(i).getDescripcion());
        itemViewHolder.textViewCosto.setText(String.valueOf(itemList.get(i).getPrecio()));


    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
