import com.td.td3.Point;
import com.td.td3.Pointcol;

import java.util.ArrayList;

public class TestP {
    public static void main(String[] args) {
        ArrayList<Point> tabPt = new ArrayList<Point>();

        // Création de points
        tabPt.add(new Point(2.6,9.6));
        tabPt.add(new Point(2.36,19.6));
        tabPt.add(new Pointcol(6.9,9.5, (byte) 65));
        tabPt.add(new Pointcol(69.0,97.5, (byte) 95));
        Point[] tap = tabPt.toArray(new Point[0]);

        // Affichage
        for (Point p : tap) System.out.println(p.afficher());
    }
}
