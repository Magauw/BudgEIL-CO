package com.eilco.budgeilco;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class CategorieAdapter extends RecyclerView.Adapter<CategorieViewHolder>{

    private List<Categorie> CategorieList;
    public CategorieAdapter(List<Categorie> CategorieList) {
        this.CategorieList = CategorieList;
    }
    @NonNull
    @Override
    public CategorieViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.categorie_item,
                parent, false);
        return new CategorieViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull CategorieViewHolder holder, int position) {
        holder.display(CategorieList.get(position));
    }
    @Override
    public int getItemCount() {
        return CategorieList.size();
    }
}
