package com.td.td1;

public class Exercice9 {
    public static void main(String[] args) {
        int n=10, p=5, q=10 ;
        n=p=q=5;
        n += p += q ;
        System.out.println ("A : n = " + n + " p = " + p + " q = " + q) ;
        q = n < p ? n++ : p++ ;
        System.out.println ("B : n = " + n + " p = " + p + " q = " + q) ;
        q = n > p ? n++ : p++ ;
        System.out.println ("C : n = " + n + " p = " + p + " q = " + q) ;
    }
}
