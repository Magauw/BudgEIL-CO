package com.eilco.budgeilco;

import java.util.List;

public class Depense {

    private String montant;

    private Categorie categorie;



    public Depense(String montant, Categorie categorie) {
        this.montant = montant;
        this.categorie = categorie;
    }

    public String getMontant() {
        return montant;
    }

    public void setMontant(String montant) {
        this.montant = montant;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
