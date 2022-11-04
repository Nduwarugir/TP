import com.td.td3.Point;

import java.util.Scanner;

public class TestMain {
    public static void main(String[] args) {
        // Creation Pint
        Point p = new Point(2,8);
        System.out.println(p.afficher());

        // Init
        p.initialiser(3.6,6.9);
        System.out.println(p.afficher());

        // Deplacer
        Scanner sc = new Scanner(System.in);
        System.out.print("Deplacer sur x ");
        double dx = sc.nextDouble();
        System.out.print("Deplacer sur y ");
        double dy = sc.nextDouble();
        p.deplacer(dx,dy);
        System.out.println(p.afficher());
    }
}
