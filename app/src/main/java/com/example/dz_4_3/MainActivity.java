package com.example.dz_4_3;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dz_4_3.animal.Animal;

import java.util.ArrayList;

public class MainActivity extends AppCompatActivity implements AnimalClick {
    AnimalAdapter adapter;
    ArrayList<Animal> arrayList;


    RecyclerView recyclerView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initView();
        fillList();
        initAdapter();
    }

    private void initView() {
        recyclerView = findViewById(R.id.recyclerView);
    }

    private void fillList() {
        arrayList = new ArrayList<>();
        arrayList.add(new Animal("Snake", 2, "black", R.drawable.snake));
        arrayList.add(new Animal("Lion", 200, "gold", R.drawable.lion));
        arrayList.add(new Animal("Dog", 30, "brown", R.drawable.dog));
        arrayList.add(new Animal("Dragons", 500, "red", R.drawable.dragons));
    }

    private void initAdapter() {
        adapter = new AnimalAdapter(arrayList, this);
        recyclerView.setAdapter(adapter);
    }

    @Override
    public void animalClicked(Animal animal) {
        Intent intent = new Intent(MainActivity.this, SecondActivity.class);
        intent.putExtra("animal", animal);
        startActivity(intent);
    }
}