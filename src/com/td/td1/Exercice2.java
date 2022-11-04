package com.td.td1;

public class Exercice2 {
    public static void main(String[] args) {
        System.out.println("Exercice 2!");
        byte b1 = 10, b2 = 20 ;
        short p = 200 ;
        int n = 500 ;
        long q = 100 ;
        float x = 2.5f ;
        double y = 5.25 ;
        System.out.println("1- Type = "+ (b1+b2) + "\tValeur = "+(b1+b2));
        System.out.println("2- Type = "+ (p+b1) + "\tValeur = "+(p+b1));
        System.out.println("3- Type = "+ (b1*b2) + "\tValeur = "+(b1*b2));
        System.out.println("4- Type = "+ (q+p*(b1+b2)) + "\tValeur = "+(q+p*(b1+b2)));
        System.out.println("5- Type = "+ (x+q*n) + "\tValeur = "+(x+q*n));
        System.out.println("6- Type = "+ (b1*q/x) + "\tValeur = "+(b1*q/x));
        System.out.println("7- Type = "+ (b1*q*2./x) + "\tValeur = "+(b1*q*2./x));
        System.out.println("8- Type = "+ (b1*q*2.f/x) + "\tValeur = "+(b1*q*2.f/x));
    }
}
