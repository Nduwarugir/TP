package com.tp.l1;

import java.io.*;
import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class Etudiant implements Serializable {
    protected String NCIN; protected String NOM; protected String PRENOM; protected char SEXE; protected int AGE;
    protected float MOYENNE; protected String SERIEBACC; protected float NOTEMATH; protected float NOTEPHY;
    protected String CHOIX2; protected String CHOIX3; protected final String DECISION;
    protected static File file = new File("includes/Etudiant.txt");
    private static ArrayList<Etudiant> listEtudiants = new ArrayList<Etudiant>();
    public Etudiant(String NCIN, String NOM, String PRENOM, char SEXE, int AGE, double MOYENNE, String SERIEBACC,
                    double NOTEMATH, double NOTEPHY, String CHOIX2, String CHOIX3) {
        setListEtudiants();
        this.NCIN = NCIN;
        this.NOM = NOM;
        this.PRENOM = PRENOM;
        this.SEXE = SEXE;
        this.AGE = AGE;
        this.MOYENNE = (float) MOYENNE;
        this.SERIEBACC = SERIEBACC;
        this.NOTEMATH = (float) NOTEMATH;
        this.NOTEPHY = (float) NOTEPHY;
        this.CHOIX2 = CHOIX2;
        this.CHOIX3 = CHOIX3;
        this.DECISION = setDECISION();
        listEtudiants.add(this);
        saveListEtudiants();
    }
    public static void setListEtudiants() {
        /*Path filePath = Paths.get("demo.txt");
        Charset charset = StandardCharsets.UTF_8;

        try (BufferedReader bufferedReader = Files.newBufferedReader(filePath, charset)) {
            String line;
            while ((line = bufferedReader.readLine()) != null) {
                System.out.println(line);
            }
        } catch (IOException ex) {
            System.out.format("I/O error: %s%n", ex);
        }*/
        try (ObjectInputStream ois = new ObjectInputStream(new BufferedInputStream(new FileInputStream(file)))){
            Etudiant.listEtudiants = (ArrayList<Etudiant>) ois.readObject();
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
    public static void saveListEtudiants() {
        try (ObjectOutputStream oos = new ObjectOutputStream(new BufferedOutputStream(new FileOutputStream(file,true)))){
            for (Etudiant E : listEtudiants) oos.writeObject(E);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    public static ArrayList<Etudiant> getListEtudiants() {
        return listEtudiants;
    }
    public String getDECISION() {
        return DECISION;
    }
    private String setDECISION() {
        if (this.MOYENNE >= 14 || this.MOYENNE >= 12 && this.NOTEPHY >= 16 && this.NOTEMATH >= 15) return "INFORMATIQUE";
        else return this.CHOIX2;
    }
    public boolean search() {
        for (Etudiant E : listEtudiants) if(this.NCIN.equals(E.getNCIN())) return true;
        return false;
    }
    public boolean mod_student(String ncin){
        Scanner sc = new Scanner(System.in);
        for (Etudiant E : listEtudiants) {
            if (ncin.equals(E.getNCIN())){
                listEtudiants.removeIf(e -> e.getNCIN().equals(E.getNCIN()));
                System.out.println("Vous allez commencer les modifications...");
                System.out.print("NOM: "); E.setNOM(sc.nextLine());
                System.out.print("PRENOM: "); E.setPRENOM(sc.nextLine());
                System.out.print("AGE: "); E.setAGE(sc.nextInt());
                System.out.print("SEXE: "); E.setSEXE(sc.nextLine().charAt(0));
                System.out.print("CHOIX 2: "); E.setCHOIX2(sc.nextLine());
                System.out.print("CHOIX 3: "); E.setCHOIX3(sc.nextLine());
                System.out.println("Les nouvelles données sont:\n" + this.toString());
                listEtudiants.add(E);
                return true;
            }
        }
        return false;
    }

    @Override
    public String toString() {
        return "Etudiant: " +
                "\n\tNCIN = " + NCIN +
                "\n\tNOM = " + NOM +
                "\n\tPRENOM = " + PRENOM +
                "\n\tSEXE = " + SEXE +
                "\n\tAGE = " + AGE +
                "\n\tMOYENNE = " + MOYENNE +
                "\n\tSERIEBACC = " + SERIEBACC +
                "\n\tNOTEMATH = " + NOTEMATH +
                "\n\tNOTEPHY = " + NOTEPHY +
                "\n\tCHOIX2 = " + CHOIX2 +
                "\n\tCHOIX3 = " + CHOIX3 +
                "\n\tDECISION = " + DECISION;
    }

    public void del_student(Etudiant E){}
    public void admis(Etudiant E){}
    public String getNCIN() {
        return NCIN;
    }
    public void setNOM(String NOM) {
        this.NOM = NOM;
    }
    public void setPRENOM(String PRENOM) {
        this.PRENOM = PRENOM;
    }
    public void setSEXE(char SEXE) {
        this.SEXE = SEXE;
    }
    public void setAGE(int AGE) {
        this.AGE = AGE;
    }
    public void setMOYENNE(float MOYENNE) {
        this.MOYENNE = MOYENNE;
    }
    public void setSERIEBACC(String SERIEBACC) {
        this.SERIEBACC = SERIEBACC;
    }
    public void setNOTEMATH(float NOTEMATH) {
        this.NOTEMATH = NOTEMATH;
    }
    public void setNOTEPHY(float NOTEPHY) {
        this.NOTEPHY = NOTEPHY;
    }
    public void setCHOIX2(String CHOIX2) {
        this.CHOIX2 = CHOIX2;
    }
    public void setCHOIX3(String CHOIX3) {
        this.CHOIX3 = CHOIX3;
    }

}
