package com.td.td1;

public class Exercice1 {
    public static void main(String[] args) {
        System.out.println("Exercice 1!");
        float a = 5.2f, b = 3.2f, c = 9f;
        float x = 2 * a / (b * c);
        System.out.println("1- x= "+x+".\n");
        int n = 8, p= 9;
        float y = 1;
        float v = (y + 3) * (n%p);
        System.out.println("2- v= "+v+".\n");
        float z = -a / -(b + c);
        System.out.println("3- z= "+z+".\n");
        float t = (x/y)%-z;
        System.out.println("4- t= "+t+".\n");

    }
}