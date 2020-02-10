package com.eilco.budgeilco;

public class Categorie {

    private String nom;

    //private Double montantTotal;

    public Categorie(String nom) {
        this.nom = nom;
       // this.montantTotal = montantTotal;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

  /* public Double getMontantTotal() {
        return montantTotal;
    }

    public void setMontantTotal(Double montantTotal) {
        this.montantTotal = montantTotal;*
    }*/
}
