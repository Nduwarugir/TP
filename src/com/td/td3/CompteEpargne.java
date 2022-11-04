package com.td.td3;

public class CompteEpargne extends Compte {
    protected double tauxInter;

    public CompteEpargne(String numero, String proprietaire, double tauxInter) {
        super(numero, proprietaire);
        this.tauxInter = tauxInter;
    }

    public CompteEpargne(String numero, String proprietaire, int solde, double tauxInter) {
        super(numero, proprietaire, solde);
        this.tauxInter = tauxInter;
    }

    public void traitR() {
        super.Deposer((int) (this.solde * tauxInter));
    }
}
