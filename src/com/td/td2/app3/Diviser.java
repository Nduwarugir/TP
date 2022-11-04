package com.td.td2.app3;

public class Diviser {
    public double a, b;

    public Diviser(double a, double b){
        this.a = a;
        this.b = b;
    }

    public double diviser1(){
        return a/b;
    }

    public static double diviser2(double a, double b){
        return a/b;
    }
}
