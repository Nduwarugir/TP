import com.tp.l1.Etudiant;

import java.io.IOException;
import java.util.ArrayList;

public class MainEtudiant {
    public static void main(String[] args) throws IOException {
        Etudiant E = new Etudiant("20U2598","NDUWARUGIRA","Link's",'M',21,14.35,
                "C",18,18,"MATHEMATIQUES","PHYSIQUE");
        System.out.println(E.getDECISION());
        System.out.println(E.toString());
        Etudiant.saveListEtudiants();

    }

}
