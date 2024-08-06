package com.example.lap61;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity {

    ArrayList<Cake> cakes;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        recyclerView = findViewById(R.id.recyclerView);
        cakes = new ArrayList<>();
        cakes.add(new Cake("cake A","good cake",R.drawable.cake_a));
        cakes.add(new Cake("cake B","great cake",R.drawable.cake_b));
        cakes.add(new Cake("cake C","Tasty cake",R.drawable.cake_c));
        cakes.add(new Cake("cake D","delicious cake",R.drawable.cake_d));
        cakes.add(new Cake("cake E","yummy cake",R.drawable.cake_e));
        cakes.add(new Cake("cake F","flavorful cake",R.drawable.cake_f));
        cakes.add(new Cake("cake G","sweet cake",R.drawable.cake_g));
        LinearLayoutManager linearLayoutManager = new LinearLayoutManager(getApplicationContext());
        linearLayoutManager.setOrientation(LinearLayoutManager.VERTICAL);
        RecyclerAdapter adapter = new RecyclerAdapter(cakes);
        recyclerView.setLayoutManager(linearLayoutManager);
        recyclerView.setAdapter(adapter);

    }
}