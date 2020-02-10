package com.eilco.budgeilco;

import android.view.View;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class DepenseViewHolder extends RecyclerView.ViewHolder {

    private TextView mMontant;

    private TextView mCategorie;

    public DepenseViewHolder(@NonNull View itemView) {
        super(itemView);
        mMontant = itemView.findViewById(R.id.textViewMont);
        mCategorie = itemView.findViewById(R.id.textViewCat);
    }
    void display(Depense depense) {
        mMontant.setText(depense.getMontant() + "€");

            mCategorie.setText(depense.getCategorie().getNom());

    }
}
