package com.example.dz_4_3;

import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;

import com.example.dz_4_3.animal.Animal;

public class SecondActivity extends AppCompatActivity {
    Animal animal;
    TextView name, kg, color;
    ImageView imageView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        initID();
        animal = (Animal) getIntent().getSerializableExtra("animal");
        name.setText(animal.getName());
        color.setText(animal.getColor());
        kg.setText(String.valueOf(animal.getSum()));
        imageView.setImageResource(animal.getImage());
    }

    private void initID() {
        name = findViewById(R.id.text_name);
        color = findViewById(R.id.text_color);
        kg = findViewById(R.id.text_KG);
        imageView = findViewById(R.id.Image);
    }
}