import com.td.td2.app1_2.Point;

import java.util.Scanner;

public class TestPoint {
    public static void main(String[] args) {
        // Premier construction
        Point p1 = new Point();

        // Second constructeur
        Scanner sc = new Scanner(System.in);
        System.out.print("Entrer l'abscisse de votre point: ");
        double x = sc.nextDouble();
        System.out.print("Entrer l'ordonnée de votre point: ");
        double y = sc.nextDouble();
        Point p2 = new Point(x,y);

        // Troisième constructeur
        Point p3 = new Point(p2);

        // Test des méthodes
        System.out.println("Méthode afficher:");
        System.out.println("Les coordonées de p1 sont: \n\t" + p1.toString());
        System.out.println("Les coordonées de p2 sont: \n\t" + p2.toString());
        System.out.println("Les coordonées de p3 sont: \n\t" + p3.toString());

        System.out.println("Méthode deplacer:");
        p1.deplacer(23.6,8.3);
        System.out.println("Les coordonées de p1 apres son deplacement de (23.6; 8.3) sont: \n\t" + p1.toString());

        System.out.println("Méthode distance:");
        System.out.println("La distance entre p1 et p2 est: " + p1.distance(p2) );
        System.out.println("La distance entre p1 et p3 est: " + p1.distance(p3) );
        System.out.println("La distance entre p2 et p3 est: " + p3.distance(p2) );

    }
}
