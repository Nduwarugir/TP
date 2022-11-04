package com.td.td1;

import java.util.Scanner;

public class Exercice13 {
    public static void main(String[] args) {
        int i, n, som ;
        Scanner clavier = new Scanner(System.in);
        som = 0 ;
        for (i=0 ; i<4 ; i++) {
            System.out.println ("donnez un entier ") ;
            n = clavier.nextInt();
            som += n ;
        }
        System.out.println ("Somme : " + som) ;
    }
}
