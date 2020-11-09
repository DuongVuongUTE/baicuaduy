package com.example.foody;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Context;
import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    RecyclerView recyclerView,list_uudai;
    productadapter productadapter;
    productuudai productuudai;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        List<product> list =new ArrayList<>();
        list.add(new product("Deal mới",R.drawable.a1));
        list.add(new product("Deal 1",R.drawable.a1));
        list.add(new product("Deal 2",R.drawable.a1));
        list.add(new product("Deal 3",R.drawable.a1));
        list.add(new product("Deal 4",R.drawable.a1));
        list.add(new product("Deal 5",R.drawable.a1));
        list.add(new product("Deal 6",R.drawable.a1));

        setRecyclerView(list);


        List<product> listuudai =new ArrayList<>();
        listuudai.add(new product("chỉ 11.000 cho món đặc biệt",R.drawable.h1));
        listuudai.add(new product("chỉ 11.000 cho món đặc biệt",R.drawable.h1));
        listuudai.add(new product("chỉ 11.000 cho món đặc biệt",R.drawable.h1));
        listuudai.add(new product("chỉ 11.000 cho món đặc biệt",R.drawable.h1));
        listuudai.add(new product("chỉ 11.000 cho món đặc biệt",R.drawable.h1));
        listuudai.add(new product("chỉ 11.000 cho món đặc biệt",R.drawable.h1));

        setListuudai(listuudai);

    }
    public void setRecyclerView(List<product> productList) {
        recyclerView = findViewById(R.id.rv);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        recyclerView.setLayoutManager(layoutManager);
        productadapter = new productadapter(this, productList);
        recyclerView.setAdapter(productadapter);
    }

    public void setListuudai(List<product> listuudai) {
        list_uudai = findViewById(R.id.list_uudai);
        RecyclerView.LayoutManager layoutManager = new LinearLayoutManager(this, RecyclerView.HORIZONTAL, false);
        list_uudai.setLayoutManager(layoutManager);
        productuudai = new productuudai(this, listuudai);
        list_uudai.setAdapter(productuudai);
    }

}