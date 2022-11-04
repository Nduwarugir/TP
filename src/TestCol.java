import com.td.td3.Pointcol;

public class TestCol {
    public static void main(String[] args) {
        Pointcol pcl = new Pointcol(2.0,3.0);
        System.out.println(pcl.affichercol());

        pcl.colorer((byte) 35);
        System.out.println(pcl.affichercol());

        Pointcol pcl2 = new Pointcol(2.0,3.0, (byte) 69);
        System.out.println(pcl2.affichercol());

    }
}
