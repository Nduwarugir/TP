package com.td.td3;

public class CompteSecurise extends Compte {

    public CompteSecurise(String numero, String proprietaire) {
        super(numero, proprietaire);
    }

    public CompteSecurise(String numero, String proprietaire, int solde) {
        super(numero, proprietaire, solde);
    }

    @Override
    public void Retirer(int montant) {
        if (solde >= montant) this.solde -= montant;
        else System.out.println("Retrait impossible.");
    }
}
