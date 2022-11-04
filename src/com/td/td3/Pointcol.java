package com.td.td3;

public class Pointcol extends Point {
    protected byte couleur;

    public Pointcol(double x, double y){
        super(x,y);
    }

    public Pointcol(double x, double y, byte couleur){
        super(x,y);
        this.couleur = couleur;
    }

    public byte getCouleur() {
        return couleur;
    }

    public void setCouleur(byte couleur) {
        this.couleur = couleur;
    }

    public void colorer(byte couleur){
        this.couleur = couleur;
    }

    public String affichercol(){
        return super.afficher() + " et de couleur " + this.couleur;
    }

    @Override
    public String identifie() {
        return super.identifie() + " coloré de couleur" + this.couleur;
    }
}
