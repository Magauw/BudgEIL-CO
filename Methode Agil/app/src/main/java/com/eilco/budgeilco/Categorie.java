package com.eilco.budgeilco;

public class Categorie {

    private String nom;

    private String montantTotal;

    public Categorie(String nom, String montantTotal) {
        this.nom = nom;
        this.montantTotal = montantTotal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(String montantTotal) {
        this.montantTotal = montantTotal;
    }
}
