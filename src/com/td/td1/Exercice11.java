package com.td.td1;

import java.util.Scanner;

public class Exercice11 {
    public static void main(String[] args) {
        int n ;
        Scanner clavier = new Scanner(System.in);
        System.out.println ("Entrez un entier : ");
        n = clavier.nextInt() ;
        switch (n) {
            case 0 : System.out.println ("Nul") ;
            case 1 :
            case 2 :
                System.out.println ("Petit") ;
                break ;
            case 3 :
            case 4 :
            case 5 : System.out.println ("Moyen") ;
            default : System.out.println ("Grand") ;
        }
    }
}
