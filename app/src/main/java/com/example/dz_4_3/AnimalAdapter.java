package com.example.dz_4_3;


import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;


import com.example.dz_4_3.animal.Animal;

import java.util.ArrayList;

public class AnimalAdapter extends RecyclerView.Adapter<AnimalHolder> {
    ArrayList<Animal> animalArraylist;

    AnimalClick animalClick;

    public AnimalAdapter(ArrayList<Animal> arrayList, AnimalClick animalClick) {
        this.animalArraylist = arrayList;
        this.animalClick = animalClick;
    }

    @NonNull
    @Override
    public AnimalHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new AnimalHolder(LayoutInflater.from(parent.getContext())
                .inflate(R.layout.item_svoi1, parent, false));
    }

    @Override
    public void onBindViewHolder(@NonNull AnimalHolder holder, int position) {
        holder.onBind(animalArraylist.get(position));

        holder.itemView.setOnClickListener(view -> {
            animalClick.animalClicked(animalArraylist.get(position));
        });
    }

    @Override
    public int getItemCount() {
        return animalArraylist.size();
    }
}

