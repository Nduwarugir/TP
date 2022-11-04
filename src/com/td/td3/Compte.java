package com.td.td3;

public class Compte {
    protected String numero;
    protected String proprietaire;
    protected int solde;

    public Compte(String numero, String proprietaire) {
        this.numero = numero;
        this.proprietaire = proprietaire;
    }

    public Compte(String numero, String proprietaire, int solde) {
        this.numero = numero;
        this.proprietaire = proprietaire;
        this.solde = solde;
    }

    public String getNumero() {
        return numero;
    }

    public void setNumero(String numero) {
        this.numero = numero;
    }

    public String getProprietaire() {
        return proprietaire;
    }

    public void setProprietaire(String proprietaire) {
        this.proprietaire = proprietaire;
    }

    public int getSolde() {
        return solde;
    }

    public void setSolde(int solde) {
        this.solde = solde;
    }

    public void Deposer(int montant){
        this.solde += montant;
    }

    public void Retirer(int montant){
        this.solde -= montant;
    }
}
