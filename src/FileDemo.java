import com.tp.l1.Etudiant;

import java.io.*;
import java.util.ArrayList;
import java.util.Scanner;

public class FileDemo implements Serializable {
    static ArrayList<Etudiant> list= new ArrayList<>();

    public static void main(String[] args) throws Exception
    {
        File file=new File("includes/Etudiant2.txt");
        if(!file.createNewFile() && file.length()!=0)
        {
            FileInputStream fis=new FileInputStream("includes/Etudiant2.txt");
            ObjectInputStream ois=new ObjectInputStream(fis);
            while(true)
            {
                try{
                    list.add((Etudiant) ois.readObject());
                }
                catch(EOFException e) {
                    break;
                }
                catch(Exception e) {
                    e.printStackTrace();
                    break;
                }
            }
            ois.close();
            fis.close();
        }
        Scanner scn=new Scanner(System.in);
        int x=0;
        while(x!=4)
        {
            System.out.println("MENU");
            System.out.println("Enter 1 to add new object to file");
            System.out.println("Enter 2 to display list size");
            System.out.println("Enter 3 to read file");
            System.out.println("Enter 4 to exit");
            System.out.print("Enter your choice: ");
            x=scn.nextInt();
            if(x==1) {
                Etudiant E = new Etudiant("20U2598","NDUWARUGIRA","Link's",'M',21,14.35,
                        "C",18,18,"MATHEMATIQUES","PHYSIQUE");
                list.add(E);
                FileOutputStream fos=new FileOutputStream("includes/Etudiant.txt",true);
                ObjectOutputStream oos=new ObjectOutputStream(fos);
                oos.writeObject(E);
                oos.close();
                fos.close();
                System.out.println("student Created");
            }
            else if(x==2) {
                System.out.println(list.size());
            }
            else if(x==3) for (Etudiant E : list) System.out.println(E.toString());
            else if(x==4)
                break;
            else
                System.out.println("Invaild choice");
        }
    }
}