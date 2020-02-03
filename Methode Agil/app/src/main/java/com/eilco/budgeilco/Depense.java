package com.eilco.budgeilco;

public class Depense {

    private double montant;

    private Categorie categorie;

    public Depense(double montant, Categorie categorie) {
        this.montant = montant;
        this.categorie = categorie;
    }

    public double getMontant() {
        return montant;
    }

    public void setMontant(double montant) {
        this.montant = montant;
    }

    public Categorie getCategorie() {
        return categorie;
    }

    public void setCategorie(Categorie categorie) {
        this.categorie = categorie;
    }
}
