package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.os.Bundle;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
ArrayList<RecyclerViewItem>recyclerViewItems;
private RecyclerView recyclerView;
private RecyclerView.Adapter adapter;
private RecyclerView.LayoutManager layoutManager;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerViewItems=new ArrayList<>();
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_android_black_24dp,"Poxos","Poxosya"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_android_black_24dp,"Poxos","Poxosya"));
        recyclerViewItems.add(new RecyclerViewItem(R.drawable.ic_android_black_24dp,"Poxos","Poxosya"));
        recyclerView=findViewById(R.id.recyclerVi);
        recyclerView.setHasFixedSize(true);
        adapter=new RecyclerViewAdapter(recyclerViewItems);
        layoutManager=new LinearLayoutManager(this) ;
recyclerView.setAdapter(adapter);
recyclerView.setLayoutManager(layoutManager);
    }
}
