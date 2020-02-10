package com.eilco.budgeilco;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class DepenseAdapter  extends RecyclerView.Adapter<DepenseViewHolder>  {

    public List<Depense> depenseList;
    public DepenseAdapter(List<Depense> depenseList) {
        this.depenseList = depenseList;
    }
    @NonNull
    @Override
    public DepenseViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.depense_item,
                parent, false);
        return new DepenseViewHolder(view);
    }
    @Override
    public void onBindViewHolder(@NonNull DepenseViewHolder holder, int position) {
        holder.display(depenseList.get(position));
    }
    @Override
    public int getItemCount() {
        return depenseList.size();
    }
}
