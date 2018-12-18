package com.example.diego.abarrotesapp;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.LinearLayoutManager;
import android.support.v7.widget.RecyclerView;

import com.example.diego.abarrotesapp.controller.ItemAdapter;
import com.example.diego.abarrotesapp.model.Item;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        RecyclerView rv = (RecyclerView)findViewById(R.id.rv);

        List<Item> items = new ArrayList<>();
        Item i = new Item(1,"papel", 1.1);
        items.add(i);
        ItemAdapter adapter = new ItemAdapter(items);

        LinearLayoutManager llm = new LinearLayoutManager(this);
        rv.setLayoutManager(llm);
        rv.setAdapter(adapter);



    }
}
