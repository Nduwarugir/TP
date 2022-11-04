package com.td.td3;

public class Integer implements Affichable {
    int val;

    public Integer(int val) {
        this.val = val;
    }

    @Override
    public String afficher() {
        return "Je suis un entier de valeur " + this.val;
    }
}
