package com.td.td3;

public class Float implements Affichable {
    float val;

    public Float(float val) {
        this.val = val;
    }

    @Override
    public String afficher() {
        return "Je suis un réel de valeur " + this.val;

    }
}
