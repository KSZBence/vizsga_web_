/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package modell;

import java.util.ArrayList;

/**
 *
 * @author install
 */
public class Kolcsonzo {
    private ArrayList<Jarmu> jarmuvek;
    public Kolcsonzo() {
        this.jarmuvek = new ArrayList<>();
        jarmuvek.add(new Auto("-abc", Jarmu.minosites.ATLAGOS));
        jarmuvek.add(new Auto("a-bc", Jarmu.minosites.KIVALO));
        jarmuvek.add(new Hajo("a-bcd",Jarmu.minosites.KIVALO, 5, "hajo1"));
        jarmuvek.add(new Hajo("a-bcde", Jarmu.minosites.MEGFELEELO, 5, "hajo2"));
    }

    public ArrayList<Jarmu> getJarmuvek() {
        return jarmuvek;
    }
    
}
