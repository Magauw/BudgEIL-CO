package com.eilco.budgeilco;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class CategorieViewHolder extends RecyclerView.ViewHolder {

    private TextView mNom;


    private TextView mMontantTotal;

    public CategorieViewHolder(@NonNull View itemView) {
        super(itemView);
        mNom = itemView.findViewById(R.id.textViewCat);
        mMontantTotal = itemView.findViewById(R.id.textViewMont);
    }
    void display(Categorie categorie){
        mNom.setText(categorie.getNom());
        //mMontantTotal.setText(categorie.getMontantTotal().toString());
    }
}
