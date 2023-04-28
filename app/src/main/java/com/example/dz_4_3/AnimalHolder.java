package com.example.dz_4_3;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.dz_4_3.animal.Animal;


public class AnimalHolder extends RecyclerView.ViewHolder {
    ImageView imageView;

    TextView textViewName;

    public AnimalHolder(@NonNull View itemView) {
        super(itemView);
    }

    public void onBind(Animal animal) {
        imageView = itemView.findViewById(R.id.imageView);
        textViewName = itemView.findViewById(R.id.textView);
        imageView.setImageResource(animal.getImage());
        textViewName.setText(animal.getName());
    }
}
