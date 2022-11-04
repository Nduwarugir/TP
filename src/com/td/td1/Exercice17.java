package com.td.td1;

import java.util.Scanner;

public class Exercice17 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str;
        System.out.print("Quelle hauteur du triangle souhaitez-vous ? ");
        int n = sc.nextInt();
        int vide, plein;
        for (int i = 0; i < n; i++){
            str = "";
            plein = 2 * i + 1;
            vide = n - i - 1;
            for (int j = 0; j < vide; j++) str += " ";
            for (int k = 0; k < plein; k++) str += "*";
            System.out.println(str);
        }
    }
}
