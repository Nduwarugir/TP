package com.td.td3;

public class Point {
    protected double x;
    protected double y;

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
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

    public void initialiser(double x, double y){
        this.x = x;
        this.y = y;
    }

    public void deplacer(double dx, double dy){
        this.x += dx;
        this.y += dy;
    }

    public final String afficher(){
        return "Je suis un point de coordoonees " + this.x + " et " + this.y;
    }

    public String identifie(){
        return "Je suis un point";
    }

}
