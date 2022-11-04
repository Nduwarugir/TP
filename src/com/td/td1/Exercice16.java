//        Écrire un programme qui calcule les racines carrées de nombres fournis en donnée.
//        Il s’arrêtera lorsqu’on lui fournira la valeur 0. Il refusera les valeurs négatives.
//        Son exécution se présentera ainsi :

package com.td.td1;

import java.util.Scanner;

public class Exercice16 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double db = 0;
        do {
            System.out.print("\nDonnez un nombre positif: ");
            db = sc.nextDouble();
            if (db < 0){
                System.out.println("Svp positif");
                continue;
            }
            if (db == 0) continue;
            System.out.println("Sa racine carree est : " + square(db));
        }while (db != 0);
        System.out.println("Merci, A bientôt...");
    }

    public static double square(double n){
        return Math.sqrt(n);
    }
}
