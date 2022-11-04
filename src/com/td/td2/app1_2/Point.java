package com.td.td2.app1_2;

import static java.lang.Math.pow;
import static java.lang.Math.sqrt;

public class Point {

    protected double x;
    protected double y;

    public Point(){
        this.x = 0.0;
        this.y = 0.0;
        System.out.println("\nPoint créé avec le constructeur par defaut.\n");
    }

    public Point(double x, double y){
        this.x = x;
        this.y = y;
        System.out.println("\nPoint créé avec le constructeur inter-actif.\n");
    }

    public Point(Point p){
        this.x = p.getX();
        this.y = p.getY();
        System.out.println("\nPoint créé avec le constructeur copieur.\n");
    }

    public double getX() {
        return x;
    }

    public void setX(double x) {
        this.x = x;
    }

    public double getY() {
        return y;
    }

    public void setY(double y) {
        this.y = y;
    }

    public void deplacer(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    @Override
    public String toString() {
        return "x=" + x + ", y=" + y;
    }

    public double distance(Point p){
        return sqrt( pow(this.x - p.getX(), 2) + pow(this.y - p.getY(), 2) );
    }

}
