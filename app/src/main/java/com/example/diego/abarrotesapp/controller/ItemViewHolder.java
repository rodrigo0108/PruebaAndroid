package com.example.diego.abarrotesapp.controller;


import android.support.v7.widget.RecyclerView;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import com.example.diego.abarrotesapp.R;

public class ItemViewHolder extends RecyclerView.ViewHolder{

    TextView textViewName;
    TextView textViewCosto;
    ImageView imageViewIcon;

    public ItemViewHolder(View itemView) {
        super(itemView);
        this.textViewName = (TextView) itemView.findViewById(R.id.textViewName);
        this.textViewCosto = (TextView) itemView.findViewById(R.id.textViewCost);
        this.imageViewIcon = (ImageView) itemView.findViewById(R.id.imageView);
    }
}
