/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nezet;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import modell.Auto;
import modell.Hajo;
import modell.Jarmu;
import modell.Kolcsonzo;

/**
 *
 * @author install
 */
public class Konzol implements Serializable{
    private ArrayList<Jarmu> jarmuvek;
    public Konzol() throws IOException {
        this.jarmuvek = new Kolcsonzo().getJarmuvek();
        ArrayList<Auto> autok = new ArrayList<>();
        ArrayList<Hajo> hajok = new ArrayList<>();
        for (Jarmu jarmu : jarmuvek) {
            if (jarmu instanceof Auto) {
                autok.add((Auto) jarmu);
            } else {
                hajok.add((Hajo) jarmu);
            }
        }
        feladatok();
    }

    private void feladatok() throws IOException {
        jarmuvekKonzolon();
        jarmuvekFajlban();
    }

    private void jarmuvekKonzolon() {
        System.out.print("- Kölcsönző járművei:");
        for (Jarmu jarmu : jarmuvek) {
            System.out.println(jarmu);
        }
    }

    private void jarmuvekFajlban() throws IOException {
        try{
            ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("jarmmuvek.bin"));
            
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Konzol.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
    
}
